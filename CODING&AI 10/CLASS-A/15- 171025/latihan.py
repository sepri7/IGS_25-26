data = []
while True:
    angka = int(input("angka : "))
    data.append(angka)
    opsi = input("lanjut (y/t) : ")
    if opsi == "t" :
        break
total = sum(data)
jml = len(data)
print(f"rata- rata = { total/jml } ")