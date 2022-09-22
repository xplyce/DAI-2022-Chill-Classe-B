package ch.heigvd.dai.chill.domain.aoiram;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValaisanneBiereDeCaveTest {

    @Test
    void thePriceAndNameForValaisanneShouldBeCorrect() {
        ValaisanneBiereDeCave beer = new ValaisanneBiereDeCave();
        assertEquals(beer.getName(), ValaisanneBiereDeCave.NAME);
        assertEquals(beer.getPrice(), ValaisanneBiereDeCave.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.aoiram.ValaisanneBiereDeCave";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = ValaisanneBiereDeCave.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
