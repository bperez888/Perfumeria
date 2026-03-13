/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.caso1.service;


import com.caso1.domain.Pedido;
import com.perfumeria.domain.Pedido;
import java.util.List;


/**
 *
 * @author menas
 */
public interface PedidoService {

    List<Pedido> listarPedidosPorUsuario(Long idUsuario);
}
