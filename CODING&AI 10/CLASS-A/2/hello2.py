a = 10 
b = 10
# result = a >= b
print( a < b )
name = "bUdi"
print( name.upper() )
print("_"*20 + " If Statement")
warna = input("Warna Lampu = ").lower()
waktu = input("Waktu (pagi/malam) = ").lower()
if warna == "merah":
    print("Berhenti !")
elif warna == "hijau":
    if waktu == "pagi":
        print("Silahkan Jalan !")
    elif waktu == "malam":
        print("Jalan Sepi, Silahkan Jalan !")
    else:
        print("Waktu Salah !")
elif warna == "kuning":
    print("Siap-siap")
else:
    print("Warna Salah")