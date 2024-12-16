package com.salesianostriana.dam.ejeval01.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Place {

    private  Long id;

    private String nombre;
    private String direccion;
    private String locacion;
    private String descripcion;
    private String tags;
    private String imagen;
}
