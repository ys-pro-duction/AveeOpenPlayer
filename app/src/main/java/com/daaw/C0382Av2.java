package com.daaw;

/* JADX INFO: renamed from: com.daaw.Av2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0382Av2 implements InterfaceC1223Iv2 {
    public final /* synthetic */ BinderC0486Bv2 a;

    public C0382Av2(BinderC0486Bv2 binderC0486Bv2) {
        this.a = binderC0486Bv2;
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        C5719jc2 c5719jc2 = (C5719jc2) obj;
        synchronized (this.a) {
            this.a.K = c5719jc2;
            this.a.K.b();
        }
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final void zza() {
        synchronized (this.a) {
            this.a.K = null;
        }
    }
}
