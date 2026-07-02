package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.aS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3157aS2 extends AbstractC3436bS2 {
    public final Callable F;
    public final /* synthetic */ C3714cS2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3157aS2(C3714cS2 c3714cS2, Callable callable, Executor executor) {
        super(c3714cS2, executor);
        this.G = c3714cS2;
        this.F = callable;
    }

    @Override // com.daaw.OS2
    public final Object a() {
        return this.F.call();
    }

    @Override // com.daaw.OS2
    public final String b() {
        return this.F.toString();
    }

    @Override // com.daaw.AbstractC3436bS2
    public final void h(Object obj) {
        this.G.e(obj);
    }
}
