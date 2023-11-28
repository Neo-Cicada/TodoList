package com.example.springboottodoapplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.springboottodoapplication.models.TodoItem;

/**
 * TodoItemRepository
 */
public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}