package com.daaw;

import com.daaw.InterfaceC3072a8;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3629c8 implements InterfaceC3072a8 {
    public final List B;

    public C3629c8(List list) {
        G10.g(list, "annotations");
        this.B = list;
    }

    @Override // com.daaw.InterfaceC3072a8
    public O7 i(AP ap) {
        return InterfaceC3072a8.b.a(this, ap);
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.B.iterator();
    }

    public String toString() {
        return this.B.toString();
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean z(AP ap) {
        return InterfaceC3072a8.b.b(this, ap);
    }
}
