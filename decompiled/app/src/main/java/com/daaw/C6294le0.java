package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.le0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6294le0 extends AbstractC5168he0 {
    public final long B;
    public final long C;
    public boolean D;
    public long E;

    public C6294le0(long j, long j2, long j3) {
        this.B = j3;
        this.C = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.D = z;
        this.E = z ? j : j2;
    }

    @Override // com.daaw.AbstractC5168he0
    public long b() {
        long j = this.E;
        if (j != this.C) {
            this.E = this.B + j;
            return j;
        }
        if (!this.D) {
            throw new NoSuchElementException();
        }
        this.D = false;
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.D;
    }
}
