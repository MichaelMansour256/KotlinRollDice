package com.example.roledice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RollButton : Button=findViewById(R.id.button)
        RollButton.setOnClickListener{RollDice()}
        RollDice()
    }
    private fun RollDice(){
        val d=Dice(6)
        val RollDice =d.Roll()

        val DiceImage : ImageView =findViewById(R.id.imageView)
        val DrawableResImg=when(RollDice){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        DiceImage.setImageResource(DrawableResImg)
        DiceImage.contentDescription = DiceImage.toString()
    }
}



class  Dice(private val numberOfSides:Int){
    fun Roll( ):Int{
        return (1..numberOfSides).random()
    }
}