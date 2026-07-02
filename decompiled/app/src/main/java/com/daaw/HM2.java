package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class HM2 extends TM2 {
    public String a;
    public String b;

    @Override // com.daaw.TM2
    public final TM2 a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.daaw.TM2
    public final TM2 b(String str) {
        this.a = str;
        return this;
    }

    @Override // com.daaw.TM2
    public final UM2 c() {
        return new JM2(this.a, this.b, null);
    }
}
