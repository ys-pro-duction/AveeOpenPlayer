package com.daaw;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.y;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.aQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3146aQ extends AbstractC8526te1 {
    public static final y.c i = new a();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    /* JADX INFO: renamed from: com.daaw.aQ$a */
    public class a implements y.c {
        @Override // androidx.lifecycle.y.c
        public AbstractC8526te1 a(Class cls) {
            return new C3146aQ(true);
        }

        @Override // androidx.lifecycle.y.c
        public /* synthetic */ AbstractC8526te1 b(J50 j50, AbstractC5247hu abstractC5247hu) {
            return AbstractC9091ve1.a(this, j50, abstractC5247hu);
        }

        @Override // androidx.lifecycle.y.c
        public /* synthetic */ AbstractC8526te1 c(Class cls, AbstractC5247hu abstractC5247hu) {
            return AbstractC9091ve1.c(this, cls, abstractC5247hu);
        }
    }

    public C3146aQ(boolean z) {
        this.e = z;
    }

    public static C3146aQ k(C0313Ae1 c0313Ae1) {
        return (C3146aQ) new androidx.lifecycle.y(c0313Ae1, i).b(C3146aQ.class);
    }

    @Override // com.daaw.AbstractC8526te1
    public void d() {
        if (FragmentManager.J0(3)) {
            toString();
        }
        this.f = true;
    }

    public void e(androidx.fragment.app.c cVar) {
        if (this.h) {
            FragmentManager.J0(2);
        } else {
            if (this.b.containsKey(cVar.G)) {
                return;
            }
            this.b.put(cVar.G, cVar);
            if (FragmentManager.J0(2)) {
                cVar.toString();
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3146aQ.class == obj.getClass()) {
            C3146aQ c3146aQ = (C3146aQ) obj;
            if (this.b.equals(c3146aQ.b) && this.c.equals(c3146aQ.c) && this.d.equals(c3146aQ.d)) {
                return true;
            }
        }
        return false;
    }

    public void f(androidx.fragment.app.c cVar, boolean z) {
        if (FragmentManager.J0(3)) {
            Objects.toString(cVar);
        }
        h(cVar.G, z);
    }

    public void g(String str, boolean z) {
        FragmentManager.J0(3);
        h(str, z);
    }

    public final void h(String str, boolean z) {
        C3146aQ c3146aQ = (C3146aQ) this.c.get(str);
        if (c3146aQ != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c3146aQ.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c3146aQ.g((String) it.next(), true);
                }
            }
            c3146aQ.d();
            this.c.remove(str);
        }
        C0313Ae1 c0313Ae1 = (C0313Ae1) this.d.get(str);
        if (c0313Ae1 != null) {
            c0313Ae1.a();
            this.d.remove(str);
        }
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public androidx.fragment.app.c i(String str) {
        return (androidx.fragment.app.c) this.b.get(str);
    }

    public C3146aQ j(androidx.fragment.app.c cVar) {
        C3146aQ c3146aQ = (C3146aQ) this.c.get(cVar.G);
        if (c3146aQ != null) {
            return c3146aQ;
        }
        C3146aQ c3146aQ2 = new C3146aQ(this.e);
        this.c.put(cVar.G, c3146aQ2);
        return c3146aQ2;
    }

    public Collection l() {
        return new ArrayList(this.b.values());
    }

    public C0313Ae1 m(androidx.fragment.app.c cVar) {
        C0313Ae1 c0313Ae1 = (C0313Ae1) this.d.get(cVar.G);
        if (c0313Ae1 != null) {
            return c0313Ae1;
        }
        C0313Ae1 c0313Ae12 = new C0313Ae1();
        this.d.put(cVar.G, c0313Ae12);
        return c0313Ae12;
    }

    public boolean n() {
        return this.f;
    }

    public void o(androidx.fragment.app.c cVar) {
        if (this.h) {
            FragmentManager.J0(2);
        } else {
            if (this.b.remove(cVar.G) == null || !FragmentManager.J0(2)) {
                return;
            }
            cVar.toString();
        }
    }

    public void p(boolean z) {
        this.h = z;
    }

    public boolean q(androidx.fragment.app.c cVar) {
        if (this.b.containsKey(cVar.G)) {
            return this.e ? this.f : !this.g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
