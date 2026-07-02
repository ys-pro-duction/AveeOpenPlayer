package com.daaw;

/* JADX INFO: renamed from: com.daaw.b22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3324b22 implements InterfaceC6244lS2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ C3602c22 b;

    public C3324b22(C3602c22 c3602c22, String str) {
        this.b = c3602c22;
        this.a = str;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        C3602c22 c3602c22 = this.b;
        String str = (String) obj;
        c3602c22.I.a(c3602c22.H.d(c3602c22.F, c3602c22.G, false, this.a, str, c3602c22.G.d));
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        C3602c22 c3602c22 = this.b;
        c3602c22.I.a(c3602c22.H.d(c3602c22.F, c3602c22.G, false, this.a, null, c3602c22.G.d));
    }
}
