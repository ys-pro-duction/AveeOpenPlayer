package com.daaw;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.n50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC6703n50 {
    BOOLEAN(EnumC8067rz0.H, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC8067rz0.I, "char", "C", "java.lang.Character"),
    BYTE(EnumC8067rz0.J, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC8067rz0.K, "short", "S", "java.lang.Short"),
    INT(EnumC8067rz0.L, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC8067rz0.M, "float", "F", "java.lang.Float"),
    LONG(EnumC8067rz0.N, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC8067rz0.O, "double", "D", "java.lang.Double");

    public static final Map N = new HashMap();
    public static final Map O = new EnumMap(EnumC8067rz0.class);
    public static final Map P = new HashMap();
    public static final Set Q = new HashSet();
    public static final Map R = new HashMap();
    public final EnumC8067rz0 B;
    public final String C;
    public final String D;
    public final AP E;

    static {
        for (EnumC6703n50 enumC6703n50 : values()) {
            N.put(enumC6703n50.k(), enumC6703n50);
            O.put(enumC6703n50.l(), enumC6703n50);
            P.put(enumC6703n50.h(), enumC6703n50);
            String strReplace = enumC6703n50.E.b().replace('.', '/');
            Q.add(strReplace);
            R.put(strReplace, "(" + enumC6703n50.D + ")L" + strReplace + ";");
        }
    }

    EnumC6703n50(EnumC8067rz0 enumC8067rz0, String str, String str2, String str3) {
        if (enumC8067rz0 == null) {
            a(8);
        }
        if (str == null) {
            a(9);
        }
        if (str2 == null) {
            a(10);
        }
        if (str3 == null) {
            a(11);
        }
        this.B = enumC8067rz0;
        this.C = str;
        this.D = str2;
        this.E = new AP(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.EnumC6703n50.a(int):void");
    }

    public static EnumC6703n50 c(EnumC8067rz0 enumC8067rz0) {
        if (enumC8067rz0 == null) {
            a(5);
        }
        EnumC6703n50 enumC6703n50 = (EnumC6703n50) O.get(enumC8067rz0);
        if (enumC6703n50 == null) {
            a(6);
        }
        return enumC6703n50;
    }

    public static EnumC6703n50 g(String str) {
        if (str == null) {
            a(3);
        }
        EnumC6703n50 enumC6703n50 = (EnumC6703n50) N.get(str);
        if (enumC6703n50 != null) {
            return enumC6703n50;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String h() {
        String str = this.D;
        if (str == null) {
            a(14);
        }
        return str;
    }

    public String k() {
        String str = this.C;
        if (str == null) {
            a(13);
        }
        return str;
    }

    public EnumC8067rz0 l() {
        EnumC8067rz0 enumC8067rz0 = this.B;
        if (enumC8067rz0 == null) {
            a(12);
        }
        return enumC8067rz0;
    }

    public AP n() {
        AP ap = this.E;
        if (ap == null) {
            a(15);
        }
        return ap;
    }
}
