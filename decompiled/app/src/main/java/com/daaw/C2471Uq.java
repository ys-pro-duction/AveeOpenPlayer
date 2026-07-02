package com.daaw;

/* JADX INFO: renamed from: com.daaw.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2471Uq {
    public final boolean a;
    public final String b;
    public final C2157Rq c;

    /* JADX INFO: renamed from: com.daaw.Uq$a */
    public static final class a {
        public boolean a;
        public String b;
        public C2157Rq c;

        public C2471Uq a() {
            return new C2471Uq(this, null);
        }

        public a b(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ C2471Uq(a aVar, NC1 nc1) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public C2157Rq a() {
        return this.c;
    }

    public boolean b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}
