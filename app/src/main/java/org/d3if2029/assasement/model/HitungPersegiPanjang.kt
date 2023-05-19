package org.d3if2029.assasement.model

import org.d3if2029.assasement.db.PersegiPanjangEntity


fun PersegiPanjangEntity.hitungPersegiPanjang(): HasilPersegiPanjang {
    val keliling = (2 * (panjang + lebar))
    val luas = panjang * lebar
    return HasilPersegiPanjang(keliling, luas)
}
