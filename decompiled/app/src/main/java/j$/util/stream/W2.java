package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class W2 {
    public static final W2 DOUBLE_VALUE;
    public static final W2 INT_VALUE;
    public static final W2 LONG_VALUE;
    public static final W2 REFERENCE;
    public static final /* synthetic */ W2[] a;

    public static W2 valueOf(String str) {
        return (W2) Enum.valueOf(W2.class, str);
    }

    public static W2[] values() {
        return (W2[]) a.clone();
    }

    static {
        W2 w2 = new W2("REFERENCE", 0);
        REFERENCE = w2;
        W2 w22 = new W2("INT_VALUE", 1);
        INT_VALUE = w22;
        W2 w23 = new W2("LONG_VALUE", 2);
        LONG_VALUE = w23;
        W2 w24 = new W2("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = w24;
        a = new W2[]{w2, w22, w23, w24};
    }
}
