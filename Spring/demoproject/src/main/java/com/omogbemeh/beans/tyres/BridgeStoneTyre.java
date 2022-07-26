package com.omogbemeh.beans.tyres;

import com.omogbemeh.interfaces.TyreInterface;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre extends Tyre implements TyreInterface {

    public BridgeStoneTyre() {
        super("BridgeStone");
    }

    public void rotate() {
        System.out.println("The bridgeStone tyre is rotating");
    }
}
