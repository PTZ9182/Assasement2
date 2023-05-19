package org.d3if2029.assasement.ui.persegi_panjang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.d3if2029.assasement.db.PersegiPanjangDao
import org.d3if2029.assasement.db.PersegiPanjangEntity
import org.d3if2029.assasement.model.HasilPersegiPanjang
import org.d3if2029.assasement.model.hitungPersegiPanjang


class PersegiPanjangViewModel(private val db: PersegiPanjangDao) : ViewModel() {


    private val hasilPersegiPanjang = MutableLiveData<HasilPersegiPanjang?>()


    fun hitung(panjang: Int, lebar: Int) {


        val dataPersegiPanjang = PersegiPanjangEntity(
            panjang = panjang,
            lebar = lebar,
        )
        hasilPersegiPanjang.value = dataPersegiPanjang.hitungPersegiPanjang()
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                db.insert(dataPersegiPanjang)
            }
        }
    }
    fun getHasilHitung(): LiveData<HasilPersegiPanjang?> = hasilPersegiPanjang

}
