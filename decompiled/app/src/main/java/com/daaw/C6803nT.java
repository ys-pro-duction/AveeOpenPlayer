package com.daaw;

/* JADX INFO: renamed from: com.daaw.nT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6803nT {
    public static C0529Cg1 c = new C0529Cg1();
    public static final Object d = new Object();
    public static volatile C6803nT e = null;
    public int a = -1;
    public final C4542fO0[] b = new C4542fO0[2];

    public C6803nT() {
        int i = 0;
        while (true) {
            C4542fO0[] c4542fO0Arr = this.b;
            if (i >= c4542fO0Arr.length) {
                e(this.a, true);
                return;
            } else {
                c4542fO0Arr[i] = new C4542fO0(i);
                i++;
            }
        }
    }

    public static C6803nT a() {
        C6803nT c6803nT;
        C6803nT c6803nT2 = e;
        if (c6803nT2 != null) {
            return c6803nT2;
        }
        synchronized (d) {
            try {
                if (e == null) {
                    e = new C6803nT();
                }
                c6803nT = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6803nT;
    }

    public static C6803nT c() {
        return e;
    }

    public InterfaceC9894yX b() {
        return d(this.a);
    }

    public C4542fO0 d(int i) {
        if (i < 0) {
            return null;
        }
        C4542fO0[] c4542fO0Arr = this.b;
        if (i >= c4542fO0Arr.length) {
            return null;
        }
        return c4542fO0Arr[i];
    }

    public void e(int i, boolean z) {
        if (i < 0 || i >= this.b.length) {
            i = -1;
        }
        c.a(Integer.valueOf(this.a), Integer.valueOf(i), i >= 0 ? this.b[i] : null, Boolean.valueOf(z));
    }

    public void f(int i, String str) {
        if (i >= 0) {
            C4542fO0[] c4542fO0Arr = this.b;
            if (i < c4542fO0Arr.length && !c4542fO0Arr[i].f.equals(str)) {
                this.b[i].f = str == null ? "" : new String(str);
                e(i, true);
            }
        }
    }

    public void g(String str) {
        f(this.a, str);
    }

    public void h(int i) {
        if (i < 0 || i >= this.b.length) {
            this.a = -1;
        } else {
            this.a = i;
        }
        e(this.a, false);
    }

    public void i(int i, boolean z, String str, InterfaceC5694jX interfaceC5694jX) {
        if (i >= 0) {
            C4542fO0[] c4542fO0Arr = this.b;
            if (i >= c4542fO0Arr.length) {
                return;
            }
            InterfaceC5694jX interfaceC5694jX2 = c4542fO0Arr[i].c;
            if (interfaceC5694jX2 == null || !interfaceC5694jX2.equals(interfaceC5694jX)) {
                this.b[i].f = "";
            }
            C4542fO0 c4542fO0 = this.b[i];
            c4542fO0.a = z;
            c4542fO0.b = str;
            c4542fO0.c = interfaceC5694jX;
            e(i, true);
        }
    }
}
