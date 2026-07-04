package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ky1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1442Ky1 extends AbstractCallableC3025Zy1 {
    public final boolean i;

    public C1442Ky1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2) {
        super(c2813Xx1, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", c9733xv1, i, 61);
        this.i = c2813Xx1.s();
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        long jLongValue = ((Long) this.f.invoke(null, this.b.b(), Boolean.valueOf(this.i))).longValue();
        synchronized (this.e) {
            this.e.t(jLongValue);
        }
    }
}
