package com.example.tugas10.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.tugas10.MahasiswaApplications

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                aplikasiMhs().container.MahasiswaRepository
            )
        }
        initializer {
            InsertViewModel(
                aplikasiMhs().container.MahasiswaRepository
            )
        }
        initializer {
            DetailViewModel(
                aplikasiMhs().container.MahasiswaRepository
            )
        }
        initializer {
            UpdateViewModel(
                createSavedStateHandle(),
                aplikasiMhs().container.MahasiswaRepository
            )
        }
    }
}

fun CreationExtras.aplikasiMhs(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)