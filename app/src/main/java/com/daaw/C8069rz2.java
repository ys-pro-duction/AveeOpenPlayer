package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzam;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.rz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8069rz2 implements InterfaceC1447Kz2 {
    public final String a;
    public final PS2 b;
    public final ScheduledExecutorService c;
    public final Context d;
    public final FF2 e;
    public final AbstractC10175zX1 f;

    public C8069rz2(PS2 ps2, ScheduledExecutorService scheduledExecutorService, String str, Context context, FF2 ff2, AbstractC10175zX1 abstractC10175zX1) {
        this.b = ps2;
        this.c = scheduledExecutorService;
        this.a = str;
        this.d = context;
        this.e = ff2;
        this.f = abstractC10175zX1;
    }

    public static /* synthetic */ InterfaceFutureC8236sc0 a(C8069rz2 c8069rz2) {
        String strName = ((Boolean) zzba.zzc().b(AbstractC9820yE1.c7)).booleanValue() ? AdFormat.UNKNOWN.name() : c8069rz2.a;
        zzg zzgVarT = c8069rz2.f.t();
        C8383t62 c8383t62 = new C8383t62();
        c8383t62.e(c8069rz2.d);
        DF2 df2 = new DF2();
        df2.J("adUnitId");
        df2.e(c8069rz2.e.d);
        df2.I(new zzq());
        df2.O(true);
        c8383t62.i(df2.g());
        zzgVarT.zza(c8383t62.j());
        zzac zzacVar = new zzac();
        zzacVar.zza(strName);
        zzgVarT.zzb(zzacVar.zzb());
        new C0610Da2();
        return AbstractC7360pS2.e(AbstractC7360pS2.m((AbstractC4839gS2) AbstractC7360pS2.o(AbstractC4839gS2.C(zzgVarT.zzc().zzc()), ((Long) zzba.zzc().b(AbstractC9820yE1.d7)).longValue(), TimeUnit.MILLISECONDS, c8069rz2.c), new WN2() { // from class: com.daaw.oz2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                zzam zzamVar = (zzam) obj;
                return zzamVar != null ? new C8348sz2(zzamVar.zza) : new C8348sz2(null);
            }
        }, c8069rz2.b), Exception.class, new WN2() { // from class: com.daaw.pz2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                AbstractC4274eT1.zzh("", (Exception) obj);
                return new C8348sz2(null);
            }
        }, c8069rz2.b);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 33;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return (!((Boolean) zzba.zzc().b(AbstractC9820yE1.b7)).booleanValue() || this.e.q) ? AbstractC7360pS2.h(new C8348sz2(null)) : AbstractC7360pS2.k(new RR2() { // from class: com.daaw.qz2
            @Override // com.daaw.RR2
            public final InterfaceFutureC8236sc0 zza() {
                return C8069rz2.a(this.a);
            }
        }, this.b);
    }
}
