package ch.heigvd.dai.chill.domain.fazlijaylli;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sommersby implements IProduct {

  public final static String NAME = "Sommersby";
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
