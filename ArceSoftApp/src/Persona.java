public class Persona {
    private String nombre;
    private String nif;
    private int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Sin nombre";
        this.nif = "00000000X";
        this.edad = 0;
    }

    // Constructor por parámetros
    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", nif: " + nif + ", Edad: " + edad;
    }
}