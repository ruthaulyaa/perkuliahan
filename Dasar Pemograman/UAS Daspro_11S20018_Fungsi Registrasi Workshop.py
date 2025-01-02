# 11S20018_Ruth Aulya Silalahi
# Bubble Sort
# 27 Mei 2021

def pendaftaran():
    nama = input("Nama lengkap: ")
    alamat = input("Alamat: ") 
    day = input("Tanggal lahir: ")
    bulan = input("Bulan lahir: ")
    yborn = int(input("Tahun lahir: "))
    register = nama + '_' + alamat
    
    print (register)
    print ("usia anda: ", calculate_age(yborn), "tahun")

#menghitung usia
def calculate_age(yborn):
    string = 2021 - yborn
    return string