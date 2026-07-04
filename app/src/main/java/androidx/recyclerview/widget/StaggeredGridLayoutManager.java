package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.y.b {
    public BitSet B;
    public boolean G;
    public boolean H;
    public SavedState I;
    public int J;
    public int[] O;
    public d[] t;
    public i u;
    public i v;
    public int w;
    public int x;
    public final f y;
    public int s = -1;
    public boolean z = false;
    public boolean A = false;
    public int C = -1;
    public int D = Integer.MIN_VALUE;
    public LazySpanLookup E = new LazySpanLookup();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int B;
        public int C;
        public int D;
        public int[] E;
        public int F;
        public int[] G;
        public List H;
        public boolean I;
        public boolean J;
        public boolean K;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public void a() {
            this.E = null;
            this.D = 0;
            this.B = -1;
            this.C = -1;
        }

        public void b() {
            this.E = null;
            this.D = 0;
            this.F = 0;
            this.G = null;
            this.H = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.B);
            parcel.writeInt(this.C);
            parcel.writeInt(this.D);
            if (this.D > 0) {
                parcel.writeIntArray(this.E);
            }
            parcel.writeInt(this.F);
            if (this.F > 0) {
                parcel.writeIntArray(this.G);
            }
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeInt(this.J ? 1 : 0);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeList(this.H);
        }

        public SavedState(Parcel parcel) {
            this.B = parcel.readInt();
            this.C = parcel.readInt();
            int i = parcel.readInt();
            this.D = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.E = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.F = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.G = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.I = parcel.readInt() == 1;
            this.J = parcel.readInt() == 1;
            this.K = parcel.readInt() == 1;
            this.H = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.D = savedState.D;
            this.B = savedState.B;
            this.C = savedState.C;
            this.E = savedState.E;
            this.F = savedState.F;
            this.G = savedState.G;
            this.I = savedState.I;
            this.J = savedState.J;
            this.K = savedState.K;
            this.H = savedState.H;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.V1();
        }
    }

    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.m();
        }

        public void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.m() + i;
            }
        }

        public void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = dVarArr[i].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {
        public d e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class d {
        public ArrayList a = new ArrayList();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public d(int i) {
            this.e = i;
        }

        public void a(View view) {
            c cVarN = n(view);
            cVarN.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void b(boolean z, int i) {
            int iL = z ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iL >= StaggeredGridLayoutManager.this.u.i()) {
                if (z || iL <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i != Integer.MIN_VALUE) {
                        iL += i;
                    }
                    this.c = iL;
                    this.b = iL;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            ArrayList arrayList = this.a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (cVarN.f && (fullSpanItemF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && fullSpanItemF.C == 1) {
                this.c += fullSpanItemF.a(this.e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = (View) this.a.get(0);
            c cVarN = n(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (cVarN.f && (fullSpanItemF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && fullSpanItemF.C == -1) {
                this.b -= fullSpanItemF.a(this.e);
            }
        }

        public void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.z ? i(this.a.size() - 1, -1, true) : i(0, this.a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.z ? i(0, this.a.size(), true) : i(this.a.size() - 1, -1, true);
        }

        public int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iM = StaggeredGridLayoutManager.this.u.m();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.a.get(i);
                int iG = StaggeredGridLayoutManager.this.u.g(view);
                int iD = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iG >= i3 : iG > i3;
                if (!z3 ? iD > iM : iD >= iM) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iG >= iM && iD <= i3) {
                            return StaggeredGridLayoutManager.this.k0(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.k0(view);
                        }
                        if (iG < iM || iD > i3) {
                            return StaggeredGridLayoutManager.this.k0(view);
                        }
                    }
                }
                i += i4;
            }
            return -1;
        }

        public int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        public int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        public int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.k0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.k0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.a.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) this.a.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.k0(view3) <= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.k0(view3) >= i) || !view3.hasFocusable()) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        public int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        public void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        public void s() {
            int size = this.a.size();
            View view = (View) this.a.remove(size - 1);
            c cVarN = n(view);
            cVarN.e = null;
            if (cVarN.c() || cVarN.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.a.remove(0);
            c cVarN = n(view);
            cVarN.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c cVarN = n(view);
            cVarN.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.p.d dVarL0 = RecyclerView.p.l0(context, attributeSet, i, i2);
        K2(dVarL0.a);
        M2(dVarL0.b);
        L2(dVarL0.c);
        this.y = new f();
        d2();
    }

    private void H2() {
        if (this.w == 1 || !w2()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    private int X1(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        return l.a(zVar, this.u, h2(!this.N), g2(!this.N), this, this.N);
    }

    private int Y1(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        return l.b(zVar, this.u, h2(!this.N), g2(!this.N), this, this.N, this.A);
    }

    private int Z1(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        return l.c(zVar, this.u, h2(!this.N), g2(!this.N), this, this.N);
    }

    private int a2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && w2()) ? -1 : 1 : (this.w != 1 && w2()) ? 1 : -1;
    }

    private void x2(View view, int i, int i2, boolean z) {
        k(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iU2 = U2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iU22 = U2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? K1(view, iU2, iU22, cVar) : I1(view, iU2, iU22, cVar)) {
            view.measure(iU2, iU22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A1(int i) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.B != i) {
            savedState.a();
        }
        this.C = i;
        this.D = Integer.MIN_VALUE;
        w1();
    }

    public final boolean A2(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == w2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        return I2(i, vVar, zVar);
    }

    public void B2(int i, RecyclerView.z zVar) {
        int iM2;
        int i2;
        if (i > 0) {
            iM2 = n2();
            i2 = 1;
        } else {
            iM2 = m2();
            i2 = -1;
        }
        this.y.a = true;
        R2(iM2, zVar);
        J2(i2);
        f fVar = this.y;
        fVar.c = iM2 + fVar.d;
        fVar.b = Math.abs(i);
    }

    public final void C2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }

    public final void D2(RecyclerView.v vVar, f fVar) {
        if (!fVar.a || fVar.i) {
            return;
        }
        if (fVar.b == 0) {
            if (fVar.e == -1) {
                E2(vVar, fVar.g);
                return;
            } else {
                F2(vVar, fVar.f);
                return;
            }
        }
        if (fVar.e != -1) {
            int iQ2 = q2(fVar.g) - fVar.g;
            F2(vVar, iQ2 < 0 ? fVar.f : Math.min(iQ2, fVar.b) + fVar.f);
        } else {
            int i = fVar.f;
            int iP2 = i - p2(i);
            E2(vVar, iP2 < 0 ? fVar.g : fVar.g - Math.min(iP2, fVar.b));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final void E2(RecyclerView.v vVar, int i) {
        for (int iK = K() - 1; iK >= 0; iK--) {
            View viewJ = J(iK);
            if (this.u.g(viewJ) < i || this.u.q(viewJ) < i) {
                return;
            }
            c cVar = (c) viewJ.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].s();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.s();
            }
            p1(viewJ, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F0(int i) {
        super.F0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F1(Rect rect, int i, int i2) {
        int iO;
        int iO2;
        int iG0 = g0() + h0();
        int iJ0 = j0() + e0();
        if (this.w == 1) {
            iO2 = RecyclerView.p.o(i2, rect.height() + iJ0, c0());
            iO = RecyclerView.p.o(i, (this.x * this.s) + iG0, d0());
        } else {
            iO = RecyclerView.p.o(i, rect.width() + iG0, d0());
            iO2 = RecyclerView.p.o(i2, (this.x * this.s) + iJ0, c0());
        }
        E1(iO, iO2);
    }

    public final void F2(RecyclerView.v vVar, int i) {
        while (K() > 0) {
            View viewJ = J(0);
            if (this.u.d(viewJ) > i || this.u.p(viewJ) > i) {
                return;
            }
            c cVar = (c) viewJ.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].t();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.t();
            }
            p1(viewJ, vVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G0(int i) {
        super.G0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    public final void G2() {
        if (this.v.k() == 1073741824) {
            return;
        }
        int iK = K();
        float fMax = 0.0f;
        for (int i = 0; i < iK; i++) {
            View viewJ = J(i);
            float fE = this.v.e(viewJ);
            if (fE >= fMax) {
                if (((c) viewJ.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i2 = this.x;
        int iRound = Math.round(fMax * this.s);
        if (this.v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.v.n());
        }
        S2(iRound);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < iK; i3++) {
            View viewJ2 = J(i3);
            c cVar = (c) viewJ2.getLayoutParams();
            if (!cVar.f) {
                if (w2() && this.w == 1) {
                    int i4 = this.s;
                    int i5 = cVar.e.e;
                    viewJ2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = cVar.e.e;
                    int i7 = this.x * i6;
                    int i8 = i6 * i2;
                    if (this.w == 1) {
                        viewJ2.offsetLeftAndRight(i7 - i8);
                    } else {
                        viewJ2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
    }

    public int I2(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (K() == 0 || i == 0) {
            return 0;
        }
        B2(i, zVar);
        int iE2 = e2(vVar, this.y, zVar);
        if (this.y.b >= iE2) {
            i = i < 0 ? -iE2 : iE2;
        }
        this.u.r(-i);
        this.G = this.A;
        f fVar = this.y;
        fVar.b = 0;
        D2(vVar, fVar);
        return i;
    }

    public final void J2(int i) {
        f fVar = this.y;
        fVar.e = i;
        fVar.d = this.A != (i == -1) ? -1 : 1;
    }

    public void K2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        h(null);
        if (i == this.w) {
            return;
        }
        this.w = i;
        i iVar = this.u;
        this.u = this.v;
        this.v = iVar;
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.L0(recyclerView, vVar);
        r1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        M1(gVar);
    }

    public void L2(boolean z) {
        h(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.I != z) {
            savedState.I = z;
        }
        this.z = z;
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View M0(View view, int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        View viewC;
        View viewM;
        if (K() == 0 || (viewC = C(view)) == null) {
            return null;
        }
        H2();
        int iA2 = a2(i);
        if (iA2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewC.getLayoutParams();
        boolean z = cVar.f;
        d dVar = cVar.e;
        int iN2 = iA2 == 1 ? n2() : m2();
        R2(iN2, zVar);
        J2(iA2);
        f fVar = this.y;
        fVar.c = fVar.d + iN2;
        fVar.b = (int) (this.u.n() * 0.33333334f);
        f fVar2 = this.y;
        fVar2.h = true;
        fVar2.a = false;
        e2(vVar, fVar2, zVar);
        this.G = this.A;
        if (!z && (viewM = dVar.m(iN2, iA2)) != null && viewM != viewC) {
            return viewM;
        }
        if (A2(iA2)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View viewM2 = this.t[i2].m(iN2, iA2);
                if (viewM2 != null && viewM2 != viewC) {
                    return viewM2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View viewM3 = this.t[i3].m(iN2, iA2);
                if (viewM3 != null && viewM3 != viewC) {
                    return viewM3;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (iA2 == -1);
        if (!z) {
            View viewD = D(z2 ? dVar.f() : dVar.g());
            if (viewD != null && viewD != viewC) {
                return viewD;
            }
        }
        if (A2(iA2)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != dVar.e) {
                    View viewD2 = D(z2 ? this.t[i4].f() : this.t[i4].g());
                    if (viewD2 != null && viewD2 != viewC) {
                        return viewD2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                View viewD3 = D(z2 ? this.t[i5].f() : this.t[i5].g());
                if (viewD3 != null && viewD3 != viewC) {
                    return viewD3;
                }
            }
        }
        return null;
    }

    public void M2(int i) {
        h(null);
        if (i != this.s) {
            v2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new d[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new d(i2);
            }
            w1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(AccessibilityEvent accessibilityEvent) {
        super.N0(accessibilityEvent);
        if (K() > 0) {
            View viewH2 = h2(false);
            View viewG2 = g2(false);
            if (viewH2 == null || viewG2 == null) {
                return;
            }
            int iK0 = k0(viewH2);
            int iK02 = k0(viewG2);
            if (iK0 < iK02) {
                accessibilityEvent.setFromIndex(iK0);
                accessibilityEvent.setToIndex(iK02);
            } else {
                accessibilityEvent.setFromIndex(iK02);
                accessibilityEvent.setToIndex(iK0);
            }
        }
    }

    public final void N2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                T2(this.t[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean O1() {
        return this.I == null;
    }

    public final boolean O2(RecyclerView.z zVar, b bVar) {
        bVar.a = this.G ? j2(zVar.b()) : f2(zVar.b());
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    public final void P1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    public boolean P2(RecyclerView.z zVar, b bVar) {
        int i;
        if (!zVar.e() && (i = this.C) != -1) {
            if (i >= 0 && i < zVar.b()) {
                SavedState savedState = this.I;
                if (savedState == null || savedState.B == -1 || savedState.D < 1) {
                    View viewD = D(this.C);
                    if (viewD != null) {
                        bVar.a = this.A ? n2() : m2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.D) - this.u.d(viewD);
                            } else {
                                bVar.b = (this.u.m() + this.D) - this.u.g(viewD);
                            }
                            return true;
                        }
                        if (this.u.e(viewD) > this.u.n()) {
                            bVar.b = bVar.c ? this.u.i() : this.u.m();
                            return true;
                        }
                        int iG = this.u.g(viewD) - this.u.m();
                        if (iG < 0) {
                            bVar.b = -iG;
                            return true;
                        }
                        int i2 = this.u.i() - this.u.d(viewD);
                        if (i2 < 0) {
                            bVar.b = i2;
                            return true;
                        }
                        bVar.b = Integer.MIN_VALUE;
                    } else {
                        int i3 = this.C;
                        bVar.a = i3;
                        int i4 = this.D;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = U1(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void Q1(b bVar) {
        SavedState savedState = this.I;
        int i = savedState.D;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    SavedState savedState2 = this.I;
                    int i3 = savedState2.E[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.J ? this.u.i() : this.u.m();
                    }
                    this.t[i2].v(i3);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.B = savedState3.C;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.K;
        L2(savedState4.I);
        H2();
        SavedState savedState5 = this.I;
        int i4 = savedState5.B;
        if (i4 != -1) {
            this.C = i4;
            bVar.c = savedState5.J;
        } else {
            bVar.c = this.A;
        }
        if (savedState5.F > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.a = savedState5.G;
            lazySpanLookup.b = savedState5.H;
        }
    }

    public void Q2(RecyclerView.z zVar, b bVar) {
        if (P2(zVar, bVar) || O2(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    public boolean R1() {
        int iL = this.t[0].l(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R2(int r5, androidx.recyclerview.widget.RecyclerView.z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.y
            r1 = 0
            r0.b = r1
            r0.c = r5
            boolean r0 = r4.A0()
            r2 = 1
            if (r0 == 0) goto L2f
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2f
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L26
            androidx.recyclerview.widget.i r5 = r4.u
            int r5 = r5.n()
        L24:
            r6 = 0
            goto L31
        L26:
            androidx.recyclerview.widget.i r5 = r4.u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L31
        L2f:
            r5 = 0
            goto L24
        L31:
            boolean r0 = r4.N()
            if (r0 == 0) goto L4e
            androidx.recyclerview.widget.f r0 = r4.y
            androidx.recyclerview.widget.i r3 = r4.u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f = r3
            androidx.recyclerview.widget.f r6 = r4.y
            androidx.recyclerview.widget.i r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.g = r0
            goto L5e
        L4e:
            androidx.recyclerview.widget.f r0 = r4.y
            androidx.recyclerview.widget.i r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.f r5 = r4.y
            int r6 = -r6
            r5.f = r6
        L5e:
            androidx.recyclerview.widget.f r5 = r4.y
            r5.h = r1
            r5.a = r2
            androidx.recyclerview.widget.i r6 = r4.u
            int r6 = r6.k()
            if (r6 != 0) goto L75
            androidx.recyclerview.widget.i r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L75
            r1 = 1
        L75:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R2(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public boolean S1() {
        int iP = this.t[0].p(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    public void S2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    public final void T1(View view, c cVar, f fVar) {
        if (fVar.e == 1) {
            if (cVar.f) {
                P1(view);
                return;
            } else {
                cVar.e.a(view);
                return;
            }
        }
        if (cVar.f) {
            C2(view);
        } else {
            cVar.e.u(view);
        }
    }

    public final void T2(d dVar, int i, int i2) {
        int iJ = dVar.j();
        if (i == -1) {
            if (dVar.o() + iJ <= i2) {
                this.B.set(dVar.e, false);
            }
        } else if (dVar.k() - iJ >= i2) {
            this.B.set(dVar.e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i, int i2) {
        t2(i, i2, 1);
    }

    public final int U1(int i) {
        if (K() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < m2()) != this.A ? -1 : 1;
    }

    public final int U2(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView) {
        this.E.b();
        w1();
    }

    public boolean V1() {
        int iM2;
        int iN2;
        if (K() == 0 || this.F == 0 || !u0()) {
            return false;
        }
        if (this.A) {
            iM2 = n2();
            iN2 = m2();
        } else {
            iM2 = m2();
            iN2 = n2();
        }
        if (iM2 == 0 && u2() != null) {
            this.E.b();
            x1();
            w1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i = this.A ? -1 : 1;
        int i2 = iN2 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemE = this.E.e(iM2, i2, i, true);
        if (fullSpanItemE == null) {
            this.M = false;
            this.E.d(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = this.E.e(iM2, fullSpanItemE.B, i * (-1), true);
        if (fullSpanItemE2 == null) {
            this.E.d(fullSpanItemE.B);
        } else {
            this.E.d(fullSpanItemE2.B + 1);
        }
        x1();
        w1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i, int i2, int i3) {
        t2(i, i2, 8);
    }

    public final boolean W1(d dVar) {
        if (this.A) {
            if (dVar.k() < this.u.i()) {
                ArrayList arrayList = dVar.a;
                return !dVar.n((View) arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (dVar.o() > this.u.m()) {
            return !dVar.n((View) dVar.a.get(0)).f;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i, int i2) {
        t2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i, int i2, Object obj) {
        t2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView.v vVar, RecyclerView.z zVar) {
        z2(vVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF b(int i) {
        int iU1 = U1(i);
        PointF pointF = new PointF();
        if (iU1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = iU1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iU1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.z zVar) {
        super.b1(zVar);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public final LazySpanLookup.FullSpanItem b2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.D = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.D[i2] = i - this.t[i2].l(i);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem c2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.D = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.D[i2] = this.t[i2].p(i) - i;
        }
        return fullSpanItem;
    }

    public final void d2() {
        this.u = i.b(this, this.w);
        this.v = i.b(this, 1 - this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int e2(RecyclerView.v vVar, f fVar, RecyclerView.z zVar) {
        int i;
        d dVarS2;
        int iR2;
        int iE;
        int iM;
        int iE2;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r8 = 0;
        staggeredGridLayoutManager2.B.set(0, staggeredGridLayoutManager2.s, true);
        if (staggeredGridLayoutManager2.y.i) {
            i = fVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = fVar.e == 1 ? fVar.g + fVar.b : fVar.f - fVar.b;
        }
        staggeredGridLayoutManager2.N2(fVar.e, i);
        int i2 = staggeredGridLayoutManager2.A ? staggeredGridLayoutManager2.u.i() : staggeredGridLayoutManager2.u.m();
        boolean z = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (fVar.a(zVar) && (staggeredGridLayoutManager3.y.i || !staggeredGridLayoutManager3.B.isEmpty())) {
            View viewB = fVar.b(vVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = staggeredGridLayoutManager3.E.g(iA);
            boolean z2 = iG == -1;
            if (z2) {
                dVarS2 = cVar.f ? staggeredGridLayoutManager3.t[r8] : staggeredGridLayoutManager3.s2(fVar);
                staggeredGridLayoutManager3.E.n(iA, dVarS2);
            } else {
                dVarS2 = staggeredGridLayoutManager3.t[iG];
            }
            d dVar = dVarS2;
            cVar.e = dVar;
            if (fVar.e == 1) {
                staggeredGridLayoutManager3.e(viewB);
            } else {
                staggeredGridLayoutManager3.f(viewB, r8);
            }
            staggeredGridLayoutManager3.y2(viewB, cVar, r8);
            if (fVar.e == 1) {
                iE = cVar.f ? staggeredGridLayoutManager3.o2(i2) : dVar.l(i2);
                iR2 = staggeredGridLayoutManager3.u.e(viewB) + iE;
                if (z2 && cVar.f) {
                    LazySpanLookup.FullSpanItem fullSpanItemB2 = staggeredGridLayoutManager3.b2(iE);
                    fullSpanItemB2.C = -1;
                    fullSpanItemB2.B = iA;
                    staggeredGridLayoutManager3.E.a(fullSpanItemB2);
                }
            } else {
                iR2 = cVar.f ? staggeredGridLayoutManager3.r2(i2) : dVar.p(i2);
                iE = iR2 - staggeredGridLayoutManager3.u.e(viewB);
                if (z2 && cVar.f) {
                    LazySpanLookup.FullSpanItem fullSpanItemC2 = staggeredGridLayoutManager3.c2(iR2);
                    fullSpanItemC2.C = 1;
                    fullSpanItemC2.B = iA;
                    staggeredGridLayoutManager3.E.a(fullSpanItemC2);
                }
            }
            if (cVar.f && fVar.d == -1) {
                if (z2) {
                    staggeredGridLayoutManager3.M = true;
                } else {
                    if (!(fVar.e == 1 ? staggeredGridLayoutManager3.R1() : staggeredGridLayoutManager3.S1())) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = staggeredGridLayoutManager3.E.f(iA);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.E = true;
                        }
                        staggeredGridLayoutManager3.M = true;
                    }
                }
            }
            staggeredGridLayoutManager3.T1(viewB, cVar, fVar);
            if (staggeredGridLayoutManager3.w2() && staggeredGridLayoutManager3.w == 1) {
                iE2 = cVar.f ? staggeredGridLayoutManager3.v.i() : staggeredGridLayoutManager3.v.i() - (((staggeredGridLayoutManager3.s - 1) - dVar.e) * staggeredGridLayoutManager3.x);
                iM = iE2 - staggeredGridLayoutManager3.v.e(viewB);
            } else {
                iM = cVar.f ? staggeredGridLayoutManager3.v.m() : (dVar.e * staggeredGridLayoutManager3.x) + staggeredGridLayoutManager3.v.m();
                iE2 = staggeredGridLayoutManager3.v.e(viewB) + iM;
            }
            int i3 = iE2;
            int i4 = iM;
            if (staggeredGridLayoutManager3.w == 1) {
                staggeredGridLayoutManager3.C0(viewB, i4, iE, i3, iR2);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.C0(viewB, iE, i4, iR2, i3);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f) {
                staggeredGridLayoutManager.N2(staggeredGridLayoutManager.y.e, i);
            } else {
                staggeredGridLayoutManager.T2(dVar, staggeredGridLayoutManager.y.e, i);
            }
            staggeredGridLayoutManager.D2(vVar, staggeredGridLayoutManager.y);
            if (staggeredGridLayoutManager.y.h && viewB.hasFocusable()) {
                if (cVar.f) {
                    staggeredGridLayoutManager.B.clear();
                } else {
                    staggeredGridLayoutManager.B.set(dVar.e, false);
                }
            }
            z = true;
            r8 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z) {
            staggeredGridLayoutManager3.D2(vVar, staggeredGridLayoutManager3.y);
        }
        int iM2 = staggeredGridLayoutManager3.y.e == -1 ? staggeredGridLayoutManager3.u.m() - staggeredGridLayoutManager3.r2(staggeredGridLayoutManager3.u.m()) : staggeredGridLayoutManager3.o2(staggeredGridLayoutManager3.u.i()) - staggeredGridLayoutManager3.u.i();
        if (iM2 > 0) {
            return Math.min(fVar.b, iM2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
                this.I.b();
            }
            w1();
        }
    }

    public final int f2(int i) {
        int iK = K();
        for (int i2 = 0; i2 < iK; i2++) {
            int iK0 = k0(J(i2));
            if (iK0 >= 0 && iK0 < i) {
                return iK0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable g1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.I = this.z;
        savedState.J = this.G;
        savedState.K = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.a) == null) {
            savedState.F = 0;
        } else {
            savedState.G = iArr;
            savedState.F = iArr.length;
            savedState.H = lazySpanLookup.b;
        }
        if (K() <= 0) {
            savedState.B = -1;
            savedState.C = -1;
            savedState.D = 0;
            return savedState;
        }
        savedState.B = this.G ? n2() : m2();
        savedState.C = i2();
        int i = this.s;
        savedState.D = i;
        savedState.E = new int[i];
        for (int i2 = 0; i2 < this.s; i2++) {
            if (this.G) {
                iP = this.t[i2].l(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.u.i();
                    iP -= iM;
                }
            } else {
                iP = this.t[i2].p(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.u.m();
                    iP -= iM;
                }
            }
            savedState.E[i2] = iP;
        }
        return savedState;
    }

    public View g2(boolean z) {
        int iM = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int iK = K() - 1; iK >= 0; iK--) {
            View viewJ = J(iK);
            int iG = this.u.g(viewJ);
            int iD = this.u.d(viewJ);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewJ;
                }
                if (view == null) {
                    view = viewJ;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h(String str) {
        if (this.I == null) {
            super.h(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(int i) {
        if (i == 0) {
            V1();
        }
    }

    public View h2(boolean z) {
        int iM = this.u.m();
        int i = this.u.i();
        int iK = K();
        View view = null;
        for (int i2 = 0; i2 < iK; i2++) {
            View viewJ = J(i2);
            int iG = this.u.g(viewJ);
            if (this.u.d(viewJ) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewJ;
                }
                if (view == null) {
                    view = viewJ;
                }
            }
        }
        return view;
    }

    public int i2() {
        View viewG2 = this.A ? g2(true) : h2(true);
        if (viewG2 == null) {
            return -1;
        }
        return k0(viewG2);
    }

    public final int j2(int i) {
        for (int iK = K() - 1; iK >= 0; iK--) {
            int iK0 = k0(J(iK));
            if (iK0 >= 0 && iK0 < i) {
                return iK0;
            }
        }
        return 0;
    }

    public final void k2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int i;
        int iO2 = o2(Integer.MIN_VALUE);
        if (iO2 != Integer.MIN_VALUE && (i = this.u.i() - iO2) > 0) {
            int i2 = i - (-I2(-i, vVar, zVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.u.r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.w == 0;
    }

    public final void l2(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int iM;
        int iR2 = r2(Integer.MAX_VALUE);
        if (iR2 != Integer.MAX_VALUE && (iM = iR2 - this.u.m()) > 0) {
            int iI2 = iM - I2(iM, vVar, zVar);
            if (!z || iI2 <= 0) {
                return;
            }
            this.u.r(-iI2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m() {
        return this.w == 1;
    }

    public int m2() {
        if (K() == 0) {
            return 0;
        }
        return k0(J(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public int n2() {
        int iK = K();
        if (iK == 0) {
            return 0;
        }
        return k0(J(iK - 1));
    }

    public final int o2(int i) {
        int iL = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int iL2 = this.t[i2].l(i);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i, int i2, RecyclerView.z zVar, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.w != 0) {
            i = i2;
        }
        if (K() == 0 || i == 0) {
            return;
        }
        B2(i, zVar);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.s; i4++) {
            f fVar = this.y;
            if (fVar.d == -1) {
                iL = fVar.f;
                iP = this.t[i4].p(iL);
            } else {
                iL = this.t[i4].l(fVar.g);
                iP = this.y.g;
            }
            int i5 = iL - iP;
            if (i5 >= 0) {
                this.O[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.O, 0, i3);
        for (int i6 = 0; i6 < i3 && this.y.a(zVar); i6++) {
            cVar.a(this.y.c, this.O[i6]);
            f fVar2 = this.y;
            fVar2.c += fVar2.d;
        }
    }

    public final int p2(int i) {
        int iP = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int iP2 = this.t[i2].p(i);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    public final int q2(int i) {
        int iL = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int iL2 = this.t[i2].l(i);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.z zVar) {
        return X1(zVar);
    }

    public final int r2(int i) {
        int iP = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int iP2 = this.t[i2].p(i);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.z zVar) {
        return Y1(zVar);
    }

    public final d s2(f fVar) {
        int i;
        int i2;
        int i3;
        if (A2(fVar.e)) {
            i2 = this.s - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.s;
            i2 = 0;
            i3 = 1;
        }
        d dVar = null;
        if (fVar.e == 1) {
            int iM = this.u.m();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                d dVar2 = this.t[i2];
                int iL = dVar2.l(iM);
                if (iL < i4) {
                    dVar = dVar2;
                    i4 = iL;
                }
                i2 += i3;
            }
            return dVar;
        }
        int i5 = this.u.i();
        int i6 = Integer.MIN_VALUE;
        while (i2 != i) {
            d dVar3 = this.t[i2];
            int iP = dVar3.p(i5);
            if (iP > i6) {
                dVar = dVar3;
                i6 = iP;
            }
            i2 += i3;
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.n2()
            goto Ld
        L9:
            int r0 = r6.m2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.A
            if (r7 == 0) goto L4e
            int r7 = r6.m2()
            goto L52
        L4e:
            int r7 = r6.n2()
        L52:
            if (r3 > r7) goto L57
            r6.w1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.t2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.z zVar) {
        return X1(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View u2() {
        /*
            r12 = this;
            int r0 = r12.K()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.w2()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = -1
        L22:
            boolean r7 = r12.A
            if (r7 == 0) goto L28
            r0 = -1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 >= r0) goto L2c
            r6 = 1
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.J(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            boolean r9 = r12.W1(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.J(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.i r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.i r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = 1
            goto L9a
        L99:
            r8 = 0
        L9a:
            if (r3 >= 0) goto L9e
            r9 = 1
            goto L9f
        L9e:
            r9 = 0
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.z zVar) {
        return Y1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v0() {
        return this.F != 0;
    }

    public void v2() {
        this.E.b();
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    public boolean w2() {
        return a0() == 1;
    }

    public final void y2(View view, c cVar, boolean z) {
        if (cVar.f) {
            if (this.w == 1) {
                x2(view, this.J, RecyclerView.p.L(X(), Y(), j0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
                return;
            } else {
                x2(view, RecyclerView.p.L(r0(), s0(), g0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
        }
        if (this.w == 1) {
            x2(view, RecyclerView.p.L(this.x, s0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.L(X(), Y(), j0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            x2(view, RecyclerView.p.L(r0(), s0(), g0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.L(this.x, Y(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        return I2(i, vVar, zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.z2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    public static class LazySpanLookup {
        public int[] a;
        public List b;

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.b.get(i);
                if (fullSpanItem2.B == fullSpanItem.B) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.B >= fullSpanItem.B) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.b.get(size)).B >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public FullSpanItem e(int i, int i2, int i3, boolean z) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i4);
                int i5 = fullSpanItem.B;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.C == i3 || (z && fullSpanItem.E))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                if (fullSpanItem.B == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int iMin = Math.min(i2 + 1, this.a.length);
            Arrays.fill(this.a, i, iMin, -1);
            return iMin;
        }

        public final int i(int i) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemF = f(i);
            if (fullSpanItemF != null) {
                this.b.remove(fullSpanItemF);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (((FullSpanItem) this.b.get(i2)).B >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i2);
            this.b.remove(i2);
            return fullSpanItem.B;
        }

        public void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            l(i, i2);
        }

        public void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        public final void l(int i, int i2) {
            List list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i3 = fullSpanItem.B;
                if (i3 >= i) {
                    fullSpanItem.B = i3 + i2;
                }
            }
        }

        public final void m(int i, int i2) {
            List list = this.b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                int i4 = fullSpanItem.B;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.B = i4 - i2;
                    }
                }
            }
        }

        public void n(int i, d dVar) {
            c(i);
            this.a[i] = dVar.e;
        }

        public int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            public int B;
            public int C;
            public int[] D;
            public boolean E;

            public class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.B = parcel.readInt();
                this.C = parcel.readInt();
                this.E = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.D = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i) {
                int[] iArr = this.D;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.B + ", mGapDir=" + this.C + ", mHasUnwantedGapAfter=" + this.E + ", mGapPerSpan=" + Arrays.toString(this.D) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.B);
                parcel.writeInt(this.C);
                parcel.writeInt(this.E ? 1 : 0);
                int[] iArr = this.D;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.D);
                }
            }

            public FullSpanItem() {
            }
        }
    }
}
