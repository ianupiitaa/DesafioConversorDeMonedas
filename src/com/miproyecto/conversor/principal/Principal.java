package com.miproyecto.conversor.principal;

import com.miproyecto.conversor.modelo.ConversorDeMonedas;
import com.miproyecto.conversor.modelo.FormatoDeSalida;
import com.miproyecto.conversor.modelo.MonedaModelo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConversorDeMonedas conversorDeMonedas = new ConversorDeMonedas();
        while (true){
            try {
                System.out.println("********Conversor de monedas********");
                System.out.println("""
                        Selecciona el tipo de moneda que deseas usar (PRIMERAS TRES LETRAS XXX):
                        1) ARS - Peso argentino
                        2) BOB - Boliviano boliviano
                        3) BRL - Real brasileño
                        4) CLP - Peso chileno
                        5) COP - Peso colombiano
                        6) USD - Dólar estadounidense
                        0 para SALIR DEL PROGRAMA
                        """);
                var monedaUso = teclado.nextLine().toUpperCase();
                if (monedaUso.equals("0")){
                    break;
                }
                System.out.println("""
                        Selecciona el tipo de moneda que desea obtener de cambio (PRIMERAS TRES LETRAS XXX):
                        1) ARS - Peso argentino
                        2) BOB - Boliviano boliviano
                        3) BRL - Real brasileño
                        4) CLP - Peso chileno
                        5) COP - Peso colombiano
                        6) USD - Dólar estadounidense
                        0 para SALIR DEL PROGRAMA
                        """);
                var monedaCambio = teclado.nextLine().toUpperCase();
                if (monedaCambio.equals("0")){
                    break;
                }
                MonedaModelo moneda = conversorDeMonedas.conversion(monedaUso,monedaCambio);
                String monedaFormateada = FormatoDeSalida.formatoAMoneda(moneda);
                System.out.println(monedaFormateada);
            }catch (RuntimeException e){
                System.out.println("Se genera una excepcion del tipo: " + e.getMessage());
            }
        }

    }
}
