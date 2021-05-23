package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class Uri1012_CalculoArea {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double pi = 3.14159;

        double triangulo = a*c/2;
        double circulo = (c*c)*pi;
        double trapezio = (a+b)*c/2;
        double quadrado = b*b;
        double retangulo = a*b;

        System.out.println("TRIANGULO: " + String.format("%.3f", triangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", circulo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", quadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", retangulo));

    }
}
