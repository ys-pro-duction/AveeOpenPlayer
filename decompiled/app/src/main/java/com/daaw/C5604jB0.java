package com.daaw;

/* JADX INFO: renamed from: com.daaw.jB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5604jB0 implements InterfaceC9081vc1 {
    public boolean a = false;
    public boolean b = false;
    public C3122aK c;
    public final C4769gB0 d;

    public C5604jB0(C4769gB0 c4769gB0) {
        this.d = c4769gB0;
    }

    public final void a() {
        if (this.a) {
            throw new GG("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    public void b(C3122aK c3122aK, boolean z) {
        this.a = false;
        this.c = c3122aK;
        this.b = z;
    }

    @Override // com.daaw.InterfaceC9081vc1
    public InterfaceC9081vc1 c(String str) {
        a();
        this.d.h(this.c, str, this.b);
        return this;
    }

    @Override // com.daaw.InterfaceC9081vc1
    public InterfaceC9081vc1 d(boolean z) {
        a();
        this.d.n(this.c, z, this.b);
        return this;
    }
}
