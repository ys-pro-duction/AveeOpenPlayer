package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.cV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3726cV2 {
    public static final Y23 a;
    public static final HX2 b;
    public static final DX2 c;
    public static final AbstractC5138hX2 d;
    public static final AbstractC4013dX2 e;

    static {
        Y23 y23A = AbstractC6547mY2.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = y23A;
        b = HX2.b(new FX2() { // from class: com.daaw.UU2
            @Override // com.daaw.FX2
            public final InterfaceC3738cY2 a(MT2 mt2) throws GeneralSecurityException {
                EnumC3603c23 enumC3603c23;
                TU2 tu2 = (TU2) mt2;
                Y23 y23 = AbstractC3726cV2.a;
                C9203w13 c9203w13M = C9482x13.M();
                c9203w13M.o("type.googleapis.com/google.crypto.tink.AesEaxKey");
                C9756y03 c9756y03N = C10035z03.N();
                B03 b03N = C03.N();
                b03N.n(tu2.a());
                c9756y03N.o((C03) b03N.j());
                c9756y03N.n(tu2.b());
                c9203w13M.p(((C10035z03) c9756y03N.j()).d());
                RU2 ru2C = tu2.c();
                if (RU2.b.equals(ru2C)) {
                    enumC3603c23 = EnumC3603c23.TINK;
                } else if (RU2.c.equals(ru2C)) {
                    enumC3603c23 = EnumC3603c23.CRUNCHY;
                } else {
                    if (!RU2.d.equals(ru2C)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ru2C)));
                    }
                    enumC3603c23 = EnumC3603c23.RAW;
                }
                c9203w13M.n(enumC3603c23);
                return YX2.a((C9482x13) c9203w13M.j());
            }
        }, TU2.class, YX2.class);
        c = DX2.a(new BX2() { // from class: com.daaw.VU2
        }, y23A, YX2.class);
        d = AbstractC5138hX2.a(new InterfaceC4580fX2() { // from class: com.daaw.WU2
        }, LU2.class, XX2.class);
        e = AbstractC4013dX2.b(new InterfaceC3456bX2() { // from class: com.daaw.XU2
            @Override // com.daaw.InterfaceC3456bX2
            public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) throws GeneralSecurityException {
                RU2 ru2;
                Y23 y23 = AbstractC3726cV2.a;
                if (!((XX2) interfaceC3738cY2).f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    C9198w03 c9198w03P = C9198w03.P(((XX2) interfaceC3738cY2).d(), U33.a());
                    if (c9198w03P.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    QU2 qu2 = new QU2(null);
                    qu2.b(c9198w03P.R().y());
                    qu2.a(c9198w03P.Q().M());
                    qu2.c(16);
                    EnumC3603c23 enumC3603c23C = ((XX2) interfaceC3738cY2).c();
                    EnumC3603c23 enumC3603c23 = EnumC3603c23.UNKNOWN_PREFIX;
                    int iOrdinal = enumC3603c23C.ordinal();
                    if (iOrdinal == 1) {
                        ru2 = RU2.b;
                    } else if (iOrdinal == 2) {
                        ru2 = RU2.c;
                    } else if (iOrdinal == 3) {
                        ru2 = RU2.d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3603c23C.zza());
                        }
                        ru2 = RU2.c;
                    }
                    qu2.d(ru2);
                    TU2 tu2E = qu2.e();
                    JU2 ju2 = new JU2(null);
                    ju2.c(tu2E);
                    ju2.b(Z23.b(c9198w03P.R().e(), c3444bU2));
                    ju2.a(((XX2) interfaceC3738cY2).e());
                    return ju2.d();
                } catch (C8939v43 unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
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
