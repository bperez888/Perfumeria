package com.caso1.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author menas
 */
@Data
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    private LocalDate fecha;
    private double total;
    private String estado;
    private Long idUsuario;
}