package com.daaw;

import com.daaw.AbstractC9870yR;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.zR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10149zR {
    public static final a c = new a(null);
    public static final C10149zR d = new C10149zR(AbstractC1599Mm.n(AbstractC9870yR.a.e, AbstractC9870yR.d.e, AbstractC9870yR.b.e, AbstractC9870yR.c.e));
    public final List a;
    public final Map b;

    /* JADX INFO: renamed from: com.daaw.zR$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C10149zR a() {
            return C10149zR.d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.zR$b */
    public static final class b {
        public final AbstractC9870yR a;
        public final int b;

        public b(AbstractC9870yR abstractC9870yR, int i) {
            G10.g(abstractC9870yR, "kind");
            this.a = abstractC9870yR;
            this.b = i;
        }

        public final AbstractC9870yR a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final AbstractC9870yR c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G10.c(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public String toString() {
            return "KindWithArity(kind=" + this.a + ", arity=" + this.b + ')';
        }
    }

    public C10149zR(List list) {
        G10.g(list, "kinds");
        this.a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            AP apB = ((AbstractC9870yR) obj).b();
            Object arrayList = linkedHashMap.get(apB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(apB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    public final AbstractC9870yR b(AP ap, String str) {
        G10.g(ap, "packageFqName");
        G10.g(str, "className");
        b bVarC = c(ap, str);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final b c(AP ap, String str) {
        G10.g(ap, "packageFqName");
        G10.g(str, "className");
        List<AbstractC9870yR> list = (List) this.b.get(ap);
        if (list == null) {
            return null;
        }
        for (AbstractC9870yR abstractC9870yR : list) {
            if (AY0.u(str, abstractC9870yR.a(), false, 2, null)) {
                String strSubstring = str.substring(abstractC9870yR.a().length());
                G10.f(strSubstring, "substring(...)");
                Integer numD = d(strSubstring);
                if (numD != null) {
                    return new b(abstractC9870yR, numD.intValue());
                }
            }
        }
        return null;
    }

    public final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iCharAt = str.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i = (i * 10) + iCharAt;
        }
        return Integer.valueOf(i);
    }
}
