import java.util.Scanner;

public class flowchart {

  public static void printQualityBranch() {
    Scanner printQuality = new Scanner(System.in);

    System.out.println("");
    System.out.println("Do you want affordability? [Y]es or [N]o?:");
    String affordability = printQuality.next();
    affordability = affordability.toUpperCase();

    if (affordability.equals("Y")) {
      System.out.println("");
      System.out.println("Do you also want dual extrusion? [Y]es or [N]o?:");
      String extrusion_type = printQuality.next();
      extrusion_type = extrusion_type.toUpperCase();

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
    affordability = affordability.toUpperCase();

    if (affordability.equals("Y")) {
      System.out.println("");
      System.out.println("What kit do you want? [D]IY or [P]re-assembled?:");
      String kit_type = moddability.next();
      kit_type = kit_type.toUpperCase();

      if (kit_type.equals("D")) {
        System.out.println("");
        System.out.println("Do you want [M]ore Build Volume or [F]aster Printing Speed?:");
        String capability = moddability.next();
        capability = capability.toUpperCase();

        if (capability.equals("M")) {
          System.out.println("");
          System.out.println("How much more? A [B]it More or a [L]ot More?:");
          String build_amount = moddability.next();
          build_amount = build_amount.toUpperCase();

          if (build_amount.equals("B")) {
            System.out.println("");
            System.out.println("Would you rather have better [C]ompany Support or better C[O]mmunity Support?:");
            String support_type = moddability.next();
            support_type = support_type.toUpperCase();

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
      kit_type = kit_type.toUpperCase();

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
    affordability = affordability.toUpperCase();

    if (affordability.equals("Y")) {
      System.out.println("");
      System.out.println("Do you want more [E]ase of Use or [B]uild Volume?:");
      String capability = easeOfUse.next();
      capability = capability.toUpperCase();

      if (capability.equals("E")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Dremel Ideabuilder");
      }
      else if (capability.equals("B")) {
        System.out.println("");
        System.out.println("Do you want an open-source printer? [Y]es or [N]o?:");
        String printer = easeOfUse.next();
        printer = printer.toUpperCase();

        if (printer.equals("Y")) {
          System.out.println("");
          System.out.println("Do you want a dual extruder? [Y]es or [N]o?:");
          String extruder = easeOfUse.next();
          extruder = extruder.toUpperCase();

          if (extruder.equals("Y")) {
            System.out.println("");
            System.out.println("Do you want a big build volume? [Y]es or [N]o?:");
            String build_type = easeOfUse.next();
            build_type = build_type.toUpperCase();

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
          else if (extruder.equals("N")) {
            System.out.println("");
            System.out.println("");
            System.out.println("Recommendation: Solidoodle 4");
          }
        }
        else if (printer.equals("N")) {
          System.out.println("");
          System.out.println("Do you want a dual extruder? [Y]es or [N]o?:");
          String extruder = easeOfUse.next();
          extruder = extruder.toUpperCase();

          if (extruder.equals("Y")) {
            System.out.println("");
            System.out.println("");
            System.out.println("Recommendation: XYZPrinting DaVinci 2.0");
          }
          else if (extruder.equals("N")) {
            System.out.println("");
            System.out.println("Do you want a 3D scanner? [Y]es or [N]o?:");
            String scanner = easeOfUse.next();
            scanner = scanner.toUpperCase();

            if (scanner.equals("Y")) {
              System.out.println("");
              System.out.println("");
              System.out.println("Recommendation: XYZPrinting DaVinci 1.0 AiO");
            }
            else if (scanner.equals("N")) {
              System.out.println("");
              System.out.println("");
              System.out.println("Recommendation: XYZPrinting DaVinci 1.0");
            }
          }
        }
      }
    }
    else if (affordability.equals("N")) {
      System.out.println("");
      System.out.println("Do you want a MakerBot? [Y]es or [N]o?:");
      String makerbot = easeOfUse.next();
      makerbot = makerbot.toUpperCase();

      if (makerbot.equals("Y")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Makerbot Replicator 2");
      }
      else if (makerbot.equals("N")) {
        System.out.println("");
        System.out.println("Do you want a MakerBot clone? [Y]es or [N]o?:");
        String clone = easeOfUse.next();
        clone = clone.toUpperCase();

        if (clone.equals("Y")) {
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Flashforge Creator");
        }
        else if (clone.equals("N")) {
          System.out.println("");
          System.out.println("Do you want a dual extruder? [Y]es or [N]o?:");
          String extruder = easeOfUse.next();
          extruder = extruder.toUpperCase();

          if (extruder.equals("Y")) {
            System.out.println("");
            System.out.println("Do you want a triple extruder? [Y]es or [N]o?:");
            String triple_extruder = easeOfUse.next();
            triple_extruder = triple_extruder.toUpperCase();

            if (triple_extruder.equals("Y")) {
              System.out.println("");
              System.out.println("");
              System.out.println("Recommendation: 3D Systems CubePro Trio");
            }
            else if (triple_extruder.equals("N")) {
              System.out.println("");
              System.out.println("Do you want a Big Build Volume? [Y]es or [N]o?");
              String build = easeOfUse.next();
              build = build.toUpperCase();

              if (build.equals("Y")) {
                System.out.println("");
                System.out.println("");
                System.out.println("Recommendation: Leapfrog Creatr XL");
              }
              else if (build.equals("N")) {
                System.out.println("");
                System.out.println("");
                System.out.println("Recommendation: Leapfrog Creatr HS");
              }
            }
          }
          else if (extruder.equals("N")) {
            System.out.println("");
              System.out.println("");
              System.out.println("Recommendation: SeeMeCNC Orion Delta, Airwolf HDX, or Leapfrog Creatr");
          }
        }
      }
    }

    easeOfUse.close();
  }

  public static void bigBuildVolume() {
    Scanner bigBuildVolume = new Scanner(System.in);

    System.out.println("");
    System.out.println("Do you want affordability? [Y]es or [N]o?:");
    String affordability = bigBuildVolume.next();
    affordability = affordability.toUpperCase();

    if (affordability.equals("Y")) {
      System.out.println("");
      System.out.println("Do you [N]ormal sized build or [E]xtra sized build?:");
      String build_size = bigBuildVolume.next();
      build_size = build_size.toUpperCase();

      if (build_size.equals("N")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Rigidbot Big");
      }
      else if (build_size.equals("E")) {
        System.out.println("");
        System.out.println("Do you want a [D]IY kit or [P]re-assembled kit?:");
        String kit_type = bigBuildVolume.next();
        kit_type = kit_type.toUpperCase();

        if (kit_type.equals("D")) {
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: SeeMeCNC Rostock MAX v2");
        }
        else if (kit_type.equals("P")) {
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Wanhao Duplicator 5");
        }
      }
    }
    else if (affordability.equals("N")) {
      System.out.println("");
      System.out.println("Do you want a MakerBot? [Y]es or [N]o?:");
      String makerbot = bigBuildVolume.next();
      makerbot = makerbot.toUpperCase();

      if (makerbot.equals("Y")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Makerbot Replicator Z18");
      }
      else if (makerbot.equals("N")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Leapfrog Creatr XL");
      }
    }

    bigBuildVolume.close();
  }

  public static void portabilityBranch() {
    Scanner portability = new Scanner(System.in);

    System.out.println("");
    System.out.println("Do you want a MakerBot? [Y]es or [N]o?:");
    String makerbot = portability.next();
    makerbot = makerbot.toUpperCase();

    if (makerbot.equals("Y")) {
      System.out.println("");
      System.out.println("");
      System.out.println("Recommendation: MakerBot Replicator Mini");
    }
    else if (makerbot.equals("N")) {
      System.out.println("");
      System.out.println("How portable do you want your 3D designer? [F]oldable and Battery Operable, or [L]ightweight and Small?:");
      String portability_type = portability.next();
      portability_type = portability_type.toUpperCase();

      if (portability_type.equals("F")) {
        System.out.println("");
        System.out.println("");
        System.out.println("Recommendation: Portabee GO");
      }
      else if (portability_type.equals("L")) {
        System.out.println("");
        System.out.println("Would you rather [M]ore Printing capabilities or have a more [P]ortable Printer?:");
        String capability = portability.next();
        capability = capability.toUpperCase();

        if (capability.equals("M")) {
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Deezmaker Bukito");
        }
        else if (capability.equals("P")) {
          System.out.println("");
          System.out.println("");
          System.out.println("Recommendation: Printrbot Simple Metal");
        }
      }
    }

    portability.close();
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What do you want most from your 3D Designer? [U]ltra High Print Quality, [M]oddability, [E]ase of Use, [B]ig Build Volume, or [P]ortability?:");
    String purpose = scanner.next();
    purpose = purpose.toUpperCase();

    if (purpose.equals("U")) {
      printQualityBranch();
    }
    else if (purpose.equals("M")) {
      moddabilityBranch();
    }
    else if (purpose.equals("E")) {
      easeOfUseBranch();
    }
    else if (purpose.equals("B")) {
      bigBuildVolume();
    }
    else if (purpose.equals("P")) {
      portabilityBranch();
    }
    
    scanner.close();
  }
}