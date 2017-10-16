package is.ru.StringCalculator;

public class Calculator {

    public static int add(String numbers) {
    		
    		if(numbers.equals("")){
    			return 0;
    		}
    		else{
    			if(numbers.contains(",")){
    				String N[] = numbers.split(",");
    				return toInt(N[0]) + toInt(N[1]);
    			}
    			return 1;
    		}
    }

    private static int toInt(String number){
    	return Integer.parseInt(number);
    }

}