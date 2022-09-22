package ch.heigvd.dai.chill.domain.fazlijaylli;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SommersbyTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Sommersby beer = new Sommersby();
    assertEquals(beer.getName(), Sommersby.NAME);
    assertEquals(beer.getPrice(), Sommersby.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.fazlijaylli.Sommersby";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Sommersby.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
