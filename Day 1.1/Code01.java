/*
* A subarray is a contiguous sequence of elements within an array,
* defined by a starting index and an ending index, where all elements between these indices (inclusive) are
* included in their original order.
* Qno1: Write a java program to find subarray in an array.
* */
import java.util.*;
public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr  = new int[n];
        System.out.println("Enter elements in array : ");
        for( int i = 0; i< arr.length; i++){
            System.out.println("For a["+(i+1)+"] : ");
            arr[i] = sc.nextInt();
        }
        // for finding pairs of subarrays
        System.out.println("Subarray of given array : ");
        for( int i = 0; i< arr.length; i++){
            for( int j = i; j < arr.length; j++){
                for( int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}