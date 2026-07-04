package com.daaw;

/* JADX INFO: renamed from: com.daaw.rZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7944rZ1 implements InterfaceC6884nk2 {
    public final Long a;
    public final String b;
    public final HY1 c;
    public final AZ1 d;
    public final C7944rZ1 e = this;

    public /* synthetic */ C7944rZ1(HY1 hy1, AZ1 az1, Long l, String str, AbstractC7666qZ1 abstractC7666qZ1) {
        this.c = hy1;
        this.d = az1;
        this.a = l;
        this.b = str;
    }

    @Override // com.daaw.InterfaceC6884nk2
    public final C0442Bk2 zza() {
        AZ1 az1 = this.d;
        return AbstractC0546Ck2.a(this.a.longValue(), az1.a, C7999rk2.b(az1.b), this.c, this.b);
    }

    @Override // com.daaw.InterfaceC6884nk2
    public final C0867Fk2 zzb() {
        AZ1 az1 = this.d;
        return AbstractC0971Gk2.a(this.a.longValue(), az1.a, C7999rk2.b(az1.b), this.c, this.b);
    }
}
