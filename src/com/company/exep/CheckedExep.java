package com.company.exep;

import com.company.plants.Seeds;

public class CheckedExep extends Exception{

    public CheckedExep(String message) {
        super(message);
    }

    public CheckedExep(String message, Throwable cause) {
        super(message, cause);
    }
}
