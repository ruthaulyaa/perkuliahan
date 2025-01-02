# 11S20018_Ruth Aulya Silalahi
# Bubble Sort
# 27 Mei 2021

def bubble_sort(data):
    for i in range (len(data)-1,0,-1):
        for j in range (0, len(data)-1):
            if data[j] > data[j+1]:
                data[j],data[j+1] = data[j+1],data[j]
    print("angka telah diurutkan= ", data)
    print("angka terbesar terdapat pada indeks ke= ", nomor_idx)
    
data = [100, 9, 8, 10, 402]
nomor_idx = [len(data)-1]