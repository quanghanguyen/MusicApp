package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

import com.example.musicapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Iw8bcZbMjKSAnuZOeOYr8fx6qgtDvtjB
    private ActivityMainBinding binding;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        bindingNav();
    }

    private void bindingNav() {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.main_container);
        navController = navHostFragment.getNavController();
        set
    }
}