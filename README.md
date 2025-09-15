# POST-TEST 2 PEMROGRAMAN BERORIENTASI OBJEK (MANAJEMEN DATA ASET INVESTASI)

Nama: Nabil Daffa Athalasyah
NIM: 2409116090
Kelas: C 2024

## Lanjutan POSTTEST 1 ==> POSTTEST 2
# A. GAMBAR FULL INPUT CODINGAN JAVA
## Package dan Class:
<img width="344" height="342" alt="Screenshot 2025-09-14 141342" src="https://github.com/user-attachments/assets/f8bc08fa-2bce-43ed-b2d4-add8754ec2e4" />

## MainAppInvestasi:
<img width="1527" height="742" alt="Screenshot 2025-09-14 141450" src="https://github.com/user-attachments/assets/e2230814-a5cf-487a-87f2-c5046271e671" />
<img width="1526" height="554" alt="Screenshot 2025-09-14 141503" src="https://github.com/user-attachments/assets/a45bec3c-7a48-4765-b9e4-2c7d293ddcb5" />

## AsetInvestasi:
<img width="1119" height="895" alt="Screenshot 2025-09-14 141526" src="https://github.com/user-attachments/assets/75788e1c-3449-478d-8b33-728cea2a6ab8" />
<img width="940" height="320" alt="Screenshot 2025-09-14 141537" src="https://github.com/user-attachments/assets/461bffff-ee4b-44db-af56-b0c534633122" />

## AsetService:
<img width="1105" height="901" alt="Screenshot 2025-09-15 105933" src="https://github.com/user-attachments/assets/f1da97fe-f098-4f41-ab88-20deb06d4b44" />
<img width="963" height="893" alt="Screenshot 2025-09-15 105945" src="https://github.com/user-attachments/assets/44a288a5-edce-4b35-8a3b-c92615f0fb3a" />
<img width="1107" height="897" alt="Screenshot 2025-09-15 110004" src="https://github.com/user-attachments/assets/10b00392-9f93-49cd-a3a9-d84d614c085f" />
<img width="826" height="416" alt="Screenshot 2025-09-15 110025" src="https://github.com/user-attachments/assets/ac831358-a84e-420e-be29-c1159bbd8c1f" />

# B. GAMBAR FULL OUTPUT CODINGAN JAVA
<img width="649" height="360" alt="Screenshot 2025-09-14 141802" src="https://github.com/user-attachments/assets/e70d0702-52fc-4f63-86df-0f140fefb0a9" />

# C. PENJELASAN INPUT
## Penerapan MVC Package dan Class:
<img width="344" height="342" alt="Screenshot 2025-09-14 141342" src="https://github.com/user-attachments/assets/f8bc08fa-2bce-43ed-b2d4-add8754ec2e4" />

Pada bagian ini di Project Nabil Daffa_PostTest1 saya menambahkan 3 Source Package dan Class disetiap masing-masing Packagenya, Di dalam File Nabil Daffa_PostTest1 ada 3 Source Package yaitu Main, Model, dan Service. Dan setiap Package masing-masing memiliki Class yaitu MainAppInvestasi, AsetInvestasi, dan AsetService.

## Main & MainAppInvestasi:
<img width="340" height="44" alt="Screenshot 2025-09-15 093156" src="https://github.com/user-attachments/assets/56b56201-6ac0-4f2e-8c83-bbda2a36a3ec" />

Pada bagian Package Main terdapat Class yaitu Main, yang berfungsi sebagai entry point aplikasi. Class ini menampilkan menu utama user, menerima input dari user, serta memanggil method dari service untuk menjalankan operasi CRUD pada data aset investasi.

## Model & AsetInvestasi:
<img width="345" height="41" alt="Screenshot 2025-09-15 093207" src="https://github.com/user-attachments/assets/c1060172-83a6-4ed6-8db4-efeec632b786" />

Pada bagian Package Model terdapat Class yaitu AsetInvestasi, yang Merupakan blueprint / cetak biru pada objek aset investasi. Class ini berisi atribut (misalnya jenis aset, nilai, tanggal beli) beserta constructor, getter, dan setter yang berfungsi untuk mengelola data.

