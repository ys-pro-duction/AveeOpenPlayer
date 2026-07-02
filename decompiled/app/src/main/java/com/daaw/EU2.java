package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EU2 {
    public static final Y23 a;
    public static final HX2 b;
    public static final DX2 c;
    public static final AbstractC5138hX2 d;
    public static final AbstractC4013dX2 e;

    static {
        Y23 y23A = AbstractC6547mY2.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = y23A;
        b = HX2.b(new FX2() { // from class: com.daaw.AU2
            @Override // com.daaw.FX2
            public final InterfaceC3738cY2 a(MT2 mt2) throws GeneralSecurityException {
                EnumC3041a13 enumC3041a13;
                EnumC3603c23 enumC3603c23;
                C10164zU2 c10164zU2 = (C10164zU2) mt2;
                Y23 y23 = EU2.a;
                C9203w13 c9203w13M = C9482x13.M();
                c9203w13M.o("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                C4429f03 c4429f03M = C4718g03.M();
                C7239p03 c7239p03N = C7518q03.N();
                C8075s03 c8075s03N = C8354t03.N();
                c8075s03N.n(c10164zU2.c());
                c7239p03N.o((C8354t03) c8075s03N.j());
                c7239p03N.n(c10164zU2.a());
                c4429f03M.n((C7518q03) c7239p03N.j());
                C4434f13 c4434f13N = C4723g13.N();
                C5281i13 c5281i13O = C5558j13.O();
                c5281i13O.o(c10164zU2.d());
                C8204sU2 c8204sU2E = c10164zU2.e();
                if (C8204sU2.b.equals(c8204sU2E)) {
                    enumC3041a13 = EnumC3041a13.SHA1;
                } else if (C8204sU2.c.equals(c8204sU2E)) {
                    enumC3041a13 = EnumC3041a13.SHA224;
                } else if (C8204sU2.d.equals(c8204sU2E)) {
                    enumC3041a13 = EnumC3041a13.SHA256;
                } else if (C8204sU2.e.equals(c8204sU2E)) {
                    enumC3041a13 = EnumC3041a13.SHA384;
                } else {
                    if (!C8204sU2.f.equals(c8204sU2E)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(c8204sU2E)));
                    }
                    enumC3041a13 = EnumC3041a13.SHA512;
                }
                c5281i13O.n(enumC3041a13);
                c4434f13N.o((C5558j13) c5281i13O.j());
                c4434f13N.n(c10164zU2.b());
                c4429f03M.o((C4723g13) c4434f13N.j());
                c9203w13M.p(((C4718g03) c4429f03M.j()).d());
                C8483tU2 c8483tU2F = c10164zU2.f();
                if (C8483tU2.b.equals(c8483tU2F)) {
                    enumC3603c23 = EnumC3603c23.TINK;
                } else if (C8483tU2.c.equals(c8483tU2F)) {
                    enumC3603c23 = EnumC3603c23.CRUNCHY;
                } else {
                    if (!C8483tU2.d.equals(c8483tU2F)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c8483tU2F)));
                    }
                    enumC3603c23 = EnumC3603c23.RAW;
                }
                c9203w13M.n(enumC3603c23);
                return YX2.a((C9482x13) c9203w13M.j());
            }
        }, C10164zU2.class, YX2.class);
        c = DX2.a(new BX2() { // from class: com.daaw.BU2
        }, y23A, YX2.class);
        d = AbstractC5138hX2.a(new InterfaceC4580fX2() { // from class: com.daaw.CU2
        }, C6531mU2.class, XX2.class);
        e = AbstractC4013dX2.b(new InterfaceC3456bX2() { // from class: com.daaw.DU2
            @Override // com.daaw.InterfaceC3456bX2
            public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) throws GeneralSecurityException {
                C8204sU2 c8204sU2;
                C8483tU2 c8483tU2;
                Y23 y23 = EU2.a;
                if (!((XX2) interfaceC3738cY2).f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    C3872d03 c3872d03P = C3872d03.P(((XX2) interfaceC3738cY2).d(), U33.a());
                    if (c3872d03P.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (c3872d03P.Q().M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (c3872d03P.R().M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    C7925rU2 c7925rU2 = new C7925rU2(null);
                    c7925rU2.a(c3872d03P.Q().S().y());
                    c7925rU2.c(c3872d03P.R().S().y());
                    c7925rU2.d(c3872d03P.Q().R().M());
                    c7925rU2.e(c3872d03P.R().R().M());
                    EnumC3041a13 enumC3041a13N = c3872d03P.R().R().N();
                    EnumC3041a13 enumC3041a13 = EnumC3041a13.UNKNOWN_HASH;
                    EnumC3603c23 enumC3603c23 = EnumC3603c23.UNKNOWN_PREFIX;
                    int iOrdinal = enumC3041a13N.ordinal();
                    if (iOrdinal == 1) {
                        c8204sU2 = C8204sU2.b;
                    } else if (iOrdinal == 2) {
                        c8204sU2 = C8204sU2.e;
                    } else if (iOrdinal == 3) {
                        c8204sU2 = C8204sU2.d;
                    } else if (iOrdinal == 4) {
                        c8204sU2 = C8204sU2.f;
                    } else {
                        if (iOrdinal != 5) {
                            throw new GeneralSecurityException("Unable to parse HashType: " + enumC3041a13N.zza());
                        }
                        c8204sU2 = C8204sU2.c;
                    }
                    c7925rU2.b(c8204sU2);
                    EnumC3603c23 enumC3603c23C = ((XX2) interfaceC3738cY2).c();
                    int iOrdinal2 = enumC3603c23C.ordinal();
                    if (iOrdinal2 == 1) {
                        c8483tU2 = C8483tU2.b;
                    } else if (iOrdinal2 == 2) {
                        c8483tU2 = C8483tU2.c;
                    } else if (iOrdinal2 == 3) {
                        c8483tU2 = C8483tU2.d;
                    } else {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3603c23C.zza());
                        }
                        c8483tU2 = C8483tU2.c;
                    }
                    c7925rU2.f(c8483tU2);
                    C10164zU2 c10164zU2G = c7925rU2.g();
                    C5964kU2 c5964kU2 = new C5964kU2(null);
                    c5964kU2.d(c10164zU2G);
                    c5964kU2.a(Z23.b(c3872d03P.Q().S().e(), c3444bU2));
                    c5964kU2.b(Z23.b(c3872d03P.R().S().e(), c3444bU2));
                    c5964kU2.c(((XX2) interfaceC3738cY2).e());
                    return c5964kU2.e();
                } catch (C8939v43 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
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
