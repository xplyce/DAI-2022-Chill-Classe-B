package ch.heigvd.dai.chill.domain.aoiram;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class ValaisanneBiereDeCave implements IProduct {

    public final static String NAME = "Valaisanne - Bière de cave";
    public final static BigDecimal PRICE = new BigDecimal(2.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
