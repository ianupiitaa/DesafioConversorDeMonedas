package com.miproyecto.conversor.modelo;

public record MonedaModelo(String result,
                           String documentation,
                           String terms_of_use,
                           Double time_last_update_unix,
                           String time_last_update_utc,
                           Double time_next_update_unix,
                           String time_next_update_utc,
                           String base_code,
                           String target_code,
                           Double conversion_rate) {
}
