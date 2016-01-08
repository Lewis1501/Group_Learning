/**
 * Created by Sony VAIO on 18/12/2015.
 */
public class User extends Test {
    private String name;
    private int age;
    private int weightPoportion;
    private int learningMethod;
    private static long uniqueId;


    User(String name, int age, int weightPoportion, int learningMethod ){
        this.name = name;
        uniqueId = (long) (Math.random() * 1000) + 1;
        this.age = age;
        switch (weightPoportion){
            case 1:
                break;
            /*
            MAKE CASES FOR ALL OCCUPATIONS.
             */
        }
        this.learningMethod = learningMethod;
    }

    public String learntype(int LM){


        String type = " ";
        switch (LM){
            case 1:
    type = "Comedy";
                break;
            case 2:
    type = "Romance";
                break;
            case 3:
    type = "Horror";
                break;

            case 4:
    type = "Cartoons";
                break;

        }

        return type;
    }

    public String getlearningtype(){

        return   "h";
    }


    public long getuniqueId(){
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeightPoportion() {
        return weightPoportion;
    }

    public void setWeightPoportion(int weightPoportion) {
        this.weightPoportion = weightPoportion;
    }

    public int getLearningMethod() {
        return learningMethod;
    }

    public void setLearningMethod(int learningMethod) {
        this.learningMethod = learningMethod;
    }


}
