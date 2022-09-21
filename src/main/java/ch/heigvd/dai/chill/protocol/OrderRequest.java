package ch.heigvd.dai.chill.protocol;

import lombok.Data;

@Data
public class OrderRequest implements IMessage {

  private final int quantity;
  private final String productName;

}
