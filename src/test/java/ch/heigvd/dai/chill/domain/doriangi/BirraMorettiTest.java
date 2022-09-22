package ch.heigvd.dai.chill.domain.doriangi;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.doriangi.BirraMoretti;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirraMorettiTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    BirraMoretti beer = new BirraMoretti();
    assertEquals(beer.getName(), BirraMoretti.NAME);
    assertEquals(beer.getPrice(), BirraMoretti.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.doriangi.BirraMoretti";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BirraMoretti.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
