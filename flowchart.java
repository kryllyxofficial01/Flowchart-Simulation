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

  public static void moddabilityBranch() {
    Scanner moddability = new Scanner(System.in);

    System.out.println("");
    System.out.println("Do you want affordability? [Y]es or [N]o?:");
    String affordability = moddability.next();

    if (affordability.equals("Y")) {
      System.out.println("");
      System.out.println("What kit do you want? [D]IY or [P]re-assembled?:");
      String kit_type = moddability.next();

      if (kit_type.equals("D")) {
        System.out.println("");
        System.out.println("Do you want [M]ore Build Volume or [F]aster Printing Speed?:");
        String capability = moddability.next();

        if (capability.equals("M")) {
          System.out.println("");
          System.out.println("How much more? A [B]it More or a [L]ot More?:");
          String build_amount = moddability.next();

          if (build_amount.equals("B")) {
            System.out.println("");
            System.out.println("Would you rather have better [C]ompany Support or better C[O]mmunity Support?:");
            String support_type = moddability.next();

            if (support_type.equals("C")) {
              System.out.println("");
              System.out.println("");
              System.out.println("Recommendation: Printrbot Metal Plus");
            }
            else if (support_type.equals("O")) {
              System.out.println("");
              System.out.println("");
              System.out.println("Recommendation: Rigidbot Regular");
            }
          }
          else if (build_amount.equals("L")) {
            System.out.println("");
            System.out.println("");
            System.out.println("Recommendation: Rigidbot Big");
          }
        }
        else if (capability.equals("F")) {
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Velleman K8200");
        }
      }
      else if (kit_type.equals("P")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Robo3D");
      }
    }
    else if (affordability.equals("N")) {
      System.out.println("");
      System.out.println("What kit do you want? [D]IY or [P]re-assembled?:");
      String kit_type = moddability.next();

      if (kit_type.equals("D")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Lulzbot KITTAZ");
      }
      else if (kit_type.equals("P")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Lulzbot TAZ 4");
      }
    }

    moddability.close();
  }

  public static void easeOfUseBranch() {
    Scanner easeOfUse = new Scanner(System.in);

    System.out.println("");
    System.out.println("Do you want affordability? [Y]es or [N]o?:");
    String affordability = easeOfUse.next();

    if (affordability.equals("Y")) {
      System.out.println("");
      System.out.println("Do you want more [E]ase of Use or [B]uild Volume?:");
      String capability = easeOfUse.next();

      if (capability.equals("E")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Dremel Ideabuilder");
      }
      else if (capability.equals("")) {
        System.out.println("");
        System.out.println("Do you want an open-source printer? [Y]es or [N]o?:");
        String printer_type = easeOfUse.next();

        if (printer_type.equals("Y")) {
          System.out.println("");
          System.out.println("Do you want dual extruder? [Y]es or [N]o?:");
          String extruder_type = easeOfUse.next();

          if (extruder_type.equals("Y")) {
            System.out.println("");
            System.out.println("Do you want a big build volume? [Y]es or [N]o?:");
            String build_type = easeOfUse.next();

            if (build_type.equals("Y")) {
              System.out.println("");
              System.out.println("");
              System.out.println("Recommendation: Solidoodle Workbench");
            }
            else if (build_type.equals("N")) {
              System.out.println("");
              System.out.println("");
              System.out.println("Recommendation: Solidoodle Workbench Apprentice");
            }
          }
        }
      }
    }

    easeOfUse.close();
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What do you want most from your 3D Designer? [U]ltra High Print Quality, [M]oddability, [E]ase of Use, [B]ig Build Volume, or [P]ortability?:");
    String purpose = scanner.next();

    if (purpose.equals("U")) {
      printQualityBranch();
    }
    else if (purpose.equals("M")) {
      moddabilityBranch();
    }
    
    scanner.close();
  }
}
