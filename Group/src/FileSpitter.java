import java.io.*;

/**
 * Created by Sony VAIO on 04/01/2016.
 */
public class FileSpitter {


    public void splitAndWriteuData() throws IOException {

            BufferedReader br = new BufferedReader(new FileReader("data/u.data"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("data/createdFile.csv"));

            String line;
            while ((line = br.readLine())!= null){
                String[] val = line.split("\\t, -1");
                bw.write(val[0] + ", " + val[1] + ", " + val[2] + '\n');

                br.close();
                bw.close();


            }
        }


    public void splitAndWriteuItem() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("data/u.item"));
       // BufferedWriter bw = new BufferedWriter(new FileWriter("data/createdFile.csv"));

        String line;
        while ((line = br.readLine())!= null) {
            String[] val = line.split(" ");
           /* bw.write*/
            System.out.println(val[0] + ", " + val[1] + ", " + val[2] + '\n');




            }
        br.close();
        //bw.close();

        }


        public static void main(String[] a) throws IOException {
        FileSpitter fs = new FileSpitter();
            fs.splitAndWriteuData();
    }
    }



