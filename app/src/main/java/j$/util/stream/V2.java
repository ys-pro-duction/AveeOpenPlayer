package j$.util.stream;

import j$.util.C10397o;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class V2 {
    public static final V2 DISTINCT;
    public static final V2 ORDERED;
    public static final V2 SHORT_CIRCUIT;
    public static final V2 SIZED;
    public static final V2 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ V2[] v;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static V2 valueOf(String str) {
        return (V2) Enum.valueOf(V2.class, str);
    }

    public static V2[] values() {
        return (V2[]) v.clone();
    }

    static {
        U2 u2 = U2.SPLITERATOR;
        C10397o c10397oU = u(u2);
        U2 u22 = U2.STREAM;
        c10397oU.b(u22);
        U2 u23 = U2.OP;
        ((EnumMap) c10397oU.b).put(u23, 3);
        V2 v2 = new V2("DISTINCT", 0, 0, c10397oU);
        DISTINCT = v2;
        C10397o c10397oU2 = u(u2);
        c10397oU2.b(u22);
        ((EnumMap) c10397oU2.b).put(u23, 3);
        V2 v22 = new V2("SORTED", 1, 1, c10397oU2);
        SORTED = v22;
        C10397o c10397oU3 = u(u2);
        c10397oU3.b(u22);
        EnumMap enumMap = (EnumMap) c10397oU3.b;
        enumMap.put(u23, 3);
        U2 u24 = U2.TERMINAL_OP;
        enumMap.put(u24, 2);
        U2 u25 = U2.UPSTREAM_TERMINAL_OP;
        enumMap.put(u25, 2);
        V2 v23 = new V2("ORDERED", 2, 2, c10397oU3);
        ORDERED = v23;
        C10397o c10397oU4 = u(u2);
        c10397oU4.b(u22);
        ((EnumMap) c10397oU4.b).put(u23, 2);
        V2 v24 = new V2("SIZED", 3, 3, c10397oU4);
        SIZED = v24;
        C10397o c10397oU5 = u(u23);
        c10397oU5.b(u24);
        int i2 = 0;
        V2 v25 = new V2("SHORT_CIRCUIT", 4, 12, c10397oU5);
        SHORT_CIRCUIT = v25;
        v = new V2[]{v2, v22, v23, v24, v25};
        f = n(u2);
        g = n(u22);
        h = n(u23);
        n(u24);
        n(u25);
        for (V2 v26 : values()) {
            i2 |= v26.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        V2 v27 = DISTINCT;
        m = v27.c;
        n = v27.d;
        V2 v28 = SORTED;
        o = v28.c;
        p = v28.d;
        V2 v29 = ORDERED;
        q = v29.c;
        r = v29.d;
        V2 v210 = SIZED;
        s = v210.c;
        t = v210.d;
        u = SHORT_CIRCUIT.c;
    }

    public static C10397o u(U2 u2) {
        C10397o c10397o = new C10397o(9, new EnumMap(U2.class));
        c10397o.b(u2);
        return c10397o;
    }

    public V2(String str, int i2, int i3, C10397o c10397o) {
        U2[] u2ArrValues = U2.values();
        int length = u2ArrValues.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = (EnumMap) c10397o.b;
            if (i4 < length) {
                j$.com.android.tools.r8.a.Y(enumMap, u2ArrValues[i4], 0);
                i4++;
            } else {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
        }
    }

    public final boolean r(int i2) {
        return (i2 & this.e) == this.c;
    }

    public static int n(U2 u2) {
        int iIntValue = 0;
        for (V2 v2 : values()) {
            iIntValue |= ((Integer) v2.a.get(u2)).intValue() << v2.b;
        }
        return iIntValue;
    }

    public static int k(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    public static int q(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }
}
