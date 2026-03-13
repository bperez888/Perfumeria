/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.perfumeria.service;


import com.perfumeria.domain.Pedido;
import java.util.List;


/**
 *
 * @author menas
 */
public interface PedidoService {

    List<Pedido> listarPedidosPorUsuario(Long idUsuario);
}
