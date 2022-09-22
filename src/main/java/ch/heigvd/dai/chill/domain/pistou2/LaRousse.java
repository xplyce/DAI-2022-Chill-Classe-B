package ch.heigvd.dai.chill.domain.pistou2;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class LaRousse implements IProduct {

  public final static String NAME = "La Rousse, par la Brasserie du Mont Blanc";
  public final static BigDecimal PRICE = new BigDecimal(4.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
