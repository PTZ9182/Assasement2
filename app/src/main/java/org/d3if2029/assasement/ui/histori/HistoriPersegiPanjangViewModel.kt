package org.d3if2029.assasement.ui.histori

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.d3if2029.assasement.db.PersegiPanjangDao


class HistoriPersegiPanjangViewModel(private val db: PersegiPanjangDao) : ViewModel() {
    val data = db.getLastPersegiPanjang()

    fun hapusData() = viewModelScope.launch {
        withContext(Dispatchers.IO) {
            db.clearData()
        }
    }
}