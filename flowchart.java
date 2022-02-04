import java.util.Scanner;

public class flowchart {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String affordability = "";

    System.out.println("What do you want most from your 3D Designer? [U]ltra High Print Quality, [M]odability, [E]ase of Use, [B]ig Build Volume, or [P]ortability?:");
    String purpose = scanner.next();

    switch (purpose) {
      case "U":
      System.out.println("");
        System.out.println("Do you want afforability? [Y]es or [N]o?:");
        affordability = scanner.next();

        switch (affordability) {
          case "Y":
            System.out.println("");
            System.out.println("Do you want dual extrusion capabilities? [Y]es or [N]o?:");
            String extrusion_type = scanner.next();

            switch (extrusion_type) {
              case "Y":
                System.out.println("");
                System.out.println("");
                System.out.println("Recommendation: Deezmaker Bukobot v2 Duo");
              
              case "N":
                System.out.println("");
                System.out.println("");
                System.out.println("Recommendation: Deezmaker Bukobot v2");
            }
          
          case "N":
            System.out.println("");
            System.out.println("");
            System.out.println("Recommendation: Ultimaker2");
        }
    }

    scanner.close();
  }
}
