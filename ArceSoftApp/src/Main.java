public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. OBJETOS PERSONA ===");
        Persona p1 = new Persona();
        p1.setNombre("Alejandro Bautista");
        p1.setNif("12345678A");
        p1.setEdad(21);

        Persona p2 = new Persona("Carlos Ruiz", "87654321C", 22);

        System.out.println(p1.toString());
        System.out.println(p2); // Llamar a println(objeto) invoca toString() automáticamente

        System.out.println("\n=== 2. OBJETOS EMPLEADO ===");
        Empleado e1 = new Empleado();
        e1.setNombre("Maria Hogbeen"); // Método heredado de Persona
        e1.setNif("2334445555M");     // Método heredado de Persona
        e1.setEdad(23);             // Método heredado de Persona
        e1.setSalario(1500.0);      // Método propio de Empleado

        Empleado e2 = new Empleado("Alba Hogbeen", "5555444332A", 24, 2500.0);

        System.out.println(e1);
        System.out.println("Antes de subir sueldo a Alba: " + e2);
        e2.aumentarSalario(100);
        System.out.println("Después de subir sueldo a Alba: " + e2);

        System.out.println("\n=== 3. OBJETOS PROGRAMADOR ===");
        Programador prog1 = new Programador();
        prog1.setNombre("Alvaro Zamora");          // Heredado de Persona
        prog1.setSalario(1800.0);                 // Heredado de Empleado
        prog1.setCategoria(Categoria.JUNIOR);     // Propio de Programador

        Programador prog2 = new Programador("Paquito Paco", "01010101X", 25, 3200.0, Categoria.SENIOR);
        prog2.aumentarSalario(200);             // Programador puede usar el método de Empleado

        System.out.println(prog1);
        System.out.println(prog2);
    }
}
