package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class NP2 extends OP2 {
    public final transient int D;
    public final transient int E;
    public final /* synthetic */ OP2 F;

    public NP2(OP2 op2, int i, int i2) {
        this.F = op2;
        this.D = i;
        this.E = i2;
    }

    @Override // com.daaw.JP2
    public final boolean D() {
        return true;
    }

    @Override // com.daaw.JP2
    public final Object[] E() {
        return this.F.E();
    }

    @Override // com.daaw.OP2
    /* JADX INFO: renamed from: F */
    public final OP2 subList(int i, int i2) {
        AbstractC5381iO2.h(i, i2, this.E);
        int i3 = this.D;
        return this.F.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5381iO2.a(i, this.E, "index");
        return this.F.get(i + this.D);
    }

    @Override // com.daaw.JP2
    public final int q() {
        return this.F.s() + this.D + this.E;
    }

    @Override // com.daaw.JP2
    public final int s() {
        return this.F.s() + this.D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }

    @Override // com.daaw.OP2, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
