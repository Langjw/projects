public class StringDemo2
{
  public static void main ( String[] args )
  {
    String str;
    int    len;

    str = new String( "Elementary, my dear Watson!" );

    len = str.length();

    System.out.println("The length is: " + len );

    String secondStr;
    int secondLen;
    secondStr = new String("Woohoooo, yipeeee");

    secondLen = secondStr.length();
    System.out.println("The length is: " + secondLen );
  }
}