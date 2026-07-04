package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ES2 {
    public final ES2 a;
    public final PA1 b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();

    public ES2(ES2 es2, PA1 pa1) {
        this.a = es2;
        this.b = pa1;
    }

    public final ES2 a() {
        return new ES2(this, this.b);
    }

    public final InterfaceC1637Mv1 b(InterfaceC1637Mv1 interfaceC1637Mv1) {
        return this.b.a(this, interfaceC1637Mv1);
    }

    public final InterfaceC1637Mv1 c(C6350lp1 c6350lp1) {
        InterfaceC1637Mv1 interfaceC1637Mv1A = InterfaceC1637Mv1.t;
        Iterator itY = c6350lp1.y();
        while (itY.hasNext()) {
            interfaceC1637Mv1A = this.b.a(this, c6350lp1.v(((Integer) itY.next()).intValue()));
            if (interfaceC1637Mv1A instanceof C5229hq1) {
                break;
            }
        }
        return interfaceC1637Mv1A;
    }

    public final InterfaceC1637Mv1 d(String str) {
        if (this.c.containsKey(str)) {
            return (InterfaceC1637Mv1) this.c.get(str);
        }
        ES2 es2 = this.a;
        if (es2 != null) {
            return es2.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, InterfaceC1637Mv1 interfaceC1637Mv1) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (interfaceC1637Mv1 == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, interfaceC1637Mv1);
        }
    }

    public final void f(String str, InterfaceC1637Mv1 interfaceC1637Mv1) {
        e(str, interfaceC1637Mv1);
        this.d.put(str, Boolean.TRUE);
    }

    public final void g(String str, InterfaceC1637Mv1 interfaceC1637Mv1) {
        ES2 es2;
        if (!this.c.containsKey(str) && (es2 = this.a) != null && es2.h(str)) {
            this.a.g(str, interfaceC1637Mv1);
        } else {
            if (this.d.containsKey(str)) {
                return;
            }
            if (interfaceC1637Mv1 == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, interfaceC1637Mv1);
            }
        }
    }

    public final boolean h(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        ES2 es2 = this.a;
        if (es2 != null) {
            return es2.h(str);
        }
        return false;
    }
}
