package spoty;
import java.util.ArrayList;
import java.util.Comparator;
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
        Cancion c = buscarCancion(titulo);
        if(c!=null){
            System.out.println("La cancion esta ya en el catalogo");
        }
        else{
            c=new Cancion(titulo, artista, duracion);
            catalogo.add(c);
            System.out.println("Se ha insertado " + c);
        }
    }

    //busca si esta la cancion en le catalogo
    public Cancion buscarCancion(String nombre){
        Cancion c = null;
        for(int i=0; i<catalogo.size();i++){
            if(catalogo.get(i).getTitulo().equals(nombre)){
                c=catalogo.get(i);
            }
        }
        return c;
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
    public void registrarUsuario(String nombre, String email){
        Usuario u = buscarUsuario(nombre);
        if(u!=null){
            System.out.println("La usuario esta ya registrado");
        }
        else{
            u=new Usuario(email, nombre);
            usuarios.add(u);
            System.out.println("Se ha insertado " + u);
        }
    }

    //Buscar usuario por nombre y muestra por pantalla
    public Usuario buscarUsuario(String nombre){
         Usuario u = null;
         for(int i=0; i<usuarios.size();i++){
            if(usuarios.get(i).getNombre().equals(nombre)){
                u = usuarios.get(i);
                System.out.println(usuarios.get(i));
            }
        }
        return u;
    }

    // Muestra las canciones mas reproducida
    public void mostrarCancionesMasReproducidas(){
        if(catalogo.size()>3){
            catalogo.sort(Comparator.comparing(Cancion::getNreproducciones).reversed());
            System.out.println("El top 10 de las canciones mas escuchadas son: ");
            for (int i = 0; i < 3; i++){
                System.out.println(catalogo.get(i).getTitulo());
            }
        }else{
            System.out.println("No hay suficientes datos para esta funcion");
        }
        
    }

}
