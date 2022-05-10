my $choice = ' ';
my $x = 0;
say "Welcome to the 3D Printer Finder.\n\n";

gather {
    repeat {
        say "The thing I want most is...\n\n [A] Ultra High Print Quality\n\n [B] Moddability\n\n [C] Ease of Use\n\n [D] Big Build Volume\n\n [E] Portability\n\n";
    
    #EOF
    } while x < 1;
    take $choice;
}
