package com.daaw;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T7 {
    public static final AP a = new AP("javax.annotation.meta.TypeQualifierNickname");
    public static final AP b = new AP("javax.annotation.meta.TypeQualifier");
    public static final AP c = new AP("javax.annotation.meta.TypeQualifierDefault");
    public static final AP d = new AP("kotlin.annotations.jvm.UnderMigration");
    public static final List e;
    public static final Map f;
    public static final Map g;
    public static final Set h;

    static {
        S7 s7 = S7.D;
        List listN = AbstractC1599Mm.n(S7.E, S7.C, s7, S7.G, S7.F);
        e = listN;
        AP apM = C40.m();
        EnumC3262ap0 enumC3262ap0 = EnumC3262ap0.D;
        Map mapK = AbstractC1473Lg0.k(D61.a(apM, new N20(new C3541bp0(enumC3262ap0, false, 2, null), listN, false)), D61.a(C40.j(), new N20(new C3541bp0(enumC3262ap0, false, 2, null), listN, false)));
        f = mapK;
        g = AbstractC1473Lg0.n(AbstractC1473Lg0.k(D61.a(new AP("javax.annotation.ParametersAreNullableByDefault"), new N20(new C3541bp0(EnumC3262ap0.C, false, 2, null), AbstractC1496Lm.e(s7), false, 4, null)), D61.a(new AP("javax.annotation.ParametersAreNonnullByDefault"), new N20(new C3541bp0(enumC3262ap0, false, 2, null), AbstractC1496Lm.e(s7), false, 4, null))), mapK);
        h = AbstractC9867yQ0.g(C40.f(), C40.e());
    }

    public static final Map a() {
        return g;
    }

    public static final Set b() {
        return h;
    }

    public static final Map c() {
        return f;
    }

    public static final AP d() {
        return d;
    }

    public static final AP e() {
        return c;
    }

    public static final AP f() {
        return b;
    }

    public static final AP g() {
        return a;
    }
}
