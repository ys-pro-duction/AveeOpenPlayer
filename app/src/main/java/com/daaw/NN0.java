package com.daaw;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class NN0 {
    public final InterfaceC4484fC0 a;
    public final String b;
    public final boolean c;
    public final C4755g80 d;
    public final LinkedHashSet e;
    public Object f;
    public final LinkedHashSet g;
    public ThreadLocal h;
    public boolean i;

    public NN0(InterfaceC4484fC0 interfaceC4484fC0, String str, boolean z, C4755g80 c4755g80) {
        G10.g(interfaceC4484fC0, "scopeQualifier");
        G10.g(str, "id");
        G10.g(c4755g80, "_koin");
        this.a = interfaceC4484fC0;
        this.b = str;
        this.c = z;
        this.d = c4755g80;
        this.e = new LinkedHashSet();
        this.g = new LinkedHashSet();
    }

    public final void a(C1863Pa c1863Pa) {
        c1863Pa.L();
        if (c1863Pa.isEmpty()) {
            ThreadLocal threadLocal = this.h;
            if (threadLocal != null) {
                threadLocal.remove();
            }
            this.h = null;
        }
    }

    public final Object b(EI0 ei0) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            Object objG = ((NN0) it.next()).g(ei0);
            if (objG != null) {
                return objG;
            }
        }
        return null;
    }

    public final Object c(J50 j50, InterfaceC4484fC0 interfaceC4484fC0, LQ lq) {
        G10.g(j50, "clazz");
        return n(j50, interfaceC4484fC0, lq != null ? (C1936Ps0) lq.invoke() : null);
    }

    public final Object d(J50 j50, InterfaceC4484fC0 interfaceC4484fC0, C1936Ps0 c1936Ps0) {
        return n(j50, interfaceC4484fC0, c1936Ps0);
    }

    public final String e() {
        return this.b;
    }

    public final C1863Pa f() {
        C1863Pa c1863Pa;
        ThreadLocal threadLocal = this.h;
        if (threadLocal != null && (c1863Pa = (C1863Pa) threadLocal.get()) != null) {
            return c1863Pa;
        }
        C1863Pa c1863Pa2 = new C1863Pa();
        ThreadLocal threadLocal2 = new ThreadLocal();
        this.h = threadLocal2;
        threadLocal2.set(c1863Pa2);
        return c1863Pa2;
    }

    public final Object g(EI0 ei0) {
        G10.g(ei0, "ctx");
        try {
            return d(ei0.a(), ei0.e(), ei0.d());
        } catch (C4371eo0 unused) {
            this.d.d().a("* No instance found for type '" + K50.a(ei0.a()) + "' on scope '" + this + '\'');
            return null;
        } catch (C8285sm unused2) {
            this.d.d().a("* Scope closed - no instance found for " + K50.a(ei0.a()) + " on scope " + this);
            return null;
        }
    }

    public final InterfaceC4484fC0 h() {
        return this.a;
    }

    public final C1863Pa i(C1936Ps0 c1936Ps0) {
        C1863Pa c1863PaF = f();
        c1863PaF.addFirst(c1936Ps0);
        return c1863PaF;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(com.daaw.EI0 r7) throws com.daaw.C4371eo0 {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.NN0.j(com.daaw.EI0):java.lang.Object");
    }

    public final Object k(EI0 ei0) {
        this.d.d().a("|- ? " + ei0.b() + " look in other scopes");
        return b(ei0);
    }

    public final Object l(EI0 ei0) {
        return this.d.c().g(ei0.e(), ei0.a(), this.a, ei0);
    }

    public final Object m(InterfaceC4484fC0 interfaceC4484fC0, J50 j50, C1936Ps0 c1936Ps0) throws C8285sm {
        if (!this.i) {
            return o(c1936Ps0, new EI0(this.d.d(), this, j50, interfaceC4484fC0, c1936Ps0));
        }
        throw new C8285sm("Scope '" + this.b + "' is closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(com.daaw.J50 r9, com.daaw.InterfaceC4484fC0 r10, com.daaw.C1936Ps0 r11) {
        /*
            r8 = this;
            com.daaw.g80 r0 = r8.d
            com.daaw.Td0 r0 = r0.d()
            com.daaw.yb0 r1 = com.daaw.EnumC9912yb0.B
            com.daaw.yb0 r0 = r0.d()
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto Lc0
            java.lang.String r0 = ""
            r2 = 39
            if (r10 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = " with qualifier '"
            r3.append(r4)
            r3.append(r10)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L2f
        L2e:
            r3 = r0
        L2f:
            boolean r4 = r8.c
            if (r4 == 0) goto L34
            goto L4a
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = " - scope:'"
            r0.append(r4)
            java.lang.String r4 = r8.b
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L4a:
            com.daaw.g80 r4 = r8.d
            com.daaw.Td0 r4 = r4.d()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "|- '"
            r5.append(r6)
            java.lang.String r7 = com.daaw.K50.a(r9)
            r5.append(r7)
            r5.append(r2)
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = "..."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.b(r1, r0)
            com.daaw.H31 r0 = com.daaw.H31.a
            long r2 = r0.a()
            java.lang.Object r10 = r8.m(r10, r9, r11)
            com.daaw.K31 r11 = new com.daaw.K31
            long r2 = com.daaw.H31.a.c(r2)
            r0 = 0
            r11.<init>(r10, r2, r0)
            long r2 = r11.a()
            com.daaw.g80 r10 = r8.d
            com.daaw.Td0 r10 = r10.d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r9 = com.daaw.K50.a(r9)
            r0.append(r9)
            java.lang.String r9 = "' in "
            r0.append(r9)
            double r2 = com.daaw.ME.a(r2)
            r0.append(r2)
            java.lang.String r9 = " ms"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.b(r1, r9)
            java.lang.Object r9 = r11.b()
            return r9
        Lc0:
            java.lang.Object r9 = r8.m(r10, r9, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.NN0.n(com.daaw.J50, com.daaw.fC0, com.daaw.Ps0):java.lang.Object");
    }

    public final Object o(C1936Ps0 c1936Ps0, EI0 ei0) {
        if (c1936Ps0 == null) {
            return j(ei0);
        }
        AbstractC2316Td0 abstractC2316Td0D = this.d.d();
        EnumC9912yb0 enumC9912yb0 = EnumC9912yb0.B;
        if (abstractC2316Td0D.d().compareTo(enumC9912yb0) <= 0) {
            abstractC2316Td0D.b(enumC9912yb0, "| >> parameters " + c1936Ps0);
        }
        C1863Pa c1863PaI = i(c1936Ps0);
        try {
            return j(ei0);
        } finally {
            this.d.d().a("| << parameters");
            a(c1863PaI);
        }
    }

    public String toString() {
        return "['" + this.b + "']";
    }
}
