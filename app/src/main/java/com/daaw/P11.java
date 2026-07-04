package com.daaw;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class P11 {
    public static final a b = new a(null);
    public static final P11 c = new P11(0);
    public static final P11 d = new P11(1);
    public static final P11 e = new P11(2);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final P11 a() {
            return P11.e;
        }

        public final P11 b() {
            return P11.c;
        }

        public final P11 c() {
            return P11.d;
        }

        public a() {
        }
    }

    public P11(int i) {
        this.a = i;
    }

    public final boolean d(P11 p11) {
        G10.g(p11, "other");
        int i = this.a;
        return (p11.a | i) == i;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P11) && this.a == ((P11) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        if (this.a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.a & d.a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.a & e.a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + F11.d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
