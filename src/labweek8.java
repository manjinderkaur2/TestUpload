import java.util.Random;
import java.util.Scanner;
    public class labweek8
    {
        public static void main(String[] args) {
            /**
             * Question 1 - in the space below write a while loop that will display
             * the numbers 1 - 10 on the screen
             */
            System.out.println("Question 1");
            int m = 1;
            while (m <= 10) {
                if (m != 10) {
                    System.out.print(m + ",");
                } else {
                    System.out.print(m);
                }
                m++;
            }
            System.out.println();

            /**
             * Question 2 - in the space below write a while loop that will display
             * the numbers 0 - 10 on the same line, going up by 2's for example 0,
             * 2, 4, 6, 8, 10
             */
            System.out.println("Question 2");
            int i = 0;
            while (i <= 10) {
                if (i != 10) {
                    System.out.print(i + ",");
                } else {
                    System.out.print(i);
                }
                i++;
            }
            System.out.println();

            /**
             * Question 3 - in the space below write a while loop that will display
             * the numbers 3-33 on the screen, going up by 3's for example 3, 6, 9,
             * ... 33
             */
            System.out.println("Question 3");
            int a = 3;
            while (a <= 33) {
                if (a != 33) {
                    System.out.print(a + ",");
                } else {
                    System.out.print(a);
                }
                a = a + 3;
            }
            System.out.println();

            /**
             * Question 4 - in the space below write a while loop that will display
             * the numbers 33-3 on the screen, going down by 3's for example 33, 30,
             * 27, ... , 6, 3
             */
            System.out.println("Question 4");
            int b = 33;
            while (b >= 3) {
                if (b != 3) {
                    System.out.print(b + ",");
                } else {
                    System.out.print(b);
                }
                b = b - 3;
            }
            System.out.println();

            /**
             * Question 5 - in the space below write a do...while loop that will
             * display the numbers 1-10 on the screen, going up by 1's for example
             * 1, 2, 3, ... 10
             */
            System.out.println("Question 5");
            int c = 1;
            do {
                if (c != 10) {
                    System.out.print(c + ",");
                } else {
                    System.out.print(c);
                }
                c++;
            } while (c <= 10);
            System.out.println();

            /**
             * Question 6 - in the space below write a do...while loop that will
             * display the numbers 0-12 on the screen, going up by 4's for example
             * 0, 4, 8, 12
             */
            System.out.println("Question 6");
            int d = 0;
            do {
                if (d != 12) {
                    System.out.print(d + ",");
                } else {
                    System.out.print(d);
                }
                d = d + 4;
            } while (d <= 12);
            System.out.println();

            /**
             * Question 7 - in the space below write a for loop that will display
             * the numbers 1 - 10 on the screen
             */
            System.out.println("Question 7");
            for (int e = 1; e <= 10; e++) {
                if (e != 10) {
                    System.out.print(e + ",");
                } else {
                    System.out.print(e);
                }
            }
            System.out.println();

            /**
             * Question 8 - in the space below write a for loop that will display
             * the numbers 0 - 10 on the screen, going up by 2's for example 0, 2,
             * 4, 6, 8, 10
             */
            System.out.println("Question 8");
            for (int f = 0; f <= 10; f = f + 2) {
                if (f != 10) {
                    System.out.print(f + ",");
                } else {
                    System.out.print(f);
                }
            }
            System.out.println();

            /**
             * Question 9 - in the space below write a for loop that will display
             * the numbers 3-33 on the screen, going up by 3's for example 3, 6, 9,
             * ... 33
             */
            System.out.println("Question 9");
            for (int h = 3; h <= 33; h = h + 3) {
                if (h != 33) {
                    System.out.print(h + ",");
                } else {
                    System.out.print(h);
                }
            }
            System.out.println();

            /**
             * Question 10 - in the space below write a for loop that will display
             * the numbers 33-3 on the screen, going down by 3's for example 33, 30,
             * 27, ... , 6, 3
             */
            System.out.println("Question 10");
            for (int j = 33; j >= 3; j = j - 3) {
                if (j != 3) {
                    System.out.print(j + ",");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();

            /**
             * Question 11 - create a method called "invalidPassword" accepts a
             * String as an argument and returns true if the password is invalid,
             * false otherwise. The valid password is "happy".
             */
            System.out.println("Question 11");
            TrueFalse1 g = new TrueFalse1();
            Scanner use = new Scanner(System.in);
            System.out.print("Enter password:");
            String password = use.next();
            boolean result = g.invalidpassword(password);
            System.out.println(result);
            System.out.println();

            /**
             * Question 12 - using a while loop and the invalidPassword method from
             * question 7, setup a loop that will keep asking the user for a
             * password until they put in the correct password
             */
            System.out.println("Question 12");
            TrueFalse1 k = new TrueFalse1();
            System.out.print("Enter password:");
            String password1 = use.next();
            boolean result1 = k.invalidpassword1(password1);
            System.out.println(result1);

            /**
             * Question 13 - using a do .... while loop and the invalidPassword
             * method from question 7, setup a loop that will keep asking the user
             * for a password until they put in the correct password
             */
            System.out.println("Question 13");

            System.out.print("Enter password:");
            String password2 = use.next();
            TrueFalse2 n=new TrueFalse2();
            boolean result2 = n.invalidpassword2(password2);
            System.out.println(result2);
            /**
             * Question 14 - this will be a simple number guessing game. Have the
             * computer select a random number between 1 and 10. Continuously ask
             * the user to guess the number. If the user guesses the correct number,
             * the screen should display "correct, it took you X attempts to guess
             * correctly" (where X is the # of attempts)
             */

            System.out.println("Question 14");
            int attempts=1;
            System.out.print("Enter the guess(1-10):");
            int userNumber=use.nextInt();
            guessNumber gn=new guessNumber();
            int generatedRandom=gn.generatedRandom();

            while(generatedRandom!=userNumber)
            {
                System.out.print("Enter the guess again:");
                userNumber=use.nextInt();
                attempts++;
            }
            System.out.println("It took "+attempts+" attempts to guess correct number.");
            /**
             * Question 15 - Write a method called "hasTeen". The method should
             * accept 3 integers as arguments. The method should return true if any
             * of the arguments are in the range 13-19, false otherwise. Use the
             * code below to test your method.
             */

            System.out.println("Question 15");

            System.out.print("Enter first number:");
            int one=use.nextInt();
            System.out.print("Enter second number:");
            int second=use.nextInt();
            System.out.print("Enter third number:");
            int third=use.nextInt();
            numberInRange nr=new numberInRange();
            nr.check1( one, second, third);


            //System.out.printf("The method hasTeen(10, 40, 17) returns %b (should be true)%n", hasTeen(10,40,17));
            //System.out.printf("The method hasTeen(10, 17, 50) returns %b (should be true)%n", hasTeen(10,17,50));
            //System.out.printf("The method hasTeen(13, 10, 50) returns %b (should be true)%n", hasTeen(13,10,50));
            //System.out.printf("The method hasTeen(13, 17, 19) returns %b (should be true)%n", hasTeen(13,17,19));
            //System.out.printf("The method hasTeen(12, 20, 6)  returns %b (should be false)%n", hasTeen(12,20,6));

            /**
             * Question 16 - Create a method that will prompt the user to enter 10
             * numbers. There should be a prompt for each number. Once the user has
             * entered all 10 numbers, the computer should return the highest number
             * entered
             */
            System.out.println("Question 16");
            Scanner s = new Scanner(System.in);
            int[] nums = new int[11];
            System.out.println("Enter 10 integers");

            for(int j = 1; j < 11; j++)
            {
                if (j==1) {
                    System.out.println("Enter 1st number:");
                }
                else if(j==2)
                {
                    System.out.println("Enter 2nd number:");
                }
                else if(j==3)
                {
                    System.out.println("Enter 3rd number:");
                }
                else
                {
                    System.out.println("Enter "+j+"th number:");
                }
                nums[j] = use.nextInt();

            }
            greatestNumber gt=new greatestNumber();
            int result5= gt.greatest(nums);
            System.out.println("The greatest number out of  given numbers is :"+result5);

        }
    }

    class TrueFalse1 {
        String password;

        boolean invalidpassword(String check) {
            if (check.equals("happy")) {
                return true;
            } else {
                return false;
            }
        }

        boolean invalidpassword1(String password) {
            Scanner use = new Scanner(System.in);
            while (!password.equals("happy")) {
                System.out.print("Enter password:");
                password = use.next();
            }
            return true;
        }
    }

    class TrueFalse2 {
        String password;

        boolean invalidpassword2(String password) {
            Scanner use = new Scanner(System.in);
            if(!password.equals("happy")){
                do{
                    System.out.print("Enter password:");
                    password = use.next();
                }
                while(!password.equals("happy"));
            }
            else
            {
                return true;
            }
            return true;
        }
    }

    class guessNumber
    {
        int generatedRandom()
        {
            Random r=new Random();
            int gRandom=r.nextInt(9 + 1)+1;
            return gRandom;
        }

    }


    class numberInRange
    {
        int arr[]={13,14,15,16,17,18,19};

        void check1( int a,int b, int c)
        {

            boolean check1=false ;
            boolean check2=false ;
            boolean check3=false ;
            for (int element : arr) {
                if (element == a) {
                    check1 = true;
                    break;
                }
            }

            for (int element : arr) {
                if (element == b) {
                    check1 = true;
                    break;
                }
            }
            for (int element : arr) {
                if (element == c) {
                    check1 = true;
                    break;
                }
            }

            if(check1==true||check2==true||check3==true){

                System.out.println("true");
            }

            else
            {
                System.out.println("false");
            }
        }
    }


    class greatestNumber
    {
        int greatest(int[] nums)
        {
            int max=nums[0];
            for(int j = 1; j < 11; j++)
            {
                if(max < nums[j])
                {
                    max = nums[j];
                }
            }

            return max;
        }
    }
