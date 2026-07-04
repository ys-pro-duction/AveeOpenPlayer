package com.daaw;

/* JADX INFO: renamed from: com.daaw.md1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6569md1 implements InterfaceC6002kd1 {
    public final float a;
    public final float b;
    public final /* synthetic */ C6290ld1 c;

    public C6569md1(float f, float f2, InterfaceC9229w7 interfaceC9229w7) {
        this.a = f;
        this.b = f2;
        this.c = new C6290ld1(interfaceC9229w7);
    }

    @Override // com.daaw.InterfaceC5164hd1
    public boolean a() {
        return this.c.a();
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 b(long j, AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        return this.c.b(j, abstractC8664u7, abstractC8664u72, abstractC8664u73);
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 c(AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        return this.c.c(abstractC8664u7, abstractC8664u72, abstractC8664u73);
    }

    @Override // com.daaw.InterfaceC5164hd1
    public long d(AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        return this.c.d(abstractC8664u7, abstractC8664u72, abstractC8664u73);
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 g(long j, AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        return this.c.g(j, abstractC8664u7, abstractC8664u72, abstractC8664u73);
    }

    public C6569md1(float f, float f2, AbstractC8664u7 abstractC8664u7) {
        this(f, f2, AbstractC5443id1.b(abstractC8664u7, f, f2));
    }
}
