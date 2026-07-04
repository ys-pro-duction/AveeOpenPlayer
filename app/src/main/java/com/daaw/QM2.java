package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class QM2 extends AbstractC6503mN2 {
    public String a;
    public String b;

    @Override // com.daaw.AbstractC6503mN2
    public final AbstractC6503mN2 a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.daaw.AbstractC6503mN2
    public final AbstractC6503mN2 b(String str) {
        this.a = str;
        return this;
    }

    @Override // com.daaw.AbstractC6503mN2
    public final AbstractC6782nN2 c() {
        return new SM2(this.a, this.b, null);
    }
}
