print("Program Siakad")
print ()
print ("1. Tambah Data")
print ("2. Edit Data")
print ("3. Hapus Data")
print ("4. Lihat Data")
menu = input ("Pilih Menu = ")
menu = int (menu)
if (menu == 1):
    print ("1. Tambah Data Mahasiswa")
    print ("2. Tambah Data Mata Kuliah")
    print ("3. Kembali")
    menu1 = input ("Pilih Menu = ")
    menu1 = int (menu1)
    if (menu1 == 1):
        nama = input ("Masukan Nama Mahasiswa : ")
        print ("Mahasiswa yang Anda tambah adalah : " + nama)
    elif (menu1 == 2):
        matkul = input ("Masukan mata kuliah : ")
        print ("Mata kuliah yang Anda tambah adalah : " + matkul)
    elif (menu1 == 3):
        print ("Terima kasih")
    else:
        print ("Menu tidak ada")
elif (int(menu) >=2 and int(menu) <=4):
    print ("Fitur belum tersedia")
else:
    print ("Menu tidak tersedia")