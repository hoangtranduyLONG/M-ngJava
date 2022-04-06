package DaoNguocPhanTuTrongMang;

import java.util.Scanner;
public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String arr[] = new String[20];
        String arr1[] = new String[20];
        while (count < 20) {
            System.out.print("Nhập số thứ " + (count+1) + ": ");
            String inp = sc.nextLine();
            if (inp.equals("")) {
                break;
            }
            else {
                arr[count] = inp;
                count += 1;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
