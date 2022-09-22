package ch.heigvd.dai.chill.domain.santoro;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Jus implements IProduct {

    public final static String NAME = "Jus";
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
