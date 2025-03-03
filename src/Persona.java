public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona silvia = new Persona("Silvia", 20);


        // Mostrar los datos de la persona utilizando el metodo mostrarDatos
        System.out.println(silvia.mostrarDatos());
    }

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        // Inicializa los atributos con los valores recibidos
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los datos de la persona
    public String mostrarDatos() {
        return "=== Datos de la Persona ===\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n";
    }
}

//Explicación de Cada Línea:
//  1. public class Persona {
//    Clase: Una clase en Java define un tipo de objeto y sus comportamientos.
//    En este caso, Persona es la clase, que tiene atributos como nombre y edad, y métodos como mostrarDatos.
//
//  2. private String nombre;
//    Atributo: Define un atributo privado de tipo String llamado nombre para almacenar el nombre de la persona.
//
//
//  3. private int edad;
//    Atributo: Define un atributo privado de tipo int llamado edad para almacenar la edad de la persona.
//
//
//  4. public static void main(String[] args) {
//     Metodo main: Es el punto de entrada al programa. Se ejecuta al iniciar el programa.
//     El código dentro de este metodo es lo que se ejecutará cuando corras la aplicación.
//
//   5. Persona silvia = new Persona("Silvia", 20);
//      Creación de un objeto: Aquí estamos creando un objeto de la clase Persona llamado silvia utilizando el constructor de la clase.
//      silvia es el objeto. El constructor recibe los valores "Silvia" para el nombre y 20 para la edad,
//      que son asignados a los atributos nombre y edad.
//
//   6.  System.out.println(silvia.mostrarDatos());
//       Llamada a un metodo: Se llama al metodo mostrarDatos() del objeto silvia,
//       el cual devuelve un String con los datos de la persona.
//       Luego, el println imprime esos datos en la consola.
//
//    7. public Persona(String nombre, int edad) {
//       Constructor: Este es el constructor de la clase Persona. Los constructores se usan para inicializar los objetos cuando se crean.
//       Aquí, el constructor recibe dos parámetros (nombre y edad) y asigna esos valores a los atributos correspondientes de la clase.
//
//
//    8.  this.nombre = nombre;
//        this: La palabra clave this se refiere al objeto actual. Aquí, se asigna el valor del parámetro nombre al atributo de la clase nombre.
//
//
//   9.  this.edad = edad;
//       De manera similar, se asigna el valor del parámetro edad al atributo edad de la clase.
//
//
//   10.  public String mostrarDatos() {
//        Metodo: Este metodo devuelve un String con los datos de la persona.
//
//
//    11.  return "=== Datos de la Persona ===\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n";
//         Retorno de datos: El metodo mostrarDatos devuelve una cadena con el formato que muestra el nombre y la edad de la persona.
//
//
//     12.    }
//         Cierra la clase y el metodo correspondiente.
//
//
// Resumen:
//            Clase: Persona
//            La clase Persona define las características y comportamientos (atributos y métodos) de una persona.
//
//            Objeto: silvia
//            Un objeto es una instancia de una clase. En este caso, silvia es un objeto de la clase Persona.
//            Se crea con el constructor y se utiliza para acceder a sus métodos y atributos.