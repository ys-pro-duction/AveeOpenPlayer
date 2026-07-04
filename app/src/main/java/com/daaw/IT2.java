package com.daaw;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class IT2 {
    public final F13 a;
    public final List b;
    public final JZ2 c;

    public IT2(F13 f13, List list, JZ2 jz2) {
        this.a = f13;
        this.b = list;
        this.c = jz2;
    }

    public static final IT2 a(F13 f13) throws GeneralSecurityException {
        i(f13);
        return new IT2(f13, h(f13));
    }

    public static final IT2 b(F13 f13, JZ2 jz2) throws GeneralSecurityException {
        i(f13);
        return new IT2(f13, h(f13), jz2);
    }

    public static final IT2 c(MT2 mt2) {
        FT2 ft2 = new FT2();
        DT2 dt2 = new DT2(mt2, null);
        dt2.e();
        dt2.d();
        ft2.a(dt2);
        return ft2.b();
    }

    public static XX2 f(E13 e13) {
        try {
            return XX2.a(e13.N().R(), e13.N().Q(), e13.N().N(), e13.Q(), e13.Q() == EnumC3603c23.RAW ? null : Integer.valueOf(e13.M()));
        } catch (GeneralSecurityException e) {
            throw new C6268lY2("Creating a protokey serialization failed", e);
        }
    }

    public static Object g(ZW2 zw2, E13 e13, Class cls) throws GeneralSecurityException {
        try {
            return AbstractC3165aU2.c(e13.N(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    public static List h(F13 f13) {
        AbstractC8758uT2 abstractC8758uT2A;
        int iV;
        C10160zT2 c10160zT2;
        ArrayList arrayList = new ArrayList(f13.M());
        for (E13 e13 : f13.S()) {
            int iM = e13.M();
            try {
                abstractC8758uT2A = C10176zX2.b().a(f(e13), C3444bU2.a());
                iV = e13.V() - 2;
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
            if (iV == 1) {
                c10160zT2 = C10160zT2.b;
            } else if (iV == 2) {
                c10160zT2 = C10160zT2.c;
            } else {
                if (iV != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                }
                c10160zT2 = C10160zT2.d;
            }
            arrayList.add(new HT2(abstractC8758uT2A, c10160zT2, iM, iM == f13.N(), null));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static void i(F13 f13) throws GeneralSecurityException {
        if (f13 == null || f13.M() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static final Object j(ZW2 zw2, AbstractC8758uT2 abstractC8758uT2, Class cls) {
        try {
            return C9339wX2.a().c(abstractC8758uT2, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final F13 d() {
        return this.a;
    }

    public final Object e(AbstractC7921rT2 abstractC7921rT2, Class cls) throws GeneralSecurityException {
        Class clsB = AbstractC3165aU2.b(cls);
        if (clsB == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        F13 f13 = this.a;
        Charset charset = AbstractC3722cU2.a;
        int iN = f13.N();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (E13 e13 : f13.S()) {
            if (e13.V() == 3) {
                if (!e13.U()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(e13.M())));
                }
                if (e13.Q() == EnumC3603c23.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(e13.M())));
                }
                if (e13.V() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(e13.M())));
                }
                if (e13.M() == iN) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= e13.N().N() == EnumC6686n13.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        OT2 ot2 = new OT2(clsB, null);
        ot2.c(this.c);
        for (int i2 = 0; i2 < this.a.M(); i2++) {
            E13 e13P = this.a.P(i2);
            if (e13P.V() == 3) {
                ZW2 zw2 = (ZW2) abstractC7921rT2;
                Object objG = g(zw2, e13P, clsB);
                Object objJ = this.b.get(i2) != null ? j(zw2, ((HT2) this.b.get(i2)).a(), clsB) : null;
                if (objJ == null && objG == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + clsB.toString() + " for key of type " + e13P.N().R());
                }
                if (e13P.M() == this.a.N()) {
                    ot2.b(objJ, objG, e13P);
                } else {
                    ot2.a(objJ, objG, e13P);
                }
            }
        }
        return C9339wX2.a().d(ot2.d(), cls);
    }

    public final String toString() {
        Charset charset = AbstractC3722cU2.a;
        F13 f13 = this.a;
        H13 h13M = K13.M();
        h13M.o(f13.N());
        for (E13 e13 : f13.S()) {
            I13 i13M = J13.M();
            i13M.p(e13.N().R());
            i13M.r(e13.V());
            i13M.o(e13.Q());
            i13M.n(e13.M());
            h13M.n((J13) i13M.j());
        }
        return ((K13) h13M.j()).toString();
    }

    public IT2(F13 f13, List list) {
        this.a = f13;
        this.b = list;
        this.c = JZ2.b;
    }
}
