package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Formatter;

//A fórmula para calcular a área de uma circunferência é: area = π . raio2.
//Considerando para este problema que π = 3.14159:
//- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

public class Uri1002_AreaDoCirculo {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double raio = sc.nextDouble();
        double n = 3.14159;
        double area = (raio*raio)*n;

        System.out.println("A=" + String.format("%.4f", area));

    }
}
