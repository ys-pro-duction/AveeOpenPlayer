package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.daaw.Qr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2060Qr2 implements InterfaceC4956gr2 {
    public final Context a;
    public final AbstractC9212w32 b;
    public View c;
    public InterfaceC4525fM1 d;

    public C2060Qr2(Context context, AbstractC9212w32 abstractC9212w32) {
        this.a = context;
        this.b = abstractC9212w32;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, final C4498fF2 c4498fF2, final C2994Zq2 c2994Zq2) throws KF2 {
        final View view;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.D7)).booleanValue() && c4498fF2.i0) {
            try {
                view = (View) BinderC7744qp0.I(this.d.zze());
                boolean zZzf = this.d.zzf();
                if (view == null) {
                    throw new KF2(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.Nr2
                            @Override // com.daaw.WR2
                            public final InterfaceFutureC8236sc0 zza(Object obj) {
                                return this.a.c(view, c4498fF2, obj);
                            }
                        }, AbstractC9322wT1.e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new KF2(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new KF2(e2);
            }
        } else {
            view = this.c;
        }
        W22 w22A = this.b.a(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C4732g32(view, null, new InterfaceC3891d42() { // from class: com.daaw.Mr2
            @Override // com.daaw.InterfaceC3891d42
            public final zzdq zza() throws KF2 {
                try {
                    return ((ZM1) c2994Zq2.b).zze();
                } catch (RemoteException e3) {
                    throw new KF2(e3);
                }
            }
        }, (C4787gF2) c4498fF2.w.get(0)));
        w22A.i().B0(view);
        ((BinderC3558bs2) c2994Zq2.c).a3(w22A.f());
        return w22A.h();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        try {
            ((ZM1) c2994Zq2.b).G2(c4498fF2.b0);
            AbstractC1830Or2 abstractC1830Or2 = null;
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.D7)).booleanValue() && c4498fF2.i0) {
                ((ZM1) c2994Zq2.b).j1(c4498fF2.W, c4498fF2.x.toString(), c9267wF2.a.a.d, BinderC7744qp0.Z2(this.a), new BinderC1934Pr2(this, c2994Zq2, abstractC1830Or2), (InterfaceC3689cM1) c2994Zq2.c, c9267wF2.a.a.e);
            } else {
                ((ZM1) c2994Zq2.b).Q0(c4498fF2.W, c4498fF2.x.toString(), c9267wF2.a.a.d, BinderC7744qp0.Z2(this.a), new BinderC1934Pr2(this, c2994Zq2, abstractC1830Or2), (InterfaceC3689cM1) c2994Zq2.c, c9267wF2.a.a.e);
            }
        } catch (RemoteException e) {
            throw new KF2(e);
        }
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(View view, C4498fF2 c4498fF2, Object obj) {
        return AbstractC7360pS2.h(R32.a(this.a, view, c4498fF2));
    }
}
