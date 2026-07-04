package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.nI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6762nI2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C6762nI2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        V73 v73A = C4469f83.a(this.a);
        V73 v73A2 = C4469f83.a(this.b);
        Object c7320pI2 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.s8)).booleanValue() ? new C7320pI2((InterfaceC6483mI2) v73A.zzb(), (ScheduledExecutorService) this.c.zzb()) : (InterfaceC6483mI2) v73A2.zzb();
        AbstractC7000o83.b(c7320pI2);
        return c7320pI2;
    }
}
