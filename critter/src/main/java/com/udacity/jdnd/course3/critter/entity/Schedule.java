package com.udacity.jdnd.course3.critter.entity;

import com.udacity.jdnd.course3.critter.user.EmployeeSkill;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Table
@Entity
public class Schedule {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;
    @ManyToMany(targetEntity = Pet.class)
    private List<Pet> pets;
    @ManyToMany(targetEntity = Employee.class)
    private List<Employee> employee;
    @ElementCollection
    private Set<EmployeeSkill> activities;

    public Schedule() {}

    public Schedule(LocalDate date, Set<EmployeeSkill> activities) {
        this.date = date;
        this.activities = activities;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public Set<EmployeeSkill> getActivities() {
        return activities;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public void setActivities(Set<EmployeeSkill> activities) {
        this.activities = activities;
    }
}
