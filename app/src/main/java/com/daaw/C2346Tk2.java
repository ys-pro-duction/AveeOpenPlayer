package com.daaw;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.Tk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2346Tk2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;
    public final InterfaceC8394t83 i;
    public final InterfaceC8394t83 j;

    public C2346Tk2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836, InterfaceC8394t83 interfaceC8394t837, InterfaceC8394t83 interfaceC8394t838, InterfaceC8394t83 interfaceC8394t839, InterfaceC8394t83 interfaceC8394t8310) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
        this.g = interfaceC8394t837;
        this.h = interfaceC8394t838;
        this.i = interfaceC8394t839;
        this.j = interfaceC8394t8310;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.a.zzb();
        Context contextA = ((LX1) this.b).a();
        WeakReference weakReferenceA = ((MX1) this.c).a();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C2242Sk2(executor, contextA, weakReferenceA, ps2, (C8826ui2) this.e.zzb(), (ScheduledExecutorService) this.f.zzb(), (C2132Rj2) this.g.zzb(), ((XX1) this.h).a(), ((C7397pb2) this.i).zzb(), (WI2) this.j.zzb());
    }
}
