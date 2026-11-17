public class Empleado extends Persona {
    private double salario;

    // Constructor por defecto
    public Empleado() {
        super(); // Llama al constructor por defecto de Persona
        this.salario = 0.0;
    }

    // Constructor parametrizado
    public Empleado(String nombre, String nif, int edad, double salario) {
        super(nombre, nif, edad); // Pasa los datos al constructor de Persona
        this.salario = salario;
    }

    // Getter y Setter
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para aumentar el salario
    public void aumentarSalario(double cantidad) {
        if (cantidad > 0) {
            this.salario += cantidad;
        }
    }

    @Override
    public String toString() {
        // Reutilización del toString() de Persona añadiendo el salario
        return super.toString() + ", Salario: " + salario + " €";
    }
}