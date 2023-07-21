package fizz.buzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  
  public List<String> getNumbers() {
    List<String> numbers = new ArrayList<>();
    for (int i = 1; i <= 100; i++) {
      numbers.add(getNumber(i));
    }
    return numbers;
  }

  private String getNumber(int i) {
    if(i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
    if(i % 3 == 0) return "Fizz";
    if(i % 5 == 0) return "Buzz"; 
    else return "" + i;
  }
}
