package spoty;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String email;
    private List<Playlist> playlist;

    public Usuario(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
        playlist =new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Playlist> playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        String s = "Usuario=" + nombre + ", email=" + email + "Las listas de reproduccio del usuario son: ";
        for (int i = 0; i < playlist.size(); i++) {
            s = s + "\n" + playlist.get(i).toString();
        }
        return  s;
    }

    //Creamos playlist para usuario
    public void agregarPlaylist(String nombre){
        Playlist p = new Playlist(nombre);
        if(existePlaylist(nombre)){
            System.out.println("La playlist ya existe");
        }
        playlist.add(p);
    }

    //Buscamos si existe la playlist
    public boolean existePlaylist(String nombre){
        for (int i = 0; i < playlist.size(); i++) {
            if(playlist.get(i).getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    



}
