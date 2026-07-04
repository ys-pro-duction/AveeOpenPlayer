package com.daaw;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class UF2 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ C5634jI2 e;

    public UF2(C5634jI2 c5634jI2, String str, long j) {
        this.e = c5634jI2;
        AbstractC7506py0.f(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.k().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.k().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }
}
