package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//Neste problema, deve-se ler o código de uma peça 1,
//o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2,
//o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

public class Uri1010_CalculoSimples {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int codPeca1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codPeca2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double total = (qtd1*valorPeca1)+(qtd2*valorPeca2);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

    }
}
