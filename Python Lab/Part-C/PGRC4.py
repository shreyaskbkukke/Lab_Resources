import mysql.connector

conn = mysql.connector.connect(host='localhost',database='employeedb',user='root',password='')
cursor = conn.cursor()
def insert_Edata(eno, name, sal):
    try:
        query = """INSERT INTO emp (Eno, name, sal) 
        VALUES (%s, %s, %s) """
        record = (eno, name, sal)
        cursor.execute(query, record)
        conn.commit()
        print("\nRecord inserted successfully into employeee table.")
    except mysql.connector.Error as error:
        print("Failed to insert into MySQL table {}".format(error))

def displayone():
    print("...........Details of perticular employee...........")
    print("To display details of perticular employee.")
    eno=int(input("\n2Enter employee No : "))
    select_Query = "select * from emp where eno={}".format(eno)
    cursor.execute(select_Query)
    record = cursor.fetchall()
    if(cursor.rowcount==0):
        print ("Record not found!")
    else:
        print(record)
    print("____________________________________________________________________")

def display():
    print(".......Details of employees based on salary...........")
    min=int(input("Enter Min Salary : "))
    max=int(input("Enter Max Salary : "))
    print()
    print('................................')
    q="select * from emp where sal between {} and {}".format(min,max)
    cursor.execute(q)
    records=cursor.fetchall()
    select_Query = "select * from emp where eno=%s"
    for row in records:
        print(" ",row[0],"\t",row[1],"\t" ,row[2])
    print('................................')
    print("\n\n____________________________________________________________________")

while(1):
    print("\n<<<<~~~~____Menu____~~~~>>>>\n")
    print("1. To accept the details of employees and store it in database")
    print("2. To display details of perticular employee.")
    print("3. To display details of employee having salary in a given range.")
    print("4. Exit.")
    c=int(input("Enter Your choice : "))
    if c==1:
        print("____________________________________________________________________")
        print("\nTo accept the details of employees and store it in database...")
        n=int(input("Enter number of employees : "))
        for i in range(n):
            print ("\nEnter details of employee :",i+1)
            eno=int(input("Enter employee no : "))
            name= input("Enter Name : ")
            sal= int(input("Enter salary : "))
            insert_Edata(eno, name, sal)
        print("____________________________________________________________________")
    elif c==2 :
        print("____________________________________________________________________\n")
        displayone()
    elif c==3:
        print("____________________________________________________________________\n")
        print("To display details of employee having salary in a given range...")
        display()
    elif c==4:
        break
    else:
        print(".........Invalid choice......")