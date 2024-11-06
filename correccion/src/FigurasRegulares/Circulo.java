// FigurasRegulares/Circulo.java
package FigurasRegulares;

public class Circulo {
    private double radio;

    // Constructor vacío
    public Circulo() {}

    // Constructor con parámetro
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter y Setter para el atributo radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro (circunferencia)
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
