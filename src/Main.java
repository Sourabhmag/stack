import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        boolean val = true;

        while (val){
            System.out.println("\n1. Push \n2. Pop \n3. Exit");
            int condition = scanner.nextInt();
            switch (condition){
                case 1:
                    System.out.println("Enter data");
                    int data = scanner.nextInt();
                    stack.push(data);
                    stack.display();
                    break;
                case 2:
                    stack.pop();
                    stack.display();
                    break;
                default:
                    val = false;
            }
        }
        scanner.close();
    }
}
