package com.ironhack.lab306.TaskManagementSoftware.repository;

import com.ironhack.lab306.TaskManagementSoftware.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}