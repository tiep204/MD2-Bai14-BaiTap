import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc danh sach: ");
        int size = sc.nextInt();

        int[] list = new int[size];
        System.out.println("moi ban nhap : " + list.length + " gia tri: ");



        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        System.out.println("mang cua ban ban dau la");
        printArray(list);
        Main ob = new Main();
        ob.sort(list);
        System.out.println("\n");

        System.out.println("mang cua ban sau khi sap sep la: ");
        for (int i = 0; i < list.length; i++) {


        }

        printArray(list);
    }
    void sort(int list[]){
        int n = list.length;
        for (int i = 0; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key){
                list[j+1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;

        }
    }
    static void printArray(int list[]){
        int n = list.length;
        for (int i = 0; i<n; ++i){
            System.out.print(list[i] + " ");
            System.out.print("");

        }

    }
}