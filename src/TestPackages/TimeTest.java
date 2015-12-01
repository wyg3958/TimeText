package TestPackages;

//import static org.junit.Assert.*;
import timetext.Time;
//import org.junit.Test;

/**
 *
 * @author Kade
 */
public class TimeTest {

   /**
    * This tests the full Time Class
    */
   public TimeTest() {
      System.out.println("Testing Time Class");
      testToString();
      testGetDate();
      testGetMilliSeconds();
      testAccessor();
      testCompair();

   }

   /**
    * This tests the accessor for the time class
    */
   public void testToString() {
      System.err.println("Time: " + newTime.toSting());
   }

   public void testGetDate() {
      System.err.println("Date: " + newTime.getTime());
   }

   public void testGetMilliSeconds() {
      System.err.println("MilliSeconds: " + newTime.getMilliSec());
   }

   public void testAccessor() {
      System.err.println(newTime.getHours() + ":" + newTime.getMinutes() + ":" + newTime.getSeconds() + " :: " + newTime.getYear());
   }

   public void testCompair() {

      System.err.println("The Time difference is: " + newTime.compair(new Time()));
   }
   /**
    * creates a new time object to test
    */
   public Time newTime = new Time();

   public void testTimeClass() {
  
   }
}
