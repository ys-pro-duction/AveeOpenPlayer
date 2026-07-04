package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10436h {
    public static final EnumC10436h CONCURRENT;
    public static final EnumC10436h IDENTITY_FINISH;
    public static final EnumC10436h UNORDERED;
    public static final /* synthetic */ EnumC10436h[] a;

    public static EnumC10436h valueOf(String str) {
        return (EnumC10436h) Enum.valueOf(EnumC10436h.class, str);
    }

    public static EnumC10436h[] values() {
        return (EnumC10436h[]) a.clone();
    }

    static {
        EnumC10436h enumC10436h = new EnumC10436h("CONCURRENT", 0);
        CONCURRENT = enumC10436h;
        EnumC10436h enumC10436h2 = new EnumC10436h("UNORDERED", 1);
        UNORDERED = enumC10436h2;
        EnumC10436h enumC10436h3 = new EnumC10436h("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC10436h3;
        a = new EnumC10436h[]{enumC10436h, enumC10436h2, enumC10436h3};
    }
}
