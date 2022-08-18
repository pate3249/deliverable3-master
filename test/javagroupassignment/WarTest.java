package javagroupassignment;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class WarTest {

                
   GameImplement gameImplement = new GameImplement("War game",2,4,52);
   
   @Test
   public void testEmpty() {
       gameImplement = new GameImplement("War game",1,1,2);
       assertEquals(0, gameImplement.declareWinner());
   }

   @Test
   public void testOne() {
       gameImplement = new GameImplement("War game",2,4,52);
       assertEquals(0, gameImplement.declareWinner());
   }

   @Test
   public void testTwoA() {
        gameImplement = new GameImplement("War game",2,4,10);
       assertEquals(0, gameImplement.declareWinner());
   }

   @Test
   public void testTwoB() {
        gameImplement = new GameImplement("War game",2,4,5);
       assertEquals(0, gameImplement.declareWinner());
   }
  
}