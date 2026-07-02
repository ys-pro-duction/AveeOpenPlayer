package com.daaw;

/* JADX INFO: renamed from: com.daaw.Py1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1961Py1 extends AbstractCallableC3025Zy1 {
    public C1961Py1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2) {
        super(c2813Xx1, "1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", c9733xv1, i, 48);
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        this.e.b0(3);
        boolean zBooleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
        synchronized (this.e) {
            try {
                if (zBooleanValue) {
                    this.e.b0(2);
                } else {
                    this.e.b0(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
