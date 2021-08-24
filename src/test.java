import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class test {

    @Test 
    public void isThenumber0(){
        assertEquals(" ",fizbuz.check(0));
    }

    @Test
    public void isThenumberdivisibleby5(){
        assertEquals("Fizz", fizbuz.check(5));
    }

    @Test
    public void isThenumberdivisibleby3(){
        assertEquals("Buzz",fizbuz.check(3));
    }

    @Test
    public void isThenumberdivisibleby3and5(){
        assertEquals("FizzBuzz", fizbuz.check(15));
    }

    @Test
    public void randomnumber(){
        assertEquals("FizzBuzz", fizbuz.check(60));
    }
}