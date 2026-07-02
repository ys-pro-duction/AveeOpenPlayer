package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class M51 implements F51 {
    public final H51 a;
    public final String b;
    public final EG c;
    public final InterfaceC7819r51 d;
    public final N51 e;

    public M51(H51 h51, String str, EG eg, InterfaceC7819r51 interfaceC7819r51, N51 n51) {
        this.a = h51;
        this.b = str;
        this.c = eg;
        this.d = interfaceC7819r51;
        this.e = n51;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // com.daaw.F51
    public void a(GH gh, S51 s51) {
        this.e.a(IP0.a().e(this.a).c(gh).f(this.b).d(this.d).b(this.c).a(), s51);
    }

    @Override // com.daaw.F51
    public void b(GH gh) {
        a(gh, new S51() { // from class: com.daaw.L51
            @Override // com.daaw.S51
            public final void a(Exception exc) {
                M51.c(exc);
            }
        });
    }

    public H51 d() {
        return this.a;
    }
}
