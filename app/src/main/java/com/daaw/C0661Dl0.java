package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Dl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661Dl0 {
    public final Object a;
    public final InterfaceC2165Rs b;
    public final OT0 c;
    public final C4445f4 d;
    public final List e;
    public final InterfaceC5248hu0 f;

    public C0661Dl0(AbstractC0444Bl0 abstractC0444Bl0, Object obj, InterfaceC2165Rs interfaceC2165Rs, OT0 ot0, C4445f4 c4445f4, List list, InterfaceC5248hu0 interfaceC5248hu0) {
        G10.g(abstractC0444Bl0, "content");
        G10.g(interfaceC2165Rs, "composition");
        G10.g(ot0, "slotTable");
        G10.g(c4445f4, "anchor");
        G10.g(list, "invalidations");
        G10.g(interfaceC5248hu0, "locals");
        this.a = obj;
        this.b = interfaceC2165Rs;
        this.c = ot0;
        this.d = c4445f4;
        this.e = list;
        this.f = interfaceC5248hu0;
    }

    public final C4445f4 a() {
        return this.d;
    }

    public final InterfaceC2165Rs b() {
        return this.b;
    }

    public final AbstractC0444Bl0 c() {
        return null;
    }

    public final List d() {
        return this.e;
    }

    public final InterfaceC5248hu0 e() {
        return this.f;
    }

    public final Object f() {
        return this.a;
    }

    public final OT0 g() {
        return this.c;
    }
}
