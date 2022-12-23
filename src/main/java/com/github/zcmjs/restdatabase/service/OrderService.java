package com.github.zcmjs.restdatabase.service;

import com.github.zcmjs.restdatabase.dto.LiteOrderDTO;
import com.github.zcmjs.restdatabase.dto.OrderDTO;
import com.github.zcmjs.restdatabase.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface OrderService {


    /**
     * Get all the orders.
     *
     * @return the list of entities.
     */
    List<OrderDTO> findAll();

    List<LiteOrderDTO> findAllLite();


    List<OrderDTO> findAll(Sort sort);

    Page<Order> findAll(PageRequest pageRequest);

    Page<OrderDTO> findAll(Pageable pageable);
}


//public interface FreighsService {
//    /**
//     * Save a freighs.
//     *
//     * @param freightDTO the entity to save.
//     * @return the persisted entity.
//     */
//    FreightDTO save(FreightDTO freightDTO);
//
//    /**
//     * Updates a freighs.
//     *
//     * @param freightDTO the entity to update.
//     * @return the persisted entity.
//     */
//    FreightDTO update(FreightDTO freightDTO);
//
//    /**
//     * Partially updates a freighs.
//     *
//     * @param freightDTO the entity to update partially.
//     * @return the persisted entity.
//     */
//    Optional<FreightDTO> partialUpdate(FreightDTO freightDTO);
//
//    /**
//     * Get all the freighs.
//     *
//     * @return the list of entities.
//     */
//    List<FreightDTO> findAll();
//
//    /**
//     * Get all the freighs by id or parent id.
//     *
//     * @return the list of entities.
//     */
//    List<FreightDTO> findAllByIdOrParentId(UUID id);
//
//    /**
//     * Get the "id" freighs.
//     *
//     * @param id the id of the entity.
//     * @return the entity.
//     */
//    Optional<FreightDTO> findOne(UUID id);
//
//    /**
//     * accept the "id" freight.
//     *
//     * @param id the id of the entity.
//     * @return the entity.
//     */
//    FreightDTO accept(UUID id);
//
//    /**
//     * accept the "id" freight.
//     *
//     * @param id the id of the entity.
//     * @return the entity.
//     */
//    FreightDTO cancel(UUID id);
//
//    /**
//     * Delete the "id" freighs.
//     *
//     * @param id the id of the entity.
//     */
//    void delete(UUID id);
//}
