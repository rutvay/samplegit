public class fizbuz{

    // function to check wether rhe number is divisible by 5 or 3 
    public static String check(int number)
    {
        if(number == 0)
            return " ";

        if(number % 15 ==0)
            return "FizzBuzz";

        if(number % 5==0)
            return "Fizz";

        if(number % 3==0)
            return "Buzz";

        return "None";
    }
    
}
