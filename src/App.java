import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
 
public class App {
private String results;
    public static void main(String[] args) 
    {
        App app = new App();
        app.analyzePrimes();
        app.writePrimeToFile();
    }
    
    public void analyzePrimes() {
            ArrayList<Integer> prime = new ArrayList<Integer>(); //Our arrayList that holds our numbers
            prime.add(7);
            prime.add(19);
            prime.add(13);
            prime.add(15);
            prime.add(21);
            prime.add(23);
            prime.add(25);
            prime.add(29);
            prime.add(33);
            prime.add(47);
            for (int value : prime) 
            {
                boolean flag = false; //Check if the value is false
                System.out.println("Checking if " + value + " is prime");
                for (int factor = 2; factor <= value / 2; factor++) //Iterate through each value
                {
                    if (value % factor == 0)
                    {
                        flag = true;
                        break; //Break out of the loop
                    }
                }
                if (!flag)
                    results += "\n" + value + " is a prime number.\n"; //if the value is false then it is a prime number.
                else
                    results += "\n" + value + " is not a prime number.\n"; //If the value is true then it is not a prime number.
            }
        }
    
        public void writePrimeToFile(){
            try
            {
                FileWriter myWriter = new FileWriter("output.txt");
                myWriter.write(results); //Write the output of the string results from analyzePrimes to the output.txt file.
                myWriter.close();
                System.out.println("Wrote to file.");
            }catch (IOException e)
                {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
       }
}