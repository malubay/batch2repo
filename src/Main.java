import classes.MyMethods;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //This is for hello display
        byte byteVariable = 127;
        short shortMikko = 32767;
        int decimalCite = 234;
        long largeDecimal = 8884343435454545454L;
        float numberWithDecimalPlaces = 5.55f;

        int grades[] = new int[5];
        grades[0] = 87;
        grades[1] = 98;
        grades[2] = 84;
        grades[3] = 95;
        grades[4] = 88;
        String errorMessages[] = new String[3];
        errorMessages[0] = "Halt";
        errorMessages[1] = "Error";
        errorMessages[2] = "Stop";


        boolean vacation = true;
        boolean noVacation = false;

        if (vacation || noVacation) ;
        {
            System.out.println("Today is weekend ");
            System.out.println("Today is weekday ");

        }


        boolean student = true;
        boolean work = false;

        //System.out.println("You can get " + MyMethods.getNumberSubjects(student, work));

//        System.out.println("[" + MyMethods.getNumberSubjects(student, work) + "]");
//        MyMethods.printWhile(6);
        System.out.println("\n");


        int numberOfStudent = 20;
        String day = "Monday";
        int currentStudents = 16;
        if (day == "Monday" && currentStudents <= 15) {
            System.out.println("Today is " + day);
            System.out.println("Current Subject is MATH and Teacher 1 has total students of " + currentStudents);
        } else if (day == "Tuesday" && currentStudents == numberOfStudent) {
            System.out.println("Today is " + day);
            System.out.println("Current Subject is Science and Teacher 3 has total students of " + currentStudents);
        }
        if (currentStudents < numberOfStudent || currentStudents > numberOfStudent) {
            System.out.println("Current Subject is English,OOP and Server Maintenance: Teacher 2, Teacher 4 and Teacher 5 has total students of " + currentStudents);

        }

        MyMethods.totalNum();
        MyMethods.sum();

        MyMethods.for_loop();

        Random switchFriends = new Random();
        boolean isFriends = switchFriends.nextBoolean();
        if(isFriends) {
            System.out.println(MyMethods.getMyfriends() + " " + MyMethods.randomMyFriends() + " " + MyMethods.otherMyfriends());
        }else{
            System.out.println(MyMethods.otherMyfriends() + " " + MyMethods.randomMyFriends() + " " + MyMethods.getMyfriends());
        }
    }

   /*public static int getNumberSubjects (boolean student , boolean work){

        int numberofSubjects;

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
        return numberofSubjects;
    }*/










        /*int number = 2;
        if (number < 3) {
            System.out.println(number + "is less than 3");
        }
        else {
                System.out.print (number + "is greater than or equal to 3");
        }*/







        /*Person personObject = new Person();
               personObject.setName("Rocky Marciano");
               String name= personObject.getName();
        System.out.println(name) ;
               personObject.setGender(true);
                boolean gender = personObject.isGender();
        System.out.println(gender) ;
                personObject.setAge(23);
                int age = personObject.getAge();
        System.out.println(age) ;
                personObject.setWeight(56.7f);
                float weight = personObject.getWeight();
        System.out.println(weight) ;

              String java = "cite" ;*/
       /* System.out.println("Hi I am Richard") ;*/

      /*  Person personObject = new Person();
        Person person = new Person("Hello");*/





//        System.out.println(person) ;/*

/*    Employee employeeObject = new Employee();*/


/*

        employeeObject.setName("Jerry Maguire Jr.");
        employeeObject.setDepartment("accounting");
        System.out.println("Hi I am "+ employeeObject.introduceYourself() ) ;
*//*



    /*    System.out.println(employeeObject.getDepartment()) ;
        employeeObject.setSssid(433);
        int sssid = employeeObject.getSssid();
        System.out.println(sssid) ;
        employeeObject.setPagibigid(3425);
        int pagibigId = employeeObject.getPagibigid();
        System.out.println(pagibigId) ;
*/

      /*  Customer customerObject = new Customer();
        customerObject.setTelephoneNo(4556788);
        customerObject.setCustomerId(7689);
        customerObject.setName("Rocky Marciano");
        customerObject.setAge(23);
*/


       /* System.out.println(customerObject.getTelephoneNo()) ;
        System.out.println(customerObject.getCustomerId()) ;
        //System.out.println("Hi I am" + customerObject.introduceYourself());
        System.out.println("I am " + customerObject.introduceYourself("Jerry Magi ","Accounting "));
*/


  /*      System.out.println(byteVariable);
        System.out.println(mIkko);
        System.out.println("cite" + byteVariable);
         System.out.println(cite);
        System.out.f(java) ;
        System.out.println(grades[0]) ;*/


}


