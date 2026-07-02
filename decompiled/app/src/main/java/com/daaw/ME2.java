package com.daaw;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class ME2 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ C5634jI2 e;

    public ME2(C5634jI2 c5634jI2, String str, boolean z) {
        this.e = c5634jI2;
        AbstractC7506py0.f(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.k().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.k().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
