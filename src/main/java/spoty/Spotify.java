package spoty;
import java.util.ArrayList;
import java.util.List;

public class Spotify {
    List<Usuario> usuarios;
    List<Cancion> catalogo;

    public Spotify() {
        catalogo = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Cancion> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Cancion> catalogo) {
        this.catalogo = catalogo;
    }

    //agregar canciones en la playlist
    public void agregarCancion(String titulo, String artista, int duracion){
        Cancion c = new Cancion(titulo, artista, duracion);
        if(existeEnCatalogo(c)){
            System.out.println("La cancion esta ya en el catalogo");
        }
        else{
            catalogo.add(c);
            System.out.println("Se ha insertado " + c);
        }
    }

    //busca si esta la cancion en le catalogo
    public boolean existeEnCatalogo(Cancion cancion){
        for(int i=0; i<catalogo.size();i++){
            if(catalogo.get(i).equals(cancion)){
                return true;
            }
        }
        return false;
    }

    //mostrar el catalogo
    public void mostrarCatalogo(){
        String s = "Las canciones son:";
        for (int i = 0; i < catalogo.size(); i++) {
            s = s + "\n" + catalogo.get(i).toString();
        }
        System.out.println(s);
    }

    //registra usuarios
    public void registrarUsuario(String email, String nombre){
        Usuario u = new Usuario(email, nombre);
        if(estaRegistrado(u)){
            System.out.println("La usuario esta ya registrado");
        }
        else{
            usuarios.add(u);
            System.out.println("Se ha insertado " + u);
        }
    }

    //busca si esta el usuario registrado
    public boolean estaRegistrado(Usuario usuario){
        for(int i=0; i<usuarios.size();i++){
            if(usuarios.get(i).equals(usuario)){
                return true;
            }
        }
        return false;
    }

    //Buscar usuario por nombre y muestra por pantalla
    public void buscarUsuario(String nombre){
         for(int i=0; i<usuarios.size();i++){
            if(usuarios.get(i).getNombre().equals(nombre)){
                System.out.println(usuarios.get(i));
            }
        }
    }



}
