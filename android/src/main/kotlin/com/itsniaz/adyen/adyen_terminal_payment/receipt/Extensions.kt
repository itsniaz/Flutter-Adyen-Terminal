package com.itsniaz.adyen.adyen_terminal_payment.receipt

import android.graphics.Paint
import android.widget.TextView

fun TextView.showStrikeThrough(show: Boolean) {
    paintFlags =
            if (show) paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            else paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
}