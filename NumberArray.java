import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] array;

        do {
            System.out.println("Nhap vao do dai cua mang :");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Khong duoc vuot qua 10");
            }
        }while (size>10);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu tai vi tri " + i + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Mang: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println("\n"+"Gia tri lon nhat la " + max + " ,o vi tri " + index);

    }
}
