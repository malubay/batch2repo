package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B213 on 11/12/2016.
 */
public class  MyMethods {
    public static void getNumberSubjects (boolean student , boolean work) {

        int numberofSubjects = 6;

        if (work) {
            numberofSubjects = 6;
        }
        else
        {
            if(student == true){
                numberofSubjects = 7;
            }else{
                numberofSubjects = 5;
            }
        }
    }



    public static String getMyfriends () {

        List<String> myFriends = new ArrayList<String>();
        myFriends.add("Mik");
        myFriends.add("Bik");
        myFriends.add("Wik");
        myFriends.add("Rik");
        Random randName = new Random();
        int name = randName.nextInt(4);
        return myFriends.get(name);
    }


    public static String otherMyfriends () {

        List<String> otherFriends = new ArrayList<String>();
        otherFriends.add("Wena");
        otherFriends.add("Rena");
        otherFriends.add("Mena");
        otherFriends.add("Jena");
        Random randName = new Random();
        int name = randName.nextInt(4);
        return otherFriends.get(name);

    }


    public static String randomMyFriends () {

        List<String> randomMyFriends = new ArrayList<String>();
        randomMyFriends.add("Happy");
        randomMyFriends.add("Love");
        randomMyFriends.add("Hate");
        randomMyFriends.add("Anger");
        Random randName = new Random();
        int name = randName.nextInt(4);
        return randomMyFriends.get(name);




    }














    public  static  void sum (){
        int m = 1;

        do {
            System.out.print("[" + m + "]");
            m++;
        }

        while (m <= 9);

        }









    public static void totalNum () {
        int m = 0;
        int n = 0;
        while (n < 6) {
            n++;
            m = m + n;

        }

        System.out.println("[" + m + "]");
    }

    public static void for_loop(){
        String myFriends[] = {"Jerry","Michael","Rose","Jose","Tom"};
        for(int i=0; i<myFriends.length; i++){
            System.out.println(myFriends[i]);
        }
    }
    }











/*
    public static void printWhile(int number){
           int n = 7;

        while (n <= number){
            System.out.print("[" + n + "]");
            n++;
        }
    }
}
*/

