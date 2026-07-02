package com.daaw;

/* JADX INFO: renamed from: com.daaw.fH2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4506fH2 {
    public final UG2 a;
    public final InterfaceFutureC8236sc0 b;
    public boolean c = false;
    public boolean d = false;

    public C4506fH2(final AG2 ag2, final TG2 tg2, final UG2 ug2) {
        this.a = ug2;
        this.b = AbstractC7360pS2.f(AbstractC7360pS2.n(tg2.a(ug2), new WR2() { // from class: com.daaw.dH2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.b(tg2, ag2, ug2, (IG2) obj);
            }
        }, ug2.zzb()), Exception.class, new WR2() { // from class: com.daaw.eH2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c(tg2, (Exception) obj);
            }
        }, ug2.zzb());
    }

    public final synchronized InterfaceFutureC8236sc0 a(UG2 ug2) {
        if (!this.d && !this.c) {
            if (this.a.zza() != null && ug2.zza() != null && this.a.zza().equals(ug2.zza())) {
                this.c = true;
                return this.b;
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 b(TG2 tg2, AG2 ag2, UG2 ug2, IG2 ig2) {
        synchronized (this) {
            try {
                this.d = true;
                tg2.b(ig2);
                if (this.c) {
                    return AbstractC7360pS2.h(new SG2(ig2, ug2));
                }
                ag2.c(ug2.zza(), ig2);
                return AbstractC7360pS2.h(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(TG2 tg2, Exception exc) {
        synchronized (this) {
            this.d = true;
            throw exc;
        }
    }

    public final synchronized void d(InterfaceC6244lS2 interfaceC6244lS2) {
        AbstractC7360pS2.r(AbstractC7360pS2.n(this.b, new WR2() { // from class: com.daaw.YG2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.i();
            }
        }, this.a.zzb()), interfaceC6244lS2, this.a.zzb());
    }
}
