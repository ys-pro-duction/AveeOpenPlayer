package com.daaw;

/* JADX INFO: renamed from: com.daaw.qT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7641qT0 extends AbstractC8072s00 {
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7641qT0(C3490bf c3490bf) {
        super(c3490bf);
        G10.g(c3490bf, "beanDefinition");
    }

    public static final G91 e(C7641qT0 c7641qT0, EI0 ei0) {
        if (!c7641qT0.g(ei0)) {
            c7641qT0.c = c7641qT0.a(ei0);
        }
        return G91.a;
    }

    @Override // com.daaw.AbstractC8072s00
    public Object a(EI0 ei0) {
        G10.g(ei0, "context");
        return this.c == null ? super.a(ei0) : f();
    }

    @Override // com.daaw.AbstractC8072s00
    public Object b(final EI0 ei0) {
        G10.g(ei0, "context");
        C8112s80.a.f(this, new LQ() { // from class: com.daaw.pT0
            @Override // com.daaw.LQ
            public final Object invoke() {
                return C7641qT0.e(this.B, ei0);
            }
        });
        return f();
    }

    public final Object f() {
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    public boolean g(EI0 ei0) {
        return this.c != null;
    }
}
