package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BZ2 {
    public static final Y23 a;
    public static final YW2 b;
    public static final YW2 c;
    public static final HX2 d;
    public static final DX2 e;
    public static final AbstractC5138hX2 f;
    public static final AbstractC4013dX2 g;

    static {
        Y23 y23A = AbstractC6547mY2.a("type.googleapis.com/google.crypto.tink.HmacKey");
        a = y23A;
        WW2 ww2A = YW2.a();
        ww2A.a(EnumC3603c23.RAW, C4299eZ2.e);
        ww2A.a(EnumC3603c23.TINK, C4299eZ2.b);
        ww2A.a(EnumC3603c23.LEGACY, C4299eZ2.d);
        ww2A.a(EnumC3603c23.CRUNCHY, C4299eZ2.c);
        b = ww2A.b();
        WW2 ww2A2 = YW2.a();
        ww2A2.a(EnumC3041a13.SHA1, C4021dZ2.b);
        ww2A2.a(EnumC3041a13.SHA224, C4021dZ2.c);
        ww2A2.a(EnumC3041a13.SHA256, C4021dZ2.d);
        ww2A2.a(EnumC3041a13.SHA384, C4021dZ2.e);
        ww2A2.a(EnumC3041a13.SHA512, C4021dZ2.f);
        c = ww2A2.b();
        d = HX2.b(new FX2() { // from class: com.daaw.xZ2
            @Override // com.daaw.FX2
            public final InterfaceC3738cY2 a(MT2 mt2) {
                return BZ2.a((C4867gZ2) mt2);
            }
        }, C4867gZ2.class, YX2.class);
        e = DX2.a(new BX2() { // from class: com.daaw.yZ2
        }, y23A, YX2.class);
        f = AbstractC5138hX2.a(new InterfaceC4580fX2() { // from class: com.daaw.zZ2
        }, RY2.class, XX2.class);
        g = AbstractC4013dX2.b(new InterfaceC3456bX2() { // from class: com.daaw.AZ2
            @Override // com.daaw.InterfaceC3456bX2
            public final AbstractC8758uT2 a(InterfaceC3738cY2 interfaceC3738cY2, C3444bU2 c3444bU2) {
                return BZ2.b((XX2) interfaceC3738cY2, c3444bU2);
            }
        }, y23A, XX2.class);
    }

    public static /* synthetic */ YX2 a(C4867gZ2 c4867gZ2) {
        C9203w13 c9203w13M = C9482x13.M();
        c9203w13M.o("type.googleapis.com/google.crypto.tink.HmacKey");
        C4434f13 c4434f13N = C4723g13.N();
        C5281i13 c5281i13O = C5558j13.O();
        c5281i13O.o(c4867gZ2.a());
        c5281i13O.n((EnumC3041a13) c.b(c4867gZ2.e()));
        c4434f13N.o((C5558j13) c5281i13O.j());
        c4434f13N.n(c4867gZ2.b());
        c9203w13M.p(((C4723g13) c4434f13N.j()).d());
        c9203w13M.n((EnumC3603c23) b.b(c4867gZ2.f()));
        return YX2.a((C9482x13) c9203w13M.j());
    }

    public static /* synthetic */ RY2 b(XX2 xx2, C3444bU2 c3444bU2) throws GeneralSecurityException {
        if (!xx2.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            C3877d13 c3877d13Q = C3877d13.Q(xx2.d(), U33.a());
            if (c3877d13Q.M() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            YY2 yy2D = C4867gZ2.d();
            yy2D.b(c3877d13Q.S().y());
            yy2D.c(c3877d13Q.R().M());
            yy2D.a((C4021dZ2) c.c(c3877d13Q.R().N()));
            yy2D.d((C4299eZ2) b.c(xx2.c()));
            C4867gZ2 c4867gZ2E = yy2D.e();
            PY2 py2C = RY2.c();
            py2C.c(c4867gZ2E);
            py2C.b(Z23.b(c3877d13Q.S().e(), c3444bU2));
            py2C.a(xx2.e());
            return py2C.d();
        } catch (C8939v43 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c(C10176zX2 c10176zX2) {
        c10176zX2.g(d);
        c10176zX2.f(e);
        c10176zX2.e(f);
        c10176zX2.d(g);
    }
}
