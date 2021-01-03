package com.example.mycalculator

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import javax.xml.xpath.XPathExpression

class MainActivity : AppCompatActivity() {
    private lateinit var actionDivide: ImageButton
    private lateinit var actionMultiply: ImageButton
    private lateinit var actionMinus: ImageButton
    private lateinit var actionBack: ImageButton
    private lateinit var actionAdd: ImageButton
    private lateinit var actionEquals: ImageButton

    private lateinit var placeholder: TextView
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        placeholder = findViewById(R.id.tvplaceholder)
        result = findViewById(R.id.tvResult)

        val num0 = findViewById<Button>(R.id.num0)
        val num1 = findViewById<Button>(R.id.num1)
        val num2 = findViewById<Button>(R.id.num2)
        val num3 = findViewById<Button>(R.id.num3)
        val num4 = findViewById<Button>(R.id.num4)
        val num5 = findViewById<Button>(R.id.num5)
        val num6 = findViewById<Button>(R.id.num6)
        val num7 = findViewById<Button>(R.id.num7)
        val num8 = findViewById<Button>(R.id.num8)
        val num9 = findViewById<Button>(R.id.num9)
        val dot = findViewById<Button>(R.id.Dot)

        val clear = findViewById<Button>(R.id.clear)

        actionDivide = findViewById(R.id.divide)
        actionAdd = findViewById(R.id.add)
        actionEquals = findViewById(R.id.equal)
        actionBack = findViewById(R.id.back)
        actionMinus = findViewById(R.id.minus)
        actionMultiply = findViewById(R.id.Multiply)


        //Numbers
        num0.setOnClickListener { appendVal("0", false) }
        num1.setOnClickListener { appendVal("1", false) }
        num2.setOnClickListener { appendVal("2", false) }
        num3.setOnClickListener { appendVal("3", false) }
        num4.setOnClickListener { appendVal("4", false) }
        num5.setOnClickListener { appendVal("5", false) }
        num6.setOnClickListener { appendVal("6", false) }
        num7.setOnClickListener { appendVal("7", false) }
        num8.setOnClickListener { appendVal("8", false) }
        num9.setOnClickListener { appendVal("9", false) }
        dot.setOnClickListener { appendVal(".", false) }

        //Operators
        clear.setOnClickListener { appendVal("", true) }

        actionDivide.setOnClickListener { appendVal(" / ", false) }
        actionMultiply.setOnClickListener { appendVal(" * ", false) }
        actionMinus.setOnClickListener { appendVal(" - ", false) }
        actionAdd.setOnClickListener { appendVal(" + ", false) }

        actionBack.setOnClickListener {
            val expression = placeholder.text.toString()
            if (expression.isNotEmpty()) {
                placeholder.text = expression.substring(0, expression.length - 1)
            }


        }


    }
        fun appendVal(string: String, isClear: Boolean) {
            if (isClear) {
                placeholder.text = ""
                result.text = ""
//            placeholder.append(string)
            } else {
                placeholder.append(string)
            }
        }

    }
