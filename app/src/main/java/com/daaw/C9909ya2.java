package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.ya2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9909ya2 extends AbstractC4308eb2 {
    public final transient int D;
    public final transient int E;
    public final /* synthetic */ AbstractC4308eb2 F;

    public C9909ya2(AbstractC4308eb2 abstractC4308eb2, int i, int i2) {
        this.F = abstractC4308eb2;
        this.D = i;
        this.E = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        B62.a(i, this.E, "index");
        return this.F.get(i + this.D);
    }

    @Override // com.daaw.AbstractC6446m92
    public final int q() {
        return this.F.s() + this.D + this.E;
    }

    @Override // com.daaw.AbstractC6446m92
    public final int s() {
        return this.F.s() + this.D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }

    @Override // com.daaw.AbstractC4308eb2, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.daaw.AbstractC6446m92
    public final Object[] w() {
        return this.F.w();
    }

    @Override // com.daaw.AbstractC4308eb2
    /* JADX INFO: renamed from: y */
    public final AbstractC4308eb2 subList(int i, int i2) {
        B62.c(i, i2, this.E);
        AbstractC4308eb2 abstractC4308eb2 = this.F;
        int i3 = this.D;
        return abstractC4308eb2.subList(i + i3, i2 + i3);
    }
}
