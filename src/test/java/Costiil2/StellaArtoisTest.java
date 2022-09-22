package Costiil2;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.Costiil2.StellaArtois;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StellaArtoisTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    StellaArtois beer = new StellaArtois();
    assertEquals(beer.getName(), StellaArtois.NAME);
    assertEquals(beer.getPrice(), StellaArtois.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForStellaArtois() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.Costiil2.StellaArtois";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = StellaArtois.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
