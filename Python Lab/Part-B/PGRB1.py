class employee:
    def __init__(self, empNo, name, deptName, desig, age, salary):
        self.empNo=empNo
        self.name=name
        self.deptName=deptName 
        self.desig=desig
        self.age=age
        self.salary=salary

    def display(self):
        print( self.empNo +"\t"+ self.name+"\t"+ self.deptName+"\t"+ self.desig+"\t"+ self.age+"\t"+ self.salary)
    
    def search(self,eno):
        if self.empNo==eno:
            return True
        else:
            return False

empList=list()
n = int(input("Enter number of Employees : "))
print("____________________________________________________________________")
print("\n........Employee Details Entry........")
for i in range(n):
    empNo=input("\nEnter the Employee number : ")
    name=input("Enter the Employee name : ")
    deptName=input("Enter the Department name : ")
    desig= input("Enter the Designation : ") # use the same length for good result
    age=input("Enter the age : ")
    salary=input("Enter the Salary : ")
    empList.append(employee(empNo, name, deptName, desig, age, salary))
print("____________________________________________________________________\n")
print("........Employee Information....... ")
for i in range(n):
    empList[i].display()
print("____________________________________________________________________\n")
print("........Search........")
n=input("Enter the employee number : ")
print('')
for i in empList:
    found=i.search(n)
    if found:
        i.display()
        break
else:
    print("Employee not found...!")
print("____________________________________________________________________\n")