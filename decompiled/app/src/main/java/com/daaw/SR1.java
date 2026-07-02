package com.daaw;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class SR1 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final /* synthetic */ TR1 b;

    public SR1(TR1 tr1, String str) {
        this.b = tr1;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.b) {
            try {
                for (RR1 rr1 : this.b.b) {
                    rr1.a.b(rr1.b, sharedPreferences, this.a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
