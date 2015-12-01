/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackages;

import timetext.Message;

/**
 * This class is used to test the Message Class
 *
 * @author Kade Helseth
 */
public class MessageTest {

   public MessageTest() {
      this.TestMessage();
   }

   public void TestMessage() {
      System.out.println("Testing Message Class: ");
      MessageTest();
   }

   public void MessageTest() {
      System.err.println("Message1: " + message1.getMessage() + " sent at: " + message1.getTimeStamp());
      System.err.print("Changing the message text to: ");
      message1.setMessage("This is a new Text");
      System.err.print(message1.getMessage() + "\n");

      System.err.println("Message2: " + message2.getMessage() + " sent at: " + message2.getTimeStamp());

   }

   private final Message message1 = new Message("Text message");
   private final Message message2 = new Message("Mom, give me back my spaghetti");

}
