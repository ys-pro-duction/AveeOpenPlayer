package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.cE2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3658cE2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;

    public C3658cE2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3380bE2((Context) this.a.zzb(), (Executor) this.b.zzb(), (AbstractC10175zX1) this.c.zzb(), (C8611tv2) this.d.zzb(), (FE2) this.e.zzb(), new DF2());
    }
}
