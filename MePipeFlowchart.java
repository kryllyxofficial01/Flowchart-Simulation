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
        int text = scanner.nextInt();
        if(questionID == 1) {
            if(text == 1) {
                flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 2);
            } else if(text == 2) {
                flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 3);
            } else if(text == 3) {
                flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 4);
            } else if(text == 4) {
                flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 5);
            } else if(text == 5) {
                flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 6);
            } else {
                flowchartHandler("The thing I want most is... 1) Ultra High Print Quality 2) Moddability 3) Ease of Use 4) Big Build Volume 5) Portability", scanner, 1);
            }
        } else if(questionID == 2) {
            if(text == 1) {
                flowchartHandler("Do you also need dual extrusion? 1) Yes 2) No", scanner, 7);
            } else if(text == 2) {
                answer = "Ultimaker2";
            } else {
                flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 2);
            }
        } else if(questionID == 3) {
            if(text == 1) {
                flowchartHandler("DIY kit or assembled machine? 1) Kit 2) Assembled", scanner, 8);
            } else if(text == 2) {
                flowchartHandler("DIY kit or assembled machine? 1) Kit 2) Assembled", scanner, 9);
            } else {
                flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 3);
            }
        } else if(questionID == 4) {
            if(text == 1) {
                flowchartHandler("Would you rather have more ease of use or more build volume? 1) Ease of use 2) Build volume", scanner, 10);
            } else if(text == 2) {
                flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 11);
            } else {
                flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 4);
            }
        } else if(questionID == 5) {
            if(text == 1) {
                flowchartHandler("Do you want big build volume, or REALLY BIG build volume? 1) Big 2) REALLY BIG", scanner, 12);
            } else if(text == 2) {
                flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 13);
            } else {
                flowchartHandler("Do you also need affordability? 1) Yes 2) No", scanner, 5);
            }
        } else if(questionID == 6) {
            if(text == 1) {
                flowchartHandler("What level of portable are we talking about... 1) Foldable and battery operable 2) Lightweight and small", scanner, 14);
            } else if(text == 2) {
                answer = "MakerBot Replicator Mini";
            } else {
                flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 6);
            }
        } else if(questionID == 7) {
            if(text == 1) {
                answer = "Deezmaker Bukobot v2 Duo";
            } else if(text == 2) {
                answer = "Deezmaker Bukobot v2";
            } else {
                flowchartHandler("Do you also need dual extrusion? 1) Yes 2) No", scanner, 7);
            }
        } else if(questionID == 8) {
            if(text == 1) {
                flowchartHandler("Would you rather have more build volume or faster printing speeds? 1) Speed 2) Build volume", scanner, 15);
            } else if(text == 2) {
                answer = "Robo3D";
            } else {
                flowchartHandler("DIY kit or assembled machine? 1) Kit 2) Assembled", scanner, 8);
            }
        } else if(questionID == 9) {
            if(text == 1) {
                answer = "Lulzbot KITTAZ";
            } else if(text == 2) {
                answer = "Lulzbot TAZ 4";
            } else {
                flowchartHandler("DIY kit or assembled machine? 1) Kit 2) Assembled", scanner, 9);
            }
        } else if(questionID == 10) {
            if(text == 1) {
                answer = "Dremel Ideabuilder";
            } else if(text == 2) {
                flowchartHandler("Do you want an open source printer? 1) Yes 2) No/I don't care", scanner, 16);
            } else {
                flowchartHandler("Would you rather have more ease of use or more build volume? 1) Ease of use 2) Build volume", scanner, 10);
            }
        } else if(questionID == 11) {
            if(text == 1) {
                flowchartHandler("How about a MakerBot Clone? 1) That's fine! 2) No way!", scanner, 17);
            } else if(text == 2) {
                answer = "MakerBot Replicator 2";
            } else {
                flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 11);
            }
        } else if(questionID == 12) {
            if(text == 1) {
                answer = "Rigidbot Big";
            } else if(text == 2) {
                flowchartHandler("DIY kit or assembled machine? 1) Assembled 2) Kit", scanner, 18);
            } else {
                flowchartHandler("Do you want big build volume, or REALLY BIG build volume? 1) Big 2) REALLY BIG", scanner, 12);
            }
        } else if(questionID == 13) {
            if(text == 1) {
                answer = "Leapfrog Creatr XL";
            } else if(text == 2) {
                answer = "Makerbot Replicator Z18";
            } else {
                flowchartHandler("Are you opposed to the idea of having a MakerBot? 1) Yes 2) No", scanner, 13);
            }
        } else if(questionID == 14) {
            if(text == 1) {
                answer = "Portabee GO";
            } else if(text == 2) {
                flowchartHandler("Would you rather have the ability to print more materials or have a more portable printer? 1) More materials 2) Portability", scanner, 19);
            } else {
                flowchartHandler("What level of portable are we talking about... 1) Foldable and battery operable 2) Lightweight and small", scanner, 14);
            }
        } else if(questionID == 15) {
            if(text == 1) {
                answer = "Velleman K8200";
            } else if(text == 2) {
                flowchartHandler("A little big more build volume or a LOT more build volume? 1) A little more 2) A LOT more", scanner, 20);
            } else {
                flowchartHandler("Would you rather have more build volume or faster printing speeds? 1) Speed 2) Build volume", scanner, 15);
            }
        } else if(questionID == 16) {
            if(text == 1) {
                flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 21);
            } else if(text == 2) {
                flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 22);
            } else {
                flowchartHandler("Do you want an open source printer? 1) Yes 2) No/I don't care", scanner, 16);
            }
        } else if(questionID == 17) {
            if(text == 1) {
                answer = "Flashforge Creator";
            } else if(text == 2) {
                flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 23);
            } else {
                flowchartHandler("How about a MakerBot Clone? 1) That's fine! 2) No way!", scanner, 17);
            }
        } else if(questionID == 18) {
            if(text == 1) {
                answer = "Wanhao Duplicator 5";
            } else if(text == 2) {
                answer = "SeeMeCNC Rostock MAX v2";
            } else {
                flowchartHandler("DIY kit or assembled machine? 1) Assembled 2) Kit", scanner, 18);
            }
        } else if(questionID == 19) {
            if(text == 1) {
                answer = "Deezmaker Bukito";
            } else if(text == 2) {
                answer = "Printrbot Simple Metal";
            } else {
                flowchartHandler("Would you rather have the ability to print more materials or have a more portable printer? 1) More materials 2) Portability", scanner, 19);
            }
        } else if(questionID == 20) {
            if(text == 1) {
                flowchartHandler("Would you rather have better company support or better community support? 1) Community 2) Company", scanner, 24);
            } else if(text == 2) {
                answer = "Rigidbot Big";
            } else {
                flowchartHandler("A little big more build volume or a LOT more build volume? 1) A little more 2) A LOT more", scanner, 20);
            }
        } else if(questionID == 21) {
            if(text == 1) {
                flowchartHandler("Do you need a big build volume? 1) Yes 2) No", scanner, 25);
            } else if(text == 2) {
                answer = "Solidoodle 4";
            } else {
                flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 21);
            }
        } else if(questionID == 22) {
            if(text == 1) {
                answer = "XYZPrinting DaVinci 2.0";
            } else if(text == 2) {
                flowchartHandler("How does a built in 3D scanner sound? 1) Cool! 2) Eh.", scanner, 26);
            } else {
                flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 22);
            }
        } else if(questionID == 23) {
            if(text == 1) {
                flowchartHandler("Make your pick. These three have different build volumes and are priced respectively. 1) SeeMeCNC Orion Delta 2) AirWolf HDX 3) Leapfrog Creatr", scanner, 27);
            } else if(text == 2) {
                flowchartHandler("How does a triple extruder sound? 1) Cool! 2) Eh.", scanner, 28);
            } else {
                flowchartHandler("Do you need a dual extruder? 1) Yes 2) No", scanner, 23);
            }
        } else if(questionID == 24) {
            if(text == 1) {
                answer = "Rigidbot Regular";
            } else if(text == 2) {
                answer = "Printrbot Metal Plus";
            } else {
                flowchartHandler("Would you rather have better company support or better community support? 1) Community 2) Company", scanner, 24);
            }
        } else if(questionID == 25) {
            if(text == 1) {
                answer = "Solidoodle Workbench";
            } else if(text == 2) {
                answer = "Solidoodle Workbench Apprentice";
            } else {
                flowchartHandler("Do you need a big build volume? 1) Yes 2) No", scanner, 25);
            }
        } else if(questionID == 26) {
            if(text == 1) {
                answer = "XYZPrinting DaVinci 1.0 AiO";
            } else if(text == 2) {
                answer = "XYZPrinting DaVinci 1.0";
            } else {
                flowchartHandler("How does a built in 3D scanner sound? 1) Cool! 2) Eh.", scanner, 26);
            }
        } else if(questionID == 27) {
            if(text == 1) {
                answer = "SeeMeCNC Orion Delta";
            } else if(text == 2) {
                answer = "AirWolf HDX";
            } else if(text == 3) {
                answer = "Leapfrog Creatr";
            } else {
                flowchartHandler("Make your pick. These three have different build volumes and are priced respectively. 1) SeeMeCNC Orion Delta 2) AirWolf HDX 3) Leapfrog Creatr", scanner, 27);
            }
        } else if(questionID == 28) {
            if(text == 1) {
                answer = "3D Systems CubePro Trio";
            } else if(text == 2) {
                flowchartHandler("So then just a dual extruder. Do you need a big build volume? 1) Yes 2) No", scanner, 29);
            } else {
                flowchartHandler("How does a triple extruder sound? 1) Cool! 2) Eh.", scanner, 28);
            }
        } else if(questionID == 29) {
            if(text == 1) {
                answer = "Leapfrog Creatr XL";
            } else if(text == 2) {
                answer = "Leapfrog Creatr HS";
            } else {
                flowchartHandler("So then just a dual extruder. Do you need a big build volume? 1) Yes 2) No", scanner, 29);
            }
        }
    }
}
