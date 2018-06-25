package com.example.socialmultiplication.repositories;

import com.example.socialmultiplication.domain.Multiplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {
}
