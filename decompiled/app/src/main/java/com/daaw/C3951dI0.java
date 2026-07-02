package com.daaw;

/* JADX INFO: renamed from: com.daaw.dI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3951dI0 implements InterfaceC6921ns {
    public final String a;
    public final I6 b;
    public final I6 c;
    public final V6 d;
    public final boolean e;

    public C3951dI0(String str, I6 i6, I6 i62, V6 v6, boolean z) {
        this.a = str;
        this.b = i6;
        this.c = i62;
        this.d = v6;
        this.e = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new C4229eI0(c4615ff0, abstractC9647xe, this);
    }

    public I6 b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public I6 d() {
        return this.c;
    }

    public V6 e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }
}
