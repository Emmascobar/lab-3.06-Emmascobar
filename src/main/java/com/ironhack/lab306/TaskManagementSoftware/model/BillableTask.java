package com.ironhack.lab306.TaskManagementSoftware.model;

import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task {

    private Double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
