package com.daaw;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.y61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9784y61 implements InterfaceC6549mZ0 {
    public final C8661u61 B;
    public final long[] C;
    public final Map D;
    public final Map E;

    public C9784y61(C8661u61 c8661u61, Map map, Map map2) {
        this.B = c8661u61;
        this.E = map2;
        this.D = map != null ? DesugarCollections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.C = c8661u61.j();
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
        return this.C[i];
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public List g(long j) {
        return this.B.h(j, this.D, this.E);
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public int h() {
        return this.C.length;
    }
}
