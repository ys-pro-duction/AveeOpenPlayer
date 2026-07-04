package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2235Sj implements InterfaceC6549mZ0 {
    public final List B;

    public C2235Sj(List list) {
        this.B = list;
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
