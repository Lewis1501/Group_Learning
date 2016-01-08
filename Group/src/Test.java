/**
 * Created by Sony VAIO on 30/12/2015.
 */

public class Test {




    public void doSomeCalculation(User u, int Two){
        int number = 4;
            int One = u.getWeightPoportion();

            int finalAnswer = Two * One * doCalReturn(number);


        System.out.println("The final calculaion was " + finalAnswer);
        }





    public int doCalReturn(int number){
        System.out.println("Entered method 'doCalReturn");
        int calculation = number * 2;

        System.out.println("Return the cal " + calculation +  " to method " + Test.this.getClass());
        return  calculation;
    }
}
