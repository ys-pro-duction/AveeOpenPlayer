package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Uz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2509Uz1 implements Runnable {
    public final /* synthetic */ C2613Vz1 B;

    public RunnableC2509Uz1(C2613Vz1 c2613Vz1) {
        this.B = c2613Vz1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.B.D) {
            C2613Vz1 c2613Vz1 = this.B;
            if (c2613Vz1.E && c2613Vz1.F) {
                c2613Vz1.E = false;
                AbstractC4274eT1.zze("App went background");
                Iterator it = this.B.G.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC2717Wz1) it.next()).zza(false);
                    } catch (Exception e) {
                        AbstractC4274eT1.zzh("", e);
                    }
                }
            } else {
                AbstractC4274eT1.zze("App is still foreground");
            }
        }
    }
}
