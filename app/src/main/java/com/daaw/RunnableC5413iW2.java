package com.daaw;

import com.google.android.gms.measurement.internal.zzac;

/* JADX INFO: renamed from: com.daaw.iW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5413iW2 implements Runnable {
    public final /* synthetic */ zzac B;
    public final /* synthetic */ K43 C;

    public RunnableC5413iW2(K43 k43, zzac zzacVar) {
        this.C = k43;
        this.B = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.B.b();
        if (this.B.D.e() == null) {
            this.C.B.o(this.B);
        } else {
            this.C.B.y(this.B);
        }
    }
}
