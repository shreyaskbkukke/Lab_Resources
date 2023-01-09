import random as ran

# define Python user-defined exceptions
# pass is null statement in python used to in empty body 
class Error(Exception):
    """Base class for other exceptions"""
    pass

class ValueSmallError(Error):
    """Raised when the input value is too small"""
    pass

class ValueLargeError(Error):
    """Raised when the input value is too large"""
    pass

# number = 50 # you need to guess this number
number = ran.randrange(0, 100)
# user guesses a number until he/she gets it right
print("\nGuess the number between 0 to 100...Best of luck...\n")
while True:
    try:
        i_num = int(input("Enter a number : "))
        if i_num < number:
            raise ValueSmallError
        elif i_num > number:
            raise ValueLargeError
        break
    except ValueSmallError:
        print("This value is small, increase the value and try again!")
        print()
    except ValueLargeError:
        print("This value is large, decrease the value and try again!")
        print()
print("Congratulations! You guessed it correctly.")
