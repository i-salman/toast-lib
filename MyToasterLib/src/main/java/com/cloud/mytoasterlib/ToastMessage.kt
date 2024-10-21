package com.cloud.mytoasterlib

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.payment.paymentsdk.PaymentSdkConfigBuilder
import com.payment.paymentsdk.integrationmodels.PaymentSdkBillingDetails

class ToastMessage {

    fun showShortToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun test(context: Context) {
        var builder: PaymentSdkConfigBuilder
        val billingData = PaymentSdkBillingDetails(
            "London",
            "Pk",
            "abc@gmail.com",
            "Abc",
            "09876543321",
            "12345",
            "Denmark",
            "12345"
        )

        Log.d("Toaster", "${billingData.zip}")
        Log.d("Toaster", "${billingData.toString()}")
        showLongToast(context, billingData.zip!!)
        showLongToast(context, billingData.toString())

    }
}