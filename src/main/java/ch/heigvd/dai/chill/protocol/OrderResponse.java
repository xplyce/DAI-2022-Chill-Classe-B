package ch.heigvd.dai.chill.protocol;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponse implements IMessage {

  private final BigDecimal totalPrice;

}
