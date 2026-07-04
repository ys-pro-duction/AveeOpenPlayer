package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.Z1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public c O;
    public final Rect P;
    public boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;
        public boolean d = false;

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iD = d(i, i2);
            this.b.put(i, iD);
            return iD;
        }

        public int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iE = e(i, i2);
            this.a.put(i, iE);
            return iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.d
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L28
                int r2 = r2 + 1
            L23:
                r4 = 0
                goto L28
            L25:
                r2 = 0
                r3 = 0
                goto L23
            L28:
                int r0 = r6.f(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L39
                int r2 = r2 + 1
                r4 = 0
                goto L3e
            L39:
                if (r4 <= r8) goto L3e
                int r2 = r2 + 1
                r4 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r4 = r4 + r0
                if (r4 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        c3(RecyclerView.p.l0(context, attributeSet, i, i2).b);
    }

    public static int[] P2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        d3();
        U2();
        return super.B1(i, vVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void D2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.D2(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F1(Rect rect, int i, int i2) {
        int iO;
        int iO2;
        if (this.K == null) {
            super.F1(rect, i, i2);
        }
        int iG0 = g0() + h0();
        int iJ0 = j0() + e0();
        if (this.s == 1) {
            iO2 = RecyclerView.p.o(i2, rect.height() + iJ0, c0());
            int[] iArr = this.K;
            iO = RecyclerView.p.o(i, iArr[iArr.length - 1] + iG0, d0());
        } else {
            iO = RecyclerView.p.o(i, rect.width() + iG0, d0());
            int[] iArr2 = this.K;
            iO2 = RecyclerView.p.o(i2, iArr2[iArr2.length - 1] + iJ0, c0());
        }
        E1(iO, iO2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View M0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.M0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    public final void M2(RecyclerView.v vVar, RecyclerView.z zVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i3 = i;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.L[i2];
            b bVar = (b) view.getLayoutParams();
            int iY2 = Y2(vVar, zVar, k0(view));
            bVar.f = iY2;
            bVar.e = i5;
            i5 += iY2;
            i2 += i4;
        }
    }

    public final void N2() {
        int iK = K();
        for (int i = 0; i < iK; i++) {
            b bVar = (b) J(i).getLayoutParams();
            int iA = bVar.a();
            this.M.put(iA, bVar.f());
            this.N.put(iA, bVar.e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int O(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 1) {
            return this.J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return W2(vVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean O1() {
        return this.D == null && !this.I;
    }

    public final void O2(int i) {
        this.K = P2(this.K, this.J, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView.v vVar, RecyclerView.z zVar, Z1 z1) {
        super.P0(vVar, zVar, z1);
        z1.n0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Q1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.J;
        for (int i = 0; i < this.J && cVar.c(zVar) && iF > 0; i++) {
            int i2 = cVar.d;
            cVar2.a(i2, Math.max(0, cVar.g));
            iF -= this.O.f(i2);
            cVar.d += cVar.e;
        }
    }

    public final void Q2() {
        this.M.clear();
        this.N.clear();
    }

    public final int R2(RecyclerView.z zVar) {
        if (K() != 0 && zVar.b() != 0) {
            W1();
            boolean zQ2 = q2();
            View viewA2 = a2(!zQ2, true);
            View viewZ1 = Z1(!zQ2, true);
            if (viewA2 != null && viewZ1 != null) {
                int iB = this.O.b(k0(viewA2), this.J);
                int iB2 = this.O.b(k0(viewZ1), this.J);
                int iMax = this.x ? Math.max(0, ((this.O.b(zVar.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zQ2) {
                    return Math.round((iMax * (Math.abs(this.u.d(viewZ1) - this.u.g(viewA2)) / ((this.O.b(k0(viewZ1), this.J) - this.O.b(k0(viewA2), this.J)) + 1))) + (this.u.m() - this.u.g(viewA2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView.v vVar, RecyclerView.z zVar, View view, Z1 z1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.R0(view, z1);
            return;
        }
        b bVar = (b) layoutParams;
        int iW2 = W2(vVar, zVar, bVar.a());
        if (this.s == 0) {
            z1.q0(Z1.f.a(bVar.e(), bVar.f(), iW2, 1, false, false));
        } else {
            z1.q0(Z1.f.a(iW2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    public final int S2(RecyclerView.z zVar) {
        if (K() != 0 && zVar.b() != 0) {
            W1();
            View viewA2 = a2(!q2(), true);
            View viewZ1 = Z1(!q2(), true);
            if (viewA2 != null && viewZ1 != null) {
                if (!q2()) {
                    return this.O.b(zVar.b() - 1, this.J) + 1;
                }
                int iD = this.u.d(viewZ1) - this.u.g(viewA2);
                int iB = this.O.b(k0(viewA2), this.J);
                return (int) ((iD / ((this.O.b(k0(viewZ1), this.J) - iB) + 1)) * (this.O.b(zVar.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    public final void T2(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int iX2 = X2(vVar, zVar, aVar.b);
        if (z) {
            while (iX2 > 0) {
                int i2 = aVar.b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.b = i3;
                iX2 = X2(vVar, zVar, i3);
            }
            return;
        }
        int iB = zVar.b() - 1;
        int i4 = aVar.b;
        while (i4 < iB) {
            int i5 = i4 + 1;
            int iX22 = X2(vVar, zVar, i5);
            if (iX22 <= iX2) {
                break;
            }
            i4 = i5;
            iX2 = iX22;
        }
        aVar.b = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public final void U2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    public int V2(int i, int i2) {
        if (this.s != 1 || !p2()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public final int W2(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (!zVar.e()) {
            return this.O.b(i, this.J);
        }
        int iF = vVar.f(i);
        if (iF == -1) {
            return 0;
        }
        return this.O.b(iF, this.J);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public final int X2(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (!zVar.e()) {
            return this.O.c(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iF = vVar.f(i);
        if (iF == -1) {
            return 0;
        }
        return this.O.c(iF, this.J);
    }

    public final int Y2(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (!zVar.e()) {
            return this.O.f(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iF = vVar.f(i);
        if (iF == -1) {
            return 1;
        }
        return this.O.f(iF);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.h();
        this.O.g();
    }

    public final void Z2(float f, int i) {
        O2(Math.max(Math.round(f * this.J), i));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            N2();
        }
        super.a1(vVar, zVar);
        Q2();
    }

    public final void a3(View view, int i, boolean z) {
        int iL;
        int iL2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iV2 = V2(bVar.e, bVar.f);
        if (this.s == 1) {
            iL2 = RecyclerView.p.L(iV2, i, i3, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iL = RecyclerView.p.L(this.u.n(), Y(), i2, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iL3 = RecyclerView.p.L(iV2, i, i2, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iL4 = RecyclerView.p.L(this.u.n(), s0(), i3, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iL = iL3;
            iL2 = iL4;
        }
        b3(view, iL2, iL, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.z zVar) {
        super.b1(zVar);
        this.I = false;
    }

    public final void b3(View view, int i, int i2, boolean z) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z ? K1(view, i, i2, qVar) : I1(view, i, i2, qVar)) {
            view.measure(i, i2);
        }
    }

    public void c3(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i >= 1) {
            this.J = i;
            this.O.h();
            w1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public final void d3() {
        int iX;
        int iJ0;
        if (o2() == 1) {
            iX = r0() - h0();
            iJ0 = g0();
        } else {
            iX = X() - e0();
            iJ0 = j0();
        }
        O2(iX - iJ0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View i2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z, boolean z2) {
        int i;
        int iK;
        int iK2 = K();
        int i2 = 1;
        if (z2) {
            iK = K() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iK2;
            iK = 0;
        }
        int iB = zVar.b();
        W1();
        int iM = this.u.m();
        int i3 = this.u.i();
        View view = null;
        View view2 = null;
        while (iK != i) {
            View viewJ = J(iK);
            int iK0 = k0(viewJ);
            if (iK0 >= 0 && iK0 < iB && X2(vVar, zVar, iK0) == 0) {
                if (((RecyclerView.q) viewJ.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewJ;
                    }
                } else {
                    if (this.u.g(viewJ) < i3 && this.u.d(viewJ) >= iM) {
                        return viewJ;
                    }
                    if (view == null) {
                        view = viewJ;
                    }
                }
            }
            iK += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int n0(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 0) {
            return this.J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return W2(vVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void r2(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int iG0;
        int iJ0;
        int iF;
        int iF2;
        int i3;
        int iL;
        int iL2;
        View viewD;
        int iL3 = this.u.l();
        boolean z = iL3 != 1073741824;
        int i4 = K() > 0 ? this.K[this.J] : 0;
        if (z) {
            d3();
        }
        boolean z2 = cVar.e == 1;
        int iX2 = this.J;
        if (!z2) {
            iX2 = X2(vVar, zVar, cVar.d) + Y2(vVar, zVar, cVar.d);
        }
        int i5 = 0;
        while (i5 < this.J && cVar.c(zVar) && iX2 > 0) {
            int i6 = cVar.d;
            int iY2 = Y2(vVar, zVar, i6);
            if (iY2 > this.J) {
                throw new IllegalArgumentException("Item at position " + i6 + " requires " + iY2 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            iX2 -= iY2;
            if (iX2 < 0 || (viewD = cVar.d(vVar)) == null) {
                break;
            }
            this.L[i5] = viewD;
            i5++;
        }
        if (i5 == 0) {
            bVar.b = true;
            return;
        }
        M2(vVar, zVar, i5, z2);
        float f = 0.0f;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            View view = this.L[i8];
            if (cVar.l == null) {
                if (z2) {
                    e(view);
                } else {
                    f(view, 0);
                }
            } else if (z2) {
                c(view);
            } else {
                d(view, 0);
            }
            k(view, this.P);
            a3(view, iL3, false);
            int iE = this.u.e(view);
            if (iE > i7) {
                i7 = iE;
            }
            float f2 = (this.u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            Z2(f, i4);
            i7 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                View view2 = this.L[i9];
                a3(view2, 1073741824, true);
                int iE2 = this.u.e(view2);
                if (iE2 > i7) {
                    i7 = iE2;
                }
            }
        }
        for (int i10 = 0; i10 < i5; i10++) {
            View view3 = this.L[i10];
            if (this.u.e(view3) != i7) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.b;
                int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iV2 = V2(bVar2.e, bVar2.f);
                if (this.s == 1) {
                    iL2 = RecyclerView.p.L(iV2, 1073741824, i12, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iL = View.MeasureSpec.makeMeasureSpec(i7 - i11, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - i12, 1073741824);
                    iL = RecyclerView.p.L(iV2, 1073741824, i11, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iL2 = iMakeMeasureSpec;
                }
                b3(view3, iL2, iL, true);
            }
        }
        bVar.a = i7;
        if (this.s == 1) {
            if (cVar.f == -1) {
                iF2 = cVar.b;
                i3 = iF2 - i7;
            } else {
                i3 = cVar.b;
                iF2 = i3 + i7;
            }
            iJ0 = i3;
            iF = 0;
            iG0 = 0;
        } else {
            if (cVar.f == -1) {
                i2 = cVar.b;
                i = i2 - i7;
            } else {
                i = cVar.b;
                i2 = i + i7;
            }
            iG0 = i;
            iJ0 = 0;
            iF = i2;
            iF2 = 0;
        }
        for (int i13 = 0; i13 < i5; i13++) {
            View view4 = this.L[i13];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.s != 1) {
                iJ0 = this.K[bVar3.e] + j0();
                iF2 = this.u.f(view4) + iJ0;
            } else if (p2()) {
                iF = g0() + this.K[this.J - bVar3.e];
                iG0 = iF - this.u.f(view4);
            } else {
                iG0 = this.K[bVar3.e] + g0();
                iF = this.u.f(view4) + iG0;
            }
            int i14 = iF2;
            int i15 = iJ0;
            int i16 = iF;
            int i17 = iG0;
            C0(view4, i17, i15, i16, i14);
            iF2 = i14;
            iG0 = i17;
            iF = i16;
            iJ0 = i15;
            if (bVar3.c() || bVar3.b()) {
                bVar.c = true;
            }
            bVar.d = view4.hasFocusable() | bVar.d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.z zVar) {
        return this.Q ? R2(zVar) : super.s(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.z zVar) {
        return this.Q ? S2(zVar) : super.t(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void t2(RecyclerView.v vVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        super.t2(vVar, zVar, aVar, i);
        d3();
        if (zVar.b() > 0 && !zVar.e()) {
            T2(vVar, zVar, aVar, i);
        }
        U2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.z zVar) {
        return this.Q ? R2(zVar) : super.v(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.z zVar) {
        return this.Q ? S2(zVar) : super.w(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        d3();
        U2();
        return super.z1(i, vVar, zVar);
    }

    public static class b extends RecyclerView.q {
        public int e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        c3(i);
    }
}
