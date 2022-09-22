package ch.heigvd.dai.chill.domain.ernst;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.ernst.Coca;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CocaTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Coca beer = new Coca();
    assertEquals(beer.getName(), Coca.NAME);
    assertEquals(beer.getPrice(), Coca.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.ernst.Coca";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Coca.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
