tp1 = (1,2,3,4,5,6,7,8,9,10)
print('Original Tuple : ',tp1)

# answer for a question 
print('\n[a] Printing first half tuple in one line and second half in next line')
print('\t', tp1[:5])
print('\t', tp1[5:])

# answer for b question
print('\n[b] Tuple with even numbers :')
l = list()
for i in tp1:
    if i%2 == 0: 
        l.append(i)
tp = tuple(l)
print('\t',tp)

# answer for c question
tp2 = (11,13,15)
tp3 = tp1 + tp2
print('\n[c] Cocatination of tuple ',tp1 ,'andrr',tp2, 'is',tp3)

# answer for d question
print('\n[d] Max and Min\nmaximum value in the tuple :',max(tp3))
print('minimum value in the tuple :',min(tp3),'\n')
