package ch.heigvd.dai.chill.domain.JarodStreck;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwafTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Swaf beer = new Swaf();
    assertEquals(beer.getName(), Swaf.NAME);
    assertEquals(beer.getPrice(), Swaf.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.JarodStreck.Swaf";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Swaf.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
