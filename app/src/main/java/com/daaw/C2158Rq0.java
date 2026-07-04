package com.daaw;

import com.daaw.InterfaceC2054Qq0;

/* JADX INFO: renamed from: com.daaw.Rq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2158Rq0 implements InterfaceC2054Qq0 {
    public final C5208hm0 c = new C5208hm0();
    public final AQ0 d = AQ0.t();

    public C2158Rq0() {
        a(InterfaceC2054Qq0.b);
    }

    public void a(InterfaceC2054Qq0.b bVar) {
        this.c.j(bVar);
        if (bVar instanceof InterfaceC2054Qq0.b.c) {
            this.d.p((InterfaceC2054Qq0.b.c) bVar);
        } else if (bVar instanceof InterfaceC2054Qq0.b.a) {
            this.d.q(((InterfaceC2054Qq0.b.a) bVar).a());
        }
    }
}
