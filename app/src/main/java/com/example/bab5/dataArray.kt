package com.example.bab5
import Getsetarray //untuk meng import kelas Getsetarray
object dataArray {
    //untuk menampung data array

    private val languages = listOf("Soekarno", "Soeharto", "Habibie", "Gusdur", "Megawati","Susilo Bambang Yudhoyono","Jokowi WiDodo")
    //muntuk mendeklarasikan listOf()string
    val desk = listOf( // untuk mengisi listOF pada variabel desk atau deskripsi
        "presiden ke 1 di indonesia adalah ir.Soekarno",
        "presiden ke 2  di indonesia adalah Soeharto",
        "presiden ke 3 di indonesia adalah Habibie ",
        "presiden ke 4 di indonesia adalah Abdurrahman Wahid",
        "presiden ke 5 di indonesia adalah Megawati Soekarnoputri",
        "presiden ke 6 & 7 di indonesia adalah Susilo Bambang Yudhoyono",
        "presiden ke 8 & 9 di indonesia adalah Jokowi Widodo"
    )
    private val pictDat = intArrayOf( //untuk mendeklarasikan gambar harus menggunakan IntArrayOf()
        R.drawable.soekarno, //untuk memanggil gambar pada drawlable
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gsdr,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )
    val listData: ArrayList<Getsetarray> //mengoper data pada class GetSetArray
        get() {
            val list = arrayListOf<Getsetarray>()  //mendeklarasikan data array sebagai list
            for (position in languages.indices) { //perulangan untuk mengisi data ke GetSetArray
                val listDat = Getsetarray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list //mengembalikan data untuk mengirim ke GetSetArray
        }
}
