import java.util.Scanner;

public class MePipeFlowchart {

    static String answer = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        flowchartHandler("The thing I want most is... 1) Ultra High Print Quality 2) Moddability 3) Ease of Use 4) Big Build Volume 5) Portability", scanner, 1);
        System.out.println(answer);
    }

    public static void flowchartHandler(String questionText, Scanner scanner, int questionID) {
        System.out.println(questionText);
        switch (questionID) {
            case 1:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 2);
                        break;
                    case "2":
                        flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 3);
                        break;
                    case "3":
                        flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 4);
                        break;
                    case "4":
                        flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 5);
                        break;
                    case "5":
                        flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 6);
                        break;
                    default:
                        flowchartHandler("The thing I want most is... 1) Ultra High Print Quality 2) Moddability 3) Ease of Use 4) Big Build Volume 5) Portability", scanner, 1);
                        break;
                }
                break;
            case 2:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Do you also need dual extrusion? 1) Yes 2) No", scanner, 7);
                        break;
                    case "2":
                        answer = "Ultimaker2";
                    default:
                        flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 2);
                        break;
                }
                break;
            case 3:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("DIY kit or assembled machine? 1) Kit 2) Assembled", scanner, 8);
                        break;
                    case "2":
                        flowchartHandler("DIY kit or assembled machine? 1) Kit 2) Assembled", scanner, 9);
                        break;
                    default:
                        flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 3);
                        break;
                }
            case 4:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Would you rather have more ease of use or more build volume? 1) Ease of use 2) Build volume", scanner, 10);
                        break;
                    case "2":
                        flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 11);
                        break;
                    default:
                        flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 4);
                        break;
                }
                break;
            case 5:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Do you want big build volume, or REALLY BIG build volume? 1) Big 2) REALLY BIG", scanner, 12);
                        break;
                    case "2":
                        flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 13);
                        break;
                    default:
                        flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 5);
                        break;
                }
                break;
            case 6:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("What level of portable are we talking about... 1) Foldable and battery operable 2) Lightweight and small", scanner, 14);
                        break;
                    case "2":
                        answer = "MakerBot Replicator Mini";
                    default:
                        flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 6);
                        break;
                }
                break;
            case 7:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Deezmaker Bukobot v2 Duo";
                    case "2":
                        answer = "Deezmaker Bukobot v2";
                    default:
                        flowchartHandler("Do you also need dual extrusion? 1) Yes 2) No", scanner, 7);
                        break;
                }
                break;
            case 8:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Would you rather have more build volume or faster printing speeds? 1) Speed 2) Build volume", scanner, 15);
                        break;
                    case "2":
                        answer = "Robo3D";
                    default:
                        flowchartHandler("DIY kit or assembled machine? 1) Kit 2) Assembled", scanner, 8);
                        break;
                }
                break;
            case 9:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Lulzbot KITTAZ";
                    case "2":
                        answer = "Lulzbot TAZ 4";
                    default:
                        flowchartHandler("DIY kit or assembled machine? 1) Kit 2) Assembled", scanner, 9);
                        break;
                }
                break;
            case 10:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Dremel Ideabuilder";
                    case "2":
                        flowchartHandler("Do you want an open source printer? 1) Yes 2) No/I don't care", scanner, 16);
                        break;
                    default:
                        flowchartHandler("Would you rather have more ease of use or more build volume? 1) Ease of use 2) Build volume", scanner, 10);
                        break;
                }
                break;
            case 11:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("How about a MakerBot Clone? 1) That's fine! 2) No way!", scanner, 17);
                        break;
                    case "2":
                        answer = "MakerBot Replicator 2";
                    default:
                    flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 11);
                        break;
                }
                break;
            case 12:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Rigidbot Big";
                    case "2":
                        flowchartHandler("DIY kit or assembled machine? 1) Assembled 2) Kit", scanner, 18);
                        break;
                    default:
                        flowchartHandler("Do you want big build volume, or REALLY BIG build volume? 1) Big 2) REALLY BIG", scanner, 12);
                        break;
                }
                break;
            case 13:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Leapfrog Creatr XL";
                    case "2":
                        answer = "Makerbot Replicator Z18";
                    default:
                        flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 13);
                        break;
                }
                break;
            case 14:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Portabee GO";
                    case "2":
                        flowchartHandler("Would you rather have the ability to print more materials or have a more portable printer? 1) More materials 2) Portability", scanner, 19);
                        break;
                    default:
                        flowchartHandler("What level of portable are we talking about... 1) Foldable and battery operable 2) Lightweight and small", scanner, 14);
                        break;
                }
                break;
            case 15:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Velleman K8200";
                    case "2":
                        flowchartHandler("A little big more build volume or a LOT more build volume? 1) A little more 2) A LOT more", scanner, 20);
                        break;
                    default:
                        flowchartHandler("Would you rather have more build volume or faster printing speeds? 1) Speed 2) Build volume", scanner, 15);
                        break;
                }
                break;
            case 16:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 21);
                        break;
                    case "2":
                        flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 22);
                        break;
                    default:
                        flowchartHandler("Do you want an open source printer? 1) Yes 2) No/I don't care", scanner, 16);
                        break;
                }
                break;
            case 17:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Flashforge Creator";
                    case "2":
                        flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 23);
                        break;
                    default:
                        flowchartHandler("How about a MakerBot Clone? 1) That's fine! 2) No way!", scanner, 17);
                        break;
                }
                break;
            case 18:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Wanhao Duplicator 5";
                    case "2":
                        answer = "SeeMeCNC Rostock MAX v2";
                    default:
                        flowchartHandler("DIY kit or assembled machine? 1) Assembled 2) Kit", scanner, 18);
                        break;
                }
                break;
            case 19:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Deezmaker Bukito";
                    case "2":
                        answer = "Printrbot Simple Metal";
                    default:
                        flowchartHandler("Would you rather have the ability to print more materials or have a more portable printer? 1) More materials 2) Portability", scanner, 19);
                        break;
                }
                break;
            case 20:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Would you rather have better company support or better community support? 1) Community 2) Company", scanner, 24);
                        break;
                    case "2":
                        answer = "Rigidbot Big";
                    default:
                        flowchartHandler("A little big more build volume or a LOT more build volume? 1) A little more 2) A LOT more", scanner, 20);
                        break;
                }
                break;
            case 21:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Do you need a big build volume? 1) Yes 2) No", scanner, 25);
                        break;
                    case "2":
                        answer = "Solidoodle 4";
                    default:
                        flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 21);
                        break;
                }
                break;
            case 22:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "XYZPrinting DaVinci 2.0";
                    case "2":
                        flowchartHandler("How does a built in 3D scanner sound? 1) Cool! 2) Eh.", scanner, 26);
                        break;
                    default:
                        flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 22);
                        break;
                }
                break;
            case 23:
                switch (scanner.nextLine()) {
                    case "1":
                        flowchartHandler("Make your pick. These three have different build volumes and are priced respectively. 1) SeeMeCNC Orion Delta 2) AirWolf HDX 3) Leapfrog Creatr", scanner, 27);
                        break;
                    case "2":
                        flowchartHandler("How does a triple extruder sound? 1) Cool! 2) Eh.", scanner, 28);
                        break;
                    default:
                        flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 23);
                        break;
                }
                break;
            case 24:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Rigidbot Regular";
                    case "2":
                        answer = "Printrbot Metal Plus";
                    default:
                        flowchartHandler("Would you rather have better company support or better community support? 1) Community 2) Company", scanner, 24);
                        break;
                }
                break;
            case 25:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Solidoodle Workbench";
                    case "2":
                        answer = "Solidoodle Workbench Apprentice";
                    default:
                        flowchartHandler("Do you need a big build volume? 1) Yes 2) No", scanner, 25);
                        break;
                }
                break;
            case 26:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "XYZPrinting DaVinci 1.0 AiO";
                    case "2":
                        answer = "XYZPrinting DaVinci 1.0";
                    default:
                        flowchartHandler("How does a built in 3D scanner sound? 1) Cool! 2) Eh.", scanner, 26);
                        break;
                }
                break;
            case 27:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "SeeMeCNC Orion Delta";
                    case "2":
                        answer = "AirWolf HDX";
                    case "3":
                        answer = "Leapfrog Creatr";
                    default:
                        flowchartHandler("Make your pick. These three have different build volumes and are priced respectively. 1) SeeMeCNC Orion Delta 2) AirWolf HDX 3) Leapfrog Creatr", scanner, 27);
                        break;
                }
                break;
            case 28:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "3D Systems CubePro Trio";
                    case "2":
                        flowchartHandler("So then just a dual extruder. Do you need a big build volume? 1) Yes 2) No", scanner, 29);
                        break;
                    default:
                        flowchartHandler("How does a triple extruder sound? 1) Cool! 2) Eh.", scanner, 28);
                        break;
                }
                break;
            case 29:
                switch (scanner.nextLine()) {
                    case "1":
                        answer = "Leapfrog Creatr XL";
                    case "2":
                        answer = "Leapfrog Creatr HS";
                    default:
                        flowchartHandler("So then just a dual extruder. Do you need a big build volume? 1) Yes 2) No", scanner, 29);
                        break;
                }
                break;
        }
    }
}
