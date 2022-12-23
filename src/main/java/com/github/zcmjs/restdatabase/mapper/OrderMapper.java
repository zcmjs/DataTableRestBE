package com.github.zcmjs.restdatabase.mapper;

import com.github.zcmjs.restdatabase.dto.LiteOrderDTO;
import com.github.zcmjs.restdatabase.dto.OrderDTO;
import com.github.zcmjs.restdatabase.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper extends EntityMapper<OrderDTO, Order> {

    LiteOrderDTO toLiteOrderDTO(Order entity);
    List<LiteOrderDTO> toLiteOrderDTO(List<Order> entityList);
}
