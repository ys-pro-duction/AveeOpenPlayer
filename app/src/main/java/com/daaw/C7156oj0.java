package com.daaw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.oj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7156oj0 implements InterfaceC7585qF0 {
    public C7863rF0 a;
    public final C8829uj0 b;
    public Set c;

    public C7156oj0(C8829uj0 c8829uj0) {
        this.b = c8829uj0;
    }

    public final boolean a(TC tc) {
        if (this.b.h().j(tc) || c(tc)) {
            return true;
        }
        C7863rF0 c7863rF0 = this.a;
        return c7863rF0 != null && c7863rF0.c(tc);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void b() {
        C9115vj0 c9115vj0G = this.b.g();
        ArrayList arrayList = new ArrayList();
        for (TC tc : this.c) {
            if (!a(tc)) {
                arrayList.add(tc);
            }
        }
        c9115vj0G.removeAll(arrayList);
        this.c = null;
    }

    public final boolean c(TC tc) {
        Iterator it = this.b.p().iterator();
        while (it.hasNext()) {
            if (((C8271sj0) it.next()).k(tc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void d() {
        this.c = new HashSet();
    }

    @Override // com.daaw.InterfaceC7585qF0
    public long f() {
        return -1L;
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void g(TC tc) {
        this.c.add(tc);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void h(TC tc) {
        if (a(tc)) {
            this.c.remove(tc);
        } else {
            this.c.add(tc);
        }
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void j(C7863rF0 c7863rF0) {
        this.a = c7863rF0;
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void l(TC tc) {
        this.c.add(tc);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void o(TC tc) {
        this.c.remove(tc);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void p(C5000h11 c5000h11) {
        C9673xj0 c9673xj0H = this.b.h();
        Iterator it = c9673xj0H.e(c5000h11.h()).iterator();
        while (it.hasNext()) {
            this.c.add((TC) it.next());
        }
        c9673xj0H.q(c5000h11);
    }
}
