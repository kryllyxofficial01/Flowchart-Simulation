import java.util.Scanner;

public class flowchart {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String affordability = "";
    String kit_type = "";

    System.out.println("What do you want most from your 3D Designer? [U]ltra High Print Quality, [M]odability, [E]ase of Use, [B]ig Build Volume, or [P]ortability?:");
    String purpose = scanner.next();
    
    scanner.close();
  }
}
