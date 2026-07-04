package com.daaw;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Z22 implements InterfaceC4758g83 {
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

    public Z22(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836, InterfaceC8394t83 interfaceC8394t837, InterfaceC8394t83 interfaceC8394t838, InterfaceC8394t83 interfaceC8394t839, InterfaceC8394t83 interfaceC8394t8310) {
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

    public static Y22 b(C4169e42 c4169e42, Context context, C4787gF2 c4787gF2, View view, InterfaceC9334wW1 interfaceC9334wW1, InterfaceC3891d42 interfaceC3891d42, C0522Ce2 c0522Ce2, C2204Sb2 c2204Sb2, V73 v73, Executor executor) {
        return new Y22(c4169e42, context, c4787gF2, view, interfaceC9334wW1, interfaceC3891d42, c0522Ce2, c2204Sb2, v73, executor);
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y22 zzb() {
        return new Y22(((A52) this.a).zzb(), (Context) this.b.zzb(), ((C5567j32) this.c).a(), ((C5290i32) this.d).a(), ((C8647u32) this.e).a(), ((C5849k32) this.f).a(), ((C7128od2) this.g).a(), (C2204Sb2) this.h.zzb(), C4469f83.a(this.i), (Executor) this.j.zzb());
    }
}
