package ru.inline.armcheck.service;

import org.springframework.stereotype.Service;
import ru.inline.armcheck.domain.Workstation;
import ru.inline.armcheck.repository.WorkstationRepository;

import java.util.List;

@Service
public class WorkstationsService {

    private final WorkstationRepository workstationRepository;

    public WorkstationsService(WorkstationRepository workstationRepository) {
        this.workstationRepository = workstationRepository;
    }

    public List<Workstation> findAll() {
        return workstationRepository.findAll();
    }
}
