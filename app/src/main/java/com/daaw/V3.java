package com.daaw;

import android.view.Surface;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC4166e4;
import com.daaw.InterfaceC5446ie;
import com.daaw.InterfaceC9736xw0;
import com.daaw.L31;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public class V3 implements InterfaceC9736xw0.a, InterfaceC5198hk0, InterfaceC2931Zb, InterfaceC1358Kd1, InterfaceC1896Pi0, InterfaceC5446ie.a {
    public final InterfaceC5207hm C;
    public InterfaceC9736xw0 F;
    public final CopyOnWriteArraySet B = new CopyOnWriteArraySet();
    public final b E = new b();
    public final L31.c D = new L31.c();

    public static class a {
        public V3 a(InterfaceC9736xw0 interfaceC9736xw0, InterfaceC5207hm interfaceC5207hm) {
            return new V3(interfaceC9736xw0, interfaceC5207hm);
        }
    }

    public static final class b {
        public c c;
        public c d;
        public boolean f;
        public final ArrayList a = new ArrayList();
        public final L31.b b = new L31.b();
        public L31 e = L31.a;

        public c b() {
            return this.c;
        }

        public c c() {
            if (this.a.isEmpty()) {
                return null;
            }
            return (c) this.a.get(r0.size() - 1);
        }

        public c d() {
            if (this.a.isEmpty() || this.e.o() || this.f) {
                return null;
            }
            return (c) this.a.get(0);
        }

        public c e() {
            return this.d;
        }

        public boolean f() {
            return this.f;
        }

        public void g(int i, InterfaceC1792Oi0.a aVar) {
            this.a.add(new c(i, aVar));
            if (this.a.size() != 1 || this.e.o()) {
                return;
            }
            o();
        }

        public void h(int i, InterfaceC1792Oi0.a aVar) {
            c cVar = new c(i, aVar);
            this.a.remove(cVar);
            if (cVar.equals(this.d)) {
                this.d = this.a.isEmpty() ? null : (c) this.a.get(0);
            }
        }

        public void i(int i) {
            o();
        }

        public void j(int i, InterfaceC1792Oi0.a aVar) {
            this.d = new c(i, aVar);
        }

        public void k() {
            this.f = false;
            o();
        }

        public void l() {
            this.f = true;
        }

        public void m(L31 l31) {
            for (int i = 0; i < this.a.size(); i++) {
                ArrayList arrayList = this.a;
                arrayList.set(i, p((c) arrayList.get(i), l31));
            }
            c cVar = this.d;
            if (cVar != null) {
                this.d = p(cVar, l31);
            }
            this.e = l31;
            o();
        }

        public InterfaceC1792Oi0.a n(int i) {
            L31 l31 = this.e;
            if (l31 == null) {
                return null;
            }
            int iH = l31.h();
            InterfaceC1792Oi0.a aVar = null;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                c cVar = (c) this.a.get(i2);
                int i3 = cVar.b.a;
                if (i3 < iH && this.e.f(i3, this.b).c == i) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = cVar.b;
                }
            }
            return aVar;
        }

        public final void o() {
            if (this.a.isEmpty()) {
                return;
            }
            this.c = (c) this.a.get(0);
        }

        public final c p(c cVar, L31 l31) {
            int iB;
            return (l31.o() || this.e.o() || (iB = l31.b(this.e.g(cVar.b.a, this.b, true).b)) == -1) ? cVar : new c(l31.f(iB, this.b).c, cVar.b.a(iB));
        }
    }

    public static final class c {
        public final int a;
        public final InterfaceC1792Oi0.a b;

        public c(int i, InterfaceC1792Oi0.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.a == cVar.a && this.b.equals(cVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31) + this.b.hashCode();
        }
    }

    public V3(InterfaceC9736xw0 interfaceC9736xw0, InterfaceC5207hm interfaceC5207hm) {
        this.F = interfaceC9736xw0;
        this.C = (InterfaceC5207hm) AbstractC7115ob.e(interfaceC5207hm);
    }

    @Override // com.daaw.InterfaceC9736xw0.a
    public final void A(VI vi) {
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).y(aVarL, vi);
        }
    }

    @Override // com.daaw.InterfaceC2931Zb
    public final void B(int i, long j, long j2) {
        InterfaceC4166e4.a aVarM = M();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).r(aVarM, i, j, j2);
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void C(int i, InterfaceC1792Oi0.a aVar, InterfaceC1896Pi0.c cVar) {
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).b(aVarH, cVar);
        }
    }

    @Override // com.daaw.InterfaceC2931Zb
    public final void D(C0912Fw c0912Fw) {
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).s(aVarL, 1, c0912Fw);
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void E(int i, InterfaceC1792Oi0.a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar) {
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).A(aVarH, bVar, cVar);
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void F(int i, InterfaceC1792Oi0.a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar, IOException iOException, boolean z) {
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).q(aVarH, bVar, cVar, iOException, z);
        }
    }

    public void G(InterfaceC4166e4 interfaceC4166e4) {
        this.B.add(interfaceC4166e4);
    }

    public InterfaceC4166e4.a H(int i, InterfaceC1792Oi0.a aVar) {
        AbstractC7115ob.e(this.F);
        long jB = this.C.b();
        L31 l31N = this.F.n();
        long jA = 0;
        if (i == this.F.g()) {
            if (aVar == null || !aVar.b()) {
                jA = this.F.i();
            } else if (this.F.m() == aVar.b && this.F.e() == aVar.c) {
                jA = this.F.o();
            }
        } else if (i < l31N.n() && (aVar == null || !aVar.b())) {
            jA = l31N.k(i, this.D).a();
        }
        return new InterfaceC4166e4.a(jB, l31N, i, aVar, jA, this.F.o(), this.F.j() - this.F.i());
    }

    public final InterfaceC4166e4.a I(c cVar) {
        if (cVar != null) {
            return H(cVar.a, cVar.b);
        }
        int iG = ((InterfaceC9736xw0) AbstractC7115ob.e(this.F)).g();
        return H(iG, this.E.n(iG));
    }

    public final InterfaceC4166e4.a J() {
        return I(this.E.b());
    }

    public final InterfaceC4166e4.a K() {
        return I(this.E.c());
    }

    public final InterfaceC4166e4.a L() {
        return I(this.E.d());
    }

    public final InterfaceC4166e4.a M() {
        return I(this.E.e());
    }

    public final void N() {
        if (this.E.f()) {
            return;
        }
        InterfaceC4166e4.a aVarL = L();
        this.E.l();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).f(aVarL);
        }
    }

    public final void O() {
        for (c cVar : new ArrayList(this.E.a)) {
            h(cVar.a, cVar.b);
        }
    }

    @Override // com.daaw.InterfaceC2931Zb
    public final void a(int i) {
        InterfaceC4166e4.a aVarM = M();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).e(aVarM, i);
        }
    }

    @Override // com.daaw.InterfaceC1358Kd1
    public final void b(int i, int i2, int i3, float f) {
        InterfaceC4166e4.a aVarM = M();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).x(aVarM, i, i2, i3, f);
        }
    }

    @Override // com.daaw.InterfaceC9736xw0.a
    public final void c(C9457ww0 c9457ww0) {
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).t(aVarL, c9457ww0);
        }
    }

    @Override // com.daaw.InterfaceC9736xw0.a
    public final void d(boolean z) {
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).j(aVarL, z);
        }
    }

    @Override // com.daaw.InterfaceC9736xw0.a
    public final void e(int i) {
        this.E.i(i);
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).h(aVarL, i);
        }
    }

    @Override // com.daaw.InterfaceC1358Kd1
    public final void f(String str, long j, long j2) {
        InterfaceC4166e4.a aVarM = M();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).v(aVarM, 2, str, j2);
        }
    }

    @Override // com.daaw.InterfaceC9736xw0.a
    public final void g() {
        if (this.E.f()) {
            this.E.k();
            InterfaceC4166e4.a aVarL = L();
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((InterfaceC4166e4) it.next()).z(aVarL);
            }
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void h(int i, InterfaceC1792Oi0.a aVar) {
        this.E.h(i, aVar);
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).B(aVarH);
        }
    }

    @Override // com.daaw.InterfaceC1358Kd1
    public final void i(Surface surface) {
        InterfaceC4166e4.a aVarM = M();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).m(aVarM, surface);
        }
    }

    @Override // com.daaw.InterfaceC2931Zb
    public final void j(C0912Fw c0912Fw) {
        InterfaceC4166e4.a aVarJ = J();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).i(aVarJ, 1, c0912Fw);
        }
    }

    @Override // com.daaw.InterfaceC5446ie.a
    public final void k(int i, long j, long j2) {
        InterfaceC4166e4.a aVarK = K();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).w(aVarK, i, j, j2);
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void l(int i, InterfaceC1792Oi0.a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar) {
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).d(aVarH, bVar, cVar);
        }
    }

    @Override // com.daaw.InterfaceC9736xw0.a
    public final void m(TrackGroupArray trackGroupArray, C3338b51 c3338b51) {
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).n(aVarL, trackGroupArray, c3338b51);
        }
    }

    @Override // com.daaw.InterfaceC2931Zb
    public final void n(String str, long j, long j2) {
        InterfaceC4166e4.a aVarM = M();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).v(aVarM, 1, str, j2);
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void o(int i, InterfaceC1792Oi0.a aVar, InterfaceC1896Pi0.c cVar) {
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).a(aVarH, cVar);
        }
    }

    @Override // com.daaw.InterfaceC5198hk0
    public final void p(Metadata metadata) {
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).l(aVarL, metadata);
        }
    }

    @Override // com.daaw.InterfaceC1358Kd1
    public final void q(int i, long j) {
        InterfaceC4166e4.a aVarJ = J();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).c(aVarJ, i, j);
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void r(int i, InterfaceC1792Oi0.a aVar) {
        this.E.g(i, aVar);
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).p(aVarH);
        }
    }

    @Override // com.daaw.InterfaceC9736xw0.a
    public final void s(boolean z, int i) {
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).g(aVarL, z, i);
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void t(int i, InterfaceC1792Oi0.a aVar) {
        this.E.j(i, aVar);
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).u(aVarH);
        }
    }

    @Override // com.daaw.InterfaceC1358Kd1
    public final void u(C0912Fw c0912Fw) {
        InterfaceC4166e4.a aVarJ = J();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).i(aVarJ, 2, c0912Fw);
        }
    }

    @Override // com.daaw.InterfaceC9736xw0.a
    public final void v(L31 l31, Object obj, int i) {
        this.E.m(l31);
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).C(aVarL, i);
        }
    }

    @Override // com.daaw.InterfaceC1896Pi0
    public final void w(int i, InterfaceC1792Oi0.a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar) {
        InterfaceC4166e4.a aVarH = H(i, aVar);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).o(aVarH, bVar, cVar);
        }
    }

    @Override // com.daaw.InterfaceC1358Kd1
    public final void x(Format format) {
        InterfaceC4166e4.a aVarM = M();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).k(aVarM, 2, format);
        }
    }

    @Override // com.daaw.InterfaceC1358Kd1
    public final void y(C0912Fw c0912Fw) {
        InterfaceC4166e4.a aVarL = L();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).s(aVarL, 2, c0912Fw);
        }
    }

    @Override // com.daaw.InterfaceC2931Zb
    public final void z(Format format) {
        InterfaceC4166e4.a aVarM = M();
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4166e4) it.next()).k(aVarM, 1, format);
        }
    }
}
