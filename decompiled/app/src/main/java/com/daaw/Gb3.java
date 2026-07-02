package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Gb3 extends Rb3 {
    public final transient int D;
    public final transient int E;
    public final /* synthetic */ Rb3 F;

    public Gb3(Rb3 rb3, int i, int i2) {
        this.F = rb3;
        this.D = i;
        this.E = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Ka3.a(i, this.E, "index");
        return this.F.get(i + this.D);
    }

    @Override // com.daaw.AbstractC9636xb3
    public final int q() {
        return this.F.s() + this.D + this.E;
    }

    @Override // com.daaw.AbstractC9636xb3
    public final int s() {
        return this.F.s() + this.D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }

    @Override // com.daaw.Rb3, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.daaw.AbstractC9636xb3
    public final Object[] w() {
        return this.F.w();
    }

    @Override // com.daaw.Rb3
    /* JADX INFO: renamed from: y */
    public final Rb3 subList(int i, int i2) {
        Ka3.c(i, i2, this.E);
        Rb3 rb3 = this.F;
        int i3 = this.D;
        return rb3.subList(i + i3, i2 + i3);
    }
}
