
def typeHere():
    global Meter
    length = input("Enter a distance in Meters: ")
    Meter = float(length)
    return Meter

def formula():
    Feet = Meter * 3.281
    return Feet

def printC(Feet):
    Feet = str(Feet)
    print("The distance in Feet is " + Feet + ".") 

def main():
    printC(formula(typeHere()))


    