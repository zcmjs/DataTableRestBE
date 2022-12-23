package com.github.zcmjs.restdatabase.controller;

import com.github.zcmjs.restdatabase.dto.LiteOrderDTO;
import com.github.zcmjs.restdatabase.dto.OrderDTO;
import com.github.zcmjs.restdatabase.entity.Order;
import com.github.zcmjs.restdatabase.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping()
    public List<OrderDTO> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/lite")
    public List<LiteOrderDTO> findAllLite() {
        return orderService.findAllLite();
    }


    @GetMapping("/pageable")
    public Page<OrderDTO> findAllLite(Pageable pageable) {
        return orderService.findAll(pageable);
    }

    @GetMapping("/sort/{fieldName}/{sortDirection}")
    public List<OrderDTO> findAllSorted(@PathVariable String fieldName, @PathVariable Sort.Direction sortDirection) {
        return orderService.findAll(Sort.by(sortDirection, fieldName));
    }

    @GetMapping("/pagination/{page}/{offset}")
    public Page<Order> findAllPaginated(@PathVariable Integer page, @PathVariable Integer offset) {
        return orderService.findAll(PageRequest.of(page, offset));
    }

    @GetMapping("/paginationAndSorting/{page}/{offset}/{fieldName}/{sortDirection}")
    public Page<Order> findAllPaginationAndSort(@PathVariable Integer page, @PathVariable Integer offset, @PathVariable String fieldName, @PathVariable Sort.Direction sortDirection) {
        return orderService.findAll(PageRequest.of(page, offset).withSort(sortDirection, fieldName));
    }
}
