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
public final class Hf3 {
    public static final Hf3 E;
    public static final Hf3 F;
    public static final Hf3 G;
    public static final Hf3 H;
    public static final Hf3 I;
    public static final Hf3 J;
    public static final Hf3 K;
    public static final Hf3 L;
    public static final Hf3 M;
    public static final Hf3 N;
    public static final /* synthetic */ Hf3[] O;
    public final Class B;
    public final Class C;
    public final Object D;

    static {
        Hf3 hf3 = new Hf3("VOID", 0, Void.class, Void.class, null);
        E = hf3;
        Class cls = Integer.TYPE;
        Hf3 hf32 = new Hf3("INT", 1, cls, Integer.class, 0);
        F = hf32;
        Hf3 hf33 = new Hf3("LONG", 2, Long.TYPE, Long.class, 0L);
        G = hf33;
        Hf3 hf34 = new Hf3("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        H = hf34;
        Hf3 hf35 = new Hf3("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        I = hf35;
        Hf3 hf36 = new Hf3("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        J = hf36;
        Hf3 hf37 = new Hf3("STRING", 6, String.class, String.class, "");
        K = hf37;
        Hf3 hf38 = new Hf3("BYTE_STRING", 7, AbstractC9646xd3.class, AbstractC9646xd3.class, AbstractC9646xd3.C);
        L = hf38;
        Hf3 hf39 = new Hf3("ENUM", 8, cls, Integer.class, null);
        M = hf39;
        Hf3 hf310 = new Hf3("MESSAGE", 9, Object.class, Object.class, null);
        N = hf310;
        O = new Hf3[]{hf3, hf32, hf33, hf34, hf35, hf36, hf37, hf38, hf39, hf310};
    }

    public Hf3(String str, int i, Class cls, Class cls2, Object obj) {
        this.B = cls;
        this.C = cls2;
        this.D = obj;
    }

    public static Hf3[] values() {
        return (Hf3[]) O.clone();
    }

    public final Class a() {
        return this.C;
    }
}
