package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.rZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7943rZ0 extends AbstractC9713xr0 implements InterfaceC6549mZ0 {
    public InterfaceC6549mZ0 E;
    public long F;

    @Override // com.daaw.InterfaceC6549mZ0
    public int a(long j) {
        return this.E.a(j - this.F);
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public long c(int i) {
        return this.E.c(i) + this.F;
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public List g(long j) {
        return this.E.g(j - this.F);
    }

    @Override // com.daaw.InterfaceC6549mZ0
    public int h() {
        return this.E.h();
    }

    @Override // com.daaw.AbstractC4335eh
    public void l() {
        super.l();
        this.E = null;
    }

    public abstract void s();

    public void t(long j, InterfaceC6549mZ0 interfaceC6549mZ0, long j2) {
        this.C = j;
        this.E = interfaceC6549mZ0;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.F = j;
    }
}
