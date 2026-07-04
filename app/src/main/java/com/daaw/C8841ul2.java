package com.daaw;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.ul2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8841ul2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;

    public C8841ul2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((LX1) this.a).a();
        WeakReference weakReferenceA = ((MX1) this.b).a();
        C9685xl2 c9685xl2 = (C9685xl2) this.c.zzb();
        C1806Ol2 c1806Ol2 = new C1806Ol2();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new BinderC1702Nl2(contextA, weakReferenceA, c9685xl2, c1806Ol2, ps2);
    }
}
