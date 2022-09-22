package ch.heigvd.dai.chill.domain.ernst;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.ernst.Valser;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValserTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Valser beer = new Valser();
    assertEquals(beer.getName(), Valser.NAME);
    assertEquals(beer.getPrice(), Valser.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.ernst.Valser";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Valser.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
