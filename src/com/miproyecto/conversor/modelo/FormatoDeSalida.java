package com.miproyecto.conversor.modelo;

public class FormatoDeSalida {
    private String formatoNice;
    public static String formatoAMoneda(MonedaModelo moneda){
        return String.format("""
                        Conversion de: %s ---> %s
                        Tasa de cambio: %f
                        Fecha de actualizacion: %s
                        """,
                moneda.base_code(),moneda.target_code(),moneda.conversion_rate(),moneda.time_next_update_utc());

    }
}
