package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.mg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6584mg1 implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ f = new a();
    public InterfaceC9838yJ a;
    public Z41 b;
    public C6863ng1 c;
    public int d;
    public int e;

    /* JADX INFO: renamed from: com.daaw.mg1$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C6584mg1()};
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        return AbstractC7142og1.a(interfaceC9001vJ) != null;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) throws C3000Zs0 {
        if (this.c == null) {
            C6863ng1 c6863ng1A = AbstractC7142og1.a(interfaceC9001vJ);
            this.c = c6863ng1A;
            if (c6863ng1A == null) {
                throw new C3000Zs0("Unsupported or unrecognized wav header.");
            }
            this.b.d(Format.j(null, "audio/raw", null, c6863ng1A.a(), 32768, this.c.f(), this.c.i(), this.c.d(), null, null, 0, null));
            this.d = this.c.c();
        }
        if (!this.c.j()) {
            AbstractC7142og1.b(interfaceC9001vJ, this.c);
            this.a.b(this.c);
        }
        int iB = this.b.b(interfaceC9001vJ, 32768 - this.e, true);
        if (iB != -1) {
            this.e += iB;
        }
        int i = this.e / this.d;
        if (i > 0) {
            long jB = this.c.b(interfaceC9001vJ.getPosition() - ((long) this.e));
            int i2 = i * this.d;
            int i3 = this.e - i2;
            this.e = i3;
            this.b.a(jB, 1, i2, i3, null);
        }
        return iB == -1 ? -1 : 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.e = 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.a = interfaceC9838yJ;
        this.b = interfaceC9838yJ.a(0, 1);
        this.c = null;
        interfaceC9838yJ.n();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
