package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class NV0 implements InterfaceC6549mZ0 {
    public final C1631Mu[] B;
    public final long[] C;

    public NV0(C1631Mu[] c1631MuArr, long[] jArr) {
        this.B = c1631MuArr;
        this.C = jArr;
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public int a(long j) {
        int iC = AbstractC6280lb1.c(this.C, j, false, false);
        if (iC < this.C.length) {
            return iC;
        }
        return -1;
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public long c(int i) {
        AbstractC7115ob.a(i >= 0);
        AbstractC7115ob.a(i < this.C.length);
        return this.C[i];
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public List g(long j) {
        C1631Mu c1631Mu;
        int iE = AbstractC6280lb1.e(this.C, j, true, false);
        return (iE == -1 || (c1631Mu = this.B[iE]) == null) ? Collections.EMPTY_LIST : Collections.singletonList(c1631Mu);
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public int h() {
        return this.C.length;
    }
}
