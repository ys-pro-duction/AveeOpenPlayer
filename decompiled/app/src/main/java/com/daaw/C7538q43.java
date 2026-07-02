package com.daaw;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.q43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7538q43 extends AbstractList {
    public final List B;
    public final InterfaceC7259p43 C;

    public C7538q43(List list, InterfaceC7259p43 interfaceC7259p43) {
        this.B = list;
        this.C = interfaceC7259p43;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OB1 ob1A = OB1.a(((Integer) this.B.get(i)).intValue());
        return ob1A == null ? OB1.AD_FORMAT_TYPE_UNSPECIFIED : ob1A;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.size();
    }
}
