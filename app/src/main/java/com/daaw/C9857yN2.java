package com.daaw;

/* JADX INFO: renamed from: com.daaw.yN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9857yN2 extends AbstractRunnableC8734uN2 {
    public final /* synthetic */ EN2 C;

    public C9857yN2(EN2 en2) {
        this.C = en2;
    }

    @Override // com.daaw.AbstractRunnableC8734uN2
    public final void a() {
        synchronized (this.C.f) {
            try {
                if (this.C.k.get() > 0 && this.C.k.decrementAndGet() > 0) {
                    this.C.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                EN2 en2 = this.C;
                if (en2.m != null) {
                    en2.b.c("Unbind from service.", new Object[0]);
                    EN2 en22 = this.C;
                    en22.a.unbindService(en22.l);
                    this.C.g = false;
                    this.C.m = null;
                    this.C.l = null;
                }
                this.C.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
