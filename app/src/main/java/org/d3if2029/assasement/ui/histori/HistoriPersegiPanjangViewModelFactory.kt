package org.d3if2029.assasement.ui.histori

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if2029.assasement.db.PersegiPanjangDao


class HistoriPersegiPanjangViewModelFactory(
    private val db: PersegiPanjangDao
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HistoriPersegiPanjangViewModel::class.java)) {
            return HistoriPersegiPanjangViewModel(db) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
