package com.daaw;

import com.daaw.AbstractC3999dU0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.qm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7729qm0 extends AbstractC3720cU0 {
    public final NQ g;
    public final NQ h;
    public Set i;
    public C4566fU0 j;
    public int[] k;
    public int l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7729qm0(int i, C4566fU0 c4566fU0, NQ nq, NQ nq2) {
        super(i, c4566fU0, null);
        G10.g(c4566fU0, "invalid");
        this.g = nq;
        this.h = nq2;
        this.j = C4566fU0.F.a();
        this.k = new int[0];
        this.l = 1;
    }

    public AbstractC3999dU0 A() {
        Map mapK;
        C0576Cs0 c0576Cs0A;
        Set setC = C();
        if (setC != null) {
            Object obj = AbstractC5124hU0.i.get();
            G10.f(obj, "currentGlobalSnapshot.get()");
            mapK = AbstractC5124hU0.K((C7729qm0) obj, this, AbstractC5124hU0.d.y(((C7082oT) AbstractC5124hU0.i.get()).f()));
        } else {
            mapK = null;
        }
        synchronized (AbstractC5124hU0.C()) {
            try {
                AbstractC5124hU0.Y(this);
                if (setC == null || setC.size() == 0) {
                    c();
                    C7082oT c7082oT = (C7082oT) AbstractC5124hU0.i.get();
                    G10.f(c7082oT, "previousGlobalSnapshot");
                    AbstractC5124hU0.S(c7082oT, AbstractC5124hU0.a);
                    Set setC2 = c7082oT.C();
                    c0576Cs0A = (setC2 == null || setC2.isEmpty()) ? D61.a(AbstractC1599Mm.k(), null) : D61.a(AbstractC2455Um.O0(AbstractC5124hU0.g), setC2);
                } else {
                    C7082oT c7082oT2 = (C7082oT) AbstractC5124hU0.i.get();
                    AbstractC3999dU0 abstractC3999dU0F = F(AbstractC5124hU0.e, mapK, AbstractC5124hU0.d.y(c7082oT2.f()));
                    if (!G10.c(abstractC3999dU0F, AbstractC3999dU0.b.a)) {
                        return abstractC3999dU0F;
                    }
                    c();
                    G10.f(c7082oT2, "previousGlobalSnapshot");
                    AbstractC5124hU0.S(c7082oT2, AbstractC5124hU0.a);
                    Set setC3 = c7082oT2.C();
                    M(null);
                    c7082oT2.M(null);
                    c0576Cs0A = D61.a(AbstractC2455Um.O0(AbstractC5124hU0.g), setC3);
                }
                List list = (List) c0576Cs0A.a();
                Set set = (Set) c0576Cs0A.b();
                this.m = true;
                if (set != null && !set.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((InterfaceC3429bR) list.get(i)).invoke(set, this);
                    }
                }
                if (setC != null && !setC.isEmpty()) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC3429bR) list.get(i2)).invoke(setC, this);
                    }
                }
                synchronized (AbstractC5124hU0.C()) {
                    q();
                    G91 g91 = G91.a;
                }
                return AbstractC3999dU0.b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean B() {
        return this.m;
    }

    public Set C() {
        return this.i;
    }

    public final C4566fU0 D() {
        return this.j;
    }

    public final int[] E() {
        return this.k;
    }

    public final AbstractC3999dU0 F(int i, Map map, C4566fU0 c4566fU0) {
        AW0 aw0N;
        AW0 aw0M;
        G10.g(c4566fU0, "invalidSnapshots");
        C4566fU0 c4566fU0F = g().G(f()).F(this.j);
        Set<InterfaceC10170zW0> setC = C();
        G10.d(setC);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (InterfaceC10170zW0 interfaceC10170zW0 : setC) {
            AW0 aw0E = interfaceC10170zW0.e();
            AW0 aw0N2 = AbstractC5124hU0.N(aw0E, i, c4566fU0);
            if (aw0N2 != null && (aw0N = AbstractC5124hU0.N(aw0E, f(), c4566fU0F)) != null && !G10.c(aw0N2, aw0N)) {
                AW0 aw0N3 = AbstractC5124hU0.N(aw0E, f(), g());
                if (aw0N3 == null) {
                    AbstractC5124hU0.M();
                    throw new D80();
                }
                if (map == null || (aw0M = (AW0) map.get(aw0N2)) == null) {
                    aw0M = interfaceC10170zW0.m(aw0N, aw0N2, aw0N3);
                }
                if (aw0M == null) {
                    return new AbstractC3999dU0.a(this);
                }
                if (!G10.c(aw0M, aw0N3)) {
                    if (G10.c(aw0M, aw0N2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(D61.a(interfaceC10170zW0, aw0N2.b()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(interfaceC10170zW0);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!G10.c(aw0M, aw0N) ? D61.a(interfaceC10170zW0, aw0M) : D61.a(interfaceC10170zW0, aw0N.b()));
                    }
                }
            }
        }
        if (arrayList != null) {
            z();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0576Cs0 c0576Cs0 = (C0576Cs0) arrayList.get(i2);
                InterfaceC10170zW0 interfaceC10170zW02 = (InterfaceC10170zW0) c0576Cs0.a();
                AW0 aw0 = (AW0) c0576Cs0.b();
                aw0.f(f());
                synchronized (AbstractC5124hU0.C()) {
                    aw0.e(interfaceC10170zW02.e());
                    interfaceC10170zW02.p(aw0);
                    G91 g91 = G91.a;
                }
            }
        }
        if (arrayList2 != null) {
            setC.removeAll(arrayList2);
        }
        return AbstractC3999dU0.b.a;
    }

    public final void G(int i) {
        synchronized (AbstractC5124hU0.C()) {
            this.j = this.j.G(i);
            G91 g91 = G91.a;
        }
    }

    public final void H(C4566fU0 c4566fU0) {
        G10.g(c4566fU0, "snapshots");
        synchronized (AbstractC5124hU0.C()) {
            this.j = this.j.F(c4566fU0);
            G91 g91 = G91.a;
        }
    }

    public final void I(int i) {
        if (i >= 0) {
            this.k = AbstractC5152hb.s(this.k, i);
        }
    }

    public final void J(int[] iArr) {
        G10.g(iArr, "handles");
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.k;
        if (iArr2.length == 0) {
            this.k = iArr;
        } else {
            this.k = AbstractC5152hb.t(iArr2, iArr);
        }
    }

    public final void K() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            AbstractC5124hU0.Q(this.k[i]);
        }
    }

    public final void L(boolean z) {
        this.m = z;
    }

    public void M(Set set) {
        this.i = set;
    }

    public C7729qm0 N(NQ nq, NQ nq2) throws Throwable {
        x();
        P();
        G(f());
        synchronized (AbstractC5124hU0.C()) {
            try {
                int i = AbstractC5124hU0.e;
                AbstractC5124hU0.e = i + 1;
                AbstractC5124hU0.d = AbstractC5124hU0.d.G(i);
                C4566fU0 c4566fU0G = g();
                u(c4566fU0G.G(i));
                try {
                    C8012rn0 c8012rn0 = new C8012rn0(i, AbstractC5124hU0.v(c4566fU0G, f() + 1, i), AbstractC5124hU0.F(nq, h(), false, 4, null), AbstractC5124hU0.G(nq2, j()), this);
                    if (B() || e()) {
                        return c8012rn0;
                    }
                    int iF = f();
                    synchronized (AbstractC5124hU0.C()) {
                        int i2 = AbstractC5124hU0.e;
                        AbstractC5124hU0.e = i2 + 1;
                        t(i2);
                        AbstractC5124hU0.d = AbstractC5124hU0.d.G(f());
                        G91 g91 = G91.a;
                    }
                    u(AbstractC5124hU0.v(g(), iF + 1, f()));
                    return c8012rn0;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void O() {
        if (this.m) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    public final void P() {
        if (this.m && this.d < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
    }

    @Override // com.daaw.AbstractC3720cU0
    public void c() {
        AbstractC5124hU0.d = AbstractC5124hU0.d.y(f()).w(this.j);
    }

    @Override // com.daaw.AbstractC3720cU0
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        m(this);
    }

    @Override // com.daaw.AbstractC3720cU0
    public NQ h() {
        return this.g;
    }

    @Override // com.daaw.AbstractC3720cU0
    public boolean i() {
        return false;
    }

    @Override // com.daaw.AbstractC3720cU0
    public NQ j() {
        return this.h;
    }

    @Override // com.daaw.AbstractC3720cU0
    public void l(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        this.l++;
    }

    @Override // com.daaw.AbstractC3720cU0
    public void m(AbstractC3720cU0 abstractC3720cU0) {
        G10.g(abstractC3720cU0, "snapshot");
        int i = this.l;
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = i - 1;
        this.l = i2;
        if (i2 != 0 || this.m) {
            return;
        }
        y();
    }

    @Override // com.daaw.AbstractC3720cU0
    public void n() {
        if (this.m || e()) {
            return;
        }
        z();
    }

    @Override // com.daaw.AbstractC3720cU0
    public void o(InterfaceC10170zW0 interfaceC10170zW0) {
        G10.g(interfaceC10170zW0, "state");
        Set setC = C();
        if (setC == null) {
            setC = new HashSet();
            M(setC);
        }
        setC.add(interfaceC10170zW0);
    }

    @Override // com.daaw.AbstractC3720cU0
    public void q() {
        K();
        super.q();
    }

    @Override // com.daaw.AbstractC3720cU0
    public AbstractC3720cU0 v(NQ nq) {
        C8291sn0 c8291sn0;
        x();
        P();
        int iF = f();
        G(f());
        synchronized (AbstractC5124hU0.C()) {
            int i = AbstractC5124hU0.e;
            AbstractC5124hU0.e = i + 1;
            AbstractC5124hU0.d = AbstractC5124hU0.d.G(i);
            c8291sn0 = new C8291sn0(i, AbstractC5124hU0.v(g(), iF + 1, i), nq, this);
        }
        if (B() || e()) {
            return c8291sn0;
        }
        int iF2 = f();
        synchronized (AbstractC5124hU0.C()) {
            int i2 = AbstractC5124hU0.e;
            AbstractC5124hU0.e = i2 + 1;
            t(i2);
            AbstractC5124hU0.d = AbstractC5124hU0.d.G(f());
            G91 g91 = G91.a;
        }
        u(AbstractC5124hU0.v(g(), iF2 + 1, f()));
        return c8291sn0;
    }

    public final void y() {
        Set setC = C();
        if (setC != null) {
            O();
            M(null);
            int iF = f();
            Iterator it = setC.iterator();
            while (it.hasNext()) {
                for (AW0 aw0E = ((InterfaceC10170zW0) it.next()).e(); aw0E != null; aw0E = aw0E.c()) {
                    if (aw0E.d() == iF || AbstractC2455Um.W(this.j, Integer.valueOf(aw0E.d()))) {
                        aw0E.f(0);
                    }
                }
            }
        }
        b();
    }

    public final void z() {
        G(f());
        G91 g91 = G91.a;
        if (B() || e()) {
            return;
        }
        int iF = f();
        synchronized (AbstractC5124hU0.C()) {
            int i = AbstractC5124hU0.e;
            AbstractC5124hU0.e = i + 1;
            t(i);
            AbstractC5124hU0.d = AbstractC5124hU0.d.G(f());
        }
        u(AbstractC5124hU0.v(g(), iF + 1, f()));
    }
}
