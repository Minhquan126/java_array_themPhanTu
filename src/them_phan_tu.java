import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can them :");
        String newName = scanner.nextLine();
        System.out.println("Nhap vi tri can them");
        int index = scanner.nextInt();
        String[] listStudent = {"quan","ngan","men","khoa"};
        String[] newList = new String[5];
        for (int i = 0; i < index; i++) {
            newList[i] = listStudent[i];
        }
        newList[index] = newName;
        for (int j = index; j < listStudent.length; j++) {
            newList[j + 1] = listStudent[j];
        }
        for (int i = 0; i < newList.length; i++) {
            System.out.println(newList[i]);
        }
    }
}
