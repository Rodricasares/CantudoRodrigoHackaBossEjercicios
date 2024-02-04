package com.celiacos.platos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Setter
@Getter
@AllArgsConstructor


public class PedidoDTO implements Serializable {

private Long id_plato;
private String nombre_plato;
private Boolean apto_celiacos;

}
