package spoty;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nombre;
    private List<Cancion> lcanciones;
    private int duracionTotal; //en segundos

    public Playlist(String nombre) {
        lcanciones = new ArrayList<>();
        this.nombre = nombre;
        duracionTotal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getLcanciones() {
        return lcanciones;
    }

    public void setLcanciones(List<Cancion> lcanciones) {
        this.lcanciones = lcanciones;
    }

    public int getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    @Override
    public String toString() {
        String s = "Nombre de la Playlist: " + nombre + "Duracion: " + duracionTotal + "\n Las canciones son:";
        for (int i = 0; i < lcanciones.size(); i++) {
            s = s + "\n" + lcanciones.get(i).toString();
        }
        return  s;
    }

    //agregar cancion a la playlist
    public void agregarCanciones(Cancion cancion){
        lcanciones.add(cancion);
        duracionTotal = duracionTotal + cancion.getDuracion();
    }
    




}
