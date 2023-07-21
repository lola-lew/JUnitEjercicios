package fizz.buzz;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

  private FizzBuzz game;

  @Before
  public void before() {
    game = new FizzBuzz();
  }

  @Test
  public void should_returnNumbers_whenNotAMultipleOf3Or5(){
    List<String> numbersList = game.getNumbers();
    assertEquals("1", numbersList.get(0));
    assertEquals("2", numbersList.get(1));
    assertEquals("13", numbersList.get(12));
  }

  @Test
  public void should_returnFizz_whenIsAMultipleOf3(){
    List<String> numbersList = game.getNumbers();
    assertEquals("Fizz", numbersList.get(2));
    assertEquals("Fizz", numbersList.get(5));
    assertEquals("Fizz", numbersList.get(8));
    assertEquals("Fizz", numbersList.get(11));
  }

  @Test
  public void should_returnBuzz_whenIsAMultipleOf5(){
    List<String> numbersList = game.getNumbers();
    assertEquals("Buzz", numbersList.get(4));
    assertEquals("Buzz", numbersList.get(9));
    assertEquals("Buzz", numbersList.get(19));
    assertEquals("Buzz", numbersList.get(24));
  }
  
  @Test
  public void should_returnFizzBuzz_whenIsAMultipleOf3And5(){
    List<String> numbersList = game.getNumbers();
    assertEquals("FizzBuzz", numbersList.get(14));
    assertEquals("FizzBuzz", numbersList.get(29));
    assertEquals("FizzBuzz", numbersList.get(44));
    assertEquals("FizzBuzz", numbersList.get(59));
  }
}
