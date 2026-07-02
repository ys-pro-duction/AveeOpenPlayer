package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class YT implements InterfaceC8732uN0, InterfaceC7152oi1, InterfaceC8997vI {
    public static final String J = AbstractC1772Od0.f("GreedyScheduler");
    public final Context B;
    public final C0537Ci1 C;
    public final C7431pi1 D;
    public C0816Ey F;
    public boolean G;
    public Boolean I;
    public final Set E = new HashSet();
    public final Object H = new Object();

    public YT(Context context, androidx.work.a aVar, InterfaceC8357t11 interfaceC8357t11, C0537Ci1 c0537Ci1) {
        this.B = context;
        this.C = c0537Ci1;
        this.D = new C7431pi1(context, interfaceC8357t11, this);
        this.F = new C0816Ey(this, aVar.k());
    }

    @Override // com.daaw.InterfaceC8732uN0
    public boolean a() {
        return false;
    }

    @Override // com.daaw.InterfaceC7152oi1
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1772Od0.c().a(J, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.C.x(str);
        }
    }

    @Override // com.daaw.InterfaceC8997vI
    public void c(String str, boolean z) {
        i(str);
    }

    @Override // com.daaw.InterfaceC8732uN0
    public void d(String str) {
        if (this.I == null) {
            g();
        }
        if (!this.I.booleanValue()) {
            AbstractC1772Od0.c().d(J, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        AbstractC1772Od0.c().a(J, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C0816Ey c0816Ey = this.F;
        if (c0816Ey != null) {
            c0816Ey.b(str);
        }
        this.C.x(str);
    }

    @Override // com.daaw.InterfaceC8732uN0
    public void e(C1793Oi1... c1793Oi1Arr) {
        if (this.I == null) {
            g();
        }
        if (!this.I.booleanValue()) {
            AbstractC1772Od0.c().d(J, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1793Oi1 c1793Oi1 : c1793Oi1Arr) {
            long jA = c1793Oi1.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c1793Oi1.b == EnumC9111vi1.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    C0816Ey c0816Ey = this.F;
                    if (c0816Ey != null) {
                        c0816Ey.a(c1793Oi1);
                    }
                } else if (c1793Oi1.b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && c1793Oi1.j.h()) {
                        AbstractC1772Od0.c().a(J, String.format("Ignoring WorkSpec %s, Requires device idle.", c1793Oi1), new Throwable[0]);
                    } else if (i < 24 || !c1793Oi1.j.e()) {
                        hashSet.add(c1793Oi1);
                        hashSet2.add(c1793Oi1.a);
                    } else {
                        AbstractC1772Od0.c().a(J, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c1793Oi1), new Throwable[0]);
                    }
                } else {
                    AbstractC1772Od0.c().a(J, String.format("Starting work for %s", c1793Oi1.a), new Throwable[0]);
                    this.C.u(c1793Oi1.a);
                }
            }
        }
        synchronized (this.H) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC1772Od0.c().a(J, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.E.addAll(hashSet);
                    this.D.d(this.E);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC7152oi1
    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1772Od0.c().a(J, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.C.u(str);
        }
    }

    public final void g() {
        this.I = Boolean.valueOf(AbstractC0821Ez0.b(this.B, this.C.i()));
    }

    public final void h() {
        if (this.G) {
            return;
        }
        this.C.m().d(this);
        this.G = true;
    }

    public final void i(String str) {
        synchronized (this.H) {
            try {
                Iterator it = this.E.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1793Oi1 c1793Oi1 = (C1793Oi1) it.next();
                    if (c1793Oi1.a.equals(str)) {
                        AbstractC1772Od0.c().a(J, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.E.remove(c1793Oi1);
                        this.D.d(this.E);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
