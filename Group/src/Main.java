import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sony VAIO on 18/12/2015.
 */
public class Main{



    public static void main(String[] args) {





        User u1 = new User("Lewis",3,16,6);
        User u2 = new User("John",3,19,6);
        User u3 = new User("Al",33,10,7);
        User u4 = new User("Mike",33,5,7);
        User u5 = new User("Nathan",22,4,6);
        User u6 = new User("Chilli",22,11,3);
        u6.doSomeCalculation(u6,45);
        //User u6 = new User("Chin",12,1,4);


        //uG.addUser(u6);

        userGroup uG = new userGroup("Test" , 5);
        uG.addUser(u1);
        uG.addUser(u4);
        uG.addUser(u5);

        uG.weightAverage();


        uG.leastMisery();



    }
    }

