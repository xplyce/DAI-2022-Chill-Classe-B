package ch.heigvd.dai.chill.protocol;

import lombok.Data;

@Data
public class GreetingsResponse implements IMessage {

  private final String text;

}
