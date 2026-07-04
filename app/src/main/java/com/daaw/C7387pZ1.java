package com.daaw;

/* JADX INFO: renamed from: com.daaw.pZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7387pZ1 implements InterfaceC6605mk2 {
    public final HY1 a;
    public final AZ1 b;
    public Long c;
    public String d;

    public /* synthetic */ C7387pZ1(HY1 hy1, AZ1 az1, AbstractC7108oZ1 abstractC7108oZ1) {
        this.a = hy1;
        this.b = az1;
    }

    @Override // com.daaw.InterfaceC6605mk2
    public final /* bridge */ /* synthetic */ InterfaceC6605mk2 a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    @Override // com.daaw.InterfaceC6605mk2
    public final /* synthetic */ InterfaceC6605mk2 zza(String str) {
        str.getClass();
        this.d = str;
        return this;
    }

    @Override // com.daaw.InterfaceC6605mk2
    public final InterfaceC6884nk2 zzc() {
        AbstractC7000o83.c(this.c, Long.class);
        AbstractC7000o83.c(this.d, String.class);
        return new C7944rZ1(this.a, this.b, this.c, this.d, null);
    }
}
