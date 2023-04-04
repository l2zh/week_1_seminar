package com.example.week_1_seminar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week_1_seminar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit  var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (binding.etID.text.length>=6){
            binding.btnLogin.setOnClickListener{
                Snackbar.make(
                    binding.root,
                    "로그인 성공",
                    Snackbar.LENGTH_SHORT
                ).show()
        }
        }
        else{
            binding.btnLogin.setOnClickListener{
                Snackbar.make(
                    binding.root,
                    "아이디가 잘못되었습니다.",
                    Snackbar.LENGTH_SHORT
                ).show()
        }
    }
}
}