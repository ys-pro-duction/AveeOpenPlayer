package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Mi3 {
    public final String a;
    public int b;
    public long c;
    public Vp3 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ Oi3 g;

    public Mi3(Oi3 oi3, String str, int i, Vp3 vp3) {
        this.g = oi3;
        this.a = str;
        this.b = i;
        this.c = vp3 == null ? -1L : vp3.d;
        if (vp3 == null || !vp3.b()) {
            return;
        }
        this.d = vp3;
    }

    public final void g(int i, Vp3 vp3) {
        if (this.c == -1 && i == this.b && vp3 != null) {
            Oi3 oi3 = this.g;
            long j = vp3.d;
            if (j >= oi3.k()) {
                this.c = j;
            }
        }
    }

    public final boolean j(int i, Vp3 vp3) {
        if (vp3 == null) {
            return i == this.b;
        }
        Vp3 vp32 = this.d;
        return vp32 == null ? !vp3.b() && vp3.d == this.c : vp3.d == vp32.d && vp3.b == vp32.b && vp3.c == vp32.c;
    }

    public final boolean k(C10219zg3 c10219zg3) {
        Vp3 vp3 = c10219zg3.d;
        if (vp3 == null) {
            return this.b != c10219zg3.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (vp3.d > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        AbstractC8657u52 abstractC8657u52 = c10219zg3.b;
        int iA = abstractC8657u52.a(vp3.a);
        int iA2 = abstractC8657u52.a(this.d.a);
        Vp3 vp32 = c10219zg3.d;
        if (vp32.d < this.d.d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!vp32.b()) {
            int i = c10219zg3.d.e;
            return i == -1 || i > this.d.b;
        }
        Vp3 vp33 = c10219zg3.d;
        int i2 = vp33.b;
        int i3 = vp33.c;
        Vp3 vp34 = this.d;
        int i4 = vp34.b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > vp34.c;
        }
        return true;
    }

    public final boolean l(AbstractC8657u52 abstractC8657u52, AbstractC8657u52 abstractC8657u522) {
        int i = this.b;
        if (i < abstractC8657u52.c()) {
            abstractC8657u52.e(i, this.g.a, 0L);
            for (int i2 = this.g.a.n; i2 <= this.g.a.o; i2++) {
                int iA = abstractC8657u522.a(abstractC8657u52.f(i2));
                if (iA != -1) {
                    i = abstractC8657u522.d(iA, this.g.b, false).c;
                    break;
                }
            }
            i = -1;
        } else if (i >= abstractC8657u522.c()) {
            i = -1;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        Vp3 vp3 = this.d;
        return vp3 == null || abstractC8657u522.a(vp3.a) != -1;
    }
}
