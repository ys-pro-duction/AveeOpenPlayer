package com.daaw;

/* JADX INFO: renamed from: com.daaw.Uu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2490Uu2 implements InterfaceC1223Iv2 {
    public final /* synthetic */ BinderC2594Vu2 a;

    public C2490Uu2(BinderC2594Vu2 binderC2594Vu2) {
        this.a = binderC2594Vu2;
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        V22 v22 = (V22) obj;
        synchronized (this.a) {
            try {
                BinderC2594Vu2 binderC2594Vu2 = this.a;
                if (binderC2594Vu2.J != null) {
                    binderC2594Vu2.J.a();
                }
                this.a.J = v22;
                this.a.J.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC1223Iv2
    public final void zza() {
        synchronized (this.a) {
            this.a.J = null;
        }
    }
}
