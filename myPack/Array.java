package myPack;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose 1 for Duplicate Value  ");
        System.out.println("----------------------------");
        System.out.println("choose 2 for Remove Duplicate ");
        System.out.println("----------------------------");
        System.out.println("choose 3 for Find Array index position ");
        System.out.println("----------------------------");
        System.out.println("choose 4 for  Find Array Element ");
        System.out.println("----------------------------");
        System.out.println("choose 5 for Remove Array Index  ");
        System.out.println("----------------------------");
        System.out.println("choose 6 for Remove Array Element ");
        System.out.println("----------------------------");
        System.out.println("choose 7 for Reverse Number  ");
        System.out.println("----------------------------");
        System.out.println("choose 8 for Missing Array ");
        System.out.println("----------------------------");
        System.out.println("choose 9 for Percentage ");
        System.out.println("----------------------------");
        System.out.println("choose 10 for Jacked Array ");
        System.out.println("----------------------------");
        System.out.println("choose 11 for Reverse Reference Array ");
        System.out.println("----------------------------");
        System.out.println("choose 12 for Comparing / equal Array ");
        System.out.println("----------------------------");
        int Array = sc.nextInt();

        switch (Array) {
            case 1:

                int a[] = { 1, 2, 2, 3, 3, 4, 5, 6, 6, 7 };
                System.out.println(" Duplicate Value ");
                for (int i = 0; i < a.length; i++) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i] == a[j]) {
                            System.out.println(a[j]);
                        }
                    }
                }

                break;

            case 2:
                int Duplicate = 0;
                int arr[] = { 1, 2, 2, 3, 3, 4, 5, 6, 6, 7 };
                System.out.println(" Remove Duplicate  ");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            arr[j] = Duplicate;

                        }
                    }
                }
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] != Duplicate) {
                        System.out.println(arr[k]);
                    }

                }
                break;

            case 3:
                int c = 0, j = 0;
                int f[] = { 1, 2, 3, 4, 5, 6, 7 };
                System.out.print("Enter the Find Element : ");
                int ArrayFind = sc.nextInt();
                for (c = 0; c < f.length; c++) {
                    if (f[c] == ArrayFind) {
                        j = 1;
                        break;
                    } else {
                        j = 0;
                    }
                }
                if (j == 1) {
                    System.out.println("Element Found at position : " + (c));
                } else {
                    System.out.println("Element at Found ");
                }

                break;

            case 4:
                int k = 0;
                int[] e = { 1, 2, 3, 4, 5, 6, 7 };
                System.out.println("Enter the Value ");
                int Find_Array = sc.nextInt();
                for (int i = 0; i < e.length; i++) {
                    if (e[i] == Find_Array) {
                        System.out.println("Find Element : " + e[i]);
                        break;
                    } else {
                        System.out.println("Element not Found");
                    }
                }

            case 5:
                System.out.println("Enter the Index Number");
                int N = sc.nextInt();
                int[] a3 = { 1, 2, 3, 4, 5, 6, 7 };
                for (int i = 0; i < a3.length; i++) {
                    if (i == N) {
                        System.out.println("Deleted Element : " + a3[i]);
                        a3[i] = 0;
                        break;
                    }
                }
                if (N >= 0 && N < a3.length) {
                    System.out.println(" New Array's Element");
                    for (int z = 0; z < a3.length; z++) {
                        if (z != N) {
                            System.out.println(a3[z]);
                        }
                    }
                }
                break;

            case 6:
                System.out.print("Enter num of element you want in array : ");
                int n = sc.nextInt();
                int[] a2 = new int[n];
                System.out.println("Enter the all Array Element");
                for (int i = 0; i < n; i++) {
                    a2[i] = sc.nextInt();
                }
                System.out.print("Enter the Delete element you want to  :  ");
                int d = sc.nextInt();

                for (int i = 0; i < n; i++) {
                    if (d == a2[i]) {
                        System.out.println("Deleted Element : " + a2[i]);
                        a2[i] = 0;
                        break;
                    }
                }

                for (int i = 0; i < n; i++) {
                    if (a2[i] != 0) {
                        System.out.println(a2[i]);
                    }
                }
                break;

            case 7:
                System.out.print("Enter the array size : ");
                int n2 = sc.nextInt();
                int b[] = new int[n2];
                System.out.println("Enter the all " + n2 + " elements ");
                for (int y = 0; y < n2; y++) {
                    b[y] = sc.nextInt();
                }
                System.out.println(" Reverse Number");
                for (int y = n2 - 1; y >= 0; y--) {
                    System.out.println(b[y]);
                }
                break;

            case 8:
              int [] N2 = {1,2,3,4,6,7};
               int Expected_N = N2.length + 1;
               int total_sum = Expected_N * (Expected_N + 1 ) / 2;
               int sum = 0 ;
               for(int i = 0 ; i < N2.length ; i++){
                 sum = sum + N2[i] ;
               }
               System.out.println((total_sum - sum ));

                break;
            case 9:
                String str = "Keshav";
                char[] s2 = str.toCharArray();
                System.out.println("Enter the Character");
                char ch = sc.next().charAt(0);
                if (ch != 0) {
                    System.out.println(" New Array's Element");
                    for (int s = 0; s < s2.length; s++) {
                        if (str.charAt(s) != ch) {
                            System.out.println(s2[s]);
                        }

                    }

                }
                break;
                case 10:
                        // Creating a jagged array
                        int[][] jaggedArray = new int[3][];
                        
                        // Initializing the rows with different lengths
                        jaggedArray[0] = new int[]{1, 2, 3};
                        jaggedArray[1] = new int[]{4, 5, 6, 7};
                        jaggedArray[2] = new int[]{8, 9};
                        
                        // Accessing elements in the jagged array
                        System.out.println("Element at [0][1]: " + jaggedArray[0][1]); // Output: 2
                        System.out.println("Element at [1][2]: " + jaggedArray[1][2]); // Output: 6
                        System.out.println("Element at [2][1]: " + jaggedArray[2][1]); // Output: 9
                    
                
                break;

                case 11 :
                int A [] = {1,2,3,4,5,6,7}; 
                int B [] = new int [A.length];
                for(int i = 0 ; i < A.length ; i++)
                {
                    B[(A.length - 1) - i] = A[i];
                }
                System.out.println("Reverse Array ");
                for(int i = 0 ; i < B.length ; i++)
                {
                   System.out.println(B[i]);
                }
break;

case 12 :
int A2 [] = {7,7,7,1,8,4,4,0,2};
int B2 [] = {7,7,7,1,8,4,4,0,2};
int l []= new int[7];
    int [] cloned_A1 = A2.clone();
    int [] cloned_A2 = B2.clone();
    if(Arrays.equals(cloned_A1, cloned_A2)){
        System.out.println(" Arrays are Equal  ");
    }
    else{
        System.out.println("Arrays are not Equal");
    }

break;

            default:
                break;
        }
    }

}
