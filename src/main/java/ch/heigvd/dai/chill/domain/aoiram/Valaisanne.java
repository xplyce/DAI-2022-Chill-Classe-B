package ch.heigvd.dai.chill.domain.aoiram;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Valaisanne implements IProduct {

    public final static String NAME = "Valaisanne";
    public final static BigDecimal PRICE = new BigDecimal(2.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
