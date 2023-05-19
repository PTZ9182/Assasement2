package org.d3if2029.assasement.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "persegipanjang")
data class PersegiPanjangEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    var tanggal: Long = System.currentTimeMillis(),
    var panjang: Int,
    var lebar: Int
)
