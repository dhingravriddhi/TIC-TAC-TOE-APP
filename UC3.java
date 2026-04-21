import java.util.Scanner;

public class UC3 {

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);



    }

    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter slot number (1-9): ");
        int slot = sc.nextInt();
        sc.close();
        return slot;
    }
}