package com.daaw;

/* JADX INFO: renamed from: com.daaw.Uj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2445Uj1 extends AbstractC1074Hk1 {
    public String a;

    @Override // com.daaw.AbstractC1074Hk1
    public final AbstractC1074Hk1 a(String str) {
        this.a = str;
        return this;
    }

    @Override // com.daaw.AbstractC1074Hk1
    public final X00 b() {
        String str = this.a;
        if (str != null) {
            return new C2861Yj1(str, null);
        }
        throw new IllegalStateException("Missing required properties: token");
    }
}
