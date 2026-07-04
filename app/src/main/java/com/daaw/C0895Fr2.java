package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Fr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0895Fr2 implements InterfaceC4956gr2 {
    public final Context a;
    public final AbstractC9212w32 b;
    public final Executor c;

    public C0895Fr2(Context context, AbstractC9212w32 abstractC9212w32, Executor executor) {
        this.a = context;
        this.b = abstractC9212w32;
        this.c = executor;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, final C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        final View viewF;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.D7)).booleanValue() && c4498fF2.i0) {
            InterfaceC4525fM1 interfaceC4525fM1H = ((C4502fG2) c2994Zq2.b).h();
            if (interfaceC4525fM1H == null) {
                AbstractC4274eT1.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new KF2(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewF = (View) BinderC7744qp0.I(interfaceC4525fM1H.zze());
                boolean zZzf = interfaceC4525fM1H.zzf();
                if (viewF == null) {
                    throw new KF2(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewF = (View) AbstractC7360pS2.n(AbstractC7360pS2.h(null), new WR2() { // from class: com.daaw.Dr2
                            @Override // com.daaw.WR2
                            public final InterfaceFutureC8236sc0 zza(Object obj) {
                                return this.a.c(viewF, c4498fF2, obj);
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
            viewF = ((C4502fG2) c2994Zq2.b).f();
        }
        AbstractC9212w32 abstractC9212w32 = this.b;
        C10054z42 c10054z42 = new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a);
        final C4502fG2 c4502fG2 = (C4502fG2) c2994Zq2.b;
        W22 w22A = abstractC9212w32.a(c10054z42, new C4732g32(viewF, null, new InterfaceC3891d42() { // from class: com.daaw.Er2
            @Override // com.daaw.InterfaceC3891d42
            public final zzdq zza() {
                return c4502fG2.g();
            }
        }, (C4787gF2) c4498fF2.w.get(0)));
        w22A.i().B0(viewF);
        w22A.c().x0(new C12((C4502fG2) c2994Zq2.b), this.c);
        ((BinderC3558bs2) c2994Zq2.c).a3(w22A.g());
        return w22A.h();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        zzq zzqVar;
        zzq zzqVar2 = c9267wF2.a.a.e;
        if (zzqVar2.zzn) {
            zzqVar = new zzq(this.a, zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) zzba.zzc().b(AbstractC9820yE1.D7)).booleanValue() && c4498fF2.i0) ? new zzq(this.a, zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : JF2.a(this.a, c4498fF2.w);
        }
        zzq zzqVar3 = zzqVar;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.D7)).booleanValue() && c4498fF2.i0) {
            Object obj = c2994Zq2.b;
            ((C4502fG2) obj).s(this.a, zzqVar3, c9267wF2.a.a.d, c4498fF2.x.toString(), zzbw.zzl(c4498fF2.u), (InterfaceC3689cM1) c2994Zq2.c);
            return;
        }
        Object obj2 = c2994Zq2.b;
        ((C4502fG2) obj2).r(this.a, zzqVar3, c9267wF2.a.a.d, c4498fF2.x.toString(), zzbw.zzl(c4498fF2.u), (InterfaceC3689cM1) c2994Zq2.c);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(View view, C4498fF2 c4498fF2, Object obj) {
        return AbstractC7360pS2.h(R32.a(this.a, view, c4498fF2));
    }
}
