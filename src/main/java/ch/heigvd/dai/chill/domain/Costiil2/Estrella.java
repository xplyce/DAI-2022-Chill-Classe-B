package ch.heigvd.dai.chill.domain.Costiil2;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Estrella implements IProduct {

  public final static String NAME = "Estrella";
  public final static BigDecimal PRICE = new BigDecimal(3.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
