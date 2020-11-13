package com.example.uts201804008

object DataSekolah {
    private val namaSekolah = arrayOf(
        "SMKN 2 PURWAKARTA", "SMKN 3 LINGGABUANA ", "SMKN 1 SUKATANI", "SMKN 3 SUKATANI", "SMKN DARANGDAN",
        "SMKN 1 PLERED", "SMKN 1 PURWAKARTA", "SMKN 1 SUBANG", "SMKN 2 SUBANG", "SMKN 1 CIBOGO","SMKN 1 MAJALAYA",
        "SMK PGRI SUBANG", "SMKN 2 BANDUNG", "SMKN 4 BANDUNG","SMKN 1 CIASEM", "SMAN 1 CIKAUM", "SMK DAMAR",
        "SMAN 1 SUBANG", "SMAN 2 SUBANG", "SMAN 3 SUBANG", "SMAN 1 CIASEM"

    )

    private val kecSekolah = arrayOf(
        "Kecamatan : Purwakarta", "Kecamatan : Purwakarta", "Kecamatan : Sukatani","Kecamatan : Sukatani",
        "Kecamatan : Darangdan", "Kecamatan : Plered", "Kecamatan : Babakan Cikao", "Kecamatan : Subang",
        "Kecamatan : Dawuan", "Kecamatan : Cibogo", "Kecamatan : Majalaya", "Kecamatan : Subang",
        "Kecamatan : Bandung Wetan","Kecamatan : Lengkong", "Kecamatan : Ciasem","Kecamatan : Cikaum",
        "Kecamatan : Pamanukan", "Kecamatan : Subang", "Kecamatan : Subang", "Kecamatan : Subang", "Kecamatan : Ciasem"
    )
    private val kabSekolah = arrayOf(
        "Kabupaten : Purwakarta", "Kabupaten : Purwakarta", "Kabupaten : Purwakarta","Kabupaten : Purwakarta", "Kabupaten : Purwakarta",
        "Kabupaten : Purwakarta", "Kabupaten : Purwakarta", "Kabupaten : Subang", "Kabupaten : Subang", "Kabupaten : Subang",
        "Kota      : Bandung", "Kabupaten : Subang", "Kota      : Bandung","Kota      : Bandung", "Kabupaten : Subang",
        "Kabupaten : Subang", "Kabupaten : Subang", "Kabupaten : Subang", "Kabupaten : Subang", "Kabupaten : Subang", "Kabupaten : Subang"
    )
    private val provSekolah = arrayOf(
        "Provinsi : Jawa Barat 41114", "Provinsi : Jawa Barat 41118", "Provinsi : Jawa Barat 41167","Provinsi : Jawa Barat 41167",
        "Provinsi : Jawa Barat 41163", "Provinsi : Jawa Barat 41162", "Provinsi : Jawa Barat 41151", "Provinsi : Jawa Barat 41213",
        "Provinsi : Jawa Barat 41212", "Provinsi : Jawa Barat 41285", "Provinsi : Jawa Barat 40382", "Provinsi : Jawa Barat 41211",
        "Provinsi : Jawa Barat 40114", "Provinsi : Jawa Barat 40264", "Provinsi : Jawa Barat 41256", "Provinsi : Jawa Barat 41253",
        "Provinsi : Jawa Barat 41254", "Provinsi : Jawa Barat 41211", "Provinsi : Jawa Barat 41212", "Provinsi : Jawa Barat 41214",
        "Provinsi : Jawa Barat 41256"
    )
    private val logoSekolah = arrayOf(
        R.drawable.smkn2purwakarta, R.drawable.smkn3linggabuana, R.drawable.smkn1sukatani, R.drawable.smkn3sukatani,
        R.drawable.smkndarangdan, R.drawable.smkn1plered, R.drawable.smkn1purwakarta, R.drawable.smkn1subang,
        R.drawable.smkn2subang, R.drawable.smkn1cibogo, R.drawable.smkn1majalaya, R.drawable.smkpgri,
        R.drawable.smkn2bandung, R.drawable.smkn4bandung, R.drawable.smkn1ciasem, R.drawable.smkn1cikaum,
        R.drawable.smkdamar, R.drawable.sman1subang, R.drawable.sman2subang, R.drawable.sman3subang, R.drawable.sman1ciasem
    )
    val listData: ArrayList<Sekolah>
        get() {
            val listSekolah = arrayListOf<Sekolah>()
            for (position in namaSekolah.indices)
            {
                val Sekolah = Sekolah()
                Sekolah.nama = namaSekolah[position]
                Sekolah.kecamatan = kecSekolah[position]
                Sekolah.kabupaten = kabSekolah[position]
                Sekolah.provinsi = provSekolah[position]
                Sekolah.logo = logoSekolah[position]
                listSekolah.add(Sekolah)
            }
            return listSekolah
        }


}