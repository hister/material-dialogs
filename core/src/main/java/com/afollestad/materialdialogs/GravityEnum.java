package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.view.Gravity;
import android.view.View;

import com.tgbsco.nargeel.rtlizer.Rtlizer;

public enum GravityEnum {
    START, CENTER, END;

    @SuppressLint("RtlHardcoded")
    public int getGravityInt() {
        switch (this) {
            case START:
                return Rtlizer.isRtl() ? Gravity.RIGHT : Gravity.LEFT;
            case CENTER:
                return Gravity.CENTER_HORIZONTAL;
            case END:
                return Rtlizer.isRtl() ? Gravity.LEFT : Gravity.RIGHT;
            default:
                throw new IllegalStateException("Invalid gravity constant");
        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public int getTextAlignment() {
        switch (this) {
            case CENTER:
                return View.TEXT_ALIGNMENT_CENTER;
            case END:
                return View.TEXT_ALIGNMENT_VIEW_END;
            default:
                return View.TEXT_ALIGNMENT_VIEW_START;
        }
    }
}