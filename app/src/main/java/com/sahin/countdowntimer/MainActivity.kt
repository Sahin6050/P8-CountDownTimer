package com.sahin.countdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.sahin.countdowntimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // CountDown Timer bir arayüzdür. Bu yüzden object ile yapıyoruz
        // Geriye doğru saymamızı sağlar.
        object : CountDownTimer(10600,1000){
            // Her bir saniyede
            override fun onTick(p0: Long) {
                binding.textView.text = "Left: ${p0 / 1000}"

            }

            // Sonlandığında.
            override fun onFinish() {
                binding.textView.text = "Left: 0"

            }

        }.start()
    }
}