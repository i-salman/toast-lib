package com.cloud.mytoasterlib

import android.content.Context
import android.util.Log
import android.widget.Toast

class ToastMessage {

    fun showShortToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }


}