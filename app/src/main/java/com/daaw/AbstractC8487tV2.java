package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.tV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8487tV2 {
    public static final Y23 a;
    public static final HX2 b;
    public static final DX2 c;
    public static final AbstractC5138hX2 d;
    public static final AbstractC4013dX2 e;

    static {
        Y23 y23A = AbstractC6547mY2.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = y23A;
        b = HX2.b(new FX2() { // from class: com.daaw.pV2
            @Override // com.daaw.FX2
            public final InterfaceC3738cY2 a(MT2 mt2) throws GeneralSecurityException {
                EnumC3603c23 enumC3603c23;
                C7093oV2 c7093oV2 = (C7093oV2) mt2;
                Y23 y23 = AbstractC8487tV2.a;
                C9203w13 c9203w13M = C9482x13.M();
                c9203w13M.o("type.googleapis.com/google.crypto.tink.AesGcmKey");
                H03 h03N = I03.N();
                h03N.n(c7093oV2.a());
                c9203w13M.p(((I03) h03N.j()).d());
                C6535mV2 c6535mV2B = c7093oV2.b();
                if (C6535mV2.b.equals(c6535mV2B)) {
                    enumC3603c23 = EnumC3603c23.TINK;
                } else if (C6535mV2.c.equals(c6535mV2B)) {
                    enumC3603c23 = EnumC3603c23.CRUNCHY;
                } else {
                    if (!C6535mV2.d.equals(c6535mV2B)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c6535mV2B)));
                    }
                    enumC3603c23 = EnumC3603c23.RAW;
                }
                c9203w13M.n(enumC3603c23);
                return YX2.a((C9482x13) c9203w13M.j());
            }
        }, C7093oV2.class, YX2.class);
        c = DX2.a(new BX2() { // from class: com.daaw.qV2
        }, y23A, YX2.class);
        d = AbstractC5138hX2.a(new InterfaceC4580fX2() { // from class: com.daaw.rV2
        }, C4851gV2.class, XX2.class);
        e = AbstractC4013dX2.b(new InterfaceC3456bX2() { // from class: com.daaw.sV2
            @Override // com.daaw.InterfaceC3456bX2
            public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) throws GeneralSecurityException {
                C6535mV2 c6535mV2;
                Y23 y23 = AbstractC8487tV2.a;
                if (!((XX2) interfaceC3738cY2).f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    F03 f03P = F03.P(((XX2) interfaceC3738cY2).d(), U33.a());
                    if (f03P.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C6256lV2 c6256lV2 = new C6256lV2(null);
                    c6256lV2.b(f03P.Q().y());
                    c6256lV2.a(12);
                    c6256lV2.c(16);
                    EnumC3603c23 enumC3603c23C = ((XX2) interfaceC3738cY2).c();
                    EnumC3603c23 enumC3603c23 = EnumC3603c23.UNKNOWN_PREFIX;
                    int iOrdinal = enumC3603c23C.ordinal();
                    if (iOrdinal == 1) {
                        c6535mV2 = C6535mV2.b;
                    } else if (iOrdinal == 2) {
                        c6535mV2 = C6535mV2.c;
                    } else if (iOrdinal == 3) {
                        c6535mV2 = C6535mV2.d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3603c23C.zza());
                        }
                        c6535mV2 = C6535mV2.c;
                    }
                    c6256lV2.d(c6535mV2);
                    C7093oV2 c7093oV2E = c6256lV2.e();
                    C4283eV2 c4283eV2 = new C4283eV2(null);
                    c4283eV2.c(c7093oV2E);
                    c4283eV2.b(Z23.b(f03P.Q().e(), c3444bU2));
                    c4283eV2.a(((XX2) interfaceC3738cY2).e());
                    return c4283eV2.d();
                } catch (C8939v43 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
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
