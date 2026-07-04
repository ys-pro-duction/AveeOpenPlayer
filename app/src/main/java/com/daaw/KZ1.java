package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class KZ1 implements InterfaceC4215eE2 {
    public final HY1 a;
    public final KZ1 b = this;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;
    public final InterfaceC8394t83 i;

    public /* synthetic */ KZ1(HY1 hy1, Context context, String str, zzq zzqVar, JZ1 jz1) {
        this.a = hy1;
        InterfaceC4758g83 interfaceC4758g83A = C5037h83.a(context);
        this.c = interfaceC4758g83A;
        InterfaceC4758g83 interfaceC4758g83A2 = C5037h83.a(zzqVar);
        this.d = interfaceC4758g83A2;
        InterfaceC4758g83 interfaceC4758g83A3 = C5037h83.a(str);
        this.e = interfaceC4758g83A3;
        InterfaceC8394t83 interfaceC8394t83B = C4469f83.b(new C8897uv2(hy1.o));
        this.f = interfaceC8394t83B;
        InterfaceC8394t83 interfaceC8394t83B2 = C4469f83.b(new GE2(hy1.H0));
        this.g = interfaceC8394t83B2;
        InterfaceC8394t83 interfaceC8394t83B3 = C4469f83.b(new C3658cE2(interfaceC4758g83A, hy1.p, hy1.V, interfaceC8394t83B, interfaceC8394t83B2, HF2.a()));
        this.h = interfaceC8394t83B3;
        this.i = C4469f83.b(new C0590Cv2(interfaceC4758g83A, interfaceC4758g83A2, interfaceC4758g83A3, interfaceC8394t83B3, interfaceC8394t83B, interfaceC8394t83B2, hy1.i, hy1.W, hy1.a0));
    }

    @Override // com.daaw.InterfaceC4215eE2
    public final BinderC0486Bv2 zza() {
        return (BinderC0486Bv2) this.i.zzb();
    }
}
