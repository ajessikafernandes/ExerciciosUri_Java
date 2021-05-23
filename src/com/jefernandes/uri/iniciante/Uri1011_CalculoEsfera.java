package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa que calcule e mostre o volume de uma esfera
//sendo fornecido o valor de seu raio (R).
//A fórmula para calcular o volume é: (4/3) * pi * R3.
//Considere (atribua) para pi o valor 3.14159.

public class Uri1011_CalculoEsfera {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double raio = sc.nextDouble();
        double pi = 3.14159;
        double volume = (4.0/3.0)*pi*(raio*raio*raio);

        System.out.println("VOLUME = " + String.format("%.3f", volume));

    }
}
