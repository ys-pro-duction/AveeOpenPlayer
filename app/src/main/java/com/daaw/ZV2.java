package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZV2 {
    public static final Y23 a;
    public static final HX2 b;
    public static final DX2 c;
    public static final AbstractC5138hX2 d;
    public static final AbstractC4013dX2 e;

    static {
        Y23 y23A = AbstractC6547mY2.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = y23A;
        b = HX2.b(new FX2() { // from class: com.daaw.VV2
            @Override // com.daaw.FX2
            public final InterfaceC3738cY2 a(MT2 mt2) throws GeneralSecurityException {
                EnumC3603c23 enumC3603c23;
                Y23 y23 = ZV2.a;
                C9203w13 c9203w13M = C9482x13.M();
                c9203w13M.o("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                c9203w13M.p(Y03.N().d());
                TV2 tv2A = ((UV2) mt2).a();
                if (TV2.b.equals(tv2A)) {
                    enumC3603c23 = EnumC3603c23.TINK;
                } else if (TV2.c.equals(tv2A)) {
                    enumC3603c23 = EnumC3603c23.CRUNCHY;
                } else {
                    if (!TV2.d.equals(tv2A)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(tv2A.toString()));
                    }
                    enumC3603c23 = EnumC3603c23.RAW;
                }
                c9203w13M.n(enumC3603c23);
                return YX2.a((C9482x13) c9203w13M.j());
            }
        }, UV2.class, YX2.class);
        c = DX2.a(new BX2() { // from class: com.daaw.WV2
        }, y23A, YX2.class);
        d = AbstractC5138hX2.a(new InterfaceC4580fX2() { // from class: com.daaw.XV2
        }, PV2.class, XX2.class);
        e = AbstractC4013dX2.b(new InterfaceC3456bX2() { // from class: com.daaw.YV2
            @Override // com.daaw.InterfaceC3456bX2
            public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) throws GeneralSecurityException {
                TV2 tv2;
                Y23 y23 = ZV2.a;
                if (!((XX2) interfaceC3738cY2).f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    V03 v03P = V03.P(((XX2) interfaceC3738cY2).d(), U33.a());
                    if (v03P.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EnumC3603c23 enumC3603c23C = ((XX2) interfaceC3738cY2).c();
                    EnumC3603c23 enumC3603c23 = EnumC3603c23.UNKNOWN_PREFIX;
                    int iOrdinal = enumC3603c23C.ordinal();
                    if (iOrdinal == 1) {
                        tv2 = TV2.b;
                    } else if (iOrdinal == 2) {
                        tv2 = TV2.c;
                    } else if (iOrdinal == 3) {
                        tv2 = TV2.d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3603c23C.zza());
                        }
                        tv2 = TV2.c;
                    }
                    return PV2.a(tv2, Z23.b(v03P.Q().e(), c3444bU2), ((XX2) interfaceC3738cY2).e());
                } catch (C8939v43 unused) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
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
