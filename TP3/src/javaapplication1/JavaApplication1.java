/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {

        Estudiantes estudiante = new Estudiantes();
        estudiante.nombre = "Ignacio";
        estudiante.curso = "Javascript";
        estudiante.calificacion = 10;
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(3);
        estudiante.mostrarInfo();
        estudiante.bajarCalificacion(5);
        estudiante.mostrarInfo();

        Mascota ayra = new Mascota();
        ayra.edad = 3;
        ayra.mostrarInfo();
        ayra.cumplirAnios();
        ayra.mostrarInfo();

        Libro libro1 = new Libro();
        libro1.setTitulo("Usar el cerebro");
        libro1.setAutor("Facundo Manes");
        libro1.setAnioPublicacion(2003);
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getAnioPublicacion());
        
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.edad = 2;
        gallina2.edad = 5;
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.ponerHuevos(3);
        gallina2.ponerHuevos(1);
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        NaveEspacial nave1 = new NaveEspacial();
        nave1.nombre = "Apollo +21";
        nave1.combustible = 12300.3;
        nave1.avanzar(12);
        nave1.recargarCombustible(7650.75);
        nave1.mostrarEstado();
        
    }

}
