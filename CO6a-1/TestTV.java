import java.util.*;
public class TestTV
{
  public static void main(String[] args)
  {
    TV tv1 = new TV();
    tv1.turnOn();
    tv1.setChannel(30);
    tv1.setVolume(3);

    TV tv2 = new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();

    System.out.println("channel for TV1 is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
    System.out.println("channel for TV2 is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
  }
}
