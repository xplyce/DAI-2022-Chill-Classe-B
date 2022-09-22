package ch.heigvd.dai.chill.domain.theookage;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoxerTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        SuperBock beer = new SuperBock();
        assertEquals(beer.getName(), SuperBock.NAME);
        assertEquals(beer.getPrice(), SuperBock.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.theookage.SuperBock";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = SuperBock.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}