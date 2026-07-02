package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class K12 implements InterfaceC6244lS2 {
    public final /* synthetic */ C6487mJ2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ L12 c;

    public K12(L12 l12, C6487mJ2 c6487mJ2, String str) {
        this.c = l12;
        this.a = c6487mJ2;
        this.b = str;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        L12 l12 = this.c;
        final C6487mJ2 c6487mJ2 = this.a;
        final String str = (String) obj;
        l12.e.Z0(new Runnable() { // from class: com.daaw.J12
            @Override // java.lang.Runnable
            public final void run() {
                c6487mJ2.c(str, null);
            }
        });
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(final Throwable th) {
        PS2 ps2 = this.c.e;
        final C6487mJ2 c6487mJ2 = this.a;
        final String str = this.b;
        ps2.Z0(new Runnable() { // from class: com.daaw.I12
            @Override // java.lang.Runnable
            public final void run() {
                K12 k12 = this.B;
                L12 l12 = k12.c;
                l12.h = RO1.c(l12.a);
                k12.c.h.a(th, "AttributionReporting.registerSourceAndPingClickUrl");
                c6487mJ2.c(str, null);
            }
        });
    }
}
