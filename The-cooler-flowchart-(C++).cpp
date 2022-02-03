#include <iostream>
#include <string>

using namespace std;

int flowchart(){
    char choice = ' ';
    int x = 0;
    cout << "Welcome to the 3D Printer Finder.\n\n\n";
    do {
        cout << "The thing I want most is...\n\n  [A] Ultra High Print Quality\n\n  [B] Moddability\n\n  [C] Ease of Use\n\n  [D] Big Build Volume\n\n  [E] Portability\n\n";  
        cin >> choice;
        choice = toupper(choice);
        if (choice == 'A'){
            //Ultra High Print Quality 
            choice = ' ';
            cout << "Do you also need affordability? [Y or N] ";
            cin >> choice;
            choice = toupper(choice);
            if (choice == 'Y'){
                //Need affordability
                choice = ' ';
                cout << "Do you need dual extrusion? [Y or N] ";
                cin >> choice;
                choice = toupper(choice);        
                if (choice == 'Y')
                    cout << "You'll want the Deezmaker Bukobot v2 Duo.\n";
                if (choice == 'N')
                    cout << "You'll want the Deezmaker Bukobot v2.\n";                
                }
                else if (choice == 'N')
                    cout << "You'll want the Ultimaker2.\n";     
                }
            if (choice == 'B'){
                //Moddability
                choice = ' ';
                cout << "Do you also need affordability? [Y or N] ";
                cin >> choice;
                choice = toupper(choice);    
                if (choice == 'Y'){
                    choice = ' ';
                    cout << "DIY kit or assembled machine? [D or A] ";
                    cin >> choice;
                    choice = toupper(choice);    
                    if (choice == 'D'){
                        choice = ' ';
                        cout << "Would you rather have more build volume or faster printing speeds? [V or S] ";
                        cin >> choice;
                        choice = toupper(choice);    
                        if (choice == 'V'){
                            choice = ' ';
                            cout << "A little bit more build volume or a LOT more build volume? [l or L (CASE SENSITIVE)]";
                            cin >> choice;
                            if (choice == 'l'){
                                choice = ' ';
                                cout << "Would you rather have better company support or better community support? [c or C (CASE SENSITIVE)] ";
                                cin >> choice;
                                if (choice == 'c')
                                    cout << "You'll want the Rigidbot Regular.\n";
                                if (choice == 'C')
                                    cout << "You'll want the Printrbot Metal Plus.\n";
                            }                                                   
                            else if (choice == 'L')
                                cout << "You'll want the Rigidbot Big.\n";
                        }
                    }
                        else if (choice == 'A')
                            cout << "You'll want the Robo3D.\n";
                        }
                else if (choice == 'N'){
                    choice = ' ';
                    cout << "DIY kit or assembled machine? [D or A] ";
                    cin >> choice;
                    choice = toupper(choice);    
                    if (choice == 'D')
                        cout << "You'll want the Luizbot KITTAZ.\n";
                    else if (choice == 'A')
                        cout << "You'll want the Luizbot TAZ 4.\n";
                }
            }
            if (choice == 'C'){
                //Ease of Use
                choice = ' ';
                cout << "Do you also need affordability? [Y or N] ";
                cin >> choice;
                choice = toupper(choice);                
                if (choice == 'Y'){
                    choice = ' ';
                    cout << "Would you rather have more ease of use or more build volume? [E or V] ";
                    cin >> choice;
                    choice = toupper(choice);    
                    if (choice == 'E')
                        cout << "You'll want the Dremel Ideabuilder.\n";
                    else if (choice == 'V'){
                        choice = ' ';
                        cout << "Do you want an open source printer? [Y or N] ";
                        cin >> choice;
                        choice = toupper(choice);
                        if (choice == 'Y'){
                            choice = ' ';
                            cout << "Do you need a dual extruder? [Y or N] ";
                            cin >> choice;
                            choice = toupper(choice);
                            if (choice == 'Y'){
                                choice = ' ';
                                cout << "Do you need a big build volume? [Y or N] ";
                                cin >> choice;
                                choice = toupper(choice);    
                                if (choice == 'Y')
                                    cout << "You'll want the Solidoodle Workbench.\n";
                                if (choice == 'N')
                                    cout << "You'll want the Solidoodle Workbench Apprentice.\n";
                            }
                            else if (choice == 'N')
                                cout << "You'll want the Solidoodle 4.\n";
                        }
                    }
                }
                if (choice == 'N'){               
                    choice = ' ';
                    cout << "Are you opposed to the idea of having a MakerBot? [Y or N] ";
                    cin >> choice;
                    choice = toupper(choice);
                    if (choice == 'Y'){
                        choice = ' ';
                        cout << "How about a MakerBot clone? [Y or N] ";
                        cin >> choice;
                        choice = toupper(choice);
                        if (choice == 'Y')
                            cout << "You'll want the Flashforge Creator.\n";
                        else if (choice == 'N'){
                            choice = ' ';
                            cout << "Do you need a dual extruder? [Y or N] ";
                            cin >> choice;
                            choice = toupper(choice);
                            if (choice == 'Y')
                                choice = ' ';
                                cout << "How does a triple extruder sound? ";
                                cin >> choice;
                                choice = toupper(choice);
                                if (choice == 'Y')
                                    cout << "You'll want the 3D systems CubePro Trio.\n";
                                else if (choice == 'N'){
                                    choice = ' ';
                                    cout << "So then just a dual extruder. Do you need a big build volume? [Y or N] ";
                                    cin >> choice;
                                    choice = toupper(choice);
                                    if (choice == 'Y'){
                                        cout << "You'll want the Leapfrog Creatr XL.\n";    
                                    }
                                    else if (choice == 'N'){
                                        cout << "You'll want the Leapfrog Creatr HS.\n";
                                    }
                                }
                        }
                    }
                }
            }
            if (choice == 'D'){
                    
            }
            if (choice == 'E'){
                        
            }
    } while (x != 1); 
}

/* Will need this relatively often.
    choice = ' ';
    cout << "";
    cin >> choice;
    choice = toupper(choice);
*/
