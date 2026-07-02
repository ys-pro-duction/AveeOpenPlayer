package com.daaw;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'E' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.daaw.tP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8463tP2 {
    public static final EnumC8463tP2 C;
    public static final EnumC8463tP2 D;
    public static final EnumC8463tP2 E;
    public static final EnumC8463tP2 F;
    public static final EnumC8463tP2 G;
    public static final EnumC8463tP2 H;
    public static final EnumC8463tP2 I;
    public static final EnumC8463tP2 J;
    public static final EnumC8463tP2 K;
    public static final EnumC8463tP2 L;
    public static final EnumC8463tP2 M;
    public static final EnumC8463tP2 N;
    public static final EnumC8463tP2 O;
    public static final EnumC8463tP2 P;
    public static final EnumC8463tP2 Q;
    public static final EnumC8463tP2 R;
    public static final EnumC8463tP2 S;
    public static final EnumC8463tP2 T;
    public static final /* synthetic */ EnumC8463tP2[] U;
    public final XP2 B;

    static {
        EnumC8463tP2 enumC8463tP2 = new EnumC8463tP2("DOUBLE", 0, XP2.DOUBLE, 1);
        C = enumC8463tP2;
        EnumC8463tP2 enumC8463tP22 = new EnumC8463tP2("FLOAT", 1, XP2.FLOAT, 5);
        D = enumC8463tP22;
        XP2 xp2 = XP2.LONG;
        EnumC8463tP2 enumC8463tP23 = new EnumC8463tP2("INT64", 2, xp2, 0);
        E = enumC8463tP23;
        EnumC8463tP2 enumC8463tP24 = new EnumC8463tP2("UINT64", 3, xp2, 0);
        F = enumC8463tP24;
        XP2 xp22 = XP2.INT;
        EnumC8463tP2 enumC8463tP25 = new EnumC8463tP2("INT32", 4, xp22, 0);
        G = enumC8463tP25;
        EnumC8463tP2 enumC8463tP26 = new EnumC8463tP2("FIXED64", 5, xp2, 1);
        H = enumC8463tP26;
        EnumC8463tP2 enumC8463tP27 = new EnumC8463tP2("FIXED32", 6, xp22, 5);
        I = enumC8463tP27;
        EnumC8463tP2 enumC8463tP28 = new EnumC8463tP2("BOOL", 7, XP2.BOOLEAN, 0);
        J = enumC8463tP28;
        EnumC8463tP2 enumC8463tP29 = new EnumC8463tP2("STRING", 8, XP2.STRING, 2);
        K = enumC8463tP29;
        XP2 xp23 = XP2.MESSAGE;
        EnumC8463tP2 enumC8463tP210 = new EnumC8463tP2("GROUP", 9, xp23, 3);
        L = enumC8463tP210;
        EnumC8463tP2 enumC8463tP211 = new EnumC8463tP2("MESSAGE", 10, xp23, 2);
        M = enumC8463tP211;
        EnumC8463tP2 enumC8463tP212 = new EnumC8463tP2("BYTES", 11, XP2.BYTE_STRING, 2);
        N = enumC8463tP212;
        EnumC8463tP2 enumC8463tP213 = new EnumC8463tP2("UINT32", 12, xp22, 0);
        O = enumC8463tP213;
        EnumC8463tP2 enumC8463tP214 = new EnumC8463tP2("ENUM", 13, XP2.ENUM, 0);
        P = enumC8463tP214;
        EnumC8463tP2 enumC8463tP215 = new EnumC8463tP2("SFIXED32", 14, xp22, 5);
        Q = enumC8463tP215;
        EnumC8463tP2 enumC8463tP216 = new EnumC8463tP2("SFIXED64", 15, xp2, 1);
        R = enumC8463tP216;
        EnumC8463tP2 enumC8463tP217 = new EnumC8463tP2("SINT32", 16, xp22, 0);
        S = enumC8463tP217;
        EnumC8463tP2 enumC8463tP218 = new EnumC8463tP2("SINT64", 17, xp2, 0);
        T = enumC8463tP218;
        U = new EnumC8463tP2[]{enumC8463tP2, enumC8463tP22, enumC8463tP23, enumC8463tP24, enumC8463tP25, enumC8463tP26, enumC8463tP27, enumC8463tP28, enumC8463tP29, enumC8463tP210, enumC8463tP211, enumC8463tP212, enumC8463tP213, enumC8463tP214, enumC8463tP215, enumC8463tP216, enumC8463tP217, enumC8463tP218};
    }

    public EnumC8463tP2(String str, int i, XP2 xp2, int i2) {
        this.B = xp2;
    }

    public static EnumC8463tP2[] values() {
        return (EnumC8463tP2[]) U.clone();
    }

    public final XP2 a() {
        return this.B;
    }
}
