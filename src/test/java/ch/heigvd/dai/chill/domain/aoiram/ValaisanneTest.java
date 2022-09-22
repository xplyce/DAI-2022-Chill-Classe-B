package ch.heigvd.dai.chill.domain.aoiram;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValaisanneTest {

    @Test
    void thePriceAndNameForValaisanneShouldBeCorrect() {
        Valaisanne beer = new Valaisanne();
        assertEquals(beer.getName(), Valaisanne.NAME);
        assertEquals(beer.getPrice(), Valaisanne.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.aoiram.Valaisanne";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Valaisanne.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
