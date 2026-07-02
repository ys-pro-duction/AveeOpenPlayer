package com.daaw;

import com.daaw.InterfaceC5723jd1;

/* JADX INFO: renamed from: com.daaw.nd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6848nd1 implements InterfaceC5723jd1 {
    public final int a;
    public final int b;
    public final InterfaceC4216eF c;
    public final C6290ld1 d;

    public C6848nd1(int i, int i2, InterfaceC4216eF interfaceC4216eF) {
        G10.g(interfaceC4216eF, "easing");
        this.a = i;
        this.b = i2;
        this.c = interfaceC4216eF;
        this.d = new C6290ld1(new C5374iN(f(), e(), interfaceC4216eF));
    }

    @Override // com.daaw.InterfaceC5164hd1
    public boolean a() {
        return InterfaceC5723jd1.a.c(this);
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 b(long j, AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        return this.d.b(j, abstractC8664u7, abstractC8664u72, abstractC8664u73);
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 c(AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        return InterfaceC5723jd1.a.b(this, abstractC8664u7, abstractC8664u72, abstractC8664u73);
    }

    @Override // com.daaw.InterfaceC5164hd1
    public long d(AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        return InterfaceC5723jd1.a.a(this, abstractC8664u7, abstractC8664u72, abstractC8664u73);
    }

    @Override // com.daaw.InterfaceC5723jd1
    public int e() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC5723jd1
    public int f() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 g(long j, AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        return this.d.g(j, abstractC8664u7, abstractC8664u72, abstractC8664u73);
    }
}
