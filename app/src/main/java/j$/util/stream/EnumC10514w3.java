package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10514w3 {
    public static final EnumC10514w3 MAYBE_MORE;
    public static final EnumC10514w3 NO_MORE;
    public static final EnumC10514w3 UNLIMITED;
    public static final /* synthetic */ EnumC10514w3[] a;

    static {
        EnumC10514w3 enumC10514w3 = new EnumC10514w3("NO_MORE", 0);
        NO_MORE = enumC10514w3;
        EnumC10514w3 enumC10514w32 = new EnumC10514w3("MAYBE_MORE", 1);
        MAYBE_MORE = enumC10514w32;
        EnumC10514w3 enumC10514w33 = new EnumC10514w3("UNLIMITED", 2);
        UNLIMITED = enumC10514w33;
        a = new EnumC10514w3[]{enumC10514w3, enumC10514w32, enumC10514w33};
    }

    public static EnumC10514w3 valueOf(String str) {
        return (EnumC10514w3) Enum.valueOf(EnumC10514w3.class, str);
    }

    public static EnumC10514w3[] values() {
        return (EnumC10514w3[]) a.clone();
    }
}
