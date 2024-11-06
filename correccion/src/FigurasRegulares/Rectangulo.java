// FigurasRegulares/Rectangulo.java
package FigurasRegulares;

public class Rectangulo {
    private double ancho;
    private double altura;

    // Constructor vacío
    public Rectangulo() {}

    // Constructor con parámetros
    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    // Getters y Setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return ancho * altura;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (ancho + altura);
    }
}
