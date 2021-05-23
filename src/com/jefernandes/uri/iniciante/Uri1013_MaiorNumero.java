package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.abs;

//Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.

public class Uri1013_MaiorNumero {

    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int ab = ( a + b + java.lang.Math.abs( a - b)) / 2;
        int abc = ( ab + c + java.lang.Math.abs(ab - c)) / 2;

        System.out.println( abc + " eh o maior");

    }
}
