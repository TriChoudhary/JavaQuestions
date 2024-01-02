
public class Assignment4 {

    public static void main(String[] args) {

		/*
		Find C
		Description
		• You are given a number c (take a number in int by yourself) Find the value of c , after doing the following operations-

		C is multiplied by 5
		20 is added in the new value
		5 is subtracted from the new
		of C.
		value of C.

		 Ans:-*/
        int c=5;
        c=c*5;
        c=c+20;
        c=c-5;
        System.out.println(c);
        System.out.println();
		/*

		Q2 do the dry run of this code


		public class Main
		{
			public static void main(String[] args)
			 int n = 5; // Number of rows
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }



		Ans:- 	*
				**
				***
				****
				*****


		Q3  Write a Java program to print a right-angled triangle of numbers as follows:

		1
		12
		123
		1234
		12345

		Ans:- */
        int n1 = 5; // Number of rows
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
			/*

		Q4  Write a Java program to print pattern :

		******
		*    *
		*    *
		******
*/
        //Ans:-
        System.out.println();
        int w=5; //Width
        int h=4; //Height
        for(int i=1;i<=h;i++) {
            if (i==1||i==h) {
                for(int k=1;k<=w;k++) {
                    System.out.print("*");
                }}
            else {
                for(int k=1;k<=w;k++) {
                    if(k==1||k==w) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }



        System.out.println();
        System.out.println();

		        /*
		Q5   Write a Java program to print pattern :
		*
		**
		***
		****
		*****
		****
		***
		**
		*

		Ans:-
*/
        int n = 5; //Maximum Number of Stars
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

		            /*
		             for (int j = 0; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }




		Q6  Write three Java program to print pattern :


		        *
		      * *
		    * * *
		  * * * *
		* * * * *
		*/
        System.out.println();System.out.println();


        for(int i=0;i<=5;i++) {

            for(int j=5-i;j>=0;j--) {
                System.out.print(" ");
            }
            for(int k =5-i; k<=5;k++) {
                System.out.print("*");
            }
            System.out.println();
        }




        System.out.println();System.out.println();
		            /*



		Q7  write three java program to print patter

		* * * * *
		  * * * *
		    * * *
		      * *
		        *

*/

        for(int i=0;i<=5;i++) {
            for(int k=i;k>=0;k--) {
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}









