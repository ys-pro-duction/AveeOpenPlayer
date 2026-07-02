package com.daaw;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.daaw.ht0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5243ht0 extends IG {
    public int e;
    public EditText f;
    public final View.OnClickListener g;

    public C5243ht0(com.google.android.material.textfield.a aVar, int i) {
        super(aVar);
        this.e = AbstractC3931dD0.a;
        this.g = new View.OnClickListener() { // from class: com.daaw.gt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5243ht0.v(this.B, view);
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    public static /* synthetic */ void v(C5243ht0 c5243ht0, View view) {
        EditText editText = c5243ht0.f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (c5243ht0.w()) {
            c5243ht0.f.setTransformationMethod(null);
        } else {
            c5243ht0.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            c5243ht0.f.setSelection(selectionEnd);
        }
        c5243ht0.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.daaw.IG
    public void b(CharSequence charSequence, int i, int i2, int i3) {
        r();
    }

    @Override // com.daaw.IG
    public int c() {
        return ND0.v;
    }

    @Override // com.daaw.IG
    public int d() {
        return this.e;
    }

    @Override // com.daaw.IG
    public View.OnClickListener f() {
        return this.g;
    }

    @Override // com.daaw.IG
    public boolean l() {
        return true;
    }

    @Override // com.daaw.IG
    public boolean m() {
        return !w();
    }

    @Override // com.daaw.IG
    public void n(EditText editText) {
        this.f = editText;
        r();
    }

    @Override // com.daaw.IG
    public void s() {
        if (x(this.f)) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.daaw.IG
    public void u() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
