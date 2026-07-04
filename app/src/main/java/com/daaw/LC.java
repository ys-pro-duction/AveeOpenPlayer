package com.daaw;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public interface LC {
    public static final Comparator a = new Comparator() { // from class: com.daaw.IC
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((LC) obj).getKey().compareTo(((LC) obj2).getKey());
        }
    };

    C4083dm0 a();

    boolean b();

    boolean c();

    boolean d();

    C6564mc1 e(C6488mK c6488mK);

    boolean f();

    CU0 g();

    TC getKey();

    C7465pp0 h();

    boolean i();

    boolean j();

    CU0 k();
}
