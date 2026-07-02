package com.daaw;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.nr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6917nr0 {
    public final d a;
    public final InterfaceC8464tQ b;
    public int c = 65535;
    public final c d = new c(0, 65535, null);

    /* JADX INFO: renamed from: com.daaw.nr0$b */
    public interface b {
        void b(int i);
    }

    /* JADX INFO: renamed from: com.daaw.nr0$c */
    public final class c {
        public Runnable b;
        public final int c;
        public int d;
        public int e;
        public final b f;
        public final C4057dh a = new C4057dh();
        public boolean g = false;

        public c(int i, int i2, b bVar) {
            this.c = i;
            this.d = i2;
            this.f = bVar;
        }

        public void a(int i) {
            this.e += i;
        }

        public int b() {
            return this.e;
        }

        public void c() {
            this.e = 0;
        }

        public void d(C4057dh c4057dh, int i, boolean z) {
            this.a.O0(c4057dh, i);
            this.g |= z;
        }

        public boolean e() {
            return this.a.f1() > 0;
        }

        public int f(int i) {
            if (i <= 0 || Integer.MAX_VALUE - i >= this.d) {
                int i2 = this.d + i;
                this.d = i2;
                return i2;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.c);
        }

        public int g() {
            return Math.max(0, Math.min(this.d, (int) this.a.f1()));
        }

        public int h() {
            return g() - this.e;
        }

        public int i() {
            return this.d;
        }

        public int j() {
            return Math.min(this.d, C6917nr0.this.d.i());
        }

        public void k(C4057dh c4057dh, int i, boolean z) {
            do {
                int iMin = Math.min(i, C6917nr0.this.b.V0());
                int i2 = -iMin;
                C6917nr0.this.d.f(i2);
                f(i2);
                try {
                    C6917nr0.this.b.x(c4057dh.f1() == ((long) iMin) && z, this.c, c4057dh, iMin);
                    this.f.b(iMin);
                    i -= iMin;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (i > 0);
        }

        public int l(int i, e eVar) {
            Runnable runnable;
            int iMin = Math.min(i, j());
            int iF1 = 0;
            while (e() && iMin > 0) {
                if (iMin >= this.a.f1()) {
                    iF1 += (int) this.a.f1();
                    C4057dh c4057dh = this.a;
                    k(c4057dh, (int) c4057dh.f1(), this.g);
                } else {
                    iF1 += iMin;
                    k(this.a, iMin, false);
                }
                eVar.b();
                iMin = Math.min(i - iF1, j());
            }
            if (!e() && (runnable = this.b) != null) {
                runnable.run();
                this.b = null;
            }
            return iF1;
        }
    }

    /* JADX INFO: renamed from: com.daaw.nr0$d */
    public interface d {
        c[] a();
    }

    /* JADX INFO: renamed from: com.daaw.nr0$e */
    public static final class e {
        public int a;

        public e() {
        }

        public boolean a() {
            return this.a > 0;
        }

        public void b() {
            this.a++;
        }
    }

    public C6917nr0(d dVar, InterfaceC8464tQ interfaceC8464tQ) {
        this.a = (d) AbstractC7785qy0.o(dVar, "transport");
        this.b = (InterfaceC8464tQ) AbstractC7785qy0.o(interfaceC8464tQ, "frameWriter");
    }

    public c c(b bVar, int i) {
        return new c(i, this.c, (b) AbstractC7785qy0.o(bVar, "stream"));
    }

    public void d(boolean z, c cVar, C4057dh c4057dh, boolean z2) {
        AbstractC7785qy0.o(c4057dh, "source");
        int iJ = cVar.j();
        boolean zE = cVar.e();
        int iF1 = (int) c4057dh.f1();
        if (zE || iJ < iF1) {
            if (!zE && iJ > 0) {
                cVar.k(c4057dh, iJ, false);
            }
            cVar.d(c4057dh, (int) c4057dh.f1(), z);
        } else {
            cVar.k(c4057dh, iF1, z);
        }
        if (z2) {
            e();
        }
    }

    public void e() {
        try {
            this.b.flush();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i);
        }
        int i2 = i - this.c;
        this.c = i;
        for (c cVar : this.a.a()) {
            cVar.f(i2);
        }
        return i2 > 0;
    }

    public int g(c cVar, int i) {
        if (cVar == null) {
            int iF = this.d.f(i);
            h();
            return iF;
        }
        int iF2 = cVar.f(i);
        e eVar = new e();
        cVar.l(cVar.j(), eVar);
        if (eVar.a()) {
            e();
        }
        return iF2;
    }

    public void h() {
        int i;
        c[] cVarArrA = this.a.a();
        Collections.shuffle(Arrays.asList(cVarArrA));
        int i2 = this.d.i();
        int length = cVarArrA.length;
        while (true) {
            i = 0;
            if (length <= 0 || i2 <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(i2 / length);
            for (int i3 = 0; i3 < length && i2 > 0; i3++) {
                c cVar = cVarArrA[i3];
                int iMin = Math.min(i2, Math.min(cVar.h(), iCeil));
                if (iMin > 0) {
                    cVar.a(iMin);
                    i2 -= iMin;
                }
                if (cVar.h() > 0) {
                    cVarArrA[i] = cVar;
                    i++;
                }
            }
            length = i;
        }
        e eVar = new e();
        c[] cVarArrA2 = this.a.a();
        int length2 = cVarArrA2.length;
        while (i < length2) {
            c cVar2 = cVarArrA2[i];
            cVar2.l(cVar2.b(), eVar);
            cVar2.c();
            i++;
        }
        if (eVar.a()) {
            e();
        }
    }
}
