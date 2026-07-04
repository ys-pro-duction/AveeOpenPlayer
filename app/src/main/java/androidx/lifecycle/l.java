package androidx.lifecycle;

import androidx.lifecycle.g;
import com.daaw.AbstractC1972Qb0;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC7095oW0;
import com.daaw.C2202Sb0;
import com.daaw.FM0;
import com.daaw.G10;
import com.daaw.InterfaceC1660Nb0;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.InterfaceC8286sm0;
import com.daaw.SJ;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l extends g {
    public static final a k = new a(null);
    public final boolean b;
    public SJ c;
    public g.b d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public ArrayList i;
    public final InterfaceC8286sm0 j;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final g.b a(g.b bVar, g.b bVar2) {
            G10.g(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        public a() {
        }
    }

    public static final class b {
        public g.b a;
        public j b;

        public b(InterfaceC1660Nb0 interfaceC1660Nb0, g.b bVar) {
            G10.g(bVar, "initialState");
            G10.d(interfaceC1660Nb0);
            this.b = C2202Sb0.f(interfaceC1660Nb0);
            this.a = bVar;
        }

        public final void a(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
            G10.g(aVar, "event");
            g.b bVarC = aVar.c();
            this.a = l.k.a(this.a, bVarC);
            j jVar = this.b;
            G10.d(interfaceC1764Ob0);
            jVar.c(interfaceC1764Ob0, aVar);
            this.a = bVarC;
        }

        public final g.b b() {
            return this.a;
        }
    }

    public l(InterfaceC1764Ob0 interfaceC1764Ob0, boolean z) {
        this.b = z;
        this.c = new SJ();
        g.b bVar = g.b.INITIALIZED;
        this.d = bVar;
        this.i = new ArrayList();
        this.e = new WeakReference(interfaceC1764Ob0);
        this.j = AbstractC7095oW0.a(bVar);
    }

    @Override // androidx.lifecycle.g
    public void a(InterfaceC1660Nb0 interfaceC1660Nb0) {
        InterfaceC1764Ob0 interfaceC1764Ob0;
        G10.g(interfaceC1660Nb0, "observer");
        g("addObserver");
        g.b bVar = this.d;
        g.b bVar2 = g.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = g.b.INITIALIZED;
        }
        b bVar3 = new b(interfaceC1660Nb0, bVar2);
        if (((b) this.c.v(interfaceC1660Nb0, bVar3)) == null && (interfaceC1764Ob0 = (InterfaceC1764Ob0) this.e.get()) != null) {
            boolean z = this.f != 0 || this.g;
            g.b bVarF = f(interfaceC1660Nb0);
            this.f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.c.contains(interfaceC1660Nb0)) {
                m(bVar3.b());
                g.a aVarB = g.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC1764Ob0, aVarB);
                l();
                bVarF = f(interfaceC1660Nb0);
            }
            if (!z) {
                o();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.g
    public g.b b() {
        return this.d;
    }

    @Override // androidx.lifecycle.g
    public void d(InterfaceC1660Nb0 interfaceC1660Nb0) {
        G10.g(interfaceC1660Nb0, "observer");
        g("removeObserver");
        this.c.w(interfaceC1660Nb0);
    }

    public final void e(InterfaceC1764Ob0 interfaceC1764Ob0) {
        Iterator itDescendingIterator = this.c.descendingIterator();
        G10.f(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            G10.f(entry, "next()");
            InterfaceC1660Nb0 interfaceC1660Nb0 = (InterfaceC1660Nb0) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.d) > 0 && !this.h && this.c.contains(interfaceC1660Nb0)) {
                g.a aVarA = g.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(aVarA.c());
                bVar.a(interfaceC1764Ob0, aVarA);
                l();
            }
        }
    }

    public final g.b f(InterfaceC1660Nb0 interfaceC1660Nb0) {
        b bVar;
        Map.Entry entryY = this.c.y(interfaceC1660Nb0);
        g.b bVar2 = null;
        g.b bVarB = (entryY == null || (bVar = (b) entryY.getValue()) == null) ? null : bVar.b();
        if (!this.i.isEmpty()) {
            bVar2 = (g.b) this.i.get(r0.size() - 1);
        }
        a aVar = k;
        return aVar.a(aVar.a(this.d, bVarB), bVar2);
    }

    public final void g(String str) {
        if (!this.b || AbstractC1972Qb0.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void h(InterfaceC1764Ob0 interfaceC1764Ob0) {
        FM0.d dVarP = this.c.p();
        G10.f(dVarP, "observerMap.iteratorWithAdditions()");
        while (dVarP.hasNext() && !this.h) {
            Map.Entry entry = (Map.Entry) dVarP.next();
            InterfaceC1660Nb0 interfaceC1660Nb0 = (InterfaceC1660Nb0) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.d) < 0 && !this.h && this.c.contains(interfaceC1660Nb0)) {
                m(bVar.b());
                g.a aVarB = g.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC1764Ob0, aVarB);
                l();
            }
        }
    }

    public void i(g.a aVar) {
        G10.g(aVar, "event");
        g("handleLifecycleEvent");
        k(aVar.c());
    }

    public final boolean j() {
        if (this.c.size() == 0) {
            return true;
        }
        Map.Entry entryE = this.c.e();
        G10.d(entryE);
        g.b bVarB = ((b) entryE.getValue()).b();
        Map.Entry entryQ = this.c.q();
        G10.d(entryQ);
        g.b bVarB2 = ((b) entryQ.getValue()).b();
        return bVarB == bVarB2 && this.d == bVarB2;
    }

    public final void k(g.b bVar) {
        g.b bVar2 = this.d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == g.b.INITIALIZED && bVar == g.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = bVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        o();
        this.g = false;
        if (this.d == g.b.DESTROYED) {
            this.c = new SJ();
        }
    }

    public final void l() {
        this.i.remove(r0.size() - 1);
    }

    public final void m(g.b bVar) {
        this.i.add(bVar);
    }

    public void n(g.b bVar) {
        G10.g(bVar, "state");
        g("setCurrentState");
        k(bVar);
    }

    public final void o() {
        InterfaceC1764Ob0 interfaceC1764Ob0 = (InterfaceC1764Ob0) this.e.get();
        if (interfaceC1764Ob0 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.h = false;
            g.b bVar = this.d;
            Map.Entry entryE = this.c.e();
            G10.d(entryE);
            if (bVar.compareTo(((b) entryE.getValue()).b()) < 0) {
                e(interfaceC1764Ob0);
            }
            Map.Entry entryQ = this.c.q();
            if (!this.h && entryQ != null && this.d.compareTo(((b) entryQ.getValue()).b()) > 0) {
                h(interfaceC1764Ob0);
            }
        }
        this.h = false;
        this.j.setValue(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC1764Ob0 interfaceC1764Ob0) {
        this(interfaceC1764Ob0, true);
        G10.g(interfaceC1764Ob0, "provider");
    }
}
