package ch.heigvd.dai.chill.domain.ernst;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Coca implements IProduct {

  public final static String NAME = "Coca";
  public final static BigDecimal PRICE = new BigDecimal(1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
