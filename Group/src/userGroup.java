import java.io.*;
import java.util.ArrayList;


/**
 * Created by Sony VAIO on 18/12/2015.
 */
public class userGroup {

    private String name;
    private int groupSize;
    private ArrayList<User> users;

    userGroup(String name, int groupSize) {
        this.name = name;
        this.groupSize = groupSize;
        users = new ArrayList<>(groupSize);

//     System.out.println("Group: " + users.get(groupSize) + " created!");
    }

    userGroup(){
        name = "Default_Group";
        users = new ArrayList<>(8);
    }


    public void addUser(User user) {
        try {
            if (users.size() < groupSize) {
                users.add(user);

                System.out.println("user " + user.getName() + " created.");
                System.out.print(user.getName()+"' data:" + '\n' +
                "Learning type:" + user.learntype(1) + '\n' +
                "User age:"  +  user.getAge() + '\n' +
                "Learning method" + user.getLearningMethod() +  '\n' +
                "Unique id:" + user.getuniqueId() + '\n' +
                "Weight poportion" + user.getWeightPoportion() );
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array size not big enough!");
        }
    }

    public void showUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }

    public void weightAverage() {
        int add = 0;
        int i;
        for (User u : users) {
            i = u.getWeightPoportion();
            add = add + i;

        }
        double avg = add / users.size();
        System.out.println("The users average is " + avg);

    }

    public void showAllUsers() {
        for (User u : users) {
            u.getWeightPoportion();
        }
    }

    public void leastMisery() {
        int lowest = 100;

        for (User u : users) {
            //Get all users weight porportion.
            int LW = u.getWeightPoportion();
            if (LW < lowest) {
                lowest = LW;
                //compare to each others.

            }

        }
        System.out.println("The lowest weight porportion is: " + lowest);
        //print out the lowest number

    }



    }
















