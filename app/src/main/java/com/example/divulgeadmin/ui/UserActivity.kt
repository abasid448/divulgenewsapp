package com.example.divulgeadmin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.divulgeadmin.databinding.ActivityUserBinding
import com.example.divulgeadmin.ui.viewmodel.UserViewModel
import com.example.divulgeadmin.ui.viewmodel.UserViewModelProviderFactory

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding
    lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Instantiate the user repository.
        val viewModelProviderFactory = UserViewModelProviderFactory(application)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[UserViewModel::class.java]
    }
}