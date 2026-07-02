package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ls2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1522Ls2 implements InterfaceC6244lS2 {
    public final /* synthetic */ C4498fF2 a;
    public final /* synthetic */ C1626Ms2 b;

    public C1522Ls2(C1626Ms2 c1626Ms2, C4498fF2 c4498fF2) {
        this.b = c1626Ms2;
        this.a = c4498fF2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void a(Object obj) {
        synchronized (this.b) {
            try {
                this.b.h.c(obj, this.a);
                if (this.b.h.e()) {
                    C1626Ms2 c1626Ms2 = this.b;
                    c1626Ms2.e(c1626Ms2.h.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        synchronized (this.b) {
            try {
                this.b.h.b(th, this.a);
                if (this.b.h.e()) {
                    C1626Ms2 c1626Ms2 = this.b;
                    c1626Ms2.e(c1626Ms2.h.a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
