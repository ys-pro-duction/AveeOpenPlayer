package com.daaw;

/* JADX INFO: renamed from: com.daaw.Sp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2260Sp0 implements InterfaceC7157oj1 {
    public final C4057dh a;
    public int b;
    public int c;

    public C2260Sp0(C4057dh c4057dh, int i) {
        this.a = c4057dh;
        this.b = i;
    }

    @Override // com.daaw.InterfaceC7157oj1
    public int b() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC7157oj1
    public void c(byte[] bArr, int i, int i2) {
        this.a.l1(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }

    @Override // com.daaw.InterfaceC7157oj1
    public int d() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC7157oj1
    public void e(byte b) {
        this.a.L(b);
        this.b--;
        this.c++;
    }

    public C4057dh f() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC7157oj1
    public void a() {
    }
}
