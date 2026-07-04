package com.daaw;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.cm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3806cm2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C3806cm2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        final C7782qx1 c7782qx1 = (C7782qx1) this.a.zzb();
        final Context contextA = ((LX1) this.b).a();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0S0 = ps2.S0(new Callable() { // from class: com.daaw.Zl2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c7782qx1.c().zzg(contextA);
            }
        });
        AbstractC7000o83.b(interfaceFutureC8236sc0S0);
        return interfaceFutureC8236sc0S0;
    }
}
