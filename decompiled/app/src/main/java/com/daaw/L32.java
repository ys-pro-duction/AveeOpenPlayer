package com.daaw;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class L32 extends V22 {
    public final InterfaceC7872rH1 i;
    public final Runnable j;
    public final Executor k;

    public L32(C4169e42 c4169e42, InterfaceC7872rH1 interfaceC7872rH1, Runnable runnable, Executor executor) {
        super(c4169e42);
        this.i = interfaceC7872rH1;
        this.j = runnable;
        this.k = executor;
    }

    public static /* synthetic */ void o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.daaw.AbstractC4448f42
    public final void b() {
        final J32 j32 = new J32(new AtomicReference(this.j));
        this.k.execute(new Runnable() { // from class: com.daaw.K32
            @Override // java.lang.Runnable
            public final void run() {
                this.B.p(j32);
            }
        });
    }

    @Override // com.daaw.V22
    public final int h() {
        return 0;
    }

    @Override // com.daaw.V22
    public final View i() {
        return null;
    }

    @Override // com.daaw.V22
    public final zzdq j() {
        return null;
    }

    @Override // com.daaw.V22
    public final C4787gF2 k() {
        return null;
    }

    @Override // com.daaw.V22
    public final C4787gF2 l() {
        return null;
    }

    public final /* synthetic */ void p(Runnable runnable) {
        try {
            if (this.i.zzb(BinderC7744qp0.Z2(runnable))) {
                return;
            }
            o(((J32) runnable).B);
        } catch (RemoteException unused) {
            o(((J32) runnable).B);
        }
    }

    @Override // com.daaw.V22
    public final void m() {
    }

    @Override // com.daaw.V22
    public final void n(ViewGroup viewGroup, zzq zzqVar) {
    }
}
