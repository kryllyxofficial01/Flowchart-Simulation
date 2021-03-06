#include <iostream>
#include <string>

using namespace std;

class choiceClass {        // The class
    public:              // Access specifier
        void affordability() {  // Method/function defined inside the class
            cout << "Do you also need affordability? [Y or N] ";
    }
        void machineType() {
            cout << "DIY kit or assembled machine? [D or A] ";
        }
};

int flowchart(){
    char choice = ' '; 
    int x = 0;
    choiceClass affordObj, machineType;
    cout << "Welcome to the 3D Printer Finder.\n\n\n";
    do {
        cout << "The thing I want most is...\n\n  [A] Ultra High Print Quality\n\n  [B] Moddability\n\n  [C] Ease of Use\n\n  [D] Big Build Volume\n\n  [E] Portability\n\n";  
        cin >> choice;
        choice = toupper(choice);
        switch (choice) {
            case 'A':
            //Ultra High Print Quality 
            affordObj.affordability();
            cin >> choice;
            choice = toupper(choice);
            if (choice == 'Y'){
                //Need affordability
                cout << "Do you need dual extrusion? [Y or N] ";
                cin >> choice;
                choice = toupper(choice);        
                if (choice == 'Y')
                    cout << "You'll want the Deezmaker Bukobot v2 Duo.\n";
                else if (choice == 'N')
                    cout << "You'll want the Deezmaker Bukobot v2.\n";                
            }
            else if (choice == 'N')
                cout << "You'll want the Ultimaker2.\n";     
            break;
            case 'B':
                //Moddability
                affordObj.affordability();
                cin >> choice;
                choice = toupper(choice);    
                if (choice == 'Y'){
                    machineType.machineType();
                    cin >> choice;
                    choice = toupper(choice);    
                    if (choice == 'D'){
                        cout << "Would you rather have more build volume or faster printing speeds? [V or S] ";
                        cin >> choice;
                        choice = toupper(choice);    
                        if (choice == 'V'){
                            cout << "A little bit more build volume or a LOT more build volume? [l or L (CASE SENSITIVE)]";
                            cin >> choice;
                            if (choice == 'l'){
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
                    machineType.machineType();
                    cin >> choice;
                    choice = toupper(choice);    
                    if (choice == 'D')
                        cout << "You'll want the Luizbot KITTAZ.\n";
                    else if (choice == 'A')
                        cout << "You'll want the Luizbot TAZ 4.\n";
                }
            case 'C':
                //Ease of Use
                affordObj.affordability();
                cin >> choice;
                choice = toupper(choice);                
                if (choice == 'Y'){
                    cout << "Would you rather have more ease of use or more build volume? [E or V] ";
                    cin >> choice;
                    choice = toupper(choice);    
                    if (choice == 'E')
                        cout << "You'll want the Dremel Ideabuilder.\n";
                    else if (choice == 'V'){
                        cout << "Do you want an open source printer? [Y or N] ";
                        cin >> choice;
                        choice = toupper(choice);
                        if (choice == 'Y'){
                            cout << "Do you need a dual extruder? [Y or N] ";
                            cin >> choice;
                            choice = toupper(choice);
                            if (choice == 'Y'){
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
                    cout << "Are you opposed to the idea of having a MakerBot? [Y or N] ";
                    cin >> choice;
                    choice = toupper(choice);
                    if (choice == 'Y'){
                        cout << "How about a MakerBot clone? [Y or N] ";
                        cin >> choice;
                        choice = toupper(choice);
                        if (choice == 'Y')
                            cout << "You'll want the Flashforge Creator.\n";
                        else if (choice == 'N'){
                            cout << "Do you need a dual extruder? [Y or N] ";
                            cin >> choice;
                            choice = toupper(choice);
                            if (choice == 'Y')
                                cout << "How does a triple extruder sound? ";
                                cin >> choice;
                                choice = toupper(choice);
                                if (choice == 'Y')
                                    cout << "You'll want the 3D systems CubePro Trio.\n";
                                else if (choice == 'N'){
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
            case 'D':
                //Big Build Volume
                affordObj.affordability();
                cin >> choice;
                choice = toupper(choice);
                if (choice == 'Y'){
                    cout << "Do you want big build volume, or REALLY BIG build volume? [b or B (CASE SENSITIVE)] ";    
                    cin >> choice;
                    if (choice == 'b')
                        cout << "You'll want the Rigidbot Big.\n";
                    else if (choice == 'B'){
                        machineType.machineType();
                        cin >> choice;
                        choice = toupper(choice);    
                        if (choice == 'D')
                            cout << "You'll want the SeeMeCNC Rostock MAX v2.\n";
                        else if (choice == 'A')
                            cout << "You'll want the Wanhao Duplicator.\n";       
                    }
                }
                else if (choice == 'N'){
                    cout << "Are you opposed to the idea of having a MakerBot? [Y or N] ";
                    cin >> choice;
                    choice = toupper(choice);
                    if (choice == 'Y')
                        cout << "You'll want the Leapfrog Creatr XL.\n";
                    else if (choice == 'N')
                        cout << "You'll want the Makerbot Replicator Z18.\n";
                }
            case 'E':
                //Portability
                cout << "Are you opposed to the idea of having a MakerBot? [Y or N] ";
                cin >> choice;
                choice = toupper(choice);    
                if (choice == 'Y'){
                    cout << "What level of portable are we talking about...Foldable and battery operable or lightweight and small? [F or S] ";
                    cin >> choice;
                    choice = toupper(choice);
                    if (choice == 'F')
                       cout << "You'll want the Poratabee GO.\n";
                    else if (choice == 'S'){
                        cout << "Would you rather have the ability to print more materials or have a more portable printer? [M or P] ";
                        cin >> choice;
                        choice = toupper(choice);
                        if (choice == 'M')
                            cout << "You'll want the Deezmaker Bukito.\n";
                        else if (choice == 'P')
                            cout << "You'll want the Printrbot Simple Metal.\n";
                    } 
                }
            }
        choice = ' ';
    } while (x != 1);
}
