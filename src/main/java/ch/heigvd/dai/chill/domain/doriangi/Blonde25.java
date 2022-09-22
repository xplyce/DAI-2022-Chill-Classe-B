package ch.heigvd.dai.chill.domain.doriangi;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Blonde25 implements IProduct {

  public final static String NAME = "Blonde 25";
  public final static BigDecimal PRICE = new BigDecimal(2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
