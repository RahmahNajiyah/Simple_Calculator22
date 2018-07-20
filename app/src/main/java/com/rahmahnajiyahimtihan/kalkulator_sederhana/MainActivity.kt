package com.rahmahnajiyahimtihan.kalkulator_sederhana

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKali.setOnClickListener {
            val inputSatu = edt1.text.toString()
            val inputDua = edt2.text.toString()

            if (inputSatu == "" || inputDua == "") {
                Toast.makeText(this@MainActivity, "inputan belum diisi", Toast.LENGTH_SHORT).show()
            } else {

                val hasilSatu = inputSatu.toDouble()
                val hasilDua = inputDua.toDouble()

                val kali = hasilSatu * hasilDua
                txtHasil.text = "$kali"
            }
        }

        btnBagi.setOnClickListener {
            val inputSatu = edt1.text.toString()
            val inputDua = edt2.text.toString()

            if (inputSatu == "" || inputDua == "") {
                Toast.makeText(this@MainActivity, "inputan belum diisi", Toast.LENGTH_SHORT).show()
            } else {

                val hasilSatu = inputSatu.toDouble()
                val hasilDua = inputDua.toDouble()

                val bagi = hasilSatu / hasilDua
                txtHasil.text = "$bagi"

            }
        }

        btnKurang.setOnClickListener {
            val inputSatu = edt1.text.toString()
            val inputDua = edt2.text.toString()

            if (inputSatu == "" || inputDua == "") {
                Toast.makeText(this@MainActivity, "inputan belum diisi", Toast.LENGTH_SHORT).show()
            } else {

                val hasilSatu = inputSatu.toDouble()
                val hasilDua = inputDua.toDouble()

                val kurang = hasilSatu - hasilDua
                txtHasil.text = "$kurang"

            }
        }

        btnTambah.setOnClickListener {
            val inputSatu = edt1.text.toString()
            val inputDua = edt2.text.toString()

            if (inputSatu == "" || inputDua == "") {
                Toast.makeText(this@MainActivity, "inputan belum diisi", Toast.LENGTH_SHORT).show()
            } else {

                val hasilSatu = inputSatu.toDouble()
                val hasilDua = inputDua.toDouble()

                val tambah = hasilSatu + hasilDua
                txtHasil.text = "$tambah"
            }
        }

        btnClear.setOnClickListener {
            txtHasil.text = ""
            edt1.text = null
            edt2.text = null
        }

    }
}

