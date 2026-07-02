package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class H7 {
    public static final H7 D = new H7("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final H7 E = new H7("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final H7 F = new H7("ALWAYS_PARENTHESIZED", 2, true, true);
    public static final /* synthetic */ H7[] G;
    public static final /* synthetic */ YG H;
    public final boolean B;
    public final boolean C;

    static {
        H7[] h7ArrA = a();
        G = h7ArrA;
        H = AbstractC3110aH.a(h7ArrA);
    }

    public H7(String str, int i, boolean z, boolean z2) {
        this.B = z;
        this.C = z2;
    }

    public static final /* synthetic */ H7[] a() {
        return new H7[]{D, E, F};
    }

    public static H7 valueOf(String str) {
        return (H7) Enum.valueOf(H7.class, str);
    }

    public static H7[] values() {
        return (H7[]) G.clone();
    }

    public final boolean c() {
        return this.B;
    }

    public final boolean g() {
        return this.C;
    }

    public /* synthetic */ H7(String str, int i, boolean z, boolean z2, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(str, i, (i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2);
    }
}
