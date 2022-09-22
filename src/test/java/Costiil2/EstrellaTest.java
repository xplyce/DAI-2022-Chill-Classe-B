package Costiil2;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.Costiil2.Estrella;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EstrellaTest {

  @Test
  void thePriceAndNameForEstrellaShouldBeCorrect() {
    Estrella beer = new Estrella();
    assertEquals(beer.getName(), Estrella.NAME);
    assertEquals(beer.getPrice(), Estrella.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForEstrella() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.Costiil2.Estrella";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Estrella.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
