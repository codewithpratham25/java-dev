// public class snippet {
//     public static void main(String[] args) {
//         String words = "One Two Three Four";
//         int countWords = words.split("\\s").length;
//         System.out.println(countWords);
//     }
// }

import java.util.Scanner;

/**
 * snippet
 */
public class snippet {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username: ");

        String username = myObj.nextLine();
        System.out.println("Username is: "+ username);
        myObj.close();
    }
}