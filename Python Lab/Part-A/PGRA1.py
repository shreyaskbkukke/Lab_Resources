def CheckPrime( n ): 
    "This function is used to cheack the prime or not"
    for i in range( 2, n ): 
        if( n % i == 0 ): 
            return False 
            break

a = [] 
n = int(input("Enter value of n : "))  
print( "Enter", n,  "elements of the array : " ) 
for i in range( n ):  
    ele = int(input())
    a.append( ele )
print( "The prime numbers in the given array are : " ) 
for j in a: 
    if( CheckPrime( j ) != False ): 
        print( j )
