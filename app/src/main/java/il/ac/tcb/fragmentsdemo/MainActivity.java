package il.ac.tcb.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import il.ac.tcb.fragmentsdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}