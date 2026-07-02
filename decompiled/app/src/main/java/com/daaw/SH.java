package com.daaw;

import com.daaw.ZZ0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class SH implements ZZ0.c {
    public final ZZ0 a;
    public final Set c = new HashSet();
    public EnumC1409Kq0 d = EnumC1409Kq0.UNKNOWN;
    public final Map b = new HashMap();

    public static class a {
        public boolean a;
        public boolean b;
        public boolean c;
    }

    public static class b {
        public final List a = new ArrayList();
        public C1881Pe1 b;
        public int c;
    }

    public SH(ZZ0 zz0) {
        this.a = zz0;
        zz0.u(this);
    }

    @Override // com.daaw.ZZ0.c
    public void a(EnumC1409Kq0 enumC1409Kq0) {
        this.d = enumC1409Kq0;
        Iterator it = this.b.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator it2 = ((b) it.next()).a.iterator();
            while (it2.hasNext()) {
                if (((C6736nC0) it2.next()).c(enumC1409Kq0)) {
                    z = true;
                }
            }
        }
        if (z) {
            e();
        }
    }

    @Override // com.daaw.ZZ0.c
    public void b(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C1881Pe1 c1881Pe1 = (C1881Pe1) it.next();
            b bVar = (b) this.b.get(c1881Pe1.h());
            if (bVar != null) {
                Iterator it2 = bVar.a.iterator();
                while (it2.hasNext()) {
                    if (((C6736nC0) it2.next()).d(c1881Pe1)) {
                        z = true;
                    }
                }
                bVar.b = c1881Pe1;
            }
        }
        if (z) {
            e();
        }
    }

    @Override // com.daaw.ZZ0.c
    public void c(C5890kC0 c5890kC0, C6262lX0 c6262lX0) {
        b bVar = (b) this.b.get(c5890kC0);
        if (bVar != null) {
            Iterator it = bVar.a.iterator();
            while (it.hasNext()) {
                ((C6736nC0) it.next()).b(AbstractC6838nb1.s(c6262lX0));
            }
        }
        this.b.remove(c5890kC0);
    }

    public int d(C6736nC0 c6736nC0) {
        C5890kC0 c5890kC0A = c6736nC0.a();
        b bVar = (b) this.b.get(c5890kC0A);
        boolean z = bVar == null;
        if (z) {
            bVar = new b();
            this.b.put(c5890kC0A, bVar);
        }
        bVar.a.add(c6736nC0);
        AbstractC6557mb.d(true ^ c6736nC0.c(this.d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (bVar.b != null && c6736nC0.d(bVar.b)) {
            e();
        }
        if (z) {
            bVar.c = this.a.n(c5890kC0A);
        }
        return bVar.c;
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((LH) it.next()).a(null, null);
        }
    }

    public void f(C6736nC0 c6736nC0) {
        boolean zIsEmpty;
        C5890kC0 c5890kC0A = c6736nC0.a();
        b bVar = (b) this.b.get(c5890kC0A);
        if (bVar != null) {
            bVar.a.remove(c6736nC0);
            zIsEmpty = bVar.a.isEmpty();
        } else {
            zIsEmpty = false;
        }
        if (zIsEmpty) {
            this.b.remove(c5890kC0A);
            this.a.v(c5890kC0A);
        }
    }
}
