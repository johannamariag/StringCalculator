package is.ru.StringCalculator;

public class Calculator {

    public static int add(String numbers) {
    		
    		if(numbers.equals("")){
    			return 0;
    		}
    		else{
    			if(numbers.contains(",")){
    				String N[] = numbers.split(",");
    				int total = 0;
    				for(String number : N){
    					total += toInt(number);
    				}
    				return total;
    			}
    			return 1;
    		}
    }

    private static int toInt(String number){
    	return Integer.parseInt(number);
    }

}