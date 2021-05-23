package com.jefernandes.uri.iniciante;

import java.util.Scanner;
import java.io.IOException;

//Leia dois valores inteiros.
//A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
//A seguir mostre a variável PROD com mensagem correspondente.

public class Uri1004_SomaProd {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a * b;

        System.out.println("PROD = " + prod);
    }
}
