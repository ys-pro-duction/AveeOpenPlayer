package com.daaw;

import com.daaw.C6607ml;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.ba1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC3467ba1 {
    public static final EnumC3467ba1 D;
    public static final EnumC3467ba1 E;
    public static final EnumC3467ba1 F;
    public static final EnumC3467ba1 G;
    public static final /* synthetic */ EnumC3467ba1[] H;
    public static final /* synthetic */ YG I;
    public final C6607ml B;
    public final C2352Tm0 C;

    static {
        C6607ml.a aVar = C6607ml.d;
        D = new EnumC3467ba1("UBYTEARRAY", 0, C6607ml.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        E = new EnumC3467ba1("USHORTARRAY", 1, C6607ml.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        F = new EnumC3467ba1("UINTARRAY", 2, C6607ml.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        G = new EnumC3467ba1("ULONGARRAY", 3, C6607ml.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        EnumC3467ba1[] enumC3467ba1ArrA = a();
        H = enumC3467ba1ArrA;
        I = AbstractC3110aH.a(enumC3467ba1ArrA);
    }

    public EnumC3467ba1(String str, int i, C6607ml c6607ml) {
        this.B = c6607ml;
        this.C = c6607ml.h();
    }

    public static final /* synthetic */ EnumC3467ba1[] a() {
        return new EnumC3467ba1[]{D, E, F, G};
    }

    public static EnumC3467ba1 valueOf(String str) {
        return (EnumC3467ba1) Enum.valueOf(EnumC3467ba1.class, str);
    }

    public static EnumC3467ba1[] values() {
        return (EnumC3467ba1[]) H.clone();
    }

    public final C2352Tm0 c() {
        return this.C;
    }
}
