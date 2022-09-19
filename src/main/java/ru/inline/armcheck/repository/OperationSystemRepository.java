package ru.inline.armcheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.inline.armcheck.domain.OperationSystem;

public interface OperationSystemRepository extends JpaRepository<OperationSystem, Integer> {
}
