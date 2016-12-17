import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first args :");
				String first = reader.next();
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
				calc.cleanResult();
				System.out.println("Exit : yes/no" );
				exit = reader.next();
			 }

		}finally{
			reader.close();
		}

 }
}