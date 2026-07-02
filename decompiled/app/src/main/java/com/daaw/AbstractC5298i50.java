package com.daaw;

import com.daaw.AbstractC7261p50;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.i50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5298i50 implements InterfaceC2664Wm0 {
    public static final a d = new a(null);
    public static final String e;
    public static final List f;
    public static final Map g;
    public final String[] a;
    public final Set b;
    public final List c;

    /* JADX INFO: renamed from: com.daaw.i50$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.i50$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC7261p50.e.c.EnumC0222c.values().length];
            try {
                iArr[AbstractC7261p50.e.c.EnumC0222c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC7261p50.e.c.EnumC0222c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC7261p50.e.c.EnumC0222c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    static {
        String strN0 = AbstractC2455Um.n0(AbstractC1599Mm.n('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        e = strN0;
        List listN = AbstractC1599Mm.n(strN0 + "/Any", strN0 + "/Nothing", strN0 + "/Unit", strN0 + "/Throwable", strN0 + "/Number", strN0 + "/Byte", strN0 + "/Double", strN0 + "/Float", strN0 + "/Int", strN0 + "/Long", strN0 + "/Short", strN0 + "/Boolean", strN0 + "/Char", strN0 + "/CharSequence", strN0 + "/String", strN0 + "/Comparable", strN0 + "/Enum", strN0 + "/Array", strN0 + "/ByteArray", strN0 + "/DoubleArray", strN0 + "/FloatArray", strN0 + "/IntArray", strN0 + "/LongArray", strN0 + "/ShortArray", strN0 + "/BooleanArray", strN0 + "/CharArray", strN0 + "/Cloneable", strN0 + "/Annotation", strN0 + "/collections/Iterable", strN0 + "/collections/MutableIterable", strN0 + "/collections/Collection", strN0 + "/collections/MutableCollection", strN0 + "/collections/List", strN0 + "/collections/MutableList", strN0 + "/collections/Set", strN0 + "/collections/MutableSet", strN0 + "/collections/Map", strN0 + "/collections/MutableMap", strN0 + "/collections/Map.Entry", strN0 + "/collections/MutableMap.MutableEntry", strN0 + "/collections/Iterator", strN0 + "/collections/MutableIterator", strN0 + "/collections/ListIterator", strN0 + "/collections/MutableListIterator");
        f = listN;
        Iterable<C8500tZ> iterableS0 = AbstractC2455Um.S0(listN);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(iterableS0, 10)), 16));
        for (C8500tZ c8500tZ : iterableS0) {
            linkedHashMap.put((String) c8500tZ.d(), Integer.valueOf(c8500tZ.c()));
        }
        g = linkedHashMap;
    }

    public AbstractC5298i50(String[] strArr, Set set, List list) {
        G10.g(strArr, "strings");
        G10.g(set, "localNameIndices");
        G10.g(list, "records");
        this.a = strArr;
        this.b = set;
        this.c = list;
    }

    @Override // com.daaw.InterfaceC2664Wm0
    public String a(int i) {
        return getString(i);
    }

    @Override // com.daaw.InterfaceC2664Wm0
    public boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // com.daaw.InterfaceC2664Wm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC5298i50.getString(int):java.lang.String");
    }
}
