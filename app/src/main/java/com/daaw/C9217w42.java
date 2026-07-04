package com.daaw;

/* JADX INFO: renamed from: com.daaw.w42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9217w42 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC6244lS2 a;
    public final /* synthetic */ C9775y42 b;

    public C9217w42(C9775y42 c9775y42, InterfaceC6244lS2 interfaceC6244lS2) {
        this.b = c9775y42;
        this.a = interfaceC6244lS2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        C9775y42.b(this.b, ((C7815r42) obj).a, this.a);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        this.a.b(th);
        AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.s42
            @Override // java.lang.Runnable
            public final void run() {
                this.B.d();
            }
        });
    }
}
