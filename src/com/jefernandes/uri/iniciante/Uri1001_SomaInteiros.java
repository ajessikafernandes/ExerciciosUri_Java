package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Scanner;

//Leia 2 valores inteiros e armazene-os nas variáveis A e B.
//Efetue a soma de A e B atribuindo o seu resultado na variável X.
//Imprima X conforme exemplo apresentado abaixo.
//Não apresente mensagem alguma além daquilo que está sendo especificado
//e não esqueça de imprimir o fim de linha após o resultado,
//caso contrário, você receberá "Presentation Error".

public class Uri1001_SomaInteiros {

    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a+b;

        System.out.println("X = " + x);
    }
}
