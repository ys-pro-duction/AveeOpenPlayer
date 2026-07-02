package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Y22 extends V22 {
    public final Context i;
    public final View j;
    public final InterfaceC9334wW1 k;
    public final C4787gF2 l;
    public final InterfaceC3891d42 m;
    public final C0522Ce2 n;
    public final C2204Sb2 o;
    public final V73 p;
    public final Executor q;
    public zzq r;

    public Y22(C4169e42 c4169e42, Context context, C4787gF2 c4787gF2, View view, InterfaceC9334wW1 interfaceC9334wW1, InterfaceC3891d42 interfaceC3891d42, C0522Ce2 c0522Ce2, C2204Sb2 c2204Sb2, V73 v73, Executor executor) {
        super(c4169e42);
        this.i = context;
        this.j = view;
        this.k = interfaceC9334wW1;
        this.l = c4787gF2;
        this.m = interfaceC3891d42;
        this.n = c0522Ce2;
        this.o = c2204Sb2;
        this.p = v73;
        this.q = executor;
    }

    public static /* synthetic */ void o(Y22 y22) {
        C0522Ce2 c0522Ce2 = y22.n;
        if (c0522Ce2.e() == null) {
            return;
        }
        try {
            c0522Ce2.e().L0((zzbu) y22.p.zzb(), BinderC7744qp0.Z2(y22.i));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.daaw.AbstractC4448f42
    public final void b() {
        this.q.execute(new Runnable() { // from class: com.daaw.X22
            @Override // java.lang.Runnable
            public final void run() {
                Y22.o(this.B);
            }
        });
        super.b();
    }

    @Override // com.daaw.V22
    public final int h() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.D7)).booleanValue() && this.b.i0) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.E7)).booleanValue()) {
                return 0;
            }
        }
        return this.a.b.b.c;
    }

    @Override // com.daaw.V22
    public final View i() {
        return this.j;
    }

    @Override // com.daaw.V22
    public final zzdq j() {
        try {
            return this.m.zza();
        } catch (KF2 unused) {
            return null;
        }
    }

    @Override // com.daaw.V22
    public final C4787gF2 k() {
        zzq zzqVar = this.r;
        if (zzqVar != null) {
            return JF2.b(zzqVar);
        }
        C4498fF2 c4498fF2 = this.b;
        if (c4498fF2.e0) {
            for (String str : c4498fF2.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.j;
            return new C4787gF2(view.getWidth(), view.getHeight(), false);
        }
        return (C4787gF2) this.b.t.get(0);
    }

    @Override // com.daaw.V22
    public final C4787gF2 l() {
        return this.l;
    }

    @Override // com.daaw.V22
    public final void m() {
        this.o.zza();
    }

    @Override // com.daaw.V22
    public final void n(ViewGroup viewGroup, zzq zzqVar) {
        InterfaceC9334wW1 interfaceC9334wW1;
        if (viewGroup == null || (interfaceC9334wW1 = this.k) == null) {
            return;
        }
        interfaceC9334wW1.H(C8494tX1.c(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.r = zzqVar;
    }
}
