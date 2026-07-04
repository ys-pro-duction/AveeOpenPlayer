package com.daaw;

import com.daaw.InterfaceC3413bN;

/* JADX INFO: renamed from: com.daaw.hN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5095hN implements InterfaceC3413bN {
    public final float a;
    public final float b;
    public final float c;
    public final C10166zV0 d;

    public C5095hN(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        C10166zV0 c10166zV0 = new C10166zV0(1.0f);
        c10166zV0.d(f());
        c10166zV0.f(g());
        this.d = c10166zV0;
    }

    @Override // com.daaw.InterfaceC3413bN
    public float a(long j, float f, float f2, float f3) {
        this.d.e(f2);
        return AbstractC6887nl0.c(this.d.g(f, f3, j / 1000000));
    }

    @Override // com.daaw.InterfaceC3413bN
    public long b(float f, float f2, float f3) {
        float fB = this.d.b();
        float fA = this.d.a();
        float f4 = f - f2;
        float f5 = this.c;
        return AbstractC9887yV0.b(fB, fA, f3 / f5, f4 / f5, 1.0f) * 1000000;
    }

    @Override // com.daaw.InterfaceC3413bN
    public float c(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // com.daaw.InterfaceC3413bN
    public float d(long j, float f, float f2, float f3) {
        this.d.e(f2);
        return AbstractC6887nl0.b(this.d.g(f, f3, j / 1000000));
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC5866k7
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6290ld1 e(InterfaceC3626c71 interfaceC3626c71) {
        return InterfaceC3413bN.a.b(this, interfaceC3626c71);
    }

    public /* synthetic */ C5095hN(float f, float f2, float f3, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
