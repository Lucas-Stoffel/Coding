
try:
    speed = input("Enter a speed in Miles per hour: " )
except ValueError:
    print("\nThe value is not an integer")

mph = float(speed)
kmh = mph * 1.609

kmh = str(round(kmh, 2))
print("The speed in Kmh is " + kmh + ".")