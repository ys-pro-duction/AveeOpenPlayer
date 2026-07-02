package com.daaw;

import android.util.SparseArray;
import com.daaw.Z41;
import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.Pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1903Pk implements InterfaceC9838yJ {
    public final InterfaceC8715uJ B;
    public final int C;
    public final Format D;
    public final SparseArray E = new SparseArray();
    public boolean F;
    public b G;
    public CO0 H;
    public Format[] I;

    /* JADX INFO: renamed from: com.daaw.Pk$a */
    public static final class a implements Z41 {
        public final int a;
        public final int b;
        public final Format c;
        public Format d;
        public Z41 e;

        public a(int i, int i2, Format format) {
            this.a = i;
            this.b = i2;
            this.c = format;
        }

        @Override // com.daaw.Z41
        public void a(long j, int i, int i2, int i3, Z41.a aVar) {
            this.e.a(j, i, i2, i3, aVar);
        }

        @Override // com.daaw.Z41
        public int b(InterfaceC9001vJ interfaceC9001vJ, int i, boolean z) {
            return this.e.b(interfaceC9001vJ, i, z);
        }

        @Override // com.daaw.Z41
        public void c(C2584Vs0 c2584Vs0, int i) {
            this.e.c(c2584Vs0, i);
        }

        @Override // com.daaw.Z41
        public void d(Format format) {
            Format format2 = this.c;
            if (format2 != null) {
                format = format.d(format2);
            }
            this.d = format;
            this.e.d(format);
        }

        public void e(b bVar) {
            if (bVar == null) {
                this.e = new JE();
                return;
            }
            Z41 z41A = bVar.a(this.a, this.b);
            this.e = z41A;
            Format format = this.d;
            if (format != null) {
                z41A.d(format);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pk$b */
    public interface b {
        Z41 a(int i, int i2);
    }

    public C1903Pk(InterfaceC8715uJ interfaceC8715uJ, int i, Format format) {
        this.B = interfaceC8715uJ;
        this.C = i;
        this.D = format;
    }

    @Override // com.daaw.InterfaceC9838yJ
    public Z41 a(int i, int i2) {
        a aVar = (a) this.E.get(i);
        if (aVar == null) {
            AbstractC7115ob.f(this.I == null);
            aVar = new a(i, i2, i2 == this.C ? this.D : null);
            aVar.e(this.G);
            this.E.put(i, aVar);
        }
        return aVar;
    }

    @Override // com.daaw.InterfaceC9838yJ
    public void b(CO0 co0) {
        this.H = co0;
    }

    public Format[] c() {
        return this.I;
    }

    public CO0 d() {
        return this.H;
    }

    public void e(b bVar, long j) {
        this.G = bVar;
        if (!this.F) {
            this.B.i(this);
            if (j != -9223372036854775807L) {
                this.B.f(0L, j);
            }
            this.F = true;
            return;
        }
        InterfaceC8715uJ interfaceC8715uJ = this.B;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC8715uJ.f(0L, j);
        for (int i = 0; i < this.E.size(); i++) {
            ((a) this.E.valueAt(i)).e(bVar);
        }
    }

    @Override // com.daaw.InterfaceC9838yJ
    public void n() {
        Format[] formatArr = new Format[this.E.size()];
        for (int i = 0; i < this.E.size(); i++) {
            formatArr[i] = ((a) this.E.valueAt(i)).d;
        }
        this.I = formatArr;
    }
}
