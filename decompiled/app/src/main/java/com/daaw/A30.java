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
/* JADX INFO: loaded from: classes3.dex */
public final class A30 {
    public static final A30 E;
    public static final A30 F;
    public static final A30 G;
    public static final A30 H;
    public static final A30 I;
    public static final A30 J;
    public static final A30 K;
    public static final A30 L;
    public static final A30 M;
    public static final A30 N;
    public static final /* synthetic */ A30[] O;
    public final Class B;
    public final Class C;
    public final Object D;

    static {
        A30 a30 = new A30("VOID", 0, Void.class, Void.class, null);
        E = a30;
        Class cls = Integer.TYPE;
        A30 a302 = new A30("INT", 1, cls, Integer.class, 0);
        F = a302;
        A30 a303 = new A30("LONG", 2, Long.TYPE, Long.class, 0L);
        G = a303;
        A30 a304 = new A30("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        H = a304;
        A30 a305 = new A30("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        I = a305;
        A30 a306 = new A30("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        J = a306;
        A30 a307 = new A30("STRING", 6, String.class, String.class, "");
        K = a307;
        A30 a308 = new A30("BYTE_STRING", 7, AbstractC4340ei.class, AbstractC4340ei.class, AbstractC4340ei.C);
        L = a308;
        A30 a309 = new A30("ENUM", 8, cls, Integer.class, null);
        M = a309;
        A30 a3010 = new A30("MESSAGE", 9, Object.class, Object.class, null);
        N = a3010;
        O = new A30[]{a30, a302, a303, a304, a305, a306, a307, a308, a309, a3010};
    }

    public A30(String str, int i, Class cls, Class cls2, Object obj) {
        this.B = cls;
        this.C = cls2;
        this.D = obj;
    }

    public static A30 valueOf(String str) {
        return (A30) Enum.valueOf(A30.class, str);
    }

    public static A30[] values() {
        return (A30[]) O.clone();
    }

    public Class a() {
        return this.C;
    }
}
