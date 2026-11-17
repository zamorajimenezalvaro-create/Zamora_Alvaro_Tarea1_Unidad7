public class Programador extends Empleado {
    private Categoria categoria;

    // Constructor por defecto
    public Programador() {
        super(); // Llama al constructor por defecto de Empleado
        this.categoria = Categoria.JUNIOR;
    }

    // Constructor parametrizado
    public Programador(String nombre, String nif, int edad, double salario, Categoria categoria) {
        super(nombre, nif, edad, salario); // Pasa los datos al constructor de Empleado
        this.categoria = categoria;
    }

    // Getter y Setter
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        // Reutiliza el toString() de Empleado y añade la categoría
        return super.toString() + ", Categoría: " + categoria;
    }
}