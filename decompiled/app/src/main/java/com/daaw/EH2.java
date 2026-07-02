package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class EH2 extends AbstractC9550xG2 {
    @Override // com.daaw.AbstractC9550xG2
    public final /* synthetic */ int a(Object obj) {
        return ((C3113aH2) obj).a();
    }

    @Override // com.daaw.AbstractC9550xG2
    public final /* synthetic */ int b(Object obj) {
        return ((C3113aH2) obj).b();
    }

    @Override // com.daaw.AbstractC9550xG2
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        F32 f32 = (F32) obj;
        C3113aH2 c3113aH2 = f32.zzc;
        if (c3113aH2 != C3113aH2.c()) {
            return c3113aH2;
        }
        C3113aH2 c3113aH2F = C3113aH2.f();
        f32.zzc = c3113aH2F;
        return c3113aH2F;
    }

    @Override // com.daaw.AbstractC9550xG2
    public final /* synthetic */ Object d(Object obj) {
        return ((F32) obj).zzc;
    }

    @Override // com.daaw.AbstractC9550xG2
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (!C3113aH2.c().equals(obj2)) {
            if (C3113aH2.c().equals(obj)) {
                return C3113aH2.e((C3113aH2) obj, (C3113aH2) obj2);
            }
            ((C3113aH2) obj).d((C3113aH2) obj2);
        }
        return obj;
    }

    @Override // com.daaw.AbstractC9550xG2
    public final /* bridge */ /* synthetic */ void f(Object obj, int i, long j) {
        ((C3113aH2) obj).j(i << 3, Long.valueOf(j));
    }

    @Override // com.daaw.AbstractC9550xG2
    public final void g(Object obj) {
        ((F32) obj).zzc.h();
    }

    @Override // com.daaw.AbstractC9550xG2
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((F32) obj).zzc = (C3113aH2) obj2;
    }

    @Override // com.daaw.AbstractC9550xG2
    public final /* synthetic */ void i(Object obj, InterfaceC10148zQ2 interfaceC10148zQ2) {
        ((C3113aH2) obj).k(interfaceC10148zQ2);
    }

    @Override // com.daaw.AbstractC9550xG2
    public final /* synthetic */ void j(Object obj, InterfaceC10148zQ2 interfaceC10148zQ2) {
        ((C3113aH2) obj).l(interfaceC10148zQ2);
    }
}
