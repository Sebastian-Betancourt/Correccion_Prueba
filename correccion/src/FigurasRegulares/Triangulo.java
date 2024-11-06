// FigurasRegulares/Triangulo.java
package FigurasRegulares;

public class Triangulo {
    private double base;
    private double altura;

    // Constructor vacío
    public Triangulo() {}

    // Constructor con parámetros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro (simplificado)
    public double calcularPerimetro() {
        return base * 3; // Perímetro aproximado para un triángulo equilátero
    }
}
