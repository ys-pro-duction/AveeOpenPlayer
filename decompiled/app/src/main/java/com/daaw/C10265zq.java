package com.daaw;

import com.daaw.AbstractC7160ok;

/* JADX INFO: renamed from: com.daaw.zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C10265zq extends C6587mh {
    public final int N;
    public final EnumC5182hh O;

    public C10265zq(int i, EnumC5182hh enumC5182hh, NQ nq) {
        super(i, nq);
        this.N = i;
        this.O = enumC5182hh;
        if (enumC5182hh == EnumC5182hh.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC5624jG0.b(C6587mh.class).h() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    public static /* synthetic */ Object G0(C10265zq c10265zq, Object obj, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        C9520x91 c9520x91D;
        Object objJ0 = c10265zq.J0(obj, true);
        if (!(objJ0 instanceof AbstractC7160ok.a)) {
            return G91.a;
        }
        AbstractC7160ok.c(objJ0);
        NQ nq = c10265zq.C;
        if (nq == null || (c9520x91D = AbstractC0785Eq0.d(nq, obj, null, 2, null)) == null) {
            throw c10265zq.L();
        }
        AbstractC7596qI.a(c9520x91D, c10265zq.L());
        throw c9520x91D;
    }

    public final Object H0(Object obj, boolean z) {
        NQ nq;
        C9520x91 c9520x91D;
        Object objK = super.k(obj);
        if (AbstractC7160ok.f(objK) || AbstractC7160ok.e(objK)) {
            return objK;
        }
        if (!z || (nq = this.C) == null || (c9520x91D = AbstractC0785Eq0.d(nq, obj, null, 2, null)) == null) {
            return AbstractC7160ok.a.c(G91.a);
        }
        throw c9520x91D;
    }

    public final Object I0(Object obj) {
        C7718qk c7718qkG;
        int i;
        C10265zq c10265zq;
        Object obj2 = AbstractC6866nh.d;
        C7718qk c7718qk = (C7718qk) C6587mh.I.get(this);
        while (true) {
            long andIncrement = C6587mh.E.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zW = W(andIncrement);
            int i2 = AbstractC6866nh.b;
            long j2 = j / ((long) i2);
            int i3 = (int) (j % ((long) i2));
            if (c7718qk.D != j2) {
                c7718qkG = G(j2, c7718qk);
                if (c7718qkG != null) {
                    c10265zq = this;
                    i = i3;
                } else if (zW) {
                    return AbstractC7160ok.a.a(L());
                }
            } else {
                c7718qkG = c7718qk;
                i = i3;
                c10265zq = this;
            }
            Object obj3 = obj;
            int iB0 = c10265zq.B0(c7718qkG, i, obj3, j, obj2, zW);
            c7718qk = c7718qkG;
            if (iB0 == 0) {
                c7718qk.b();
                return AbstractC7160ok.a.c(G91.a);
            }
            if (iB0 == 1) {
                return AbstractC7160ok.a.c(G91.a);
            }
            if (iB0 == 2) {
                if (zW) {
                    c7718qk.p();
                    return AbstractC7160ok.a.a(L());
                }
                InterfaceC4332eg1 interfaceC4332eg1 = obj2 instanceof InterfaceC4332eg1 ? (InterfaceC4332eg1) obj2 : null;
                if (interfaceC4332eg1 != null) {
                    l0(interfaceC4332eg1, c7718qk, i);
                }
                C((c7718qk.D * ((long) i2)) + ((long) i));
                return AbstractC7160ok.a.c(G91.a);
            }
            if (iB0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iB0 == 4) {
                if (j < K()) {
                    c7718qk.b();
                }
                return AbstractC7160ok.a.a(L());
            }
            if (iB0 == 5) {
                c7718qk.b();
            }
            obj = obj3;
        }
    }

    public final Object J0(Object obj, boolean z) {
        return this.O == EnumC5182hh.DROP_LATEST ? H0(obj, z) : I0(obj);
    }

    @Override // com.daaw.C6587mh
    public boolean X() {
        return this.O == EnumC5182hh.DROP_OLDEST;
    }

    @Override // com.daaw.C6587mh, com.daaw.HP0
    public Object e(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        return G0(this, obj, interfaceC1416Ks);
    }

    @Override // com.daaw.C6587mh, com.daaw.HP0
    public Object k(Object obj) {
        return J0(obj, false);
    }
}
