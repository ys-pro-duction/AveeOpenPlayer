package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.f71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4462f71 implements InterfaceC6549mZ0 {
    public static final C4462f71 C = new C4462f71();
    public final List B;

    public C4462f71(C1631Mu c1631Mu) {
        this.B = Collections.singletonList(c1631Mu);
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

    public C4462f71() {
        this.B = Collections.EMPTY_LIST;
    }
}
