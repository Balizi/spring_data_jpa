package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designantion;
    private double prix;
    private int quantite;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDesignantion() {
        return designantion;
    }

    public void setDesignantion(String designantion) {
        this.designantion = designantion;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", designantion='" + designantion + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }
}
