import java.util.Scanner;

public class ValidasiTandaKurung {
    public static void main(String[] args) {

        StackGeneric<String> stack = new StackGeneric<>(15);
        String gg = "f(x)=(x-3)(x+9)";
        Scanner miaw = new Scanner(gg);

        miaw.useDelimiter("");

        for (int g = 0; g < 15; g++) {
            String gege = miaw.next();
            if (gege.equals("(")) {
                stack.push("(");
            } else if (gege.equals(")")){
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    
    }
}
