package com.daaw;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class YC {
    public static final Comparator c = new Comparator() { // from class: com.daaw.WC
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return YC.b((YC) obj, (YC) obj2);
        }
    };
    public static final Comparator d = new Comparator() { // from class: com.daaw.XC
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return YC.a((YC) obj, (YC) obj2);
        }
    };
    public final TC a;
    public final int b;

    public YC(TC tc, int i) {
        this.a = tc;
        this.b = i;
    }

    public static /* synthetic */ int a(YC yc, YC yc2) {
        int iL = AbstractC6838nb1.l(yc.b, yc2.b);
        return iL != 0 ? iL : yc.a.compareTo(yc2.a);
    }

    public static /* synthetic */ int b(YC yc, YC yc2) {
        int iCompareTo = yc.a.compareTo(yc2.a);
        return iCompareTo != 0 ? iCompareTo : AbstractC6838nb1.l(yc.b, yc2.b);
    }

    public int c() {
        return this.b;
    }

    public TC d() {
        return this.a;
    }
}
