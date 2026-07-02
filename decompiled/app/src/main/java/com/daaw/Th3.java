package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Th3 extends Ph3 {
    @Override // com.daaw.Ph3
    public final /* synthetic */ int a(Object obj) {
        return ((Rh3) obj).a();
    }

    @Override // com.daaw.Ph3
    public final /* synthetic */ int b(Object obj) {
        return ((Rh3) obj).b();
    }

    @Override // com.daaw.Ph3
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        AbstractC3772cf3 abstractC3772cf3 = (AbstractC3772cf3) obj;
        Rh3 rh3 = abstractC3772cf3.zzc;
        if (rh3 != Rh3.c()) {
            return rh3;
        }
        Rh3 rh3F = Rh3.f();
        abstractC3772cf3.zzc = rh3F;
        return rh3F;
    }

    @Override // com.daaw.Ph3
    public final /* synthetic */ Object d(Object obj) {
        return ((AbstractC3772cf3) obj).zzc;
    }

    @Override // com.daaw.Ph3
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (!Rh3.c().equals(obj2)) {
            if (Rh3.c().equals(obj)) {
                return Rh3.e((Rh3) obj, (Rh3) obj2);
            }
            ((Rh3) obj).d((Rh3) obj2);
        }
        return obj;
    }

    @Override // com.daaw.Ph3
    public final /* bridge */ /* synthetic */ void f(Object obj, int i, long j) {
        ((Rh3) obj).j(i << 3, Long.valueOf(j));
    }

    @Override // com.daaw.Ph3
    public final void g(Object obj) {
        ((AbstractC3772cf3) obj).zzc.h();
    }

    @Override // com.daaw.Ph3
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((AbstractC3772cf3) obj).zzc = (Rh3) obj2;
    }

    @Override // com.daaw.Ph3
    public final /* synthetic */ void i(Object obj, Hi3 hi3) {
        ((Rh3) obj).k(hi3);
    }
}
