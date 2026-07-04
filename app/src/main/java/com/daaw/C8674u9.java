package com.daaw;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: com.daaw.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8674u9 {
    public final TextView a;
    public final C3385bG b;

    public C8674u9(TextView textView) {
        this.a = textView;
        this.b = new C3385bG(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a(inputFilterArr);
    }

    public boolean b() {
        return this.b.b();
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

    public void d(boolean z) {
        this.b.c(z);
    }

    public void e(boolean z) {
        this.b.d(z);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.b.e(transformationMethod);
    }
}
