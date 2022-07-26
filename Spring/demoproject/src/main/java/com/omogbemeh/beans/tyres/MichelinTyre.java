package com.omogbemeh.beans.tyres;

import com.omogbemeh.interfaces.TyreInterface;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyre extends Tyre implements TyreInterface {
    public MichelinTyre() {
        super("Michelin");
    }

    public void rotate() {
        System.out.println("The Michelin tyre is rotating");
    }
}
