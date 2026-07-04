package com.daaw;

/* JADX INFO: renamed from: com.daaw.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7708qi implements InterfaceC4988gz {
    public InterfaceC7981rh B = C5067hG.a;
    public MD C;

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float H(int i) {
        return AbstractC4709fz.b(this, i);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float J() {
        return this.B.getDensity().J();
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float O(float f) {
        return AbstractC4709fz.d(this, f);
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ int V(float f) {
        return AbstractC4709fz.a(this, f);
    }

    public final long a() {
        return this.B.a();
    }

    public final MD b() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ long d0(long j) {
        return AbstractC4709fz.e(this, j);
    }

    public final MD e(NQ nq) {
        G10.g(nq, "block");
        MD md = new MD(nq);
        this.C = md;
        return md;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float e0(long j) {
        return AbstractC4709fz.c(this, j);
    }

    public final void f(InterfaceC7981rh interfaceC7981rh) {
        G10.g(interfaceC7981rh, "<set-?>");
        this.B = interfaceC7981rh;
    }

    public final void g(MD md) {
        this.C = md;
    }

    @Override // com.daaw.InterfaceC4988gz
    public float getDensity() {
        return this.B.getDensity().getDensity();
    }

    public final EnumC7560q90 getLayoutDirection() {
        return this.B.getLayoutDirection();
    }
}
