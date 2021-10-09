ipk = input("Masukan IPK Anda = ")
waktu = input("Masukan waktu lama studi = ")
ipk = float(ipk)
waktu = float(waktu)
if (ipk >= 3.51 and ipk < 4 and waktu <= 4):
    print("Summa Cumlaude")
elif (ipk >= 3.51 and waktu > 4):
    print("Cumlaude")
elif (ipk >= 3.51 and waktu > 4):
    print("Cumlaude")
elif (ipk >= 3.01 and ipk <= 3.51):
    print("Sangat Memuaskan")
elif (ipk >= 2.76 and ipk <= 3.01):
    print("Memuaskan")
elif (ipk >= 2.00 and ipk <= 2.76):
    print("Cukup")
elif (ipk > 0 and ipk < 2.00):
    print("Tidak lulus")
else:
    print("IPK anda tidak valid")