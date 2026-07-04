package com.daaw;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'F' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.daaw.Aa2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0298Aa2 {
    public static final EnumC0298Aa2 E;
    public static final EnumC0298Aa2 F;
    public static final EnumC0298Aa2 G;
    public static final EnumC0298Aa2 H;
    public static final EnumC0298Aa2 I;
    public static final EnumC0298Aa2 J;
    public static final EnumC0298Aa2 K;
    public static final EnumC0298Aa2 L;
    public static final EnumC0298Aa2 M;
    public static final EnumC0298Aa2 N;
    public static final /* synthetic */ EnumC0298Aa2[] O;
    public final Class B;
    public final Class C;
    public final Object D;

    static {
        EnumC0298Aa2 enumC0298Aa2 = new EnumC0298Aa2("VOID", 0, Void.class, Void.class, null);
        E = enumC0298Aa2;
        Class cls = Integer.TYPE;
        EnumC0298Aa2 enumC0298Aa22 = new EnumC0298Aa2("INT", 1, cls, Integer.class, 0);
        F = enumC0298Aa22;
        EnumC0298Aa2 enumC0298Aa23 = new EnumC0298Aa2("LONG", 2, Long.TYPE, Long.class, 0L);
        G = enumC0298Aa23;
        EnumC0298Aa2 enumC0298Aa24 = new EnumC0298Aa2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        H = enumC0298Aa24;
        EnumC0298Aa2 enumC0298Aa25 = new EnumC0298Aa2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        I = enumC0298Aa25;
        EnumC0298Aa2 enumC0298Aa26 = new EnumC0298Aa2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        J = enumC0298Aa26;
        EnumC0298Aa2 enumC0298Aa27 = new EnumC0298Aa2("STRING", 6, String.class, String.class, "");
        K = enumC0298Aa27;
        EnumC0298Aa2 enumC0298Aa28 = new EnumC0298Aa2("BYTE_STRING", 7, BM1.class, BM1.class, BM1.C);
        L = enumC0298Aa28;
        EnumC0298Aa2 enumC0298Aa29 = new EnumC0298Aa2("ENUM", 8, cls, Integer.class, null);
        M = enumC0298Aa29;
        EnumC0298Aa2 enumC0298Aa210 = new EnumC0298Aa2("MESSAGE", 9, Object.class, Object.class, null);
        N = enumC0298Aa210;
        O = new EnumC0298Aa2[]{enumC0298Aa2, enumC0298Aa22, enumC0298Aa23, enumC0298Aa24, enumC0298Aa25, enumC0298Aa26, enumC0298Aa27, enumC0298Aa28, enumC0298Aa29, enumC0298Aa210};
    }

    public EnumC0298Aa2(String str, int i, Class cls, Class cls2, Object obj) {
        this.B = cls;
        this.C = cls2;
        this.D = obj;
    }

    public static EnumC0298Aa2[] values() {
        return (EnumC0298Aa2[]) O.clone();
    }

    public final Class a() {
        return this.C;
    }
}
