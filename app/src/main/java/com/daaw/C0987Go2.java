package com.daaw;

import android.content.Context;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.daaw.Go2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0987Go2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;

    public C0987Go2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836, InterfaceC8394t83 interfaceC8394t837, InterfaceC8394t83 interfaceC8394t838) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
        this.g = interfaceC8394t837;
        this.h = interfaceC8394t838;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* synthetic */ Object zzb() {
        Context contextA = ((LX1) this.a).a();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new BinderC0883Fo2(contextA, ps2, new RP1(), ((UX1) this.d).zzb(), ((C3821cp2) this.e).zzb(), (ArrayDeque) this.f.zzb(), new C2882Yo2(), (WI2) this.h.zzb());
    }
}
