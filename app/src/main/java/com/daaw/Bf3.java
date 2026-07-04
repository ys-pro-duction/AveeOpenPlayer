package com.daaw;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Bf3 {
    public final C3519bk3 a;
    public final InterfaceC9935yf3 e;
    public final InterfaceC9661xg3 h;
    public final InterfaceC1834Os2 i;
    public boolean j;
    public InterfaceC3917d93 k;
    public C4957gr3 l = new C4957gr3(0);
    public final IdentityHashMap c = new IdentityHashMap();
    public final Map d = new HashMap();
    public final List b = new ArrayList();
    public final HashMap f = new HashMap();
    public final Set g = new HashSet();

    public Bf3(InterfaceC9935yf3 interfaceC9935yf3, InterfaceC9661xg3 interfaceC9661xg3, InterfaceC1834Os2 interfaceC1834Os2, C3519bk3 c3519bk3) {
        this.a = c3519bk3;
        this.e = interfaceC9935yf3;
        this.h = interfaceC9661xg3;
        this.i = interfaceC1834Os2;
    }

    public final int a() {
        return this.b.size();
    }

    public final AbstractC8657u52 b() {
        if (this.b.isEmpty()) {
            return AbstractC8657u52.a;
        }
        int iC = 0;
        for (int i = 0; i < this.b.size(); i++) {
            C9098vf3 c9098vf3 = (C9098vf3) this.b.get(i);
            c9098vf3.d = iC;
            iC += c9098vf3.a.H().c();
        }
        return new Qf3(this.b, this.l);
    }

    public final AbstractC8657u52 c(int i, int i2, List list) {
        AbstractC6048km2.d(i >= 0 && i <= i2 && i2 <= a());
        AbstractC6048km2.d(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C9098vf3) this.b.get(i3)).a.i((YL1) list.get(i3 - i));
        }
        return b();
    }

    public final /* synthetic */ void f(Xp3 xp3, AbstractC8657u52 abstractC8657u52) {
        this.e.zzh();
    }

    public final void g(InterfaceC3917d93 interfaceC3917d93) {
        AbstractC6048km2.f(!this.j);
        this.k = interfaceC3917d93;
        for (int i = 0; i < this.b.size(); i++) {
            C9098vf3 c9098vf3 = (C9098vf3) this.b.get(i);
            u(c9098vf3);
            this.g.add(c9098vf3);
        }
        this.j = true;
    }

    public final void h() {
        for (C8254sf3 c8254sf3 : this.f.values()) {
            try {
                c8254sf3.a.f(c8254sf3.b);
            } catch (RuntimeException e) {
                AbstractC3305ay2.d("MediaSourceList", "Failed to release child source.", e);
            }
            c8254sf3.a.e(c8254sf3.c);
            c8254sf3.a.j(c8254sf3.c);
        }
        this.f.clear();
        this.g.clear();
        this.j = false;
    }

    public final void i(Tp3 tp3) {
        C9098vf3 c9098vf3 = (C9098vf3) this.c.remove(tp3);
        c9098vf3.getClass();
        c9098vf3.a.a(tp3);
        c9098vf3.c.remove(((Np3) tp3).B);
        if (!this.c.isEmpty()) {
            s();
        }
        t(c9098vf3);
    }

    public final boolean j() {
        return this.j;
    }

    public final AbstractC8657u52 k(int i, List list, C4957gr3 c4957gr3) {
        if (!list.isEmpty()) {
            this.l = c4957gr3;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C9098vf3 c9098vf3 = (C9098vf3) list.get(i2 - i);
                if (i2 > 0) {
                    C9098vf3 c9098vf32 = (C9098vf3) this.b.get(i2 - 1);
                    c9098vf3.a(c9098vf32.d + c9098vf32.a.H().c());
                } else {
                    c9098vf3.a(0);
                }
                q(i2, c9098vf3.a.H().c());
                this.b.add(i2, c9098vf3);
                this.d.put(c9098vf3.b, c9098vf3);
                if (this.j) {
                    u(c9098vf3);
                    if (this.c.isEmpty()) {
                        this.g.add(c9098vf3);
                    } else {
                        r(c9098vf3);
                    }
                }
            }
        }
        return b();
    }

    public final AbstractC8657u52 l(int i, int i2, C4957gr3 c4957gr3) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= a()) {
            z = true;
        }
        AbstractC6048km2.d(z);
        this.l = c4957gr3;
        v(i, i2);
        return b();
    }

    public final AbstractC8657u52 m(List list, C4957gr3 c4957gr3) {
        v(0, this.b.size());
        return k(this.b.size(), list, c4957gr3);
    }

    public final AbstractC8657u52 n(C4957gr3 c4957gr3) {
        int iA = a();
        if (c4957gr3.c() != iA) {
            c4957gr3 = c4957gr3.f().g(0, iA);
        }
        this.l = c4957gr3;
        return b();
    }

    public final Tp3 o(Vp3 vp3, Ls3 ls3, long j) {
        int i = Qf3.o;
        Object obj = vp3.a;
        Object obj2 = ((Pair) obj).first;
        Vp3 vp3A = vp3.a(((Pair) obj).second);
        C9098vf3 c9098vf3 = (C9098vf3) this.d.get(obj2);
        c9098vf3.getClass();
        this.g.add(c9098vf3);
        C8254sf3 c8254sf3 = (C8254sf3) this.f.get(c9098vf3);
        if (c8254sf3 != null) {
            c8254sf3.a.l(c8254sf3.b);
        }
        c9098vf3.c.add(vp3A);
        Np3 np3I = c9098vf3.a.h(vp3A, ls3, j);
        this.c.put(np3I, c9098vf3);
        s();
        return np3I;
    }

    public final C4957gr3 p() {
        return this.l;
    }

    public final void q(int i, int i2) {
        while (i < this.b.size()) {
            ((C9098vf3) this.b.get(i)).d += i2;
            i++;
        }
    }

    public final void r(C9098vf3 c9098vf3) {
        C8254sf3 c8254sf3 = (C8254sf3) this.f.get(c9098vf3);
        if (c8254sf3 != null) {
            c8254sf3.a.c(c8254sf3.b);
        }
    }

    public final void s() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            C9098vf3 c9098vf3 = (C9098vf3) it.next();
            if (c9098vf3.c.isEmpty()) {
                r(c9098vf3);
                it.remove();
            }
        }
    }

    public final void t(C9098vf3 c9098vf3) {
        if (c9098vf3.e && c9098vf3.c.isEmpty()) {
            C8254sf3 c8254sf3 = (C8254sf3) this.f.remove(c9098vf3);
            c8254sf3.getClass();
            c8254sf3.a.f(c8254sf3.b);
            c8254sf3.a.e(c8254sf3.c);
            c8254sf3.a.j(c8254sf3.c);
            this.g.remove(c9098vf3);
        }
    }

    public final void u(C9098vf3 c9098vf3) {
        Qp3 qp3 = c9098vf3.a;
        Wp3 wp3 = new Wp3() { // from class: com.daaw.Qe3
            @Override // com.daaw.Wp3
            public final void a(Xp3 xp3, AbstractC8657u52 abstractC8657u52) {
                this.a.f(xp3, abstractC8657u52);
            }
        };
        C7418pf3 c7418pf3 = new C7418pf3(this, c9098vf3);
        this.f.put(c9098vf3, new C8254sf3(qp3, wp3, c7418pf3));
        qp3.d(new Handler(AbstractC9004vJ2.I(), null), c7418pf3);
        qp3.n(new Handler(AbstractC9004vJ2.I(), null), c7418pf3);
        qp3.m(wp3, this.k, this.a);
    }

    public final void v(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            C9098vf3 c9098vf3 = (C9098vf3) this.b.remove(i2);
            this.d.remove(c9098vf3.b);
            q(i2, -c9098vf3.a.H().c());
            c9098vf3.e = true;
            if (this.j) {
                t(c9098vf3);
            }
        }
    }
}
