package ch.heigvd.dai.chill.domain.reymermet;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class NotBier implements IProduct {

  public final static String NAME = "Not Bier";
  public final static BigDecimal PRICE = new BigDecimal(0.1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
