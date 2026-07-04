package com.daaw;

/* JADX INFO: renamed from: com.daaw.up1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8860up1 extends AbstractC3815co1 {
    public final /* synthetic */ InterfaceC6903no1 b;
    public final /* synthetic */ C9146vp1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8860up1(C9146vp1 c9146vp1, InterfaceC6903no1 interfaceC6903no1, InterfaceC6903no1 interfaceC6903no12) {
        super(interfaceC6903no1);
        this.c = c9146vp1;
        this.b = interfaceC6903no12;
    }

    @Override // com.daaw.AbstractC3815co1, com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        C6345lo1 c6345lo1A = this.b.a(j);
        C7182oo1 c7182oo1 = c6345lo1A.a;
        C7182oo1 c7182oo12 = new C7182oo1(c7182oo1.a, c7182oo1.b + this.c.B);
        C7182oo1 c7182oo13 = c6345lo1A.b;
        return new C6345lo1(c7182oo12, new C7182oo1(c7182oo13.a, c7182oo13.b + this.c.B));
    }
}
