package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.dc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4036dc3 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ zzq C;
    public final /* synthetic */ C7129od3 D;

    public RunnableC4036dc3(C7129od3 c7129od3, AtomicReference atomicReference, zzq zzqVar) {
        this.D = c7129od3;
        this.B = atomicReference;
        this.C = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.B) {
            try {
                try {
                } catch (RemoteException e) {
                    this.D.a.w().n().b("Failed to get app instance id", e);
                    atomicReference = this.B;
                }
                if (this.D.a.F().m().j(EnumC9512x73.ANALYTICS_STORAGE)) {
                    C7129od3 c7129od3 = this.D;
                    InterfaceC9167vt2 interfaceC9167vt2 = c7129od3.d;
                    if (interfaceC9167vt2 != null) {
                        AbstractC7506py0.l(this.C);
                        this.B.set(interfaceC9167vt2.r0(this.C));
                        String str = (String) this.B.get();
                        if (str != null) {
                            this.D.a.I().C(str);
                            this.D.a.F().g.b(str);
                        }
                        this.D.E();
                        atomicReference = this.B;
                        atomicReference.notify();
                        return;
                    }
                    c7129od3.a.w().n().a("Failed to get app instance id");
                    this.B.notify();
                } else {
                    this.D.a.w().u().a("Analytics storage consent denied; will not get app instance id");
                    this.D.a.I().C(null);
                    this.D.a.F().g.b(null);
                    this.B.set(null);
                }
            } finally {
                this.B.notify();
            }
        }
    }
}
