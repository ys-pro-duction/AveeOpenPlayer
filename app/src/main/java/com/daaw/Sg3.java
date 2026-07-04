package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Sg3 implements InterfaceC4907gh3 {
    public final Kg3 a;
    public final Ph3 b;
    public final boolean c;
    public final AbstractC6009ke3 d;

    public Sg3(Ph3 ph3, AbstractC6009ke3 abstractC6009ke3, Kg3 kg3) {
        this.b = ph3;
        this.c = abstractC6009ke3.c(kg3);
        this.d = abstractC6009ke3;
        this.a = kg3;
    }

    public static Sg3 h(Ph3 ph3, AbstractC6009ke3 abstractC6009ke3, Kg3 kg3) {
        return new Sg3(ph3, abstractC6009ke3, kg3);
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final int a(Object obj) {
        int iHashCode = this.b.d(obj).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final void b(Object obj) {
        this.b.g(obj);
        this.d.b(obj);
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final boolean c(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final void d(Object obj, Object obj2) {
        AbstractC6024kh3.b(this.b, obj, obj2);
        if (this.c) {
            this.d.a(obj2);
            throw null;
        }
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final boolean e(Object obj, Object obj2) {
        if (!this.b.d(obj).equals(this.b.d(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.a(obj);
        this.d.a(obj2);
        throw null;
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final void f(Object obj, Hi3 hi3) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final void g(Object obj, byte[] bArr, int i, int i2, Dc3 dc3) {
        AbstractC3772cf3 abstractC3772cf3 = (AbstractC3772cf3) obj;
        if (abstractC3772cf3.zzc == Rh3.c()) {
            abstractC3772cf3.zzc = Rh3.f();
        }
        AbstractC6314li0.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final int zza(Object obj) {
        Ph3 ph3 = this.b;
        int iB = ph3.b(ph3.d(obj));
        if (!this.c) {
            return iB;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC4907gh3
    public final Object zze() {
        Kg3 kg3 = this.a;
        return kg3 instanceof AbstractC3772cf3 ? ((AbstractC3772cf3) kg3).l() : kg3.e().s();
    }
}
