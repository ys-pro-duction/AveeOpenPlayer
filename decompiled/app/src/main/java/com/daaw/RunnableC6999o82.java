package com.daaw;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.o82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6999o82 implements Runnable {
    public final WeakReference B;

    @Override // java.lang.Runnable
    public final void run() {
        M82 m82 = (M82) this.B.get();
        if (m82 != null) {
            m82.A0(new InterfaceC9072va2() { // from class: com.daaw.m82
                @Override // com.daaw.InterfaceC9072va2
                public final void zza(Object obj) {
                    ((N82) obj).zza();
                }
            });
        }
    }
}
