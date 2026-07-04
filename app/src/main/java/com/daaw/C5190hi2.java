package com.daaw;

/* JADX INFO: renamed from: com.daaw.hi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5190hi2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ BinderC0663Dl2 F;
    public final /* synthetic */ C3831cr2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5190hi2(C3831cr2 c3831cr2, BinderC0663Dl2 binderC0663Dl2) {
        super(c3831cr2, true);
        this.G = c3831cr2;
        this.F = binderC0663Dl2;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.G.i)).registerOnMeasurementEventListener(this.F);
    }
}
