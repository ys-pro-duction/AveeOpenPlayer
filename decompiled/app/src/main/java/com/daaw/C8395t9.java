package com.daaw;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: com.daaw.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8395t9 {
    public final EditText a;
    public final UF b;

    public C8395t9(EditText editText) {
        this.a = editText;
        this.b = new UF(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, AbstractC5060hE0.g0, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(AbstractC5060hE0.u0) ? typedArrayObtainStyledAttributes.getBoolean(AbstractC5060hE0.u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.b.b(inputConnection, editorInfo);
    }

    public void e(boolean z) {
        this.b.c(z);
    }
}
