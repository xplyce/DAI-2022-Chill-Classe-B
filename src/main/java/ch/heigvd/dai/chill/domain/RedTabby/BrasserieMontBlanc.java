package ch.heigvd.dai.chill.domain.RedTabby;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class BrasserieMontBlanc implements IProduct {

  public final static String NAME = "BrasserieMontBlanc";
  public final static BigDecimal PRICE = new BigDecimal(3.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
