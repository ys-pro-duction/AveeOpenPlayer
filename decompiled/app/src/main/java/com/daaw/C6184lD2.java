package com.daaw;

import com.google.android.gms.internal.ads.zzbvg;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.lD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6184lD2 implements PD2 {
    public final AG2 a;
    public final Executor b;
    public final InterfaceC6244lS2 c = new C5614jD2(this);

    public C6184lD2(AG2 ag2, Executor executor) {
        this.a = ag2;
        this.b = executor;
    }

    @Override // com.daaw.PD2
    public final /* bridge */ /* synthetic */ InterfaceFutureC8236sc0 a(QD2 qd2, OD2 od2, Object obj) {
        return c(qd2, od2, null);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 b(InterfaceC8104s62 interfaceC8104s62, KD2 kd2) {
        AG2 ag2 = this.a;
        JG2 jg2 = kd2.b;
        zzbvg zzbvgVar = kd2.a;
        IG2 ig2B = ag2.b(jg2);
        if (ig2B != null && zzbvgVar != null) {
            AbstractC7360pS2.r(interfaceC8104s62.zzb().h(zzbvgVar), this.c, this.b);
        }
        return AbstractC7360pS2.h(new C5896kD2(jg2, zzbvgVar, ig2B));
    }

    public final InterfaceFutureC8236sc0 c(QD2 qd2, OD2 od2, final InterfaceC8104s62 interfaceC8104s62) {
        return AbstractC7360pS2.e(AbstractC7360pS2.n(AbstractC4839gS2.C(new LD2(this.a, interfaceC8104s62, this.b).c()), new WR2() { // from class: com.daaw.hD2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.b(interfaceC8104s62, (KD2) obj);
            }
        }, this.b), Exception.class, new C5337iD2(this), this.b);
    }

    @Override // com.daaw.PD2
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
