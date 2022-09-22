package ch.heigvd.dai.chill.domain.chywou;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class JusDePomme implements IProduct {

  public final static String NAME = "Jus de pomme";
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
