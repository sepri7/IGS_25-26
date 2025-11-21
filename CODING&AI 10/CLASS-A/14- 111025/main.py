# LOOP : FOR, WHILE:
for i in range( 1, 11, 2 ):
    # 1 3 5 7 9
    print( i )
print("-"*15)
for z in range( 20, 10, -3 ):
    # 20 17 14 11
    print( z )
print("-"*15)
# 10 20 30 40
for i in range( 10, 41, 10):
    print( i )
print("-"*15)
for i in range(5):
    # 0 1 2 3 4
    print( i )
print("-"*15)
for i in range(3, 8):
    #  3 4 5 6 7
    print( i )
print("-"*15, " While :  ")
#  0 1 2 3 4
i = 0
while( i <= 4 ):
    print( i )
    i += 1 # i = i + 1
# BREAK & CONTINUE:
print("-"*15, " BREAK 1 ")
z = 1
while ( True ): 
    print("STOP🎡")
    if z == 10:
        break
    z += 1
print("-"*15, " BREAK 2 ")
for i in range(1000):
    print("🎈"* i)
    if i == 7:
        break
print("-"*15, " continue 1 ")
for i in range(7):
    if i == 3:
        continue
    print(i)
    print("coding")

