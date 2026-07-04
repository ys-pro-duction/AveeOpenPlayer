package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ps0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1936Ps0 {
    public final List a;
    public final Boolean b;
    public int c;

    public C1936Ps0(List list, Boolean bool) {
        G10.g(list, "_values");
        this.a = list;
        this.b = bool;
    }

    public final Object a(J50 j50) {
        Object next;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (j50.l(next)) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        return next;
    }

    public final Object b(J50 j50) {
        Object obj = this.a.get(this.c);
        if (!j50.l(obj)) {
            obj = null;
        }
        Object obj2 = obj != null ? obj : null;
        if (obj2 != null) {
            d();
        }
        return obj2;
    }

    public Object c(J50 j50) {
        G10.g(j50, "clazz");
        if (this.a.isEmpty()) {
            return null;
        }
        Boolean bool = this.b;
        if (bool != null) {
            return G10.c(bool, Boolean.TRUE) ? b(j50) : a(j50);
        }
        Object objB = b(j50);
        return objB == null ? a(j50) : objB;
    }

    public final void d() {
        if (this.c < AbstractC1599Mm.m(this.a)) {
            this.c++;
        }
    }

    public String toString() {
        return "DefinitionParameters" + AbstractC2455Um.M0(this.a);
    }

    public /* synthetic */ C1936Ps0(List list, Boolean bool, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : bool);
    }
}
