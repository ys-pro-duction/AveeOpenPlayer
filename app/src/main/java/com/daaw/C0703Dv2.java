package com.daaw;

/* JADX INFO: renamed from: com.daaw.Dv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0703Dv2 implements InterfaceC1223Iv2 {
    public final /* synthetic */ C0807Ev2 a;

    public C0703Dv2(C0807Ev2 c0807Ev2) {
        this.a = c0807Ev2;
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (this.a) {
            this.a.c = ((AbstractC4448f42) obj).c();
            ((AbstractC4448f42) obj).b();
        }
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final void zza() {
        synchronized (this.a) {
        }
    }
}
