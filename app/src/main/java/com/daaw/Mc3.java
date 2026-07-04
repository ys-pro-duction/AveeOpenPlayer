package com.daaw;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class Mc3 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ zzq E;
    public final /* synthetic */ C7129od3 F;

    public Mc3(C7129od3 c7129od3, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.F = c7129od3;
        this.B = atomicReference;
        this.C = str2;
        this.D = str3;
        this.E = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C7129od3 c7129od3;
        InterfaceC9167vt2 interfaceC9167vt2;
        synchronized (this.B) {
            try {
                try {
                    c7129od3 = this.F;
                    interfaceC9167vt2 = c7129od3.d;
                } finally {
                    this.B.notify();
                }
            } catch (RemoteException e) {
                this.F.a.w().n().d("(legacy) Failed to get conditional properties; remote exception", null, this.C, e);
                this.B.set(Collections.EMPTY_LIST);
                atomicReference = this.B;
            }
            if (interfaceC9167vt2 == null) {
                c7129od3.a.w().n().d("(legacy) Failed to get conditional properties; not connected to service", null, this.C, this.D);
                this.B.set(Collections.EMPTY_LIST);
                return;
            }
            if (TextUtils.isEmpty(null)) {
                AbstractC7506py0.l(this.E);
                this.B.set(interfaceC9167vt2.h1(this.C, this.D, this.E));
            } else {
                this.B.set(interfaceC9167vt2.A0(null, this.C, this.D));
            }
            this.F.E();
            atomicReference = this.B;
            atomicReference.notify();
        }
    }
}
