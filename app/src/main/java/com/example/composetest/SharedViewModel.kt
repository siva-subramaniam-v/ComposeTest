package com.example.composetest

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.composetest.model.Person

class SharedViewModel : ViewModel() {
    var person by mutableStateOf<Person?>(null)
        private set

    fun addPerson(newPerson: Person) {
        person = newPerson
    }
}