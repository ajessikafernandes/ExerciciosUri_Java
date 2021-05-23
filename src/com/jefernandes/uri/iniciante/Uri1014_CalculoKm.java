package com.jefernandes.uri.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
//e o total de combustível gasto (em litros).

public class Uri1014_CalculoKm {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int km = sc.nextInt();
        double litros = sc.nextDouble();
        double consumoMedio = km/litros;

        System.out.println(String.format("%.3f", consumoMedio) + " km/l");

    }
}
