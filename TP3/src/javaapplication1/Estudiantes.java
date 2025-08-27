package javaapplication1;

class Estudiantes {

    String nombre;
    String apellido;
    String curso;
    int calificacion;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Curso: " + curso + " Calificacion: " + calificacion);
    }

    void subirCalificacion(int puntos) {
        if (calificacion > 0) {
            calificacion += puntos;
        }
    }

    void bajarCalificacion(int puntos) {
        if (calificacion > 0) {
            calificacion -= puntos;
        }
    }

}

class Mascota {

    String nombre;
    String especie;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " Especie: " + especie + " Edad: " + edad);
    }

    int cumplirAnios() {
        return edad += 1;
    }
}

class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    void setTitulo(String title) {
        if (title.length() > 0) {
            titulo = title;
        }
    }

    String getTitulo() {
        return titulo;
    }

    void setAutor(String nuevoAutor) {
        if (nuevoAutor.length() > 0) {
            autor = nuevoAutor;
        }
    }

    String getAutor() {
        return autor;
    }

    void setAnioPublicacion(int anio) {
        if (anio > 0) {
            anioPublicacion = anio;
        }
    }

    int getAnioPublicacion() {
        return anioPublicacion;
    }

}

class Gallina {

    int idGallina;
    int edad;
    int huevosPuestos;

    void ponerHuevos(int cantidad) {
        if (cantidad > 0) {
            System.out.println("La gallina puso " + cantidad + " huevo/s");
        }
    }

    void envejecer() {
        edad += 1;
    }

    void mostrarEstado() {
        System.out.println("La gallina ahora tiene " + edad);
    }

}

class NaveEspacial {

    String nombre;
    double combustible;

    void despegar() {
        System.out.println("La nave " + nombre + " ha despegado!");
    }

    void avanzar(int distancia) {
        System.out.println("Se ha avanzado " + distancia + " años luz");
    }

    void recargarCombustible(double cantidad) {
        if (cantidad > 0) {
            combustible += cantidad;
        }
    }

    void mostrarEstado() {
        System.out.println("La nave " + nombre + " tiene cargado " + combustible + " de Hidrogeno");

    }

}
