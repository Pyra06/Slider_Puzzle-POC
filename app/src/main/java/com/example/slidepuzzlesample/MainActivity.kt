package com.example.slidepuzzlesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.sql.BatchUpdateException

class MainActivity : AppCompatActivity() {

    lateinit var block1: TextView
    lateinit var block2: TextView
    lateinit var block3: TextView
    lateinit var block4: TextView
    lateinit var block5: TextView
    lateinit var block6: TextView
    lateinit var block7: TextView
    lateinit var block8: TextView
    lateinit var block9: TextView
    lateinit var block10: TextView
    lateinit var moveLeft: Button
    lateinit var moveRight: Button
    lateinit var moveUP: Button
    lateinit var moveDown: Button
    lateinit var resetBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        block1 = findViewById(R.id.textView1)
        block2 = findViewById(R.id.textView2)
        block3 = findViewById(R.id.textView3)
        block4 = findViewById(R.id.textView4)
        block5 = findViewById(R.id.textView5)
        block6 = findViewById(R.id.textView6)
        block7 = findViewById(R.id.textView7)
        block8 = findViewById(R.id.textView8)
        block9 = findViewById(R.id.textView9)
        block10 = findViewById(R.id.textView10)
        moveLeft = findViewById(R.id.button1)
        moveRight = findViewById(R.id.button2)
        moveUP = findViewById(R.id.button3)
        moveDown = findViewById(R.id.button4)
        resetBtn = findViewById(R.id.button5)

        moveLeft.setOnClickListener() {
            if (block1.text.isEmpty()) {
                block1.text = block2.text
                block2.text = ""
            } else if(block2.text.isEmpty()) {
                block2.text = block3.text
                block3.text = ""
            } else if(block3.text.isEmpty()) {
                block3.text = block4.text
                block4.text = ""
            } else if(block4.text.isEmpty()) {
                block4.text = block5.text
                block5.text = ""
            } else if(block5.text.isEmpty()) {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }

        moveRight.setOnClickListener() {
            if (block5.text.isEmpty()) {
                block5.text = block4.text
                block4.text = ""
            } else if(block4.text.isEmpty()) {
                block4.text = block3.text
                block3.text = ""
            } else if(block3.text.isEmpty()) {
                block3.text = block2.text
                block2.text = ""
            } else if(block2.text.isEmpty()) {
                block2.text = block1.text
                block1.text = ""
            } else if(block1.text.isEmpty()) {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }

        moveUP.setOnClickListener() {
            if (block6.text.isEmpty()) {
                block6.text = block7.text
                block7.text = ""
            } else if(block7.text.isEmpty()) {
                block7.text = block8.text
                block8.text = ""
            } else if(block8.text.isEmpty()) {
                block8.text = block9.text
                block9.text = ""
            } else if(block9.text.isEmpty()) {
                block9.text = block10.text
                block10.text = ""
            } else if(block10.text.isEmpty()) {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }

        moveDown.setOnClickListener() {
            if (block10.text.isEmpty()) {
                block10.text = block9.text
                block9.text = ""
            } else if(block9.text.isEmpty()) {
                block9.text = block8.text
                block8.text = ""
            } else if(block8.text.isEmpty()) {
                block8.text = block7.text
                block7.text = ""
            } else if(block7.text.isEmpty()) {
                block7.text = block6.text
                block6.text = ""
            } else if(block6.text.isEmpty()) {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }

        resetBtn.setOnClickListener() {
            block1.text = "A"
            block2.text = ""
            block3.text = "B"
            block4.text = "C"
            block5.text = "D"
            block6.text = "A"
            block7.text = ""
            block8.text = "B"
            block9.text = "c"
            block10.text = "D"
        }
    }
}
