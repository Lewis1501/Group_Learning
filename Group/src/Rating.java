/**
 * Created by Sony VAIO on 18/12/2015.
 */
public class Rating {

    private int rating;


    Rating(int rating) {
        this.rating = rating;

        if (rating < 0 && rating > 5) {
            System.out.println("Rating set");
        } else {
            System.out.println("Pick a number between 0 and 5");
        }
    }


    public void setRating(int rating) {


    }

}
