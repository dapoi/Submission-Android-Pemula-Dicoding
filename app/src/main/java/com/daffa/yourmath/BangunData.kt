package com.daffa.yourmath

object BangunData {
    private var detilBangun = arrayOf(
            arrayOf(
                    "Persegi",
                    """
                        Luas
                        Keliling
                    """.trimIndent(),
                    """
                        s x s
                        4 x s
                    """.trimIndent(),
                    "Persegi merupakan bangun datar yang memiliki empat sisi dengan panjang " +
                            "yang seluruhnya sama",
                    R.drawable.ic__23_square
            ),

            arrayOf(
                    "Segitiga",
                    """
                        Luas
                        Keliling
                    """.trimIndent(),
                    """
                        1/2 x alas x tinggi
                        s + s + s
                    """.trimIndent(),
                    "Segitiga adalah bangun datar yang terdiri dari 3 sisi garis lurus dengan " +
                            "3 titik sudut yang berjumlah 180º.",
                    R.drawable.ic_triangle
            ),

            arrayOf(
                    "Lingkaran",
                    """
                        Luas
                        Keliling
                    """.trimIndent(),
                    """
                        π x r x r
                        π x d
                    """.trimIndent(),
                    "Lingkaran adalah bangun datar dua dimensi dibentuk oleh himpunan semua " +
                            "titik yang mempunyai jarak sama dari suatu titik tetap.",
                    R.drawable.ic__25_circle
            ),

            arrayOf(
                    "Trapesium",
                    """
                        Luas
                        Keliling
                    """.trimIndent(),
                    """
                        1/2(a + b) x tinggi
                        AB + BC + CD + DA
                    """.trimIndent(),
                    "Suatu bangun datar 2 dimensi yang dibentuk dari 4 buah rusuk yang 2 buah " +
                            "di antaranya merupakan saling sejajar namun panjang nya tidak sama.",
                    R.drawable.ic__21_trapeze
            ),

            arrayOf(
                    "Tabung",
                    """
                        L. Selimut
                        L. Permukaan
                        Volume
                        Keliling
                    """.trimIndent(),
                    """
                        2 x π x r x t
                        2 x luas alas + l. sel
                        π x r^2 x t
                        2 x π x r
                    """.trimIndent(),
                    "Suatu bangun ruang tiga dimensi yang mempunyai tutup dan alas yang berbentuk " +
                            "sebuah ingkaran dengan memiliki ukuran yang sama dan diselimuti " +
                            "oleh persegi panjang.",
                    R.drawable.ic__43_cylinder
            ),

            arrayOf(
                    "Limas",
                    """
                        Volume
                        Luas
                    """.trimIndent(),
                    """
                        1/3 L. Alas x T
                        Jmlh Luas Alas + Jmlh Sisi Tegak
                    """.trimIndent(),
                    "Suatu bangun ruang tiga dimensi yang dibatasi oleh alas berbentuk segi-n " +
                            "(dapat berupa segi tiga, segi empat, segi lima, dll) serta bidang" +
                            " sisi tegak berbentuk segitiga yang berpotongan di satu titik puncak.",
                    R.drawable.ic__44_pyramid
            ),

            arrayOf(
                    "Balok",
                    """
                        Volume
                        Luas Permukaan
                        Panjang Diag.
                        Panjang Diag. Ruang
                    """.trimIndent(),
                    """
                        p x l x t
                        2 (pl + pt + lt)
                        √(p2+l2)
                        √(p2+l2+t2)
                    """.trimIndent(),
                    "Suatu bangun ruang yang mempunyai tiga pasang sisi segi empat. Di mana pada " +
                            "masing-masing sisinya yang berhadapan mempunyai bentuk serta" +
                            " ukuran yang sama.",
                    R.drawable.ic_grid
            ),

                    arrayOf(
                        "Persegi Panjang",
                        """
                                    Luas
                                    Keliling
                                """.trimIndent(),
                        """
                                     p x l                       
                                     2 x (p+l)
                                """.trimIndent(),
                        "Persegi panjang adalah bangun datar dua dimensi " +
                                "yang dibentuk oleh dua pasang sisi yang masing-masing sama panjang " +
                                "dan sejajar dengan pasangannya, dan memiliki empat buah sudut yang " +
                                "kesemuanya adalah sudut siku-siku.",
                        R.drawable.ic__46_rectangle
                    ),

            arrayOf(
                    "Kubus",
                    """
                        Volume
                        Luas Permukaan
                    """.trimIndent(),
                    """
                        s x s x s
                        6s x s
                    """.trimIndent(),
                    "Suatu bangun ruang tiga dimensi yang dibatasi oleh enam sisi serupa yang" +
                            " berwujud bujur sangkar.",
                    R.drawable.ic__07_cube
            ),

            arrayOf(
                    "Kerucut",
                    """
                        Volume
                        Luas
                    """.trimIndent(),
                    """
                        1/3 x π x r x r x t
                        luas alas + luas selimut
                    """.trimIndent(),
                    "Salah satu bangun ruang yang memiliki sebuah alas yang berbentuk lingkaran " +
                            "dengan selimut yang mempunyai irisan dari lingkaran.",
                    R.drawable.ic__15_cone
            )
    )

    val listData: ArrayList<Bangun>
            get() {
                val list = arrayListOf<Bangun>()
                for (position in detilBangun) {
                    val bangun = Bangun()
                    bangun.nama = position[0] as String
                    bangun.namaRumus = position[1] as String
                    bangun.rumus = position[2] as String
                    bangun.detil = position[3] as String
                    bangun.foto = position[4] as Int
                    list.add(bangun)
                }
                return list
            }
}