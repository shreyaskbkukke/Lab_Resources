import mysql.connector

def insert_data(rno, name, m1, m2,m3):
    try:
        query = """INSERT INTO student (rno, name, m1, m2, m3) VALUES (%s, %s, %s, %s,%s) """
        record = (rno, name, m1, m2,m3)
        cursor.execute(query, record)
        conn.commit()
        print("\nRecord inserted successfully into student table.")
    except mysql.connector.Error as error:
        print("Failed to insert into MySQL table {}".format(error))
    print("____________________________________________________________________")

def display():
    print("\n.......Details of all students...........")
    select_Query = "select * from student"
    cursor.execute(select_Query)
    
    # get all records
    records = cursor.fetchall()
    print("Total number of rows in table: ", cursor.rowcount)
    print()
    for row in records:
        print(row[0],"\t",row[1],"\t" ,row[2] ,"\t",row[3],"\t",row[4])
    print("____________________________________________________________________")

conn = mysql.connector.connect(host='localhost',database='studentdb',user='root',password='')
cursor = conn.cursor()
while(1):
    print("\n<<<<~~~~____Menu____~~~~>>>>\n")
    print("1. To accept the details of students and store it in database.")
    print("2. To display details of students.")
    print("3. To delete perticular student details.")
    print("4. Exit.")
    c = int(input("Enter Your choice : "))
    if c==1:
        print("____________________________________________________________________")
        print("\n1.To accept the details of students and store it in database")
        n = int(input("Enter number of students : "))
        for i in range(n):
            print ("\nEnter details of student : ",i+1)
            rno = int(input("Enter Register no : "))
            name = input("Enter Name : ") 
            print("Enter marks in 3 subjects : ")
            m1 = int(input())
            m2 = int(input())
            m3 = int(input())
            insert_data(rno, name, m1, m2,m3)
    elif c==2:
        print("____________________________________________________________________")
        display()
    elif c==3:
        print("____________________________________________________________________")
        try:
            rno=int(input("\nEnter register no to delete :"))
            Delete_query = """Delete from student where rno = %s"""
            
            # row to delete
            cursor.execute(Delete_query, (rno,))
            if cursor.rowcount==0:
                print("\nRecord not found!") 
            else:
                conn.commit()
                print("\nRecord deleted successfully. ")
                # display()
        except mysql.connector.Error as error:
            print("\nRecord not found!")
        print("____________________________________________________________________")
    elif c==4:
        break
    else:
        print(".........Invalid choice......")