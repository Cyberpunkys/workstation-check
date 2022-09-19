package ru.inline.armcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.inline.armcheck.domain.Workstation;

public interface WorkstationRepository extends JpaRepository<Workstation, Integer> {
}