## Service & AsetService:
<img width="343" height="40" alt="Screenshot 2025-09-15 093221" src="https://github.com/user-attachments/assets/6554f65d-cea8-451c-9efc-9ea0d6b48fc3" />

Pada bagian Package Service terdapat Class yaitu AsetService, yang berfungsi sebagai pengelola code CRUD logika bisnis. Di dalamnya terdapat method untuk menambah, menampilkan, mengupdate, dan menghapus data aset yang tersimpan dalam koleksi (ArrayList). Service ini menjadi penghubung antara MainAppInvestasi dengan AsetInvestasi.

## Penerapan Properties:
<img width="209" height="65" alt="image" src="https://github.com/user-attachments/assets/57d0a9ae-eb31-46aa-975d-5968b0537d42" />

Pada bagian ini saya menerapkan 3 Properties yaitu: this.nama yang menandakan nama, this.jenis yang menandakan jenis investasi, dan this.nilai yang menandakan nilai aset investasi.

## Penerapan Constructor:
<img width="644" height="138" alt="image" src="https://github.com/user-attachments/assets/11406df7-6e6b-4720-b876-5e2ac62fbb89" />

Pada bagian Constructor, Constructor pada class AsetInvestasi digunakan untuk memberikan nilai awal pada atribut nama, jenis, dan nilai ketika sebuah objek baru dibentuk. Proses ini berjalan otomatis saat objek sedang dibuat, sehingga setiap objek AsetInvestasi langsung memiliki data sesuai parameter yang dimasukkan. Dengan demikian, constructor menjamin bahwa setiap aset investasi sudah terdefinisi sejak pertama kali dibuat.

## Penerapan Access Modifier:
<img width="308" height="92" alt="image" src="https://github.com/user-attachments/assets/5d577172-b73a-40f9-a2f6-ea969a46cf94" />

Pada bagian Access Modifier, digunakan access modifier private pada atribut nama, jenis, dan nilai. Modifier private berarti ketiga atribut ini hanya bisa diakses di dalam class AsetInvestasi saja dan tidak dapat diakses langsung dari luar class. Tujuannya adalah untuk menerapkan prinsip enkapsulasi dalam OOP, yaitu melindungi data agar lebih aman serta memaksa penggunaan getter dan setter atau method lain yang sesuai jika ingin mengakses atau mengubah nilai atribut tersebut.

## Penerapan Fitur Search:
<img width="719" height="402" alt="image" src="https://github.com/user-attachments/assets/75d5ffb9-87c8-4072-9c9b-01955f2d5d4f" />

Fitur search (cariAset) pada kode di atas berfungsi untuk mencari data aset berdasarkan nama. Program meminta pengguna memasukkan kata kunci, lalu membandingkannya dengan setiap nama aset yang ada di dalam daftar menggunakan perulangan for. Apabila ada kecocokan, maka data aset akan ditampilkan beserta pesan "Ditemukan", sedangkan jika tidak ada yang sesuai maka muncul pesan "Maaf aset tidak ditemukan!".

## Penerapan Validasi Input:
<img width="882" height="522" alt="image" src="https://github.com/user-attachments/assets/b0c3efff-2ce9-4ca8-bef1-75013c130f08" />

Validasi input digunakan untuk melakukan untuk memvalidasi input nilai aset. Program akan terus meminta pengguna memasukkan angka hingga nilai yang diberikan benar-benar valid, yaitu berupa angka dan lebih besar dari nol. Jika pengguna memasukkan teks atau karakter yang bukan angka, program akan menampilkan pesan bahwa input tidak valid. Begitu juga jika angka yang dimasukkan kurang dari atau sama dengan nol, maka akan muncul peringatan bahwa nilai aset harus lebih dari nol. Setelah input dinyatakan valid, nilai tersebut disimpan ke dalam objek AsetInvestasi dan ditambahkan ke daftar aset.

# D. PENJELASAN OUTPUT
