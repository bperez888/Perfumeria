/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso1.controller;

import com.caso1.domain.Pedido;
import com.caso1.service.PedidoService;
import com.perfumeria.domain.Pedido;
import com.perfumeria.service.PedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author menas
 */
@RestController
@RequestMapping("/pedidos")
public class PedidoController {
     @Autowired
    private PedidoService pedidoService;

    @GetMapping("/usuario/{id}")
    public List<Pedido> obtenerPedidos(@PathVariable Long id) {
        return pedidoService.listarPedidosPorUsuario(id);
    }
}
