package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.dU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4001dU2 {
    public static final C4439f23 a;
    public static final C4439f23 b;
    public static final C4439f23 c;

    static {
        new C7368pU2();
        new C5689jV2();
        new AV2();
        new OU2();
        new C3730cW2();
        new C5972kW2();
        new SV2();
        new C9056vW2();
        C4439f23 c4439f23N = C4439f23.N();
        a = c4439f23N;
        b = c4439f23N;
        c = c4439f23N;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        C5405iU2.b();
        AbstractC5146hZ2.a();
        AbstractC3165aU2.f(new C7368pU2(), true);
        Y23 y23 = EU2.a;
        EU2.a(C10176zX2.b());
        AbstractC3165aU2.f(new C5689jV2(), true);
        Y23 y232 = AbstractC8487tV2.a;
        AbstractC8487tV2.a(C10176zX2.b());
        if (UW2.b()) {
            return;
        }
        AbstractC3165aU2.f(new OU2(), true);
        Y23 y233 = AbstractC3726cV2.a;
        AbstractC3726cV2.a(C10176zX2.b());
        AV2.k(true);
        AbstractC3165aU2.f(new SV2(), true);
        Y23 y234 = ZV2.a;
        ZV2.a(C10176zX2.b());
        AbstractC3165aU2.f(new C3730cW2(), true);
        AbstractC3165aU2.f(new C5972kW2(), true);
        AbstractC3165aU2.f(new C9056vW2(), true);
        Y23 y235 = CW2.a;
        CW2.a(C10176zX2.b());
    }
}
