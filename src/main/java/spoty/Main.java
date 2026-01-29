package spoty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ SPOTIFY ---");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Añadir canción al catálogo");
            System.out.println("3. Crear playlist");
            System.out.println("4. Añadir canción a playlist");
            System.out.println("5. Reproducir canción");
            System.out.println("6. Mostrar canciones");
            System.out.println("7. Mostrar playlists de un usuario");
            System.out.println("8. Mostrar canciones más reproducidas");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> { //Registrar usuario
                    System.out.print("Nombre usuario: ");
                    String nombre = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    spotify.registrarUsuario(nombre, email);
                }
                case 2 -> { //Añadir canción al catálogo
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    spotify.agregarCancion(titulo, artista, duracion);
                }
                case 3 -> { //Crear playlist
                    System.out.print("Usuario: ");
                    String user = sc.nextLine();
                    Usuario u = spotify.buscarUsuario(user);
                    if (u != null) {
                        System.out.print("Nombre playlist: ");
                        u.agregarPlaylist(sc.nextLine());
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                }
                case 4 -> { //Añadir canción a playlist
                    System.out.print("Usuario: ");
                    Usuario u = spotify.buscarUsuario(sc.nextLine());
                    if (u == null) break;
                    System.out.print("Playlist: ");
                    Playlist p = u.buscarPlaylist(sc.nextLine());
                    if (p == null) break;
                    System.out.print("Canción: ");
                    Cancion c = spotify.buscarCancion(sc.nextLine());
                    if (c != null) p.agregarCancion(c);
                }
                case 5 -> { //Reproducir canción
                    System.out.print("Canción: ");
                    Cancion c = spotify.buscarCancion(sc.nextLine());
                    if (c != null) {
                        c.reproducir();
                        System.out.println("Reproduciendo...");
                    }
                }
                case 6 -> {//Mostrar canciones 
                    spotify.mostrarCatalogo();
                }
                case 7 -> { //Mostrar playlists de un usuario
                    System.out.print("Usuario: ");
                    Usuario u = spotify.buscarUsuario(sc.nextLine());
                    if (u != null) {
                        System.out.println(u);
                    }
                }  //Mostrar canciones más reproducidas
                case 8 -> spotify.mostrarCancionesMasReproducidas();
            }
        } while (opcion != 0);

        sc.close();
    }
}