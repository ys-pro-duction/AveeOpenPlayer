package com.daaw;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public interface X80 {

    public enum a {
        RED,
        BLACK
    }

    X80 a();

    X80 b(Object obj, Object obj2, Comparator comparator);

    X80 c(Object obj, Comparator comparator);

    X80 d();

    X80 e(Object obj, Object obj2, a aVar, X80 x80, X80 x802);

    boolean f();

    X80 g();

    Object getKey();

    Object getValue();

    X80 h();

    boolean isEmpty();

    int size();
}
