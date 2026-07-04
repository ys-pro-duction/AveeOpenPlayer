package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.daaw.io0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC5496io0 implements InterfaceC7689qe0 {
    public static final EnumC5496io0 B = new EnumC5496io0("FROM_IDE", 0);
    public static final EnumC5496io0 C = new EnumC5496io0("FROM_BACKEND", 1);
    public static final EnumC5496io0 D = new EnumC5496io0("FROM_TEST", 2);
    public static final EnumC5496io0 E = new EnumC5496io0("FROM_BUILTINS", 3);
    public static final EnumC5496io0 F = new EnumC5496io0("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
    public static final EnumC5496io0 G = new EnumC5496io0("WHEN_CHECK_OVERRIDES", 5);
    public static final EnumC5496io0 H = new EnumC5496io0("FOR_SCRIPT", 6);
    public static final EnumC5496io0 I = new EnumC5496io0("FROM_REFLECTION", 7);
    public static final EnumC5496io0 J = new EnumC5496io0("WHEN_RESOLVE_DECLARATION", 8);
    public static final EnumC5496io0 K = new EnumC5496io0("WHEN_GET_DECLARATION_SCOPE", 9);
    public static final EnumC5496io0 L = new EnumC5496io0("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
    public static final EnumC5496io0 M = new EnumC5496io0("FOR_ALREADY_TRACKED", 11);
    public static final EnumC5496io0 N = new EnumC5496io0("WHEN_GET_ALL_DESCRIPTORS", 12);
    public static final EnumC5496io0 O = new EnumC5496io0("WHEN_TYPING", 13);
    public static final EnumC5496io0 P = new EnumC5496io0("WHEN_GET_SUPER_MEMBERS", 14);
    public static final EnumC5496io0 Q = new EnumC5496io0("FOR_NON_TRACKED_SCOPE", 15);
    public static final EnumC5496io0 R = new EnumC5496io0("FROM_SYNTHETIC_SCOPE", 16);
    public static final EnumC5496io0 S = new EnumC5496io0("FROM_DESERIALIZATION", 17);
    public static final EnumC5496io0 T = new EnumC5496io0("FROM_JAVA_LOADER", 18);
    public static final EnumC5496io0 U = new EnumC5496io0("WHEN_GET_LOCAL_VARIABLE", 19);
    public static final EnumC5496io0 V = new EnumC5496io0("WHEN_FIND_BY_FQNAME", 20);
    public static final EnumC5496io0 W = new EnumC5496io0("WHEN_GET_COMPANION_OBJECT", 21);
    public static final EnumC5496io0 X = new EnumC5496io0("FOR_DEFAULT_IMPORTS", 22);
    public static final /* synthetic */ EnumC5496io0[] Y;
    public static final /* synthetic */ YG Z;

    static {
        EnumC5496io0[] enumC5496io0ArrA = a();
        Y = enumC5496io0ArrA;
        Z = AbstractC3110aH.a(enumC5496io0ArrA);
    }

    public EnumC5496io0(String str, int i) {
    }

    public static final /* synthetic */ EnumC5496io0[] a() {
        return new EnumC5496io0[]{B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X};
    }

    public static EnumC5496io0 valueOf(String str) {
        return (EnumC5496io0) Enum.valueOf(EnumC5496io0.class, str);
    }

    public static EnumC5496io0[] values() {
        return (EnumC5496io0[]) Y.clone();
    }

    @Override // com.daaw.InterfaceC7689qe0
    public InterfaceC8799ud0 getLocation() {
        return null;
    }
}
