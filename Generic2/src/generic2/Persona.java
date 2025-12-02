package generic2;

public class Persona implements Identificable<Integer>, Comparable<Persona> {

    private Integer DNI;
    private String nombre;
    private Integer edad;
    private double estatura;

    public Persona(String nombre, Integer edad, double estatura, Integer DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.DNI = DNI;
    }

    @Override
    public void setId(Integer id) {
        this.DNI = DNI;
    }

    @Override
    public Integer getID() {
        return DNI;
    }

    @Override
    public int compareTo(Persona o) {
        // Si la persona es mayor que yo retorno NEGATIVO
        // Si la persona es menor que yo retorno POSITIVO
        // Si somos iguales retorno 0
        //return this.edad - o.edad;
        int resultado = 0;
        if (this.estatura < o.estatura) {
            resultado = -1;
        } else if (this.estatura > o.estatura) {
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }

}
