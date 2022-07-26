package com.omogbemeh.factory;

import com.omogbemeh.beans.tyres.BridgeStoneTyre;
import com.omogbemeh.beans.tyres.MichelinTyre;
import com.omogbemeh.beans.tyres.Tyre;
import org.springframework.stereotype.Component;

@Component
public class TyreFactory {

    public static Tyre createTyre(String tyreType) {
        String formattedTyre = tyreType.strip().toLowerCase();
        if ("bridgestone".equals(formattedTyre)) return new BridgeStoneTyre();
        else if ("michelin".equals(formattedTyre)) return new MichelinTyre();
        return null;
    }
}
