package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.window.SplashScreen
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapplication.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    var binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
                // start of animation background
//        val layout: ConstraintLayout = binding.MainLayout
//        val animationdrawable = layout.background as AnimationDrawable
//        animationdrawable.setEnterFadeDuration(1000)
//        animationdrawable.setExitFadeDuration(3000)
//        animationdrawable.start()
                // end of animation background

//        appending all the numbers
                binding.button1.setOnClickListener {
                    binding.textView.append("1")
                }
        binding.button2.setOnClickListener {
            binding.textView.append("2")
        }
        binding.button3.setOnClickListener {
            binding.textView.append("3")
        }
        binding.button4.setOnClickListener {
            binding.textView.append("4")
        }
        binding.button5.setOnClickListener {
            binding.textView.append("5")
        }
        binding.button6.setOnClickListener {
            binding.textView.append("6")
        }
        binding.button7.setOnClickListener {
            binding.textView.append("7")
        }
        binding.button8.setOnClickListener {
            binding.textView.append("8")
        }
        binding.button9.setOnClickListener {
            binding.textView.append("9")
        }
        binding.button0.setOnClickListener {
            binding.textView.append("0")
        }
//        appending all the operators
        binding.buttonClear.setOnClickListener {
            binding.textView.text = ""
        }
        binding.buttonPlus.setOnClickListener {
            binding.textView.append("+")
        }
        binding.buttonMinus.setOnClickListener {
            binding.textView.append("-")
        }
        binding.buttonMultiply.setOnClickListener {
            binding.textView.append("*")
        }
        binding.buttonDivide.setOnClickListener {
            binding.textView.append("/")
        }
        binding.buttonDot.setOnClickListener {
            binding.textView.append(".")
        }
        binding.buttonEqual.setOnClickListener {
            val expression = ExpressionBuilder(binding.textView.text.toString()).build()
            val result = expression.evaluate()
            val longResult = result.toLong()

            if (result == longResult.toDouble()) {
                binding.textView.text = longResult.toString()
            } else {
                binding.textView.text = result.toString()
            }
        }
    }
}




