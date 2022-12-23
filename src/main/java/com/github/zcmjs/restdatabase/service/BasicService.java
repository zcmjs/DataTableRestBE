package com.github.zcmjs.restdatabase.service;

/**
 * Contract for a generic dto to entity mapper.
 *
 * @param <D> - DTO type parameter.
 * @param <E> - Entity type parameter.
 */
public interface BasicService <D, E> {
    /**
     * Save a freighs.
     *
     * @param entity the entity to save.
     * @return the persisted entity mapped to dto.
     */
    D save(E entity);
}
