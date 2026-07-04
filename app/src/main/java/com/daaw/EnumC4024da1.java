package com.daaw;

import com.daaw.C6607ml;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.da1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4024da1 {
    public static final EnumC4024da1 E;
    public static final EnumC4024da1 F;
    public static final EnumC4024da1 G;
    public static final EnumC4024da1 H;
    public static final /* synthetic */ EnumC4024da1[] I;
    public static final /* synthetic */ YG J;
    public final C6607ml B;
    public final C2352Tm0 C;
    public final C6607ml D;

    static {
        C6607ml.a aVar = C6607ml.d;
        E = new EnumC4024da1("UBYTE", 0, C6607ml.a.b(aVar, "kotlin/UByte", false, 2, null));
        F = new EnumC4024da1("USHORT", 1, C6607ml.a.b(aVar, "kotlin/UShort", false, 2, null));
        G = new EnumC4024da1("UINT", 2, C6607ml.a.b(aVar, "kotlin/UInt", false, 2, null));
        H = new EnumC4024da1("ULONG", 3, C6607ml.a.b(aVar, "kotlin/ULong", false, 2, null));
        EnumC4024da1[] enumC4024da1ArrA = a();
        I = enumC4024da1ArrA;
        J = AbstractC3110aH.a(enumC4024da1ArrA);
    }

    public EnumC4024da1(String str, int i, C6607ml c6607ml) {
        this.B = c6607ml;
        C2352Tm0 c2352Tm0H = c6607ml.h();
        this.C = c2352Tm0H;
        AP apF = c6607ml.f();
        C2352Tm0 c2352Tm0L = C2352Tm0.l(c2352Tm0H.c() + "Array");
        G10.f(c2352Tm0L, "identifier(...)");
        this.D = new C6607ml(apF, c2352Tm0L);
    }

    public static final /* synthetic */ EnumC4024da1[] a() {
        return new EnumC4024da1[]{E, F, G, H};
    }

    public static EnumC4024da1 valueOf(String str) {
        return (EnumC4024da1) Enum.valueOf(EnumC4024da1.class, str);
    }

    public static EnumC4024da1[] values() {
        return (EnumC4024da1[]) I.clone();
    }

    public final C6607ml c() {
        return this.D;
    }

    public final C6607ml g() {
        return this.B;
    }

    public final C2352Tm0 h() {
        return this.C;
    }
}
