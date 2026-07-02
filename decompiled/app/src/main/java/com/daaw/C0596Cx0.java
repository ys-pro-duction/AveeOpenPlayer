package com.daaw;

/* JADX INFO: renamed from: com.daaw.Cx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0596Cx0 implements InterfaceC6921ns {
    public final String a;
    public final a b;
    public final I6 c;
    public final X6 d;
    public final I6 e;
    public final I6 f;
    public final I6 g;
    public final I6 h;
    public final I6 i;
    public final boolean j;
    public final boolean k;

    /* JADX INFO: renamed from: com.daaw.Cx0$a */
    public enum a {
        STAR(1),
        POLYGON(2);

        public final int B;

        a(int i) {
            this.B = i;
        }

        public static a a(int i) {
            for (a aVar : values()) {
                if (aVar.B == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C0596Cx0(String str, a aVar, I6 i6, X6 x6, I6 i62, I6 i63, I6 i64, I6 i65, I6 i66, boolean z, boolean z2) {
        this.a = str;
        this.b = aVar;
        this.c = i6;
        this.d = x6;
        this.e = i62;
        this.f = i63;
        this.g = i64;
        this.h = i65;
        this.i = i66;
        this.j = z;
        this.k = z2;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new C0492Bx0(c4615ff0, abstractC9647xe, this);
    }

    public I6 b() {
        return this.f;
    }

    public I6 c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public I6 e() {
        return this.g;
    }

    public I6 f() {
        return this.i;
    }

    public I6 g() {
        return this.c;
    }

    public X6 h() {
        return this.d;
    }

    public I6 i() {
        return this.e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }
}
