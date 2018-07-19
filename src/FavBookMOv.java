
import java.util.Collections;
import java.util.Scanner;

import java.util.ArrayList;


public class FavBookMOv {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> favBooMmov = new ArrayList<String>();
        System.out.println("Enter you favourite move or book");
        String input = keyboard.next();
        while(!input.equalsIgnoreCase("done")){

            favBooMmov.add(input);
            input = keyboard.next();
        }


        favBooMmov.sort(String::compareToIgnoreCase);
        for (String myValue : favBooMmov) {
            System.out.println(myValue);
        }
    }
}
