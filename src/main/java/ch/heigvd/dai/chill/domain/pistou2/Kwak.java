package ch.heigvd.dai.chill.domain.pistou2;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Kwak implements IProduct {

  public final static String NAME = "Kwak";
  public final static BigDecimal PRICE = new BigDecimal(8.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
