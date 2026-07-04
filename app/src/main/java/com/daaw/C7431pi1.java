package com.daaw;

import android.content.Context;
import com.daaw.AbstractC4385er;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7431pi1 implements AbstractC4385er.a {
    public static final String d = AbstractC1772Od0.f("WorkConstraintsTracker");
    public final InterfaceC7152oi1 a;
    public final AbstractC4385er[] b;
    public final Object c;

    public C7431pi1(Context context, InterfaceC8357t11 interfaceC8357t11, InterfaceC7152oi1 interfaceC7152oi1) {
        Context applicationContext = context.getApplicationContext();
        this.a = interfaceC7152oi1;
        this.b = new AbstractC4385er[]{new C2527Ve(applicationContext, interfaceC8357t11), new C2735Xe(applicationContext, interfaceC8357t11), new BX0(applicationContext, interfaceC8357t11), new C10251zn0(applicationContext, interfaceC8357t11), new C1293Jn0(applicationContext, interfaceC8357t11), new C0669Dn0(applicationContext, interfaceC8357t11), new C0556Cn0(applicationContext, interfaceC8357t11)};
        this.c = new Object();
    }

    @Override // com.daaw.AbstractC4385er.a
    public void a(List list) {
        synchronized (this.c) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c(str)) {
                        AbstractC1772Od0.c().a(d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                InterfaceC7152oi1 interfaceC7152oi1 = this.a;
                if (interfaceC7152oi1 != null) {
                    interfaceC7152oi1.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.AbstractC4385er.a
    public void b(List list) {
        synchronized (this.c) {
            try {
                InterfaceC7152oi1 interfaceC7152oi1 = this.a;
                if (interfaceC7152oi1 != null) {
                    interfaceC7152oi1.b(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.c) {
            try {
                for (AbstractC4385er abstractC4385er : this.b) {
                    if (abstractC4385er.d(str)) {
                        AbstractC1772Od0.c().a(d, String.format("Work %s constrained by %s", str, abstractC4385er.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Iterable iterable) {
        synchronized (this.c) {
            try {
                for (AbstractC4385er abstractC4385er : this.b) {
                    abstractC4385er.g(null);
                }
                for (AbstractC4385er abstractC4385er2 : this.b) {
                    abstractC4385er2.e(iterable);
                }
                for (AbstractC4385er abstractC4385er3 : this.b) {
                    abstractC4385er3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.c) {
            try {
                for (AbstractC4385er abstractC4385er : this.b) {
                    abstractC4385er.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
