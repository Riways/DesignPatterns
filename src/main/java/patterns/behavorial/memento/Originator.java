package patterns.behavorial.memento;

import java.util.concurrent.ThreadLocalRandom;

public class Originator {
	 private String state;

     Originator(String state)
     {
         this.state = state;
         System.out.println("Originator: My initial state is: " + state);
     }

     public void doSomething()
     {
    	 System.out.println("Originator: I'm doing something important.");
         this.state = this.generateRandomString(30);
         synchronized(this) {
        	 try {
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
         }
         System.out.println("Originator: and my state has changed to: " + state);
     }

     private String generateRandomString(int length)
     {
         StringBuilder result = new StringBuilder();

         while (length > 0)
         {
             result.append((char)ThreadLocalRandom.current().nextInt(97, 122)) ;

             length--;
         }

         return result.toString();
     }

     public Memento getMementoShot()
     {
         return new MementoImpl(this.state);
     }

     public void restore(Memento memento)
     {
         this.state = memento.getState();
         System.out.println("Originator: My state has changed to: " + state);
     }
}
