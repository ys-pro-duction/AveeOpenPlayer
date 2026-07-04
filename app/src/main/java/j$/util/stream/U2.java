package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class U2 {
    public static final U2 OP;
    public static final U2 SPLITERATOR;
    public static final U2 STREAM;
    public static final U2 TERMINAL_OP;
    public static final U2 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ U2[] a;

    public static U2 valueOf(String str) {
        return (U2) Enum.valueOf(U2.class, str);
    }

    public static U2[] values() {
        return (U2[]) a.clone();
    }

    static {
        U2 u2 = new U2("SPLITERATOR", 0);
        SPLITERATOR = u2;
        U2 u22 = new U2("STREAM", 1);
        STREAM = u22;
        U2 u23 = new U2("OP", 2);
        OP = u23;
        U2 u24 = new U2("TERMINAL_OP", 3);
        TERMINAL_OP = u24;
        U2 u25 = new U2("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = u25;
        a = new U2[]{u2, u22, u23, u24, u25};
    }
}
