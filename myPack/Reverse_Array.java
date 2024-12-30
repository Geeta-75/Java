package myPack;

public class Reverse_Array {
    public static void main(String[] args) {
        Reverse();
        int [] a = {4,5,6,8,1,2,3,7};
        System.out.println("Reverse number");
        for(int i = 0 ; i > a.length ; i--)
        {
            System.out.println(a[i]);
        }
    }

    static void Reverse() {
                int[] array = {1, 2, 3, 4, 5};
                int length = array.length;
        
                System.out.print("Original Array: ");
                for (int num : array) {
                    System.out.print(num + " ");
                }
        
                for (int i = 0; i < length / 2; i++) {
                    int temp = array[i];
                    array[i] = array[length - 1 - i];
                    array[length - 1 - i] = temp;
                }
        
                System.out.print("\nArray after reversing: ");
                for (int num : array) {
                    System.out.print(num + " ");
                }
            }
        }
        
    
