package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.daaw.S41;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public static final ThreadLocal F = new ThreadLocal();
    public static Comparator G = new a();
    public long C;
    public long D;
    public ArrayList B = new ArrayList();
    public ArrayList E = new ArrayList();

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.d;
            if ((recyclerView == null) != (cVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    public static class b implements RecyclerView.p.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.O;
            if (recyclerView.N == null || pVar == null || !pVar.x0()) {
                return;
            }
            if (z) {
                if (!recyclerView.F.p()) {
                    pVar.q(recyclerView.N.f(), this);
                }
            } else if (!recyclerView.t0()) {
                pVar.p(this.a, this.b, recyclerView.J0, this);
            }
            int i = this.d;
            if (i > pVar.m) {
                pVar.m = i;
                pVar.n = z;
                recyclerView.D.P();
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        int iJ = recyclerView.G.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            RecyclerView.D dM0 = RecyclerView.m0(recyclerView.G.i(i2));
            if (dM0.c == i && !dM0.x()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.c1 && this.B.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.B.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.B.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.B.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.I0.c(recyclerView, false);
                i += recyclerView.I0.d;
            }
        }
        this.E.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.B.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.I0;
                int iAbs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.E.size()) {
                        cVar = new c();
                        this.E.add(cVar);
                    } else {
                        cVar = (c) this.E.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar.a = i6 <= iAbs;
                    cVar.b = iAbs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.E, G);
    }

    public final void c(c cVar, long j) {
        RecyclerView.D dI = i(cVar.d, cVar.e, cVar.a ? Long.MAX_VALUE : j);
        if (dI == null || dI.b == null || !dI.w() || dI.x()) {
            return;
        }
        h((RecyclerView) dI.b.get(), j);
    }

    public final void d(long j) {
        for (int i = 0; i < this.E.size(); i++) {
            c cVar = (c) this.E.get(i);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.c1 && !this.B.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.C == 0) {
                this.C = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.I0.e(i, i2);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public final void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.i0 && recyclerView.G.j() != 0) {
            recyclerView.f1();
        }
        b bVar = recyclerView.I0;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                S41.a("RV Nested Prefetch");
                recyclerView.J0.f(recyclerView.N);
                for (int i = 0; i < bVar.d * 2; i += 2) {
                    i(recyclerView, bVar.c[i], j);
                }
            } finally {
                S41.b();
            }
        }
    }

    public final RecyclerView.D i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.D;
        try {
            recyclerView.P0();
            RecyclerView.D dN = vVar.N(i, false, j);
            if (dN != null) {
                if (!dN.w() || dN.x()) {
                    vVar.a(dN, false);
                } else {
                    vVar.G(dN.a);
                }
            }
            recyclerView.R0(false);
            return dN;
        } catch (Throwable th) {
            recyclerView.R0(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.B.remove(recyclerView);
        if (RecyclerView.c1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            S41.a("RV Prefetch");
            if (!this.B.isEmpty()) {
                int size = this.B.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.B.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.D);
                }
            }
        } finally {
            this.C = 0L;
            S41.b();
        }
    }
}
