class Rectangle:
    def __init__(self, length, width):
        self.length = length
        self.width = width
        
    def area(self):
        a = self.length * self.width
        print("\nArea of the Rectangle is %.2f"%a)
    
    def perimeter(self):
        p = 2 * (self.length + self.width)
        print("\nPerimeter of the Rectangle is %.2f"%p)

class Box(Rectangle):
    def __init__(self, length, width, height):
        super().__init__(length, width)
        self.height = height
        
    def volume(self):
        v = self.length * self.width * self.height
        print("\nVolume of the Box is %.2f"%v)
    
    def perimeter(self):
        super().perimeter()
        p = 4 * (self.length + self.width + self.height)
        print("\nPerimeter of the Box is %.2f"%p,"\n")

l=float(input("Enter the length of the rectangle : "))
w=float(input("Enter the width of the rectangle : "))
h=float(input("Enter the height of the Box : ")) 
b1=Box(l,w,h)
b1.area()
b1.volume()
b1.perimeter()