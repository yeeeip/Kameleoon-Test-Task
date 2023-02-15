package com.nuzhd.techtask.service;

import com.nuzhd.techtask.model.Quote;

import java.util.List;
import java.util.UUID;

public interface QuoteService {

    Quote create(Quote quote);

    Quote update(Quote quote);

    Quote findById(UUID quoteId);

    List<Quote> findAll();

    void deleteById(UUID quoteId);

    List<Quote> findTop10();

    List<Quote> findWorst10();

}
