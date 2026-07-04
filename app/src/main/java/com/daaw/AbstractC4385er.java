package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4385er implements InterfaceC4953gr {
    public final List a = new ArrayList();
    public Object b;
    public AbstractC5232hr c;
    public a d;

    /* JADX INFO: renamed from: com.daaw.er$a */
    public interface a {
        void a(List list);

        void b(List list);
    }

    public AbstractC4385er(AbstractC5232hr abstractC5232hr) {
        this.c = abstractC5232hr;
    }

    @Override // com.daaw.InterfaceC4953gr
    public void a(Object obj) {
        this.b = obj;
        h(this.d, obj);
    }

    public abstract boolean b(C1793Oi1 c1793Oi1);

    public abstract boolean c(Object obj);

    public boolean d(String str) {
        Object obj = this.b;
        return obj != null && c(obj) && this.a.contains(str);
    }

    public void e(Iterable iterable) {
        this.a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1793Oi1 c1793Oi1 = (C1793Oi1) it.next();
            if (b(c1793Oi1)) {
                this.a.add(c1793Oi1.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        } else {
            this.c.a(this);
        }
        h(this.d, this.b);
    }

    public void f() {
        if (this.a.isEmpty()) {
            return;
        }
        this.a.clear();
        this.c.c(this);
    }

    public void g(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            h(aVar, this.b);
        }
    }

    public final void h(a aVar, Object obj) {
        if (this.a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.b(this.a);
        } else {
            aVar.a(this.a);
        }
    }
}
