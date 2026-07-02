package com.daaw;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class VF extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile Editable.Factory b;
    public static Class c;

    public VF() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, VF.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new VF();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? ZU0.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
