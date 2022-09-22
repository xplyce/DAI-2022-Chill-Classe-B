package ch.heigvd.dai.chill.domain.reymermet;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.reymermet.NotBier;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotBierTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    NotBier beer = new NotBier();
    assertEquals(beer.getName(), NotBier.NAME);
    assertEquals(beer.getPrice(), NotBier.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.reymermet.NotBier";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = NotBier.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
