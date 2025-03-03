// Clase Auto
public class Auto {

    // Atributos de la clase<<<<<<------------
    private String marca;
    private int año;
    private int puertas;
    private double precio;

    // Constructor para inicializar los atributos<<<<<<<<<<<<<-------------------
    public Auto(String marca, int año, int puertas, double precio) {
        this.marca = marca;
        this.año = año;
        this.puertas = puertas;
        this.precio = precio;
    }

    // Métodos Getters (para obtener los valores de los atributos)<<<--------------------
    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public int getPuertas() {
        return puertas;
    }

    public double getPrecio() {
        return precio;
    }

    // Métodos Setters (para modificar los valores de los atributos)<<<<<<<<<<<<<<<<<<----------------------
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAño(int año) {
        if (año > 1885 && año <= java.time.Year.now().getValue()) { // Validar años reales
            this.año = año;
        } else {
            System.out.println("Error: Año inválido.");
        }
    }

    public void setPuertas(int puertas) {
        if (puertas > 0) { // Validación para evitar valores negativos o cero
            this.puertas = puertas;
        } else {
            System.out.println("Error: El número de puertas debe ser positivo.");
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0) { // Validación para evitar precios negativos
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    // Metodo para mostrar los datos del auto<<<<<<<<<<<<<<<<<<-----------------------------------
    public String mostrarDatos() {
        return "=== Información del Auto ===\n" +
                "Marca: " + marca + "\n" +
                "Año: " + año + "\n" +
                "Número de puertas: " + puertas + "\n" +
                "Precio: $" + precio + "\n";
    }

    // Metodo main<<<<<<<<<<<<<<<<<<<<<<<---------------------------------
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto miAuto = new Auto("Toyota", 2022, 4, 25000.50);

        // Mostrar los datos del auto
        System.out.println(miAuto.mostrarDatos());

        // Modificar el precio del auto
        miAuto.setPrecio(27000.75);

        // Mostrar los datos del auto después de modificar el precio
        System.out.println("Después de cambiar el precio:");
        System.out.println(miAuto.mostrarDatos());

        // Intentar asignar un precio negativo (para probar la validación)
        miAuto.setPrecio(-5000);
    }
}

