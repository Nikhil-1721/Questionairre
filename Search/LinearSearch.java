package Search;

import java.util.Scanner;

public class LinearSearch {

    public static int search(int element, int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == element) {
                return i;
                }
            }
                return -1;
        }

    public static void main(String[] args) {
           int list[] = {10, 20, 30, 40, 50, 60};
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter an element to search");
           int index = scan.nextInt();
           int i =  LinearSearch.search(index, list);
           System.out.println("Element found at index : " + i);
        }
    }

