# Gestión de una Plataforma de Música Tipo Spotify

Simulación de una plataforma de música en Java, siguiendo principios de programación orientada a objetos y buenas prácticas.

---

## Requisitos de Finalización

Desarrolla una aplicación en Java que permita simular el funcionamiento básico de una plataforma de música similar a Spotify. El programa debe seguir una arquitectura orientada a objetos y aplicar buenas prácticas de programación.

---

## 1. Modelado de Clases

Se deben crear al menos las siguientes clases:

### **Clase `Cancion`**
- Título
- Artista
- Duración (en segundos)
- Número de reproducciones

### **Clase `Playlist`**
- Nombre de la playlist
- Lista de canciones
- Duración total de la playlist (calculada)

### **Clase `Usuario`**
- Nombre de usuario
- Email
- Lista de playlists creadas

### **Clase `Spotify`**
- Lista de usuarios registrados
- Catálogo de canciones disponibles

> Se pueden añadir más clases si se considera necesario para la arquitectura.

---

## 2. Funcionalidades Obligatorias

La aplicación debe permitir:

### Gestión de Canciones
- Añadir canciones al catálogo.
- Mostrar todas las canciones disponibles.
- Reproducir una canción (incrementa el número de reproducciones).

### Gestión de Usuarios
- Registrar usuarios en la plataforma.
- Buscar un usuario por nombre y mostrar su información.

### Gestión de Playlists
- Crear una playlist para un usuario.
- Añadir canciones a una playlist.
- Mostrar las playlists de un usuario.
- Mostrar las canciones de una playlist y su duración total.

### Estadísticas
- Mostrar las canciones más reproducidas (ordenadas de mayor a menor).
- Mostrar la duración total de una playlist.

---

## 3. Entrada / Salida

- La aplicación funciona **por consola** mediante un menú interactivo.
- Los datos se mantienen en memoria (no se requiere persistencia en ficheros ni base de datos).

### Ejemplo de Menú

1.Registrar usuario
2.Añadir canción al catálogo
3.Crear playlist
4.Añadir canción a playlist
5.Reproducir canción
6.Mostrar canciones
7.Mostrar playlists de un usuario
8.Mostrar canciones más reproducidas
0.Salir

---

## 4. Consideraciones Adicionales

- Aplica **encapsulamiento** (atributos privados y métodos públicos).
- Usa **constructores adecuados**.
- Implementa **getters y setters** cuando sea necesario.
- Maneja errores comunes, por ejemplo:
  - Añadir una canción a una playlist inexistente.
  - Crear una playlist para un usuario que no existe.
  - Reproducir una canción que no está en el catálogo.
- El diseño debe ser **modular y extensible**.

---

## 5. Ampliaciones Opcionales (Posibles en examen)

- Limitar la duración máxima de una playlist.
- Permitir eliminar canciones de una playlist.
- Crear playlists colaborativas.
- Simular **cuentas Free y Premium** (con restricciones).
- Guardar el número total de **minutos escuchados por un usuario**.

---

## 6. Tecnologías

- **Lenguaje:** Java
- **Ejecución:** Consola
- **Paradigma:** Programación Orientada a Objetos (POO)
