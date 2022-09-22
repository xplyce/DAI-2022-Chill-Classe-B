package ch.heigvd.dai.chill.domain.motacarneiro;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Sagres implements IProduct {

  public final static String NAME = "Sagres";
  public final static BigDecimal PRICE = new BigDecimal(4.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
