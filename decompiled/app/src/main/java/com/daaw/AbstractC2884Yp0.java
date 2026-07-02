package com.daaw;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.daaw.Yp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2884Yp0 {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public LQ c;

    public AbstractC2884Yp0(boolean z) {
        this.a = z;
    }

    public final void a(InterfaceC3510bj interfaceC3510bj) {
        G10.g(interfaceC3510bj, "cancellable");
        this.b.add(interfaceC3510bj);
    }

    public final LQ b() {
        return this.c;
    }

    public abstract void d();

    public void e(C2419Ud c2419Ud) {
        G10.g(c2419Ud, "backEvent");
    }

    public void f(C2419Ud c2419Ud) {
        G10.g(c2419Ud, "backEvent");
    }

    public final boolean g() {
        return this.a;
    }

    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3510bj) it.next()).cancel();
        }
    }

    public final void i(InterfaceC3510bj interfaceC3510bj) {
        G10.g(interfaceC3510bj, "cancellable");
        this.b.remove(interfaceC3510bj);
    }

    public final void j(boolean z) {
        this.a = z;
        LQ lq = this.c;
        if (lq != null) {
            lq.invoke();
        }
    }

    public final void k(LQ lq) {
        this.c = lq;
    }

    public void c() {
    }
}
