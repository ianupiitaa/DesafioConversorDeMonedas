package com.miproyecto.conversor.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("********Conversor de monedas********");
        System.out.println("Selecciona el tipo de moneda que deseas usar");
        var monedaUso = teclado.nextLine();
        System.out.println("Selecciona el tipo de moneda que desea obtener de cambio");
        var monedaCambio = teclado.nextLine();
//        System.out.println(monedaUso + "*****" +monedaCambio);

    }
}
