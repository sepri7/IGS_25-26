# merubah tipe data (casting)
a = 10
print("tipe data a apa : ", type(a))
b = float(a)
print("tipe data b apa : ", type(b))
c = str(a)
print("tipe data c apa : ", type(c))

print("-" * 10, "input user")
nama = input("siapa nama kamu : ")
# input data di python : tipe data= str
print(f"nama saya : { nama } ")

print("-" * 10, "TAMBAHAN")
x = int(input("nilai x : "))
y = int(input("nilai y : "))
print(f"{x} + {y} = {x+y}")

print("-" * 10, "IF STATEMENT")
# diskon beli >= 10000  : diskon (10%:0.1)
# diskon beli == 4000  : diskon (3%:0.03)
# diskon beli == 3000  : diskon (2%:0.03)
# selain itu diskon : 0%
beli = int(input("Jumlah beli : "))
if beli >= 10000:
    print("diskon 10%")
elif beli == 4000:
    print("diskon 3%")
elif beli == 3000:
    print("diskon 2%")
else:
    print("diskon 0%")

print("-" * 10, "LOOP ( FOR / WHILE)")
for i in range(1, 10, 2):
    print(i)
