package com.daaw;

import android.content.Context;
import android.view.Surface;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ut3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8882ut3 {
    public final Context a;
    public final InterfaceC9645xd2 b;
    public final InterfaceC2457Um1 c;
    public C8603tt3 d;
    public List e;
    public St3 f;
    public boolean g;

    public C8882ut3(Context context, InterfaceC9645xd2 interfaceC9645xd2, InterfaceC2457Um1 interfaceC2457Um1) {
        this.a = context;
        this.b = interfaceC9645xd2;
        this.c = interfaceC2457Um1;
    }

    public final InterfaceC2665Wm1 a() {
        C8603tt3 c8603tt3 = this.d;
        AbstractC6048km2.b(c8603tt3);
        return c8603tt3;
    }

    public final void b() {
        AbstractC6048km2.b(this.d);
        throw null;
    }

    public final void c(C2485Ut1 c2485Ut1) {
        boolean z = false;
        if (!this.g && this.d == null) {
            z = true;
        }
        AbstractC6048km2.f(z);
        AbstractC6048km2.b(this.e);
        C8603tt3 c8603tt3 = new C8603tt3(this.a, this.b, this.c, c2485Ut1);
        this.d = c8603tt3;
        St3 st3 = this.f;
        if (st3 != null) {
            c8603tt3.e(st3);
        }
    }

    public final void d() {
        if (this.g) {
            return;
        }
        if (this.d != null) {
            throw null;
        }
        this.g = true;
    }

    public final void e(Surface surface, NE2 ne2) {
        C8603tt3 c8603tt3 = this.d;
        AbstractC6048km2.b(c8603tt3);
        c8603tt3.c(surface, ne2);
    }

    public final void f(long j) {
        AbstractC6048km2.b(this.d);
    }

    public final void g(List list) {
        this.e = list;
        if (i()) {
            C8603tt3 c8603tt3 = this.d;
            AbstractC6048km2.b(c8603tt3);
            c8603tt3.d(list);
        }
    }

    public final void h(St3 st3) {
        this.f = st3;
        if (i()) {
            C8603tt3 c8603tt3 = this.d;
            AbstractC6048km2.b(c8603tt3);
            c8603tt3.e(st3);
        }
    }

    public final boolean i() {
        return this.d != null;
    }
}
