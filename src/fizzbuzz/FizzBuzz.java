
package fizzbuzz;


public class FizzBuzz {
   //Dylan Rychlik 
   //2/19/2020 Fizz Fuzz Solution
   //Fizz Buzz is a popular math game based on division and is played by many primary and secondary school students. 
    //This kata will require the production of a method the returns a response based on the following rules.
    //A number divisible by 3 returns fizz
    //A number divisible by 5 returns buzz
    //A number divisible by 15 returns fizzbuzz
    //A number not divisible by 3, 5, or 15 returns itself
    //For full verification, the numbers 1 through 100 should iterated over, and their result checked.
    public static void main(String[] args) {
        //numbers 1 through 100 iterated over, and their result checked.
        for (int x = 1; x <= 100; x++){
            //call the FizzBuzz method
            String output = FizzBuzz(x);
            //Output the result
            System.out.println(output);
        }
      
    }
    //method with String return type and an int for a paramter
    public static String FizzBuzz(int num){
        //Result is what is being returned
        String result;
        //A number divisible by 3 returns fizz
        if (num % 15 == 0){
            result = "fizzbuzz";
        }
        //A number divisible by 5 returns buzz
        else if (num % 5 == 0){
            result = "buzz";
        }
        //A number divisible by 15 returns fizzbuzz
        else if (num % 3 == 0){
            result = "fizz";
        }
        //A number not divisible by 3, 5, or 15 returns itself
        else {
            result = String.valueOf(num);
                    
         }
        return result;
    }
    
    }
    

