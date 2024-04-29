package com.vilaka.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TaxService {
    public double tax(double amount){
        return amount * 0.2;
    }
}
