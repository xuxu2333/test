import java.util.ArrayList;
import java.util.Scanner;

public class Logger {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i));
        }


    }

}
