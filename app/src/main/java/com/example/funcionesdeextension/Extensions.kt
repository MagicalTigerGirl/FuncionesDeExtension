package com.example.funcionesdeextension

import android.app.Activity
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

fun String.happy(): String {
    return "$this :)"
}

// Comprobar nulos. Devuelve un boleano
fun Any?.isNull() = this == null

fun comprobarNulos() {
    val age: Int? = null

    if (age.isNull()) {
        //Age es null
    }
}

// Simplifica crear un Toast
fun Activity.toast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

// Recuperar un color
fun Activity.color(@ColorRes color: Int) = ContextCompat.getColor(this, color)

// Cargar URL con la libreria Glide
fun ImageView.load(url: String) {
    if (url.isNotEmpty()) {
        Glide.with(this.context).load(url).into(this)
    }
}

// Simplificar listeners textChangedListener del EditText
fun EditText.onTextChanged(listener: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {

        override fun afterTextChanged(s: Editable?) {
            listener(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    })
}
