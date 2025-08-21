package com.example.roomdatabase.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData


class UserViewModel(application: Application) : AndroidViewModel(application) {

    private val readAllData: LiveData<List<User>>
    private val repository: UserRepository

    init{
        val userDao = UserDatabase.getDatabase(application).getUserDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData
    }

    //fun addUser(user: User) {
       // viewModelSc
    //}
}
