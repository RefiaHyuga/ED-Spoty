package spoty;

public class Cancion {

    private String titulo;
    private String artista;
    private int duracion; //en segundos
    private int nreproducciones;

    public Cancion(String titulo, String artista, int duracion) {
        this.artista = artista;
        this.duracion = duracion;
        this.titulo = titulo;
        nreproducciones = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNreproducciones() {
        return nreproducciones;
    }

    public void setNreproducciones(int nreproducciones) {
        this.nreproducciones = nreproducciones;
    }

    @Override
    public String toString() {
        return "Cancion [titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + ", nreproducciones="
                + nreproducciones + "]";
    }

    //reproducir canciones
    public void reproducir(){
        nreproducciones++;
    }
    
}
