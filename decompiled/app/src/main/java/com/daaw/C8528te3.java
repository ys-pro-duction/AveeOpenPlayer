package com.daaw;

/* JADX INFO: renamed from: com.daaw.te3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8528te3 extends AbstractC0585Cu1 {
    public final /* synthetic */ C9372we3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8528te3(C9372we3 c9372we3, InterfaceC5027h63 interfaceC5027h63) {
        super(interfaceC5027h63);
        this.e = c9372we3;
    }

    @Override // com.daaw.AbstractC0585Cu1
    public final void c() {
        this.e.i();
        this.e.a.w().s().a("Starting upload from DelayedRunnable");
        this.e.b.C();
    }
}
