package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ns2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1730Ns2 {
    public final XS2 c;
    public Object f;
    public final String h;
    public final int i;
    public final C5245ht2 j;
    public C4498fF2 k;
    public final Map a = new HashMap();
    public final List b = new ArrayList();
    public final List d = new ArrayList();
    public final Set e = new HashSet();
    public int g = Integer.MAX_VALUE;

    public C1730Ns2(C9267wF2 c9267wF2, C5245ht2 c5245ht2, XS2 xs2) {
        this.i = c9267wF2.b.b.p;
        this.j = c5245ht2;
        this.c = xs2;
        this.h = C6929nt2.c(c9267wF2);
        List list = c9267wF2.b.a;
        for (int i = 0; i < list.size(); i++) {
            this.a.put((C4498fF2) list.get(i), Integer.valueOf(i));
        }
        this.b.addAll(list);
    }

    public final synchronized C4498fF2 a() {
        for (int i = 0; i < this.b.size(); i++) {
            try {
                C4498fF2 c4498fF2 = (C4498fF2) this.b.get(i);
                String str = c4498fF2.u0;
                if (!this.e.contains(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        this.e.add(str);
                    }
                    this.d.add(c4498fF2);
                    return (C4498fF2) this.b.remove(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public final synchronized void b(Throwable th, C4498fF2 c4498fF2) {
        this.d.remove(c4498fF2);
        this.e.remove(c4498fF2.u0);
        if (d() || i()) {
            return;
        }
        f();
    }

    public final synchronized void c(Object obj, C4498fF2 c4498fF2) {
        try {
            this.d.remove(c4498fF2);
            if (d()) {
                return;
            }
            Integer num = (Integer) this.a.get(c4498fF2);
            int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            if (iIntValue > this.g) {
                this.j.m(c4498fF2);
                return;
            }
            if (this.f != null) {
                this.j.m(this.k);
            }
            this.g = iIntValue;
            this.f = obj;
            this.k = c4498fF2;
            if (i()) {
                return;
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d() {
        return this.c.isDone();
    }

    public final synchronized boolean e() {
        if (!d()) {
            List list = this.d;
            if (list.size() < this.i) {
                if (g(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized void f() {
        this.j.i(this.k);
        Object obj = this.f;
        if (obj != null) {
            this.c.e(obj);
        } else {
            this.c.f(new C6092kt2(3, this.h));
        }
    }

    public final synchronized boolean g(boolean z) {
        try {
            for (C4498fF2 c4498fF2 : this.b) {
                Integer num = (Integer) this.a.get(c4498fF2);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z || !this.e.contains(c4498fF2.u0)) {
                    int i = this.g;
                    if (iIntValue < i) {
                        return true;
                    }
                    if (iIntValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h() {
        try {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.a.get((C4498fF2) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i() {
        if (!g(true)) {
            if (!h()) {
                return false;
            }
        }
        return true;
    }
}
