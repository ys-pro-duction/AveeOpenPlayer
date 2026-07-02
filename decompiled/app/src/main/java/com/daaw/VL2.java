package com.daaw;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class VL2 {
    public final byte[] a;
    public int b;
    public int c;
    public final /* synthetic */ WL2 d;

    public /* synthetic */ VL2(WL2 wl2, byte[] bArr, UL2 ul2) {
        this.d = wl2;
        this.a = bArr;
    }

    public final VL2 a(int i) {
        this.c = i;
        return this;
    }

    public final VL2 b(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        try {
            WL2 wl2 = this.d;
            if (wl2.b) {
                wl2.a.x(this.a);
                this.d.a.n(this.b);
                this.d.a.b(this.c);
                this.d.a.C(null);
                this.d.a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
