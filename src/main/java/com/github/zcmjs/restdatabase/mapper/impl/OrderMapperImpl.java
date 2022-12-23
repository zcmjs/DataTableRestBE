//package com.github.zcmjs.restdatabase.mapper.impl;
//
//import com.github.zcmjs.restdatabase.dto.OrderDTO;
//import com.github.zcmjs.restdatabase.entity.Order;
//import com.github.zcmjs.restdatabase.mapper.OrderMapper;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class OrderMapperImpl implements OrderMapper {
//    @Override
//    public Order toEntity(OrderDTO dto) {
//        if (dto == null) {
//            return null;
//        }
//        Order entity = new Order();
//        entity.setId(dto.getId());
//        entity.setNumberRange(dto.getNumberRange());
//        entity.setName(dto.getName());
//        entity.setEmail(dto.getEmail());
//        entity.setPhone(dto.getPhone());
//        entity.setAddress(dto.getAddress());
//        entity.setCountry(dto.getCountry());
//        entity.setRegion(dto.getRegion());
//        entity.setPostalZip(dto.getPostalZip());
//        entity.setTextx(dto.getTextx());
//        entity.setDate(dto.getDate());
//
//        return entity;
//    }
//
//    @Override
//    public OrderDTO toDto(Order entity) {
//        if (entity == null) {
//            return null;
//        }
//        OrderDTO dto = new OrderDTO();
//        dto.setId(entity.getId());
//        dto.setNumberRange(entity.getNumberRange());
//        dto.setName(entity.getName());
//        dto.setEmail(entity.getEmail());
//        dto.setPhone(entity.getPhone());
//        dto.setAddress(entity.getAddress());
//        dto.setCountry(entity.getCountry());
//        dto.setRegion(entity.getRegion());
//        dto.setPostalZip(entity.getPostalZip());
//        dto.setTextx(entity.getTextx());
//        dto.setDate(entity.getDate());
//        return dto;
//    }
//
//    @Override
//    public List<Order> toEntity(List<OrderDTO> dtoList) {
//        return null;
//    }
//
//    @Override
//    public List<OrderDTO> toDto(List<Order> entityList) {
//        if (entityList == null) {
//            return null;
//        }
//        return entityList.stream()
//                .map(this::toDto)
//                .toList();
//    }
//}
