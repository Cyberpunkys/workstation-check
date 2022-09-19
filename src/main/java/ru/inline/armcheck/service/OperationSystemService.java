package ru.inline.armcheck.service;

import org.springframework.stereotype.Service;
import ru.inline.armcheck.domain.OperationSystem;
import ru.inline.armcheck.repository.OperationSystemRepository;

import java.util.List;

@Service
public class OperationSystemService {

    private final OperationSystemRepository operationSystemRepository;

    public OperationSystemService(OperationSystemRepository operationSystemRepository) {
        this.operationSystemRepository = operationSystemRepository;
    }

    public List<OperationSystem> findAll() {
        return operationSystemRepository.findAll();
    }

    public void create(OperationSystem os) {
        operationSystemRepository.save(os);
    }
}
