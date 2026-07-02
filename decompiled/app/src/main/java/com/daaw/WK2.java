package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class WK2 extends TK2 {
    public String a;
    public boolean b;
    public boolean c;
    public byte d;

    @Override // com.daaw.TK2
    public final TK2 a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.a = str;
        return this;
    }

    @Override // com.daaw.TK2
    public final TK2 b(boolean z) {
        this.c = true;
        this.d = (byte) (this.d | 2);
        return this;
    }

    @Override // com.daaw.TK2
    public final TK2 c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
        return this;
    }

    @Override // com.daaw.TK2
    public final UK2 d() {
        String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new YK2(str, this.b, this.c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" clientVersion");
        }
        if ((this.d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
