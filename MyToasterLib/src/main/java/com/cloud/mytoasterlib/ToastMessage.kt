package com.cloud.mytoasterlib

import android.content.Context
import android.widget.Toast
import com.payment.paymentsdk.PaymentSdkConfigBuilder

class ToastMessage {

    fun showShortToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun test() {
        var builder: PaymentSdkConfigBuilder
    }
}