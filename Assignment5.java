package JavaQuestions;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String []args) {

//	Square Matrix
//
//
//	Description
//
//
//	Square Matrix - Single Test Case
//	Input
//	• The first line of the input contains N the dimensions of the square matrix
//	• The next N lines contains N space separated integers, denoting the elements of the matrix
//	Output
//	• Print the elements of the matrix row by row, by adding 1 to each element, as shown in the sample test case
//
//
//	You have to take input by yourself  and out put should be like this not in string it should be number
//
//
//	Sample Input 1
//	3
//	1 2 3
//	4 5 6
//	7 8 9
//
//
//	Sample Output 1
//
//
//	2 3 4
//	5 6  7
//	8 9 10

        System.out.println("Enter the size of square matrix");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int arr[][]=new int[x][x];
        System.out.println("Good.! Now enter the elements");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j]=sc.nextInt()+1;
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

}
