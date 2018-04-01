package good.old.times;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * An example of term frequency problem where the main constraint is memory. Limit the number of variables declared.
 * Because there are severe memory constraints the only things that can be kept in main memory are the
 * list of stop words and the current line being read and a few other details
 * Read input file character by character. Once a word is found , look it up in term - frequency file
 * Increment and store count in the file.
 * Once input file has been read go through the term frequency file and sort to get top 5 term frequencies
 */
public class TermFrequency {

    public static String[] STOP_WORDS = new String[] {"of","the","is","in","a","an"};//stop words , [of,the,is,in,a,an]
    static String[][] data = new String[8][];

    public static void main(String[] args) throws IOException {
        data[0]= STOP_WORDS;
        String filePath = args[0];
        System.out.println(filePath);
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        int ch = br.read();
        while(ch != -1) {
            System.out.println((char)ch);
            ch = br.read();
        }
        br.close();


    }
}
