/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.perfumeria.service;

import com.perfumeria.domain.Pedido;
import com.perfumeria.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author menas
 */
@Service
public class PedidoServiceImpl implements PedidoService{
    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> listarPedidosPorUsuario(Long idUsuario) {
        return pedidoRepository.findByIdUsuario(idUsuario);
    }
}
