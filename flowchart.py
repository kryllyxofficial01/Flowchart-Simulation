need = input("What do you want most from your 3D printer?\n\t1. Ultra High Print Quality\n\t2. Moddability\n\t3. Ease of Use\n\t4. Big Build Volume\n\t5. Portability\n> ")
if need.upper() == "1":
    affordability = input("\nDo you want affordability? [Y]es/[N]o? ")
    if affordability.upper() == "Y":
        dual_extrusion = input("Do you want dual extrusion? [Y]es/[N]o ")
        if dual_extrusion.upper() == "Y":
            print("\n\nDeezmaker Bukobot v2 Duo")
        elif dual_extrusion.upper() == "N":
            print("\n\nDeezmaker Bukobot v2")
        else:
            print("\n\nInvalid answer...")
    elif affordability.upper() == "N":
        print("\n\nUltimaker2")
elif need.upper() == "2":
    affordability = input("Do you want afforability [Y]es/[N]o? ")
    if affordability.upper() == "Y":
        kit = input("Do you want a [D]IY kit or a [P]reassembled kit? ")
        if kit.upper() == "D":
          build = input("Do you want [B]igger Build Volume or [F]aster Printing Speeds? ")
          if build.upper() == "B":
            amount = input("How much bigger? [A] lot or a [L]ittle? ")
            if amount.upper() == "A":
              support = input("Would you rather have [B]etter Company Support or Better [C]ommunity Support? ")
              if support.upper() == "B":
                print("\n\nPrintrbot Metal Plus")
              elif support.upper() == "C":
                print("\n\nRigidbot Regular")
              else:
                print("\n\nInvalid input...")
            elif amount.upper() == "L":
              print("\n\nRigidbot Big")
            else:
              print("\n\nInvalid input...")
          elif build.upper() == "F":
            print("\n\nVeiliman K8200")
          else:
            print("\n\nInvalid input...")
        elif kit.upper() == "P":
          print("\n\nRobo3D")
        else:
          print("\n\nInvalid input...")
elif need.upper() == "3":
    pass
elif need.upper() == "4":
    pass
elif need.upper() == "5":
    pass
else:
    print("\n\nInvalid input...")