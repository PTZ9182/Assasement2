package org.d3if2029.assasement.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersegiPanjangDao {
    @Insert
    fun insert(persegipanjang: PersegiPanjangEntity)

    @Query("SELECT * FROM persegipanjang ORDER BY id DESC")
    fun getLastPersegiPanjang(): LiveData<List<PersegiPanjangEntity>>

    @Query("DELETE FROM persegipanjang")
    fun clearData()
}