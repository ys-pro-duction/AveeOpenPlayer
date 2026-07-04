package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JY2 {
    public static final Y23 a;
    public static final HX2 b;
    public static final DX2 c;
    public static final AbstractC5138hX2 d;
    public static final AbstractC4013dX2 e;

    static {
        Y23 y23A = AbstractC6547mY2.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = y23A;
        b = HX2.b(new FX2() { // from class: com.daaw.FY2
            @Override // com.daaw.FX2
            public final InterfaceC3738cY2 a(MT2 mt2) throws GeneralSecurityException {
                EnumC3603c23 enumC3603c23;
                EY2 ey2 = (EY2) mt2;
                Y23 y23 = JY2.a;
                C9203w13 c9203w13M = C9482x13.M();
                c9203w13M.o("type.googleapis.com/google.crypto.tink.AesCmacKey");
                WZ2 wz2N = XZ2.N();
                ZZ2 zz2N = C3036a03.N();
                zz2N.n(ey2.a());
                wz2N.o((C3036a03) zz2N.j());
                wz2N.n(ey2.b());
                c9203w13M.p(((XZ2) wz2N.j()).d());
                CY2 cy2D = ey2.d();
                if (CY2.b.equals(cy2D)) {
                    enumC3603c23 = EnumC3603c23.TINK;
                } else if (CY2.c.equals(cy2D)) {
                    enumC3603c23 = EnumC3603c23.CRUNCHY;
                } else if (CY2.e.equals(cy2D)) {
                    enumC3603c23 = EnumC3603c23.RAW;
                } else {
                    if (!CY2.d.equals(cy2D)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(cy2D)));
                    }
                    enumC3603c23 = EnumC3603c23.LEGACY;
                }
                c9203w13M.n(enumC3603c23);
                return YX2.a((C9482x13) c9203w13M.j());
            }
        }, EY2.class, YX2.class);
        c = DX2.a(new BX2() { // from class: com.daaw.GY2
        }, y23A, YX2.class);
        d = AbstractC5138hX2.a(new InterfaceC4580fX2() { // from class: com.daaw.HY2
        }, C7663qY2.class, XX2.class);
        e = AbstractC4013dX2.b(new InterfaceC3456bX2() { // from class: com.daaw.IY2
            @Override // com.daaw.InterfaceC3456bX2
            public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) throws GeneralSecurityException {
                CY2 cy2;
                Y23 y23 = JY2.a;
                if (!((XX2) interfaceC3738cY2).f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    UZ2 uz2P = UZ2.P(((XX2) interfaceC3738cY2).d(), U33.a());
                    if (uz2P.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BY2 by2 = new BY2(null);
                    by2.a(uz2P.R().y());
                    by2.b(uz2P.Q().M());
                    EnumC3603c23 enumC3603c23C = ((XX2) interfaceC3738cY2).c();
                    EnumC3603c23 enumC3603c23 = EnumC3603c23.UNKNOWN_PREFIX;
                    int iOrdinal = enumC3603c23C.ordinal();
                    if (iOrdinal == 1) {
                        cy2 = CY2.b;
                    } else if (iOrdinal == 2) {
                        cy2 = CY2.d;
                    } else if (iOrdinal == 3) {
                        cy2 = CY2.e;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3603c23C.zza());
                        }
                        cy2 = CY2.c;
                    }
                    by2.c(cy2);
                    EY2 ey2D = by2.d();
                    C7105oY2 c7105oY2 = new C7105oY2(null);
                    c7105oY2.c(ey2D);
                    c7105oY2.a(Z23.b(uz2P.R().e(), c3444bU2));
                    c7105oY2.b(((XX2) interfaceC3738cY2).e());
                    return c7105oY2.d();
                } catch (C8939v43 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        }, y23A, XX2.class);
    }

    public static void a(C10176zX2 c10176zX2) {
        c10176zX2.g(b);
        c10176zX2.f(c);
        c10176zX2.e(d);
        c10176zX2.d(e);
    }
}
