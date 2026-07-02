package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class XY1 implements YB2 {
    public final HY1 a;
    public final XY1 b = this;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;

    public /* synthetic */ XY1(HY1 hy1, Context context, String str, WY1 wy1) {
        this.a = hy1;
        InterfaceC4758g83 interfaceC4758g83A = C5037h83.a(context);
        this.c = interfaceC4758g83A;
        InterfaceC4758g83 interfaceC4758g83A2 = C5037h83.a(str);
        this.d = interfaceC4758g83A2;
        RD2 rd2 = new RD2(interfaceC4758g83A, hy1.H0, hy1.I0);
        this.e = rd2;
        InterfaceC8394t83 interfaceC8394t83B = C4469f83.b(new DC2(hy1.H0));
        this.f = interfaceC8394t83B;
        InterfaceC8394t83 interfaceC8394t83B2 = C4469f83.b(new FC2(interfaceC4758g83A, hy1.p, hy1.V, rd2, interfaceC8394t83B, HF2.a(), hy1.i));
        this.g = interfaceC8394t83B2;
        this.h = C4469f83.b(new LC2(hy1.V, interfaceC4758g83A, interfaceC4758g83A2, interfaceC8394t83B2, interfaceC8394t83B, hy1.i, hy1.a0));
    }

    @Override // com.daaw.YB2
    public final KC2 zza() {
        return (KC2) this.h.zzb();
    }
}
