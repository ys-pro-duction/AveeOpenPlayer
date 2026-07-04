package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.daaw.AbstractC8245se;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxh;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.gB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4770gB1 implements AbstractC8245se.a {
    public final /* synthetic */ zzaxh a;
    public final /* synthetic */ BT1 b;
    public final /* synthetic */ C5328iB1 c;

    public C4770gB1(C5328iB1 c5328iB1, zzaxh zzaxhVar, BT1 bt1) {
        this.c = c5328iB1;
        this.a = zzaxhVar;
        this.b = bt1;
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        synchronized (this.c.d) {
            try {
                C5328iB1 c5328iB1 = this.c;
                if (c5328iB1.b) {
                    return;
                }
                c5328iB1.b = true;
                final YA1 ya1 = this.c.a;
                if (ya1 == null) {
                    return;
                }
                PS2 ps2 = AbstractC9322wT1.a;
                final zzaxh zzaxhVar = this.a;
                final BT1 bt1 = this.b;
                final InterfaceFutureC8236sc0 interfaceFutureC8236sc0Z0 = ps2.Z0(new Runnable() { // from class: com.daaw.dB1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4770gB1 c4770gB1 = this.B;
                        YA1 ya12 = ya1;
                        BT1 bt12 = bt1;
                        try {
                            C3088aB1 c3088aB1K = ya12.K();
                            boolean zJ = ya12.J();
                            zzaxh zzaxhVar2 = zzaxhVar;
                            zzaxe zzaxeVarC3 = zJ ? c3088aB1K.c3(zzaxhVar2) : c3088aB1K.b3(zzaxhVar2);
                            if (!zzaxeVarC3.v()) {
                                bt12.c(new RuntimeException("No entry contents."));
                                C5328iB1.e(c4770gB1.c);
                                return;
                            }
                            C4481fB1 c4481fB1 = new C4481fB1(c4770gB1, zzaxeVarC3.p(), 1);
                            int i = c4481fB1.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            c4481fB1.unread(i);
                            bt12.b(C5887kB1.b(c4481fB1, zzaxeVarC3.s(), zzaxeVarC3.E(), zzaxeVarC3.e(), zzaxeVarC3.D()));
                        } catch (RemoteException e) {
                            e = e;
                            AbstractC4274eT1.zzh("Unable to obtain a cache service instance.", e);
                            bt12.c(e);
                            C5328iB1.e(c4770gB1.c);
                        } catch (IOException e2) {
                            e = e2;
                            AbstractC4274eT1.zzh("Unable to obtain a cache service instance.", e);
                            bt12.c(e);
                            C5328iB1.e(c4770gB1.c);
                        }
                    }
                });
                final BT1 bt12 = this.b;
                bt12.g(new Runnable() { // from class: com.daaw.eB1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (bt12.isCancelled()) {
                            interfaceFutureC8236sc0Z0.cancel(true);
                        }
                    }
                }, AbstractC9322wT1.f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void B(int i) {
    }
}
