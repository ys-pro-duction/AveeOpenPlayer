package com.daaw;

import com.daaw.C0524Cf0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.uj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8829uj0 extends AbstractC1940Pt0 {
    public InterfaceC7585qF0 i;
    public boolean j;
    public final Map c = new HashMap();
    public final C7435pj0 e = new C7435pj0();
    public final C9673xj0 f = new C9673xj0(this);
    public final C6031kj0 g = new C6031kj0();
    public final C9115vj0 h = new C9115vj0();
    public final Map d = new HashMap();

    public static C8829uj0 m() {
        C8829uj0 c8829uj0 = new C8829uj0();
        c8829uj0.s(new C7156oj0(c8829uj0));
        return c8829uj0;
    }

    public static C8829uj0 n(C0524Cf0.b bVar, C1872Pc0 c1872Pc0) {
        C8829uj0 c8829uj0 = new C8829uj0();
        c8829uj0.s(new C7992rj0(c8829uj0, bVar, c1872Pc0));
        return c8829uj0;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public InterfaceC2017Qh a() {
        return this.g;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public VC b(C0722Ea1 c0722Ea1) {
        C6877nj0 c6877nj0 = (C6877nj0) this.d.get(c0722Ea1);
        if (c6877nj0 != null) {
            return c6877nj0;
        }
        C6877nj0 c6877nj02 = new C6877nj0();
        this.d.put(c0722Ea1, c6877nj02);
        return c6877nj02;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public InterfaceC0344Am0 d(C0722Ea1 c0722Ea1, InterfaceC7942rZ interfaceC7942rZ) {
        C8271sj0 c8271sj0 = (C8271sj0) this.c.get(c0722Ea1);
        if (c8271sj0 != null) {
            return c8271sj0;
        }
        C8271sj0 c8271sj02 = new C8271sj0(this, c0722Ea1);
        this.c.put(c0722Ea1, c8271sj02);
        return c8271sj02;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public InterfaceC0364Ar0 e() {
        return new C8550tj0();
    }

    @Override // com.daaw.AbstractC1940Pt0
    public InterfaceC7585qF0 f() {
        return this.i;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public boolean i() {
        return this.j;
    }

    @Override // com.daaw.AbstractC1940Pt0
    public Object j(String str, BZ0 bz0) {
        this.i.d();
        try {
            return bz0.get();
        } finally {
            this.i.b();
        }
    }

    @Override // com.daaw.AbstractC1940Pt0
    public void k(String str, Runnable runnable) {
        this.i.d();
        try {
            runnable.run();
        } finally {
            this.i.b();
        }
    }

    @Override // com.daaw.AbstractC1940Pt0
    public void l() {
        AbstractC6557mb.d(!this.j, "MemoryPersistence double-started!", new Object[0]);
        this.j = true;
    }

    @Override // com.daaw.AbstractC1940Pt0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C7435pj0 c(C0722Ea1 c0722Ea1) {
        return this.e;
    }

    public Iterable p() {
        return this.c.values();
    }

    @Override // com.daaw.AbstractC1940Pt0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C9115vj0 g() {
        return this.h;
    }

    @Override // com.daaw.AbstractC1940Pt0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C9673xj0 h() {
        return this.f;
    }

    public final void s(InterfaceC7585qF0 interfaceC7585qF0) {
        this.i = interfaceC7585qF0;
    }
}
