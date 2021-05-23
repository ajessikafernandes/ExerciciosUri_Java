package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//Escreva um programa que leia o número de um funcionário,
//seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
//A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

public class Uri1008_Salario {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double horaValor = sc.nextDouble();

        double salario = horasTrabalhadas*horaValor;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));

    }
}
