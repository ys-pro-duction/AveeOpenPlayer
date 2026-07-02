package com.daaw;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: com.daaw.Mm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1600Mm0 implements MovementMethod {
    @Override // android.text.method.MovementMethod
    public boolean canSelectArbitrarily() {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public void onTakeFocus(TextView textView, Spannable spannable, int i) {
        Layout layout = textView.getLayout();
        if (layout != null && (i & 2) != 0) {
            textView.scrollTo(textView.getScrollX(), layout.getLineTop(0));
        }
        if (layout == null || (i & 1) == 0) {
            return;
        }
        int totalPaddingTop = textView.getTotalPaddingTop() + textView.getTotalPaddingBottom();
        textView.scrollTo(textView.getScrollX(), layout.getLineTop(layout.getLineCount()) - (textView.getHeight() - totalPaddingTop));
    }

    @Override // android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public void initialize(TextView textView, Spannable spannable) {
    }
}
