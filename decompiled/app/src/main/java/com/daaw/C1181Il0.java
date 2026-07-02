package com.daaw;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Il0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1181Il0 implements InterfaceC6549mZ0 {
    public final List B;

    public C1181Il0(List list) {
        this.B = DesugarCollections.unmodifiableList(list);
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public long c(int i) {
        AbstractC7115ob.a(i == 0);
        return 0L;
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public List g(long j) {
        return j >= 0 ? this.B : Collections.EMPTY_LIST;
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public int h() {
        return 1;
    }
}
