package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class NM2 extends AbstractC5657jN2 {
    public int a;
    public String b;
    public byte c;

    @Override // com.daaw.AbstractC5657jN2
    public final AbstractC5657jN2 a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.daaw.AbstractC5657jN2
    public final AbstractC5657jN2 b(int i) {
        this.a = i;
        this.c = (byte) 1;
        return this;
    }

    @Override // com.daaw.AbstractC5657jN2
    public final AbstractC5936kN2 c() {
        if (this.c == 1) {
            return new PM2(this.a, this.b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
