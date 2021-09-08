package com.br.freitastiago.lotterynumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.br.freitastiago.lotterynumbers.databinding.ActivityMainBinding

private  lateinit var binding: ActivityMainBinding

val numbersOdd: IntArray = intArrayOf(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59)
val numbersEven: IntArray = intArrayOf(2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60)


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val generatorMegaOdd = NumberGeneratorOdd()
        val generatorMegaEven = NumberGeneratorEven()


        binding.ivRoll.setOnClickListener {

            var NumOne = generatorMegaOdd.Roll()
            var NumThree = generatorMegaOdd.Roll()
            var NumFive = generatorMegaOdd.Roll()
            var NumTwo = generatorMegaEven.Roll()
            var NumFour = generatorMegaEven.Roll()
            var NumSix = generatorMegaEven.Roll()



            binding.tvNumOne.text = numbersOdd.get(NumOne).toString()
            binding.tvNumTwo.text = numbersEven.get(NumTwo).toString()
            binding.tvNumThree.text = numbersOdd.get(NumThree).toString()
            binding.tvNumFour.text = numbersEven.get(NumFour).toString()
            binding.tvNumFive.text = numbersOdd.get(NumFive).toString()
            binding.tvNumSix.text = numbersEven.get(NumSix).toString()



        }

    }

}

class NumberGeneratorOdd() {
    fun Roll(): Int { return (0..(numbersOdd.size-1)).random() }
}

class NumberGeneratorEven() {
    fun Roll(): Int { return (0..(numbersEven.size-1)).random() }
}