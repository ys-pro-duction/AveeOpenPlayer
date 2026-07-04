package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.gA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4767gA2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;

    public C4767gA2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzg zzgVarZzb = ((JX1) this.a).zzb();
        Context contextA = ((LX1) this.b).a();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C3921dA2(zzgVarZzb, contextA, ps2, (ScheduledExecutorService) this.d.zzb(), ((C2578Vq2) this.e).zzb(), ((I62) this.f).a());
    }
}
