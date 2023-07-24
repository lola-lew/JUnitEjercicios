package calcu.ej;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {
    
  public boolean validateDate(String strDate){
    boolean isValid = false;
        
    // regex to validate the string of the date
    String strDateRegEx =  "(0[1-9]|[12][0-9]|[3][01])/(0[1-9]|1[012])/\\d{4}";
    
    // if the date matches the regex string format we'll check if the date is actually a valid date
    if(strDate.matches(strDateRegEx)){
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
      sdf.setLenient(false); // this line is for a strict validation of the date
      try {
        sdf.parse(strDate);
        isValid = true;
      } catch (ParseException e) {}        
    }        
    System.out.println("Is date [" + strDate + "] valid? " + isValid);
    return isValid;
  }

}

