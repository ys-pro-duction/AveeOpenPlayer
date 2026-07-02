package com.daaw;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X extends AbstractSet implements Set, K60 {
    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }
}
