package com.example.exercise.ui.theme

import androidx.lifecycle.ViewModel
import com.example.exercise.data.UIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DataViewModel : ViewModel(){
    private val _stateUI = MutableStateFlow(UIState())
    val stateUI: StateFlow<UIState> = _stateUI.asStateFlow()

    fun setNama(namaMahasiswa:String){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = namaMahasiswa)
        }
    }

    fun setNim(nim: String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nim = nim)
        }
    }
}