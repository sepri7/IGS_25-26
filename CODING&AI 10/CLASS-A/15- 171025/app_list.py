# list []
#           0/-4   1/-3 2/-2  3/-1
dataList = ["abc", 321, True, 3.14]
print(f" index 1 : { dataList[1] } ")
print(f" index -3  : { dataList[-3] } ")
print(dataList)
# irisan / slincing
print(dataList[ 1 : 3])# 1: start, 3: end
print(dataList[ 2 : ])# 2: start, end:..
print(dataList[ : 2 ])# start : 0, 2: end
# append : add di akhir value
dataList.append( 100 )
print(dataList)
# insert : add value di index tertentu
dataList.insert( 1, 200 )# 1: index, 200 : newValue
print(dataList)
# update:
dataList[ 0 ] = "z"
print(dataList)
# pop : delete di record/value terakhir atau index tertentu
dataList.pop() # delete akhir
print(dataList)
dataList.pop(0) # delete by index(0)
print(dataList)
print("-"*10, "lIST IN LOOP")
for i in dataList:
    print( i )
# len : jumlah list:
print( f"jumlahvalue dataList : { len(dataList) } " )
abc = [1,2,3]
print( f"SUM TAMPIL JUMLAH : { sum(abc) } " )


