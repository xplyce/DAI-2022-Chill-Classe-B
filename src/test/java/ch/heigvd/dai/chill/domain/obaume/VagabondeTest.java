package ch.heigvd.dai.chill.domain.obaume;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.obaume.Vagabonde;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VagabondeTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Vagabonde beer = new Vagabonde();
    assertEquals(beer.getName(), Vagabonde.NAME);
    assertEquals(beer.getPrice(), Vagabonde.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.obaume.Vagabonde";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Vagabonde.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
