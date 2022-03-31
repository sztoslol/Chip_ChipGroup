package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun setupChipGroup() {
            findViewById<Chip>(R.id.chip1).setOnCloseIconClickListener {
                findViewById<ChipGroup>(R.id.chipGroup).removeView(it)
                Toast
                    .makeText(this, "Removed 1st Chip", Toast.LENGTH_SHORT)
                    .show()
            }

            findViewById<Chip>(R.id.chip2).setOnCloseIconClickListener {
                findViewById<ChipGroup>(R.id.chipGroup).removeView(it)
                Toast
                    .makeText(this, "Removed 2nd Chip", Toast.LENGTH_SHORT)
                    .show()
            }
            findViewById<Chip>(R.id.chip3).setOnCloseIconClickListener {
                findViewById<ChipGroup>(R.id.chipGroup).removeView(it)
                Toast
                    .makeText(this, "Removed 3rd Chip", Toast.LENGTH_SHORT)
                    .show()
            }
            findViewById<Chip>(R.id.chip4).setOnCloseIconClickListener {
                findViewById<ChipGroup>(R.id.chipGroup).removeView(it)
                Toast
                    .makeText(this, "Removed 4th Chip", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

}
