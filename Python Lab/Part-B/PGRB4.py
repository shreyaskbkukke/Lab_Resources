import re

def text_match(text):
    patterns = '[A-Z]+[a-z]+$'
    if re.search(patterns, text):
        return 'String matches as per requirment!'
    else:
        return('String not matching as per requerements')
    
def z_match(text):
    pattern = '\w*z.\w*'
    if re.search(pattern, text):
        return 'z found in the string'  
    else:
        return('z Not found!')

def str_match(text):
    patterns = '^[a-zA-Z0-9_]*$'
    if re.search(patterns, text):
        return 'Found a match!'
    else:
        return('Not matched!')

while(1):
    print("\n\n\n<<<<~~~~____Menu____~~~~>>>>\n")
    print('1. Find the sequences of one upper case letter followed by lower case letters.')
    print('2. Match a word containing letter z.' )
    print('3. Match a string that contains only upper and lowercase letters, numbers,underscores.') 
    print('4. To remove leading zeros from an IP address.')
    print('5. Exit')
    c=int(input('Enter your choice : '))
    if (c==1):
        str= input('\nEnter a string : ')
        print(text_match(str))
    elif(c==2):
        str= input('\nEnter a string : ')
        print(z_match(str))
    elif(c==3):
        str= input('\nEnter a string : ')
        print(str_match(str)) 
    elif(c==4):
        ip= input('\nEnter ip address : ')
        print('IP address after removing leading zeros')
        ip=re.sub('\.[0]*', '.', ip)
        print(ip.lstrip('0'))
    elif(c==5):
        exit()
    else:
        print('Invalid choice...Please enter the proper answer...')