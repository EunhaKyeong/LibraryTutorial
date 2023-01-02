package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class CustomToast {
    companion object {
        fun showCustomToast(context: Context, message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}