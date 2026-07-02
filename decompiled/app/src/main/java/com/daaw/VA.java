package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class VA {
    public static final VA B = new VA("STABLE", 0);
    public static final VA C = new VA("UNSTABLE", 1);
    public static final /* synthetic */ VA[] D;
    public static final /* synthetic */ YG E;

    static {
        VA[] vaArrA = a();
        D = vaArrA;
        E = AbstractC3110aH.a(vaArrA);
    }

    public VA(String str, int i) {
    }

    public static final /* synthetic */ VA[] a() {
        return new VA[]{B, C};
    }

    public static VA valueOf(String str) {
        return (VA) Enum.valueOf(VA.class, str);
    }

    public static VA[] values() {
        return (VA[]) D.clone();
    }
}
