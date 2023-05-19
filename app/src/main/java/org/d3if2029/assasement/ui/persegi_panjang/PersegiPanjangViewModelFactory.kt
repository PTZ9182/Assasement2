package org.d3if2029.assasement.ui.persegi_panjang

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if2029.assasement.db.PersegiPanjangDao

class PersegiPanjangViewModelFactory(
    private val db: PersegiPanjangDao
    ) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PersegiPanjangViewModel::class.java)) {
            return PersegiPanjangViewModel(db) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}