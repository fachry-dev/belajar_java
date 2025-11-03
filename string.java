// string adalah tipe data reference

String greeting = "Hello, World!";
System.out.println(greeting);

char [] dicodingChar = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};
String dicodingString = new String(dicodingChar);
System.out.println(dicodingString);

// untuk mengetahui panjang string
String dicoding = "dicoding";
int length = dicoding.length();
System.out.println(length);

// menggambil karakter dari sebuah string
String dicoding = "dicoding";
char result = dicoding.charAt(7);
System.out.println(result);

// method lain yang disediakan oleh kelas String
1	length()
    // Digunakan untuk mengetahui panjang atau jumlah karakter dalam string
2	charAt(int index)
    // Digunakan untuk mengambil sebuah karakter berdasarkan indeks tertentu
3	format(String format, Object… args)
    // Digunakan untuk memformat sebuah string.
4	substring(int beginIndex)
    // Mengembalikan/menghasilkan substring berdasarkan indeks yang diberikan.
5	contains(CharSequence s)
    // Mengembalikan/menghasilkan nilai true atau false setelah mencocokkan karakter.
6	equals(Object object)
    // Memeriksa apakah nilai objek sama dengan nilai string.
7	isEmpty()	
    // Memeriksa apakah sebuah string itu kosong atau tidak.
8	concat(String s)
    // Mengkonsolidasikan sebuah string.
9	replace(char a, char b)	
    // Mengganti suatu karakter di dalam string.
10	indexOf(String a)
    // Mengetahui indeks dari sebuah substring.
11	toLowerCase()
    // Mengubah format string menjadi huruf kecil semua.
12	toUpperCase()
    // Mengubah format string menjadi huruf kapital semua.
13	trim()
    // Menghapus spasi awal dan akhir dari string.
14	valueOf(int value)
    // Mengkonversi tipe yang diberikan menjadi sebuah string.
15	compareTo()
    // Membandingkan dua nilai