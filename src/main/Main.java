package main;

import modelo.Figura;
import modelo.Circulo;
import modelo.Rectangulo;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de tipo Figura con diferentes figuras
        Figura[] arregloFiguras = new Figura[2];
        arregloFiguras[0] = new Circulo(5.0);
        arregloFiguras[1] = new Rectangulo(4.0, 6.0);

        // Mostrar el área de cada una usando polimorfismo
        for (int i = 0; i < arregloFiguras.length; i++) {
            System.out.println("El área de la figura es: " + arregloFiguras[i].calcularArea());
        }
    }
}
