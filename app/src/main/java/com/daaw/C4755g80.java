package com.daaw;

import com.daaw.H31;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.g80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4755g80 {
    public final PN0 a = new PN0(this);
    public final C8630u00 b = new C8630u00(this);
    public final C7286pA0 c = new C7286pA0(this);
    public final C5635jJ d = new C5635jJ(this);
    public AbstractC2316Td0 e = new C7030oG();

    public static /* synthetic */ void g(C4755g80 c4755g80, List list, boolean z, boolean z2, int i, Object obj) throws C9743xy {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c4755g80.f(list, z, z2);
    }

    public final void a() {
        this.e.a("Create eager instances ...");
        long jA = H31.a.a();
        this.b.b();
        long jC = H31.a.c(jA);
        this.e.a("Created eager instances in " + ME.a(jC) + " ms");
    }

    public final Object b(J50 j50, InterfaceC4484fC0 interfaceC4484fC0, LQ lq) {
        G10.g(j50, "clazz");
        return this.a.b().c(j50, interfaceC4484fC0, lq);
    }

    public final C8630u00 c() {
        return this.b;
    }

    public final AbstractC2316Td0 d() {
        return this.e;
    }

    public final PN0 e() {
        return this.a;
    }

    public final void f(List list, boolean z, boolean z2) throws C9743xy {
        G10.g(list, "modules");
        Set setA = AbstractC4078dl0.a(list);
        this.b.e(setA, z);
        this.a.d(setA);
        if (z2) {
            a();
        }
    }
}
