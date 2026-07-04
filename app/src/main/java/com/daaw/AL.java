package com.daaw;

import com.daaw.C2756Xj0;

/* JADX INFO: loaded from: classes3.dex */
public class AL implements InterfaceC7086oU {
    public static final C2756Xj0.g d;
    public static final C2756Xj0.g e;
    public static final C2756Xj0.g f;
    public final InterfaceC7569qB0 a;
    public final InterfaceC7569qB0 b;
    public final UL c;

    static {
        C2756Xj0.d dVar = C2756Xj0.e;
        d = C2756Xj0.g.e("x-firebase-client-log-type", dVar);
        e = C2756Xj0.g.e("x-firebase-client", dVar);
        f = C2756Xj0.g.e("x-firebase-gmpid", dVar);
    }

    public AL(InterfaceC7569qB0 interfaceC7569qB0, InterfaceC7569qB0 interfaceC7569qB02, UL ul) {
        this.b = interfaceC7569qB0;
        this.a = interfaceC7569qB02;
        this.c = ul;
    }

    @Override // com.daaw.InterfaceC7086oU
    public void a(C2756Xj0 c2756Xj0) {
        if (this.a.get() == null || this.b.get() == null) {
            return;
        }
        int iA = ((IV) this.a.get()).b("fire-fst").a();
        if (iA != 0) {
            c2756Xj0.p(d, Integer.toString(iA));
        }
        c2756Xj0.p(e, ((InterfaceC0826Fa1) this.b.get()).a());
        b(c2756Xj0);
    }

    public final void b(C2756Xj0 c2756Xj0) {
        UL ul = this.c;
        if (ul == null) {
            return;
        }
        String strC = ul.c();
        if (strC.length() != 0) {
            c2756Xj0.p(f, strC);
        }
    }
}
