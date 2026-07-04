package com.daaw;

import com.daaw.X80;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class W80 implements X80 {
    public static final W80 a = new W80();

    public static W80 i() {
        return a;
    }

    @Override // com.daaw.X80
    public X80 b(Object obj, Object obj2, Comparator comparator) {
        return new Y80(obj, obj2);
    }

    @Override // com.daaw.X80
    public boolean f() {
        return false;
    }

    @Override // com.daaw.X80
    public Object getKey() {
        return null;
    }

    @Override // com.daaw.X80
    public Object getValue() {
        return null;
    }

    @Override // com.daaw.X80
    public boolean isEmpty() {
        return true;
    }

    @Override // com.daaw.X80
    public int size() {
        return 0;
    }

    @Override // com.daaw.X80
    public X80 a() {
        return this;
    }

    @Override // com.daaw.X80
    public X80 d() {
        return this;
    }

    @Override // com.daaw.X80
    public X80 g() {
        return this;
    }

    @Override // com.daaw.X80
    public X80 h() {
        return this;
    }

    @Override // com.daaw.X80
    public X80 c(Object obj, Comparator comparator) {
        return this;
    }

    @Override // com.daaw.X80
    public X80 e(Object obj, Object obj2, X80.a aVar, X80 x80, X80 x802) {
        return this;
    }
}
