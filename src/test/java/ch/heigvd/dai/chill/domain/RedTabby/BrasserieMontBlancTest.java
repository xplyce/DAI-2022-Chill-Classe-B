package ch.heigvd.dai.chill.domain.RedTabby;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrasserieMontBlancTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    BrasserieMontBlanc beer = new BrasserieMontBlanc();
    assertEquals(beer.getName(), BrasserieMontBlanc.NAME);
    assertEquals(beer.getPrice(), BrasserieMontBlanc.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.RedTabby.BrasserieMontBlanc";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BrasserieMontBlanc.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
