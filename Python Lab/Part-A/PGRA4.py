def char_frequency(str):
    dict = {}
    for i in str:
        keys = dict.keys()
        if i in keys:
            dict[i] += 1
        else:
            dict[i] = 1
    return dict

str = input('Enter a String : ')
d = char_frequency(str)
print('\nFrequency of each character in a string is : ')
print(d)
for key, value in d.items():
    print('Count of charecter', key,'is' , value)