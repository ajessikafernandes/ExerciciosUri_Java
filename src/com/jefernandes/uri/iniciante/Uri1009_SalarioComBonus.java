package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia o nome de um vendedor,
//o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
//Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
//informar o total a receber no final do mês, com duas casas decimais.

public class Uri1009_SalarioComBonus {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nomeVendedor = sc.next();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double salarioFinal = (totalVendas*0.15)+salarioFixo;

        System.out.println("TOTAL = R$ " + String.format("%.2f", salarioFinal));

    }
}
