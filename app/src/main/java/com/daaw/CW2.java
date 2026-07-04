package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CW2 {
    public static final Y23 a;
    public static final HX2 b;
    public static final DX2 c;
    public static final AbstractC5138hX2 d;
    public static final AbstractC4013dX2 e;

    static {
        Y23 y23A = AbstractC6547mY2.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = y23A;
        b = HX2.b(new FX2() { // from class: com.daaw.yW2
            @Override // com.daaw.FX2
            public final InterfaceC3738cY2 a(MT2 mt2) throws GeneralSecurityException {
                EnumC3603c23 enumC3603c23;
                Y23 y23 = CW2.a;
                C9203w13 c9203w13M = C9482x13.M();
                c9203w13M.o("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                c9203w13M.p(C6133l23.N().d());
                C9335wW2 c9335wW2A = ((C9614xW2) mt2).a();
                if (C9335wW2.b.equals(c9335wW2A)) {
                    enumC3603c23 = EnumC3603c23.TINK;
                } else if (C9335wW2.c.equals(c9335wW2A)) {
                    enumC3603c23 = EnumC3603c23.CRUNCHY;
                } else {
                    if (!C9335wW2.d.equals(c9335wW2A)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c9335wW2A.toString()));
                    }
                    enumC3603c23 = EnumC3603c23.RAW;
                }
                c9203w13M.n(enumC3603c23);
                return YX2.a((C9482x13) c9203w13M.j());
            }
        }, C9614xW2.class, YX2.class);
        c = DX2.a(new BX2() { // from class: com.daaw.zW2
        }, y23A, YX2.class);
        d = AbstractC5138hX2.a(new InterfaceC4580fX2() { // from class: com.daaw.AW2
        }, C8212sW2.class, XX2.class);
        e = AbstractC4013dX2.b(new InterfaceC3456bX2() { // from class: com.daaw.BW2
            @Override // com.daaw.InterfaceC3456bX2
            public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) throws GeneralSecurityException {
                C9335wW2 c9335wW2;
                Y23 y23 = CW2.a;
                if (!((XX2) interfaceC3738cY2).f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    C5286i23 c5286i23P = C5286i23.P(((XX2) interfaceC3738cY2).d(), U33.a());
                    if (c5286i23P.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    EnumC3603c23 enumC3603c23C = ((XX2) interfaceC3738cY2).c();
                    EnumC3603c23 enumC3603c23 = EnumC3603c23.UNKNOWN_PREFIX;
                    int iOrdinal = enumC3603c23C.ordinal();
                    if (iOrdinal == 1) {
                        c9335wW2 = C9335wW2.b;
                    } else if (iOrdinal == 2) {
                        c9335wW2 = C9335wW2.c;
                    } else if (iOrdinal == 3) {
                        c9335wW2 = C9335wW2.d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC3603c23C.zza());
                        }
                        c9335wW2 = C9335wW2.c;
                    }
                    return C8212sW2.a(c9335wW2, Z23.b(c5286i23P.Q().e(), c3444bU2), ((XX2) interfaceC3738cY2).e());
                } catch (C8939v43 unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
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
