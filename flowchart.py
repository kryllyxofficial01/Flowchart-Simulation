need = input("What do you want most from your 3D printer? [U]ltra High Print Quality, [M]oddability, [E]ase of Use, [B]ig Build Volume, or [P]ortability? ")
if need.upper() == "U":
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
elif need.upper() == "M":
  pass
elif need.upper() == "E":
  pass
elif need.upper() == "B":
  pass
elif need.upper() == "P":
  pass
else:
  print("\n\nInvalid input...")