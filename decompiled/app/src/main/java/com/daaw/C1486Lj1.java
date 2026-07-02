package com.daaw;

import com.daaw.W00;

/* JADX INFO: renamed from: com.daaw.Lj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1486Lj1 extends W00.a {
    public String a;
    public Long b;

    @Override // com.daaw.W00.a
    public final W00 a() {
        String str = this.a;
        if (str != null) {
            return new C2237Sj1(str, this.b, null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.daaw.W00.a
    public final W00.a b(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    @Override // com.daaw.W00.a
    public final W00.a c(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.a = str;
        return this;
    }
}
