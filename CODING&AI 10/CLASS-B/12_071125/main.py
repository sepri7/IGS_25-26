#        0/-6  1/-5  2/-4  3/-3  4/-2  5/-1
data = [3, 5, 9, "A", "Z", True, 5]
# indexing :
print(data)
print(data[2])
print(data[-4])
# change value
data[0] = 99
print(data)
# slicing
print(data[1:4])
data2 = ["a", "p", 6, 9]
# buat : 1. panggil value p, 2 ganti nilai 6 = 9,
# 3 tampilkakn a, p saja
print(data2[1])
data2[2] = 9
print(data2[0:2])
print("-" * 10)
for i in data2:
    print(i)
