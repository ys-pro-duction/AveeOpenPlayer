package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.cU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3719cU {
    public final a a = new a();
    public final Map b = new HashMap();

    /* JADX INFO: renamed from: com.daaw.cU$a */
    public static class a {
        public final Object a;
        public List b;
        public a c;
        public a d;

        public a() {
            this(null);
        }

        public void b(Object obj) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(obj);
        }

        public Object c() {
            int iD = d();
            if (iD > 0) {
                return this.b.remove(iD - 1);
            }
            return null;
        }

        public int d() {
            List list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(Object obj) {
            this.d = this;
            this.c = this;
            this.a = obj;
        }
    }

    public static void e(a aVar) {
        a aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
    }

    public static void g(a aVar) {
        aVar.c.d = aVar;
        aVar.d.c = aVar;
    }

    public Object a(InterfaceC0813Ex0 interfaceC0813Ex0) {
        a aVar = (a) this.b.get(interfaceC0813Ex0);
        if (aVar == null) {
            aVar = new a(interfaceC0813Ex0);
            this.b.put(interfaceC0813Ex0, aVar);
        } else {
            interfaceC0813Ex0.a();
        }
        b(aVar);
        return aVar.c();
    }

    public final void b(a aVar) {
        e(aVar);
        a aVar2 = this.a;
        aVar.d = aVar2;
        aVar.c = aVar2.c;
        g(aVar);
    }

    public final void c(a aVar) {
        e(aVar);
        a aVar2 = this.a;
        aVar.d = aVar2.d;
        aVar.c = aVar2;
        g(aVar);
    }

    public void d(InterfaceC0813Ex0 interfaceC0813Ex0, Object obj) {
        a aVar = (a) this.b.get(interfaceC0813Ex0);
        if (aVar == null) {
            aVar = new a(interfaceC0813Ex0);
            c(aVar);
            this.b.put(interfaceC0813Ex0, aVar);
        } else {
            interfaceC0813Ex0.a();
        }
        aVar.b(obj);
    }

    public Object f() {
        for (a aVar = this.a.d; !aVar.equals(this.a); aVar = aVar.d) {
            Object objC = aVar.c();
            if (objC != null) {
                return objC;
            }
            e(aVar);
            this.b.remove(aVar.a);
            ((InterfaceC0813Ex0) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.a.c;
        boolean z = false;
        while (!aVar.equals(this.a)) {
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            sb.append(aVar.d());
            sb.append("}, ");
            aVar = aVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
