package com.github.zcmjs.restdatabase.service;

import com.github.zcmjs.restdatabase.dto.LiteOrderDTO;
import com.github.zcmjs.restdatabase.dto.OrderDTO;
import com.github.zcmjs.restdatabase.entity.Order;
import com.github.zcmjs.restdatabase.mapper.OrderMapper;
import com.github.zcmjs.restdatabase.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        return orderMapper.toDto(orderRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public List<LiteOrderDTO> findAllLite() {
        return orderMapper.toLiteOrderDTO(orderRepository.findAll());
    }
    @Override
    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(Sort sort) {
        return orderMapper.toDto(orderRepository.findAll(sort));
    }
    @Override
    @Transactional(readOnly = true)
    public Page<Order> findAll(PageRequest pageRequest) {
        return orderRepository.findAll(pageRequest);
    }
    @Override
    @Transactional(readOnly = true)
    public Page<OrderDTO> findAll(Pageable pageable) {
        return orderRepository.findAll(pageable).map(orderMapper::toDto);
    }

}
