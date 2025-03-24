package com.nandes.CalculadorAPI.domain.models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class food {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable=false, unique=true)
    private String name;
    @Column(nullable=false, unique=true)
    private float kcalBy100g;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getKcalBy100g() {
        return kcalBy100g;
    }

    public void setKcalBy100g(float kcalBy100g) {
        this.kcalBy100g = kcalBy100g;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final food other = (food) obj;
        return Objects.equals(this.name, other.name);
    }

    

}
