def circle():
    "Function to calculate squre of the circle"
    print("...You choiced Circle...")
    radius = int(input("Enter the radius : "))
    print("Area of the circle with the radius of",radius,"units is", 3.14*(radius**2) ,"square units.")

def square():
    "Function to calculate squre of the square"
    print("...You choiced Square...")
    side = int(input("Enter the size of a side of a square : "))
    print("Area of the square w ith the a side of",side,"units is", side**2 ,"square units.")

def rectangle():
    "Function to calculate squre of the rectangle"
    print("...You choiced Rectangle...")
    length = int(input("Enter the length of the rectangle : "))
    breadth = int(input("Enter the breadth of the rectangle : "))
    print("Area of the rectangle with length and breadth",length,",",breadth,"units is", length*breadth ,"square units.")

def triangle():  
    "Function to calculate squre of  the triangle"
    print("...You choiced Triangle...")
    b = int(input("Enter the base of the Triangle : "))
    h = int(input("Enter the hieght of the Triangle : "))
    print("Area of the trangle with base and height",b,",",h ,"units is",1/2*b*h,"square units.")

while(1):
    print("\n\n\n<<<<~~~~____Menu____~~~~>>>>\n" 
    "1. Circle\n"
    "2. Square\n"
    "3. Rectanglen\n"
    "4. Triangle\n"
    "5. Exit\n")
    c = int(input("Enter Your choice : "))
    if c == 1:
        circle()
    elif c == 2:
        square()
    elif c == 3:
        rectangle()
    elif c == 4:
        triangle()
    elif c == 5:
        exit()
    else:
        print("Invalid choice...!")
