package com.nuzhd.task.repository;

import com.nuzhd.task.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface QuoteRepository extends JpaRepository<Quote, UUID> {

}
