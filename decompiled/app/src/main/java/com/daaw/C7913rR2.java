package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.rR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7913rR2 extends AbstractC6798nR2 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public C7913rR2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // com.daaw.AbstractC6798nR2
    public final C7635qR2 a(AbstractC9873yR2 abstractC9873yR2, C7635qR2 c7635qR2) {
        return (C7635qR2) this.d.getAndSet(abstractC9873yR2, c7635qR2);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final C9594xR2 b(AbstractC9873yR2 abstractC9873yR2, C9594xR2 c9594xR2) {
        return (C9594xR2) this.c.getAndSet(abstractC9873yR2, c9594xR2);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final void c(C9594xR2 c9594xR2, C9594xR2 c9594xR22) {
        this.b.lazySet(c9594xR2, c9594xR22);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final void d(C9594xR2 c9594xR2, Thread thread) {
        this.a.lazySet(c9594xR2, thread);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean e(AbstractC9873yR2 abstractC9873yR2, C7635qR2 c7635qR2, C7635qR2 c7635qR22) {
        return AbstractC10152zR2.a(this.d, abstractC9873yR2, c7635qR2, c7635qR22);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean f(AbstractC9873yR2 abstractC9873yR2, Object obj, Object obj2) {
        return AbstractC10152zR2.a(this.e, abstractC9873yR2, obj, obj2);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean g(AbstractC9873yR2 abstractC9873yR2, C9594xR2 c9594xR2, C9594xR2 c9594xR22) {
        return AbstractC10152zR2.a(this.c, abstractC9873yR2, c9594xR2, c9594xR22);
    }
}
