package com.daaw;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.x80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9514x80 {
    public final a a;
    public final C4740g50 b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String f;
    public final int g;
    public final String h;
    public final byte[] i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.x80$a */
    public static final class a {
        public static final C0253a C;
        public static final Map D;
        public static final a E = new a("UNKNOWN", 0, 0);
        public static final a F = new a("CLASS", 1, 1);
        public static final a G = new a("FILE_FACADE", 2, 2);
        public static final a H = new a("SYNTHETIC_CLASS", 3, 3);
        public static final a I = new a("MULTIFILE_CLASS", 4, 4);
        public static final a J = new a("MULTIFILE_CLASS_PART", 5, 5);
        public static final /* synthetic */ a[] K;
        public static final /* synthetic */ YG L;
        public final int B;

        /* JADX INFO: renamed from: com.daaw.x80$a$a, reason: collision with other inner class name */
        public static final class C0253a {
            public /* synthetic */ C0253a(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            public final a a(int i) {
                a aVar = (a) a.D.get(Integer.valueOf(i));
                return aVar == null ? a.E : aVar;
            }

            public C0253a() {
            }
        }

        static {
            a[] aVarArrA = a();
            K = aVarArrA;
            L = AbstractC3110aH.a(aVarArrA);
            C = new C0253a(null);
            a[] aVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(aVarArrValues.length), 16));
            for (a aVar : aVarArrValues) {
                linkedHashMap.put(Integer.valueOf(aVar.B), aVar);
            }
            D = linkedHashMap;
        }

        public a(String str, int i, int i2) {
            this.B = i2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{E, F, G, H, I, J};
        }

        public static final a g(int i) {
            return C.a(i);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) K.clone();
        }
    }

    public C9514x80(a aVar, C4740g50 c4740g50, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        G10.g(aVar, "kind");
        G10.g(c4740g50, "metadataVersion");
        this.a = aVar;
        this.b = c4740g50;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str;
        this.g = i;
        this.h = str2;
        this.i = bArr;
    }

    public final String[] a() {
        return this.c;
    }

    public final String[] b() {
        return this.d;
    }

    public final a c() {
        return this.a;
    }

    public final C4740g50 d() {
        return this.b;
    }

    public final String e() {
        String str = this.f;
        if (this.a == a.J) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.c;
        if (this.a != a.I) {
            strArr = null;
        }
        List listD = strArr != null ? AbstractC5152hb.d(strArr) : null;
        return listD == null ? AbstractC1599Mm.k() : listD;
    }

    public final String[] g() {
        return this.e;
    }

    public final boolean h(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean i() {
        return h(this.g, 2);
    }

    public final boolean j() {
        return h(this.g, 16) && !h(this.g, 32);
    }

    public String toString() {
        return this.a + " version=" + this.b;
    }
}
