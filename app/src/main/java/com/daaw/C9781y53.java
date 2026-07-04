package com.daaw;

/* JADX INFO: renamed from: com.daaw.y53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9781y53 extends AbstractC9223w53 {
    @Override // com.daaw.AbstractC9223w53
    public final /* synthetic */ int a(Object obj) {
        return ((C9502x53) obj).a();
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* synthetic */ int b(Object obj) {
        return ((C9502x53) obj).b();
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        AbstractC4449f43 abstractC4449f43 = (AbstractC4449f43) obj;
        C9502x53 c9502x53 = abstractC4449f43.zzc;
        if (c9502x53 != C9502x53.c()) {
            return c9502x53;
        }
        C9502x53 c9502x53F = C9502x53.f();
        abstractC4449f43.zzc = c9502x53F;
        return c9502x53F;
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* synthetic */ Object d(Object obj) {
        return ((AbstractC4449f43) obj).zzc;
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (!C9502x53.c().equals(obj2)) {
            if (C9502x53.c().equals(obj)) {
                return C9502x53.e((C9502x53) obj, (C9502x53) obj2);
            }
            ((C9502x53) obj).d((C9502x53) obj2);
        }
        return obj;
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* synthetic */ Object f() {
        return C9502x53.f();
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* synthetic */ Object g(Object obj) {
        ((C9502x53) obj).h();
        return obj;
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* bridge */ /* synthetic */ void h(Object obj, int i, int i2) {
        ((C9502x53) obj).j((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* bridge */ /* synthetic */ void i(Object obj, int i, long j) {
        ((C9502x53) obj).j((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* bridge */ /* synthetic */ void j(Object obj, int i, Object obj2) {
        ((C9502x53) obj).j((i << 3) | 3, obj2);
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* bridge */ /* synthetic */ void k(Object obj, int i, AbstractC9213w33 abstractC9213w33) {
        ((C9502x53) obj).j((i << 3) | 2, abstractC9213w33);
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* bridge */ /* synthetic */ void l(Object obj, int i, long j) {
        ((C9502x53) obj).j(i << 3, Long.valueOf(j));
    }

    @Override // com.daaw.AbstractC9223w53
    public final void m(Object obj) {
        ((AbstractC4449f43) obj).zzc.h();
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* synthetic */ void n(Object obj, Object obj2) {
        ((AbstractC4449f43) obj).zzc = (C9502x53) obj2;
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* synthetic */ void o(Object obj, Object obj2) {
        ((AbstractC4449f43) obj).zzc = (C9502x53) obj2;
    }

    @Override // com.daaw.AbstractC9223w53
    public final boolean q(InterfaceC4454f53 interfaceC4454f53) {
        return false;
    }

    @Override // com.daaw.AbstractC9223w53
    public final /* synthetic */ void r(Object obj, Q33 q33) {
        ((C9502x53) obj).k(q33);
    }
}
