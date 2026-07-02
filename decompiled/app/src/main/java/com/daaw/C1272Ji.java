package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1272Ji {
    public static final b f = new a();
    public final G31 a;
    public final InterfaceC4610fe0 b = AbstractC4889ge0.a();
    public final InterfaceC4610fe0 c = AbstractC4889ge0.a();
    public final InterfaceC4610fe0 d = AbstractC4889ge0.a();
    public volatile long e;

    /* JADX INFO: renamed from: com.daaw.Ji$a */
    public class a implements b {
        @Override // com.daaw.C1272Ji.b
        public C1272Ji a() {
            return new C1272Ji(G31.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ji$b */
    public interface b {
        C1272Ji a();
    }

    public C1272Ji(G31 g31) {
        this.a = g31;
    }

    public void a(boolean z) {
        if (z) {
            this.c.a(1L);
        } else {
            this.d.a(1L);
        }
    }

    public void b() {
        this.b.a(1L);
        this.e = this.a.a();
    }
}
