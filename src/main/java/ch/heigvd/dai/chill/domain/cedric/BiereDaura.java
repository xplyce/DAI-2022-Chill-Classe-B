package ch.heigvd.dai.chill.domain.cedric;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class BiereDaura implements IProduct {

  public final static String NAME = "BiereDaura";
  public final static BigDecimal PRICE = new BigDecimal(3.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
