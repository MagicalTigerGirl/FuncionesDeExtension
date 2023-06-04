package com.example.funcionesdeextension

import android.app.Activity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import com.example.funcionesdeextension.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        happy()
        cargarImagen()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    // Happy
    fun happy() {
        var name = "Maria"
        var happyName: String = name.happy()
        toast(happyName)
    }

    // Simplificar Toast
    fun crearToast() {
        toast("Ejemplo 1")
        toast("Ejemplo 2", Toast.LENGTH_LONG)
    }

    // Recuperar color
    fun recuperarColor() {
        color(R.color.white)
    }

     fun cargarImagen() {
        binding.image.load("")
    }

    fun simplificarListenerEditText() {
        binding.editText.onTextChanged { "El carácter añadido es $it" }
        //binding.editText.onTextChanged {texto -> "El carácter añadido es $texto" }
    }
}