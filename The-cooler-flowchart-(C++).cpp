#include <iostream>
#include <string>

using namespace std;

int flowchart(){
       char choice = ' ';
        int x, y = 0;
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
                        }
                        else if (choice == 'N'){
                                cout << "You'll want the Ultimaker2.\n";
                        }        
                }
                else
                        cout << "Invalid answer. Please try again.\n";
        } while (x != 1); 
}
