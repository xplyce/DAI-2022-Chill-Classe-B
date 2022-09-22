package ch.heigvd.dai.chill.domain.theookage;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class SuperBock implements IProduct {

  public final static String NAME = "SuperBock";
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