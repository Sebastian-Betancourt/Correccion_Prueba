// FigurasRegulares/Cuadrado.java
package FigurasRegulares;
import java.util.Scanner;

public class Cuadrado {
    private double lado;

    // Constructor vacío
    public Cuadrado() {}

    // Constructor con parámetro
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Getter y Setter para el atributo lado
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return lado * lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
