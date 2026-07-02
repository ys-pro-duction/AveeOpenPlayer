package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class BR0 implements InterfaceC6921ns {
    public final String a;
    public final a b;
    public final I6 c;
    public final I6 d;
    public final I6 e;
    public final boolean f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a a(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public BR0(String str, a aVar, I6 i6, I6 i62, I6 i63, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = i6;
        this.d = i62;
        this.e = i63;
        this.f = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new C4178e61(abstractC9647xe, this);
    }

    public I6 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public I6 d() {
        return this.e;
    }

    public I6 e() {
        return this.c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
