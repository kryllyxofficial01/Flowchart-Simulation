// Query One: First Set of Questions
// Query Two: Second Set of Questions
// Query Three: Third Set of Questions

import java.util.Scanner;

public class flowchart {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What do you want most from your 3D Designer? [U]ltra High Print Quality, [M]odability, [E]ase of Use, [B] Build Volume, or [P]ortability:");
    String qualities = scanner.next();

    // Query One
    if (qualities.equals("U")) {
      System.out.println("");
      System.out.println("Do you like affordability? [Y]es/[N]o:");
      String affordability = scanner.next();

      // Query Two
      if (affordability.equals("Y")) {
        System.out.println("");
        System.out.println("Do you want dual extrusion? [Y]es/[N]o:");
        String extrusion_type = scanner.next();

        // Query Three
        if (extrusion_type.equals("Y")){
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Deezmaker Bukobot v2 Duo");
        }
        // Query Three
        if (extrusion_type.equals("N")){
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Deezmaker Bukobot v2");
        }
      }
      // Query Two
      else if (affordability.equals("N")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Ultimaker2");
      }
    }
    // Query One
    else if (qualities.equals("M")) {
      System.out.println("");
      System.out.println("Do you like affordability? [Y]es/[N]o:");
      String affordability = scanner.next();
      
      // Query Two
      if (affordability.equals("Y")) {
        System.out.println("");
        System.out.println("[D]IY Kit or [A]ssembled Machine?:");
        String kit_type = scanner.next();

        // Query Three
        if (kit_type.equals("D")){
          System.out.println("");
          System.out.println("[M]ore Build Volume or [F]aster Printing Speeds?:");
          String build = scanner.next();
        }
        // Query Three
        else if (kit_type.equals("A")){
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Robo3D");
        }
      }
      // Query Two
      else if (affordability.equals("N")) {
        System.out.println("");
        System.out.println("[D]IY Kit or [A]ssembled Machine?:");
        String kit_type = scanner.next();

        // Query Three
        if (kit_type.equals("D")){
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Lulzbot KITTAZ");
        }
        // Query Three
        else if (kit_type.equals("A")){
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Lulzbot TAZ 4");
        }
      }
    }
    // Query One
    else if (qualities.equals("E")) {
      System.out.println("");
      System.out.println("Do you like affordability? [Y]es/[N]o:");
      String affordability_ = scanner.next();

      // Query Two
      if (affordability_.equals("Y")) {
        System.out.println("");
        System.out.println("[E]ase of Use or [M]ore Build Volume?:");
        String ease = scanner.next();

        // Query Three
        if (ease.equals("E")) {
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Dremel Ideabuilder");
        }
        // Query Three
        else if (ease.equals("M")) {
          System.out.println("");
          System.out.println("Recommendation: Dremel Ideabuilder");
        }
      }
      // Query Two
      else if (affordability_.equals("N")) {
        System.out.println("");
        System.out.println("Do you want a MakerBot? [Y]es/[N]o:");
        String makerbot = scanner.next();

        // Query Three
        if (makerbot.equals("N")) {
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Makerbot Replicator 2");
        }
        // Query Three
        else if (makerbot.equals("Y")) {
          System.out.println("");
          System.out.println("Do you want a MakerBot clone? [Y]es/[N]o:");
        }
      }
    }
    // Query One
    else if (qualities.equals("B")) {
      System.out.println("");
      System.out.println("Do you like affordability? [Y]es/[N]o:");
      String affordability_ = scanner.next();

      // Query Two
      if (affordability_.equals("Y")) {
        System.out.println("");
        System.out.println("[N]ormal or [E]xtra Sized?:");
        String build_size = scanner.next();
      }
      // Query Two
      else if (affordability_.equals("N")) {
        System.out.println("");
        System.out.println("Do you want a MakerBot? [Y]es/[N]o:");
        String makerbot = scanner.next();
      }
    }
    // Query One
    else if (qualities.equals("P")) {
      System.out.println("");
      System.out.println("Do you want a MakerBot? [Y]es/[N]o:");
      String makerbot = scanner.next();

      // Query Two
      if (makerbot.equals("N")) {
        System.out.println("");
        System.out.println("What type of portability do you want? [F]oldable & Battery Operable or [L]ightweight & Small:");
        String portability = scanner.next();
      }
      // Query Two
      else if (makerbot.equals("Y")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: MakerBot Replicator Mini");
      }
    }
    // Query One
    else {
      System.out.println("");
      System.out.println("");
      System.out.println("That was not an option.");
    }

    scanner.close();
  }
}