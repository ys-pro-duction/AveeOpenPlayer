package com.daaw;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class FH2 {
    public final String a;
    public boolean b;
    public String c;
    public final /* synthetic */ C5634jI2 d;

    public FH2(C5634jI2 c5634jI2, String str, String str2) {
        this.d = c5634jI2;
        AbstractC7506py0.f(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.k().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.d.k().edit();
        editorEdit.putString(this.a, str);
        editorEdit.apply();
        this.c = str;
    }
}
