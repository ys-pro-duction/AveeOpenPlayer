package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OV2 {
    public static final Y23 a;
    public static final HX2 b;
    public static final DX2 c;
    public static final AbstractC5138hX2 d;
    public static final AbstractC4013dX2 e;

    static {
        Y23 y23A = AbstractC6547mY2.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = y23A;
        b = HX2.b(new FX2() { // from class: com.daaw.KV2
            @Override // com.daaw.FX2
            public final InterfaceC3738cY2 a(MT2 mt2) throws GeneralSecurityException {
                EnumC3603c23 enumC3603c23;
                JV2 jv2 = (JV2) mt2;
                Y23 y23 = OV2.a;
                C9203w13 c9203w13M = C9482x13.M();
                c9203w13M.o("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                R03 r03N = S03.N();
                r03N.n(jv2.a());
                c9203w13M.p(((S03) r03N.j()).d());
                HV2 hv2B = jv2.b();
                if (HV2.b.equals(hv2B)) {
                    enumC3603c23 = EnumC3603c23.TINK;
                } else if (HV2.c.equals(hv2B)) {
                    enumC3603c23 = EnumC3603c23.CRUNCHY;
                } else {
                    if (!HV2.d.equals(hv2B)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(hv2B)));
                    }
                    enumC3603c23 = EnumC3603c23.RAW;
                }
                c9203w13M.n(enumC3603c23);
                return YX2.a((C9482x13) c9203w13M.j());
            }
        }, JV2.class, YX2.class);
        c = DX2.a(new BX2() { // from class: com.daaw.LV2
        }, y23A, YX2.class);
        d = AbstractC5138hX2.a(new InterfaceC4580fX2() { // from class: com.daaw.MV2
        }, C9610xV2.class, XX2.class);
        e = AbstractC4013dX2.b(new InterfaceC3456bX2() { // from class: com.daaw.NV2
            @Override // com.daaw.InterfaceC3456bX2
            public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) throws GeneralSecurityException {
                HV2 hv2;
                Y23 y23 = OV2.a;
                if (!((XX2) interfaceC3738cY2).f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    P03 p03P = P03.P(((XX2) interfaceC3738cY2).d(), U33.a());
                    if (p03P.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    GV2 gv2 = new GV2(null);
                    gv2.a(p03P.Q().y());
                    EnumC3603c23 enumC3603c23C = ((XX2) interfaceC3738cY2).c();
                    EnumC3603c23 enumC3603c23 = EnumC3603c23.UNKNOWN_PREFIX;
                    int iOrdinal = enumC3603c23C.ordinal();
                    if (iOrdinal == 1) {
                        hv2 = HV2.b;
                    } else if (iOrdinal == 2) {
                        hv2 = HV2.c;
                    } else if (iOrdinal == 3) {
                        hv2 = HV2.d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3603c23C.zza());
                        }
                        hv2 = HV2.c;
                    }
                    gv2.b(hv2);
                    JV2 jv2C = gv2.c();
                    C9052vV2 c9052vV2 = new C9052vV2(null);
                    c9052vV2.c(jv2C);
                    c9052vV2.b(Z23.b(p03P.Q().e(), c3444bU2));
                    c9052vV2.a(((XX2) interfaceC3738cY2).e());
                    return c9052vV2.d();
                } catch (C8939v43 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
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
