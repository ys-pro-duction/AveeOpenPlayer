package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5830k implements InterfaceC8783ua {
    public final Object a;
    public final List b = new ArrayList();
    public Object c;

    public AbstractC5830k(Object obj) {
        this.a = obj;
        this.c = obj;
    }

    @Override // com.daaw.InterfaceC8783ua
    public Object a() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC8783ua
    public void c(Object obj) {
        this.b.add(a());
        l(obj);
    }

    @Override // com.daaw.InterfaceC8783ua
    public final void clear() {
        this.b.clear();
        l(this.a);
        k();
    }

    @Override // com.daaw.InterfaceC8783ua
    public /* synthetic */ void d() {
        AbstractC8504ta.a(this);
    }

    @Override // com.daaw.InterfaceC8783ua
    public void g() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        l(this.b.remove(r0.size() - 1));
    }

    @Override // com.daaw.InterfaceC8783ua
    public /* synthetic */ void i() {
        AbstractC8504ta.b(this);
    }

    public final Object j() {
        return this.a;
    }

    public abstract void k();

    public void l(Object obj) {
        this.c = obj;
    }
}
