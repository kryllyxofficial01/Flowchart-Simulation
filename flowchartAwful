using System;

class Program {
    public static void Main (string[] args) {
        char choice = ' ';
        int x = 0;
        Console.WriteLine("Welcome to the 3D Printer Finder.\n\n");
		
        do {
            Console.Write("The thing I want most is...\n\n [A] Ultra High Print Quality\n\n [B] Moddability\n\n [C] Ease of Use\n\n [D] Big Build Volume\n\n [E] Portability\n\n");
            choice = Convert.ToChar(Console.ReadLine());
            choice = Char.ToUpper(choice);
            switch (choice) {
                case 'A':
                Console.Write("Do you also need affordability? [Y or N] ");
                choice = Convert.ToChar(Console.ReadLine());
                choice = Char.ToUpper(choice);

                if (choice == 'Y'){
                    Console.Write("Do you need dual extrusion [Y or N] ");
                    choice = Convert.ToChar(Console.ReadLine());
                    choice = Char.ToUpper(choice);

                    if (choice == 'Y')
                        Console.WriteLine("You'll want the Deezmaker Bukobot v2 Duo.");
                    else if (choice == 'N')
                        Console.WriteLine("You'll want the Deezmaker Bukobot v2");
                }
                else if (choice == 'N')
                    Console.WriteLine("You'll want the Ultimaker2.");
                break;
                    
                case 'B':
                    Console.Write("Do you also need affordability? [Y or N] ");
                    choice = Convert.ToChar(Console.ReadLine());
                    choice = Char.ToUpper(choice);

                    if (choice == 'Y'){
                        Console.WriteLine("DIY Kit or Assembled Machine? [D or V] ");
                        choice = Convert.ToChar(Console.ReadLine());
                        choice = Char.ToUpper(choice);

                        if (choice == 'D'){
                            Console.Write("Would you rather have more build volume or faster printing speeds? [V or S] ");
                            choice = Convert.ToChar(Console.ReadLine());
                            choice = Char.ToUpper(choice);

                            if (choice == 'V'){
                                Console.Write("A little bit more build volume or a LOT more build volume? [l or L (CASE SENSITIVE)] ");
                                choice = Convert.ToChar(Console.ReadLine());
                                choice = Char.ToUpper(choice);
                                
                                if (choice == 'l'){
                                    Console.Write("Would you rather have better company support or better community support [c or C (CASE SENSITIVE)] ");
                                    choice = Convert.ToChar(Console.ReadLine());
                                    choice = Char.ToUpper(choice);

                                    if (choice == 'c')
                                        Console.WriteLine("You'll want the Rigidbot Regular.");
                                    else if (choice == 'C')
                                        Console.WriteLine("You'll want the Printrbot Metal Plus.");
                                }
                                else if (choice == 'L')
                                    Console.WriteLine("You'll want the Rigidbot Big.");
                            }
                        }
                        else if (choice == 'A')
                            Console.WriteLine("You'll want the Robo3D");
                    }
                    else if (choice == 'N'){
                        Console.WriteLine("DIY Kit or Assembled Machine? [D or V] ");
                        choice = Convert.ToChar(Console.ReadLine());
                        choice = Char.ToUpper(choice);

                        if (choice == 'D')
                            Console.WriteLine("You'll want the Luizbot KITTAZ");
                        else if (choice == 'A')
                            Console.WriteLine("You'll want the Luizbot TAZ 4");
                    }
                    break;
                    
                case 'C':
                    Console.Write("Do you also need affordability? [Y or N] ");
                    choice = Convert.ToChar(Console.ReadLine());
                    choice = Char.ToUpper(choice);

                    if (choice == 'Y'){
                        Console.Write("Would you rather have more ease of use or more build volume? [E or V] ");
                        choice = Convert.ToChar(Console.ReadLine());

                        if (choice == 'E')
                            Console.WriteLine("You'll want the Dremel Ideabuilder.");
                        else if (choice == 'V'){
                            Console.Write("Do you want an open source printer [Y or N] ");
                            choice = Convert.ToChar(Console.ReadLine());
                            choice = Char.ToUpper(choice);

                            if (choice == 'Y'){
                                Console.Write("Do you need a dual extruder? [Y or N] ");
                                choice = Convert.ToChar(Console.ReadLine());
                                choice = Char.ToUpper(choice);

                                if (choice == 'Y'){
                                    Console.Write("Do you need a big build volume? [Y or N] ");
                                    choice = Convert.ToChar(Console.ReadLine());
                                    choice = Char.ToUpper(choice);    

                                    if (choice == 'Y')
                                        Console.WriteLine("You'll want the Solidoodle Workbench.");
                                    else if (choice == 'N')
                                        Console.WriteLine("You'll want the Solidoodle Workbench Apprentice.");
                                }
                                else if (choice == 'N')
                                    Console.WriteLine("You'll want the Solidoodle 4.");
                            }
                        }
                    }
                    if (choice == 'N'){
                        Console.Write("Are you opposed to the idea of having a MakerBot? [Y or N] ");
                        choice = Convert.ToChar(Console.ReadLine());
                        choice = Char.ToUpper(choice);

                        if (choice == 'Y'){
                            Console.Write("How about a MakerBot clone? [Y or N] ");
                            choice = Convert.ToChar(Console.ReadLine());
                            choice = Char.ToUpper(choice);

                            if (choice == 'Y')
                                Console.WriteLine("You'll want the Flashforge Creator.");
                            else if (choice == 'N'){
                                Console.Write("Do you need a dual extruder? [Y or N] ");
                                choice = Convert.ToChar(Console.ReadLine());
                                choice = Char.ToUpper(choice);

                                if (choice == 'Y'){
                                    Console.Write("How does a triple extruder sound? [Y or N] ");
                                    choice = Convert.ToChar(Console.ReadLine());
                                    choice = Char.ToUpper(choice);

                                    if (choice == 'Y')
                                        Console.WriteLine("You'll want the 3D systems CubePro Trio.");
                                    else if (choice == 'N'){
                                        Console.Write("So then just a dual extruder. Do you need a big build volume? [Y or N] ");
                                        choice = Convert.ToChar(Console.ReadLine());
                                        choice = Char.ToUpper(choice);

                                        if (choice == 'Y')
                                            Console.WriteLine("You'll want the Leapfrog Creatr XL.");
                                        else if (choice == 'N'){
                                            Console.WriteLine("You'll want the Leapfrog Creatr HS.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                break;
                    
                case 'D':
                    Console.Write("Do you also need affordability? [Y or N] ");
                    choice = Convert.ToChar(Console.ReadLine());
                    choice = Char.ToUpper(choice);

                    if (choice == 'Y'){
                        Console.Write("Do you want big build volume, or REALLY BIG build volume? [b or B (CASE SENSITIVE)] ");
                        choice = Convert.ToChar(Console.ReadLine());
                        
                        if (choice == 'b')
                            Console.WriteLine("You'll want the Rigidbot Big. ");
                        else if (choice == 'B'){
                            Console.WriteLine("DIY Kit or Assembled Machine? [D or V] ");
                            choice = Convert.ToChar(Console.ReadLine());
                            choice = Char.ToUpper(choice);

                            if (choice == 'D')
                                Console.WriteLine("You'll want the SeeMeCNC Rostock MAX v2.");
                            else if (choice == 'A')
                                Console.WriteLine("You'll want the Wanhao Duplicator.");
                        }
                    }
                break;
                case 'E':
                    Console.Write("Are you opposed to the idea of having a MakerBot? [Y or N] ");
                    choice = Convert.ToChar(Console.ReadLine());
                    choice = Char.ToUpper(choice);

                    if (choice == 'Y'){
                        Console.Write("What level of portable are we talking about...Foldable and battery operable or lightweight and small? [F or S] ");
                        choice = Convert.ToChar(Console.ReadLine());
                        choice = Char.ToUpper(choice);

                        if (choice == 'F')
                            Console.WriteLine("You'll want the Portabee GO.");
                        else if (choice == 'S'){
                            Console.Write("Would you rather have the ability to print more materials or have a more portable printer? [M or P] ");
                            choice = Convert.ToChar(Console.ReadLine());
                            choice = Char.ToUpper(choice);

                            if (choice == 'M')
                                Console.WriteLine("You'll want the Deezmaker Bukito.");
                            else if (choice == 'P')
                                Console.WriteLine("You'll want the Printrbot Simple Metal.");
                        }
                    }
                break;
            }
            choice = ' ';
        } while (x != 1);
    }
}
