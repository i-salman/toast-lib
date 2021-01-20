package com.cloud.mytoasterlib

import android.content.Context
import android.widget.Toast

class ToastMessage {

    fun showToast(context: Context, message: String, duration: Int) {
        Toast.makeText(context, message, duration).show()
    }
}