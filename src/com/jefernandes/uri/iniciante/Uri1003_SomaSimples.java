package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia dois valores inteiros, no caso para variáveis A e B.
//A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

public class Uri1003_SomaSimples {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = a + b;

        System.out.println("SOMA = " + soma);

    }
}
