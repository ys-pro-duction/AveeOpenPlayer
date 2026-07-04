package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class KR0 extends AbstractC6956o0 {
    public long a = -1;
    public InterfaceC1416Ks b;

    @Override // com.daaw.AbstractC6956o0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(IR0 ir0) {
        if (this.a >= 0) {
            return false;
        }
        this.a = ir0.Z();
        return true;
    }

    @Override // com.daaw.AbstractC6956o0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC1416Ks[] b(IR0 ir0) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ir0.Y(j);
    }
}
