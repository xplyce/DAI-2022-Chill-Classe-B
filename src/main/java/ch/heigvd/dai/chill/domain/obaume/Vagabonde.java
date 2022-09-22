package ch.heigvd.dai.chill.domain.obaume;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Vagabonde implements IProduct {
    public final static String NAME = "Vagabonde";
    public final static BigDecimal PRICE = new BigDecimal(3.5);

    @Override
    public String getName() {return NAME;}

    @Override
    public BigDecimal getPrice() {return PRICE;}
}
