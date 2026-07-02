package com.daaw;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.xj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9673xj0 implements InterfaceC4153e11 {
    public int c;
    public final C8829uj0 f;
    public final Map a = new HashMap();
    public final C7863rF0 b = new C7863rF0();
    public CU0 d = CU0.C;
    public long e = 0;

    public C9673xj0(C8829uj0 c8829uj0) {
        this.f = c8829uj0;
    }

    @Override // com.daaw.InterfaceC4153e11
    public void a(C5000h11 c5000h11) {
        c(c5000h11);
    }

    @Override // com.daaw.InterfaceC4153e11
    public void b(CU0 cu0) {
        this.d = cu0;
    }

    @Override // com.daaw.InterfaceC4153e11
    public void c(C5000h11 c5000h11) {
        this.a.put(c5000h11.g(), c5000h11);
        int iH = c5000h11.h();
        if (iH > this.c) {
            this.c = iH;
        }
        if (c5000h11.e() > this.e) {
            this.e = c5000h11.e();
        }
    }

    @Override // com.daaw.InterfaceC4153e11
    public int d() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC4153e11
    public UY e(int i) {
        return this.b.d(i);
    }

    @Override // com.daaw.InterfaceC4153e11
    public CU0 f() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC4153e11
    public void g(UY uy, int i) {
        this.b.g(uy, i);
        InterfaceC7585qF0 interfaceC7585qF0F = this.f.f();
        Iterator it = uy.iterator();
        while (it.hasNext()) {
            interfaceC7585qF0F.l((TC) it.next());
        }
    }

    @Override // com.daaw.InterfaceC4153e11
    public C5000h11 h(Z01 z01) {
        return (C5000h11) this.a.get(z01);
    }

    @Override // com.daaw.InterfaceC4153e11
    public void i(UY uy, int i) {
        this.b.b(uy, i);
        InterfaceC7585qF0 interfaceC7585qF0F = this.f.f();
        Iterator it = uy.iterator();
        while (it.hasNext()) {
            interfaceC7585qF0F.o((TC) it.next());
        }
    }

    public boolean j(TC tc) {
        return this.b.c(tc);
    }

    public void k(InterfaceC8310sr interfaceC8310sr) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            interfaceC8310sr.accept((C5000h11) it.next());
        }
    }

    public long l(C1872Pc0 c1872Pc0) {
        Iterator it = this.a.entrySet().iterator();
        long jC = 0;
        while (it.hasNext()) {
            jC += (long) c1872Pc0.n((C5000h11) ((Map.Entry) it.next()).getValue()).c();
        }
        return jC;
    }

    public long m() {
        return this.e;
    }

    public long n() {
        return this.a.size();
    }

    public void o(int i) {
        this.b.h(i);
    }

    public int p(long j, SparseArray sparseArray) {
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iH = ((C5000h11) entry.getValue()).h();
            if (((C5000h11) entry.getValue()).e() <= j && sparseArray.get(iH) == null) {
                it.remove();
                o(iH);
                i++;
            }
        }
        return i;
    }

    public void q(C5000h11 c5000h11) {
        this.a.remove(c5000h11.g());
        this.b.h(c5000h11.h());
    }
}
