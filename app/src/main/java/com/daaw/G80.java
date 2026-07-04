package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class G80 {
    public static final G80 B = new G80("RUNTIME", 0);
    public static final G80 C = new G80("BINARY", 1);
    public static final G80 D = new G80("SOURCE", 2);
    public static final /* synthetic */ G80[] E;
    public static final /* synthetic */ YG F;

    static {
        G80[] g80ArrA = a();
        E = g80ArrA;
        F = AbstractC3110aH.a(g80ArrA);
    }

    public G80(String str, int i) {
    }

    public static final /* synthetic */ G80[] a() {
        return new G80[]{B, C, D};
    }

    public static G80 valueOf(String str) {
        return (G80) Enum.valueOf(G80.class, str);
    }

    public static G80[] values() {
        return (G80[]) E.clone();
    }
}
