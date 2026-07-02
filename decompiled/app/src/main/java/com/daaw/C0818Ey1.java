package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ey1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0818Ey1 extends AbstractCallableC3025Zy1 {
    public final C8904ux1 i;
    public final long j;
    public final long k;

    public C0818Ey1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, C8904ux1 c8904ux1, long j, long j2) {
        super(c2813Xx1, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", c9733xv1, i, 11);
        this.i = c8904ux1;
        this.j = j;
        this.k = j2;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        C8904ux1 c8904ux1 = this.i;
        if (c8904ux1 != null) {
            C8339sx1 c8339sx1 = new C8339sx1((String) this.f.invoke(null, c8904ux1.b(), Long.valueOf(this.j), Long.valueOf(this.k)));
            synchronized (this.e) {
                try {
                    this.e.A0(c8339sx1.a.longValue());
                    if (c8339sx1.b.longValue() >= 0) {
                        this.e.G(c8339sx1.b.longValue());
                    }
                    if (c8339sx1.c.longValue() >= 0) {
                        this.e.g0(c8339sx1.c.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
