package com.caso1.repository;

import com.perfumeria.domain.Pedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author menas
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long>  {
    List<Pedido> findByIdUsuario(Long idUsuario);
}
