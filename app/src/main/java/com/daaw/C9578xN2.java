package com.daaw;

/* JADX INFO: renamed from: com.daaw.xN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9578xN2 extends AbstractRunnableC8734uN2 {
    public final /* synthetic */ C7521q11 C;
    public final /* synthetic */ AbstractRunnableC8734uN2 D;
    public final /* synthetic */ EN2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9578xN2(EN2 en2, C7521q11 c7521q11, C7521q11 c7521q112, AbstractRunnableC8734uN2 abstractRunnableC8734uN2) {
        super(c7521q11);
        this.E = en2;
        this.C = c7521q112;
        this.D = abstractRunnableC8734uN2;
    }

    @Override // com.daaw.AbstractRunnableC8734uN2
    public final void a() {
        synchronized (this.E.f) {
            try {
                EN2.n(this.E, this.C);
                if (this.E.k.getAndIncrement() > 0) {
                    this.E.b.c("Already connected to the service.", new Object[0]);
                }
                EN2.p(this.E, this.D);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
