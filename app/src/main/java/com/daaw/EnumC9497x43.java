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
/* JADX INFO: renamed from: com.daaw.x43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9497x43 {
    public static final EnumC9497x43 E;
    public static final EnumC9497x43 F;
    public static final EnumC9497x43 G;
    public static final EnumC9497x43 H;
    public static final EnumC9497x43 I;
    public static final EnumC9497x43 J;
    public static final EnumC9497x43 K;
    public static final EnumC9497x43 L;
    public static final EnumC9497x43 M;
    public static final EnumC9497x43 N;
    public static final /* synthetic */ EnumC9497x43[] O;
    public final Class B;
    public final Class C;
    public final Object D;

    static {
        EnumC9497x43 enumC9497x43 = new EnumC9497x43("VOID", 0, Void.class, Void.class, null);
        E = enumC9497x43;
        Class cls = Integer.TYPE;
        EnumC9497x43 enumC9497x432 = new EnumC9497x43("INT", 1, cls, Integer.class, 0);
        F = enumC9497x432;
        EnumC9497x43 enumC9497x433 = new EnumC9497x43("LONG", 2, Long.TYPE, Long.class, 0L);
        G = enumC9497x433;
        EnumC9497x43 enumC9497x434 = new EnumC9497x43("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        H = enumC9497x434;
        EnumC9497x43 enumC9497x435 = new EnumC9497x43("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        I = enumC9497x435;
        EnumC9497x43 enumC9497x436 = new EnumC9497x43("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        J = enumC9497x436;
        EnumC9497x43 enumC9497x437 = new EnumC9497x43("STRING", 6, String.class, String.class, "");
        K = enumC9497x437;
        EnumC9497x43 enumC9497x438 = new EnumC9497x43("BYTE_STRING", 7, AbstractC9213w33.class, AbstractC9213w33.class, AbstractC9213w33.C);
        L = enumC9497x438;
        EnumC9497x43 enumC9497x439 = new EnumC9497x43("ENUM", 8, cls, Integer.class, null);
        M = enumC9497x439;
        EnumC9497x43 enumC9497x4310 = new EnumC9497x43("MESSAGE", 9, Object.class, Object.class, null);
        N = enumC9497x4310;
        O = new EnumC9497x43[]{enumC9497x43, enumC9497x432, enumC9497x433, enumC9497x434, enumC9497x435, enumC9497x436, enumC9497x437, enumC9497x438, enumC9497x439, enumC9497x4310};
    }

    public EnumC9497x43(String str, int i, Class cls, Class cls2, Object obj) {
        this.B = cls;
        this.C = cls2;
        this.D = obj;
    }

    public static EnumC9497x43[] values() {
        return (EnumC9497x43[]) O.clone();
    }

    public final Class a() {
        return this.C;
    }
}
