package com.daaw;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V extends AbstractList implements List, InterfaceC10062z60 {
    public abstract int e();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return s(i);
    }

    public abstract Object s(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
