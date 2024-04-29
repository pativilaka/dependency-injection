package com.vilaka.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PensionService {
    public double discount(double amount){
        return amount * 0.1;
    }
}
