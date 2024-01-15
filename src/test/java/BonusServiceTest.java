import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.BonusService;

 public class BonusServiceTest {
    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
     @Test
     public void shouldCalculateForRegisteredAndOverLimit(){
         BonusService service = new BonusService();
         long amount = 1_000_000;
         boolean registered = true;
         long expected = 500;
         long actual = service.calculate(amount,registered);
         Assertions.assertEquals(expected,actual);
     }
     @Test
     public void shouldCalculateForRegisteredAndUnderLimit2() {
         BonusService service = new BonusService();
         long amount = 1000;
         boolean registered = false;
         long expected = 30;
         long actual = service.calculate(amount, registered);
         Assertions.assertEquals(expected, actual);
     }
     @Test
     public void shouldCalculateForRegisteredAndOverLimit2(){
         BonusService service = new BonusService();
         long amount = 1_000_000;
         boolean registered = false;
         long expected = 500;
         long actual = service.calculate(amount,registered);
         Assertions.assertEquals(expected,actual);
     }
 }

