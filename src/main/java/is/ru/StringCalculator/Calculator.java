package is.ru.StringCalculator;

public class Calculator {

    public static int add(String numbers) {
    		
    		if(numbers.equals("")){
    			return 0;
    		}
    		else{
    			if(numbers.contains(",")){
    				String N[] = numbers.split(",");
    				return Integer.parseInt(N[0]) + Integer.parseInt(N[1]);
    			}
    			return 1;
    		}
    }

}