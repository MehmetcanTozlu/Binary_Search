
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Search search = new Search();
        int[] arr = {1, 3, 5, 11, 15, 18, 22, 33, 56, 88, 123, 454, 545, 666, 800, 912};
        search.Binary_Search(arr);
    }
}

class Search {

    public void Binary_Search(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int i = -1, j = arr.length, flag = 0;
        System.out.println("Dizinde Bulmak Istediginiz Degeri Giriniz: ");
        int getValue = sc.nextInt();
        while (j - i > 1){
            int middle = (i + j) / 2;
            if (arr[middle] == getValue){
                flag = 1;
                System.out.println("Deger Bulundu. Deger: " + getValue);
                break;
            }
            else if(arr[middle] > getValue){
                j = middle;
            }
            else
                i = middle;
        }
        if (flag == 0)
            System.out.println("Deger Dizinde Bulunamadi...");
    }
}
