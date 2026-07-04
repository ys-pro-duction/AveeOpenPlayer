package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC6886nl {
    public static final EnumC6886nl C = new EnumC6886nl("CLASS", 0, "class");
    public static final EnumC6886nl D = new EnumC6886nl("INTERFACE", 1, "interface");
    public static final EnumC6886nl E = new EnumC6886nl("ENUM_CLASS", 2, "enum class");
    public static final EnumC6886nl F = new EnumC6886nl("ENUM_ENTRY", 3, null);
    public static final EnumC6886nl G = new EnumC6886nl("ANNOTATION_CLASS", 4, "annotation class");
    public static final EnumC6886nl H = new EnumC6886nl("OBJECT", 5, "object");
    public static final /* synthetic */ EnumC6886nl[] I;
    public static final /* synthetic */ YG J;
    public final String B;

    static {
        EnumC6886nl[] enumC6886nlArrA = a();
        I = enumC6886nlArrA;
        J = AbstractC3110aH.a(enumC6886nlArrA);
    }

    public EnumC6886nl(String str, int i, String str2) {
        this.B = str2;
    }

    public static final /* synthetic */ EnumC6886nl[] a() {
        return new EnumC6886nl[]{C, D, E, F, G, H};
    }

    public static EnumC6886nl valueOf(String str) {
        return (EnumC6886nl) Enum.valueOf(EnumC6886nl.class, str);
    }

    public static EnumC6886nl[] values() {
        return (EnumC6886nl[]) I.clone();
    }

    public final boolean c() {
        return this == H || this == F;
    }
}
