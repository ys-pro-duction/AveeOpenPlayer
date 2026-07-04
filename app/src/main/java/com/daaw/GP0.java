package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class GP0 extends GO0 {
    public final AtomicReferenceArray F;

    public GP0(long j, GP0 gp0, int i) {
        super(j, gp0, i);
        this.F = new AtomicReferenceArray(FP0.f);
    }

    @Override // com.daaw.GO0
    public int n() {
        return FP0.f;
    }

    @Override // com.daaw.GO0
    public void o(int i, Throwable th, InterfaceC4684ft interfaceC4684ft) {
        r().set(i, FP0.e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.F;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.D + ", hashCode=" + hashCode() + ']';
    }
}
