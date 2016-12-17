import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "n";
			String clear = "y";
			String first ;
			
			while(!exit.equals("y")){
				System.out.println("First args :");
				
				if(clear.equals("n")){
					first =Integer.toString(calc.getResult());
				    System.out.println(first );
				    }else 
					first = reader.next();
				
				System.out.println("Enter your arifmetic command :");
				String command = reader.next();
				System.out.println("Enter second args :");
				String second = reader.next();
			
				switch(command){
				case "+" : calc.add(Integer.valueOf(first),Integer.valueOf(second));break;
				case "-" : calc.subt(Integer.valueOf(first),Integer.valueOf(second));break;
				case "*" : calc.multipl(Integer.valueOf(first),Integer.valueOf(second));break;
				case "/" : calc.div(Integer.valueOf(first),Integer.valueOf(second));break;
				case "%" : calc.mdl(Integer.valueOf(first),Integer.valueOf(second));break;
				case "sqr" : calc.sqr(Integer.valueOf(first),Integer.valueOf(second));break;
				}
				
				System.out.println("Result : " + calc.getResult());
				
				System.out.println("You want clear result : y/n? ");
				clear = reader.next();
				
			    if(clear.equals("y"))
			    	calc.cleanResult();
			    
			    	
			    
			    
				System.out.println("Exit : y/n?" );
				exit = reader.next();
			 }

		}finally{
			reader.close();
		}

 }
}