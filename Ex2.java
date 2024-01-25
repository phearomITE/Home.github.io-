import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isDuplicate = false;
            
            for (int j = 0; j < i; j++) {
                if (input.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                result.append(currentChar);
            }
        }
        
        System.out.println("String with duplicates removed: " + result.toString());
    }
}
