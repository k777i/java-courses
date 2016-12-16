public class Calculate {

        public static void main(String[] arg)  {
                
                
                System.out.println("Calculate ...");
                double first = Double.valueOf(arg[0]);
                double second = Double.valueOf(arg[1]);
                double add = first + second;
                double sub = first - second;
                double mult = first * second;
                double div = first / second;
                double modul = first % second;
                double sqrd = Math.pow(first,second);
                String s = String.valueOf(arg[2]);
                
                System.out.println("Hello "+s);
                System.out.println("Sum = "+ add);
                System.out.println("Sub = "+ sub);
                System.out.println("Mult = "+ mult);
                System.out.println("Div = "+ div);
                System.out.println("Modul = "+ modul);
                System.out.println("Squared = "+ sqrd);

        }
}