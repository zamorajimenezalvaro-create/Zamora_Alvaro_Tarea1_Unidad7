# ENUNCIADO
 
La empresa ArceSoft Software & Marketing quiere desarrollar una aplicación en la que tener toda la información de los trabajadores de la oficina. Entre el equipo de desarrolladores encargados de crear la aplicación, estás tú, que empezarás con la primera parte del proyecto. Empieza a desarrollar la app a través de los siguientes pasos:


- Implementa una jerarquía de clases como la que se detalla a continuación:

A) Persona

Atributos: nombre, nif, edad

Métodos: 

- Getters y Setters.

- Constructores (por defecto y parametrizado)

- Método toString(), que devolverá en un String los atributos de persona concatenados.

B) Empleado, especialización de persona.

Atributos: salario
Métodos: 

- Getter y Setter.

- Constructores (por defecto y parametrizado)

- Método toString(), que sobrescribirá el método toString() de la clase padre, añadiendo además de los atributos de persona los propios de empleado.
- Un método que permita aumentar el salario en una cantidad que sería pasada como parámetro.

C) Programador, especialización de Empleado. 

Atributos: categoría (que puede ser “Analista”, “Senior” y “Junior”). Implementar usando Enum.

Métodos: 

- Getter y Setter.

- Constructores (por defecto y parametrizado)

- Método toString(), que sobrescribirá el método toString() de la clase padre, añadiendo además de los atributos de empleado los propios de programador.

- Realiza una clase Main, para probar las clases anteriores. Usa los constructores para crear un par de objetos de cada clase y comprueba como un objeto de una clase hija puede llamar a métodos de la clase padre, pero no al contrario. Ejecuta los métodos toString() de cada uno de los objetos y comprueba el estado de cada instancia.
