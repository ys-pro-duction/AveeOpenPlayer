package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.Ix2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1231Ix2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C1231Ix2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        TP2 tp2K;
        C8905ux2 c8905ux2A = C0390Ax2.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.zzb();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.R3)).booleanValue()) {
            tp2K = TP2.L(new C1754Ny2(c8905ux2A, ((Integer) zzba.zzc().b(AbstractC9820yE1.S3)).intValue(), scheduledExecutorService));
        } else {
            tp2K = TP2.K();
        }
        AbstractC7000o83.b(tp2K);
        return tp2K;
    }
}
