import java.util.Scanner;

public class flowchart {

  public static void printQualityBranch() {
    Scanner printQuality = new Scanner(System.in);

    System.out.println("");
    System.out.println("Do you want affordability? [Y]es or [N]o?:");
    String affordability = printQuality.next();

    if (affordability.equals("Y")) {
      System.out.println("");
      System.out.println("Do you also want dual extrusion? [Y]es or [N]o?:");
      String extrusion_type = printQuality.next();

      if (extrusion_type.equals("Y")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Deezmaker Bukobot v2 Duo");
      }
      else if (extrusion_type.equals("N")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Deezmaker Bukobot v2");
      }
    }
    else if (affordability.equals("N")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Ultimaker2");
    }

    printQuality.close();
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What do you want most from your 3D Designer? [U]ltra High Print Quality, [M]odability, [E]ase of Use, [B]ig Build Volume, or [P]ortability?:");
    String purpose = scanner.next();

    if (purpose.equals("U")) {
      printQualityBranch();
    }
    
    scanner.close();
  }
}
