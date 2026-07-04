package com.daaw;

/* JADX INFO: renamed from: com.daaw.dy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4140dy2 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ C6675mz2 d;

    public C4140dy2(C6675mz2 c6675mz2, int i, boolean z, boolean z2) {
        this.d = c6675mz2;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.G(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.d.G(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.d.G(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.G(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
