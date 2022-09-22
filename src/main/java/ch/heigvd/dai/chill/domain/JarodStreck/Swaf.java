package ch.heigvd.dai.chill.domain.JarodStreck;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Swaf implements IProduct {

  public final static String NAME = "Punk IPA";
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
