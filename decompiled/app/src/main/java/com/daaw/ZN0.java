package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ZN0 implements InterfaceC1516Lr0 {
    public final int B;
    public final List C;
    public Float D;
    public Float E;

    public ZN0(int i, List list, Float f, Float f2, YN0 yn0, YN0 yn02) {
        G10.g(list, "allScopes");
        this.B = i;
        this.C = list;
        this.D = f;
        this.E = f2;
    }

    public final YN0 a() {
        return null;
    }

    public final Float b() {
        return this.D;
    }

    public final Float c() {
        return this.E;
    }

    public final int d() {
        return this.B;
    }

    public final YN0 e() {
        return null;
    }

    @Override // com.daaw.InterfaceC1516Lr0
    public boolean isValid() {
        return this.C.contains(this);
    }

    public final void f(YN0 yn0) {
    }

    public final void g(YN0 yn0) {
    }
}
