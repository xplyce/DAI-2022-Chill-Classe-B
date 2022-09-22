package ch.heigvd.dai.chill.domain.doriangi;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class BirraMoretti implements IProduct {

  public final static String NAME = "Birra Moretti";
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
