package com.daaw;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.daaw.vB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8971vB1 {
    public final byte[] a;
    public int b;
    public final /* synthetic */ C9250wB1 c;

    public /* synthetic */ C8971vB1(C9250wB1 c9250wB1, byte[] bArr, AbstractC7570qB1 abstractC7570qB1) {
        this.c = c9250wB1;
        this.a = bArr;
    }

    public final C8971vB1 a(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        this.c.c.execute(new Runnable() { // from class: com.daaw.pB1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.d();
            }
        });
    }

    public final synchronized void d() {
        try {
            C9250wB1 c9250wB1 = this.c;
            if (c9250wB1.b) {
                c9250wB1.a.x(this.a);
                this.c.a.n(0);
                this.c.a.b(this.b);
                this.c.a.C(null);
                this.c.a.zzf();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzf("Clearcut log failed", e);
        }
    }
}
