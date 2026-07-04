package com.daaw;

import com.daaw.AbstractC1759Oa;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Vj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2548Vj0 implements DN0 {
    public final InterfaceC1900Pj0 a;
    public final K91 b;
    public final boolean c;
    public final AbstractC7042oJ d;

    public C2548Vj0(K91 k91, AbstractC7042oJ abstractC7042oJ, InterfaceC1900Pj0 interfaceC1900Pj0) {
        this.b = k91;
        this.c = abstractC7042oJ.e(interfaceC1900Pj0);
        this.d = abstractC7042oJ;
        this.a = interfaceC1900Pj0;
    }

    private int k(K91 k91, Object obj) {
        return k91.i(k91.g(obj));
    }

    private void l(K91 k91, AbstractC7042oJ abstractC7042oJ, Object obj, KE0 ke0, C6484mJ c6484mJ) throws Throwable {
        K91 k912;
        AbstractC7042oJ abstractC7042oJ2;
        KE0 ke02;
        C6484mJ c6484mJ2;
        Object objF = k91.f(obj);
        C7325pK c7325pKD = abstractC7042oJ.d(obj);
        while (ke0.z() != Integer.MAX_VALUE) {
            try {
                k912 = k91;
                abstractC7042oJ2 = abstractC7042oJ;
                ke02 = ke0;
                c6484mJ2 = c6484mJ;
            } catch (Throwable th) {
                th = th;
                k912 = k91;
            }
            try {
                if (!n(ke02, c6484mJ2, abstractC7042oJ2, c7325pKD, k912, objF)) {
                    k912.o(obj, objF);
                    return;
                }
                ke0 = ke02;
                c6484mJ = c6484mJ2;
                abstractC7042oJ = abstractC7042oJ2;
                k91 = k912;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                k912.o(obj, objF);
                throw th3;
            }
        }
        k91.o(obj, objF);
    }

    public static C2548Vj0 m(K91 k91, AbstractC7042oJ abstractC7042oJ, InterfaceC1900Pj0 interfaceC1900Pj0) {
        return new C2548Vj0(k91, abstractC7042oJ, interfaceC1900Pj0);
    }

    @Override // com.daaw.DN0
    public void a(Object obj, Object obj2) {
        MN0.F(this.b, obj, obj2);
        if (this.c) {
            MN0.D(this.d, obj, obj2);
        }
    }

    @Override // com.daaw.DN0
    public void b(Object obj, byte[] bArr, int i, int i2, AbstractC1759Oa.a aVar) {
        AbstractC5394iS abstractC5394iS = (AbstractC5394iS) obj;
        if (abstractC5394iS.unknownFields == L91.c()) {
            abstractC5394iS.unknownFields = L91.k();
        }
        AbstractC6314li0.a(obj);
        throw null;
    }

    @Override // com.daaw.DN0
    public void c(Object obj) {
        this.b.j(obj);
        this.d.f(obj);
    }

    @Override // com.daaw.DN0
    public final boolean d(Object obj) {
        return this.d.c(obj).k();
    }

    @Override // com.daaw.DN0
    public void e(Object obj, KE0 ke0, C6484mJ c6484mJ) throws Throwable {
        l(this.b, this.d, obj, ke0, c6484mJ);
    }

    @Override // com.daaw.DN0
    public boolean f(Object obj, Object obj2) {
        if (!this.b.g(obj).equals(this.b.g(obj2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(obj).equals(this.d.c(obj2));
        }
        return true;
    }

    @Override // com.daaw.DN0
    public int g(Object obj) {
        int iK = k(this.b, obj);
        return this.c ? iK + this.d.c(obj).f() : iK;
    }

    @Override // com.daaw.DN0
    public Object h() {
        InterfaceC1900Pj0 interfaceC1900Pj0 = this.a;
        return interfaceC1900Pj0 instanceof AbstractC5394iS ? ((AbstractC5394iS) interfaceC1900Pj0).O() : interfaceC1900Pj0.d().I();
    }

    @Override // com.daaw.DN0
    public int i(Object obj) {
        int iHashCode = this.b.g(obj).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(obj).hashCode() : iHashCode;
    }

    @Override // com.daaw.DN0
    public void j(Object obj, InterfaceC9674xj1 interfaceC9674xj1) {
        Iterator itN = this.d.c(obj).n();
        if (itN.hasNext()) {
            AbstractC6314li0.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        o(this.b, obj, interfaceC9674xj1);
    }

    public final boolean n(KE0 ke0, C6484mJ c6484mJ, AbstractC7042oJ abstractC7042oJ, C7325pK c7325pK, K91 k91, Object obj) throws P10 {
        int iT = ke0.t();
        if (iT != AbstractC6027ki1.a) {
            if (AbstractC6027ki1.b(iT) != 2) {
                return ke0.G();
            }
            Object objB = abstractC7042oJ.b(c6484mJ, this.a, AbstractC6027ki1.a(iT));
            if (objB == null) {
                return k91.m(obj, ke0);
            }
            abstractC7042oJ.h(ke0, objB, c6484mJ, c7325pK);
            return true;
        }
        Object objB2 = null;
        AbstractC4340ei abstractC4340eiC = null;
        int iM = 0;
        while (ke0.z() != Integer.MAX_VALUE) {
            int iT2 = ke0.t();
            if (iT2 == AbstractC6027ki1.c) {
                iM = ke0.m();
                objB2 = abstractC7042oJ.b(c6484mJ, this.a, iM);
            } else if (iT2 == AbstractC6027ki1.d) {
                if (objB2 != null) {
                    abstractC7042oJ.h(ke0, objB2, c6484mJ, c7325pK);
                } else {
                    abstractC4340eiC = ke0.C();
                }
            } else if (!ke0.G()) {
                break;
            }
        }
        if (ke0.t() != AbstractC6027ki1.b) {
            throw P10.b();
        }
        if (abstractC4340eiC != null) {
            if (objB2 != null) {
                abstractC7042oJ.i(abstractC4340eiC, objB2, c6484mJ, c7325pK);
            } else {
                k91.d(obj, iM, abstractC4340eiC);
            }
        }
        return true;
    }

    public final void o(K91 k91, Object obj, InterfaceC9674xj1 interfaceC9674xj1) {
        k91.s(k91.g(obj), interfaceC9674xj1);
    }
}
