import FigurasRegulares.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear e inicializar el objeto Cuadrado
        Cuadrado cuadrado = new Cuadrado();
        System.out.print("Ingrese el valor del lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());

        // Crear e inicializar el objeto Rectangulo
        Rectangulo rectangulo = new Rectangulo();
        System.out.print("Ingrese el ancho del rectángulo: ");
        rectangulo.setAncho(scanner.nextDouble());
        System.out.print("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(scanner.nextDouble());

        // Crear e inicializar el objeto Circulo
        Circulo circulo = new Circulo();
        System.out.print("Ingrese el radio del círculo: ");
        circulo.setRadio(scanner.nextDouble());

        // Crear e inicializar el objeto Triangulo
        Triangulo triangulo = new Triangulo();
        System.out.print("Ingrese la base del triángulo: ");
        triangulo.setBase(scanner.nextDouble());
        System.out.print("Ingrese la altura del triángulo: ");
        triangulo.setAltura(scanner.nextDouble());

        // Calcular y mostrar el área y el perímetro de cada figura
        mostrarResultados("Cuadrado", cuadrado.getLado(), cuadrado.calcularArea(), cuadrado.calcularPerimetro());
        mostrarResultados("Rectángulo", rectangulo.getAncho(), rectangulo.getAltura(), rectangulo.calcularArea(), rectangulo.calcularPerimetro());
        mostrarResultados("Círculo", circulo.getRadio(), circulo.calcularArea(), circulo.calcularPerimetro());
        mostrarResultados("Triángulo", triangulo.getBase(), triangulo.getAltura(), triangulo.calcularArea(), triangulo.calcularPerimetro());

        // Sumar áreas
        double sumaAreas = cuadrado.calcularArea() + rectangulo.calcularArea() + circulo.calcularArea() + triangulo.calcularArea();
        System.out.printf("La sumatoria de las áreas de todas las figuras es: %.2f\n", sumaAreas);
    }

    private static void mostrarResultados(String nombreFigura, double medida1, double area, double perimetro) {
        System.out.printf("%s - Medida: %.2f | Área: %.2f | Perímetro: %.2f\n", nombreFigura, medida1, area, perimetro);
    }

    private static void mostrarResultados(String nombreFigura, double medida1, double medida2, double area, double perimetro) {
        System.out.printf("%s - Medidas: %.2f, %.2f | Área: %.2f | Perímetro: %.2f\n", nombreFigura, medida1, medida2, area, perimetro);
    }
}
