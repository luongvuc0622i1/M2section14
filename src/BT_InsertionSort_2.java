import java.util.Scanner;

public class BT_InsertionSort_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        for (int k = 1; k < list.length ; k++) {
            int x = list[k];
            int pos = k;
            while(pos > 0 && list[pos] < list[pos-1]){
                int temp = list[pos-1];
                list[pos-1] = list[pos];
                list[pos] = temp;

                pos--;
            }
            list[pos] = x;
        }

        /* Show the list after sort */
        System.out.print("List after the sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
    }
}
