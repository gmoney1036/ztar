package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.demo.model.data;
import com.test.demo.repository.dataRepository;

import java.util.List;

@Service
public class dataService {
    private final dataRepository dataRepository;

    @Autowired
    public dataService(dataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<data> getAllNumbers() {
        return dataRepository.getAllNumbers();
    }

    
}
