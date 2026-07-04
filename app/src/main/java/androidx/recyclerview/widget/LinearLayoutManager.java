package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.y.b {
    public int A;
    public int B;
    public boolean C;
    public SavedState D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;
    public int s;
    public c t;
    public i u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int B;
        public int C;
        public boolean D;

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

        public boolean a() {
            return this.B >= 0;
        }

        public void b() {
            this.B = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.B);
            parcel.writeInt(this.C);
            parcel.writeInt(this.D ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.B = parcel.readInt();
            this.C = parcel.readInt();
            this.D = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.B = savedState.B;
            this.C = savedState.C;
            this.D = savedState.D;
        }
    }

    public static class a {
        public i a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            this.c = this.d ? this.a.i() : this.a.m();
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int iO = this.a.o();
            if (iO >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - iO) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int iE = this.c - this.a.e(view);
                    int iM = this.a.m();
                    int iMin = iE - (iM + Math.min(this.a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.c += Math.min(i2, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.a.g(view);
            int iM2 = iG - this.a.m();
            this.c = iG;
            if (iM2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - iO) - this.a.d(view))) - (iG + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(iM2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < zVar.b();
        }

        public void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    public static class c {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int k;
        public boolean m;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public boolean j = false;
        public List l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.z zVar) {
            int i = this.d;
            return i >= 0 && i < zVar.b();
        }

        public View d(RecyclerView.v vVar) {
            if (this.l != null) {
                return e();
            }
            View viewO = vVar.o(this.d);
            this.d += this.e;
            return viewO;
        }

        public final View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.D) this.l.get(i)).a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int iA;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.D) this.l.get(i2)).a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.d) * this.e) >= 0 && iA < i) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = iA;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A1(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        w1();
    }

    public int A2(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (K() == 0 || i == 0) {
            return 0;
        }
        W1();
        this.t.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        H2(i2, iAbs, true, zVar);
        c cVar = this.t;
        int iX1 = cVar.g + X1(vVar, cVar, zVar, false);
        if (iX1 < 0) {
            return 0;
        }
        if (iAbs > iX1) {
            i = i2 * iX1;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 0) {
            return 0;
        }
        return A2(i, vVar, zVar);
    }

    public void B2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        h(null);
        if (i != this.s || this.u == null) {
            i iVarB = i.b(this, i);
            this.u = iVarB;
            this.E.a = iVarB;
            this.s = i;
            w1();
        }
    }

    public void C2(boolean z) {
        h(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View D(int i) {
        int iK = K();
        if (iK == 0) {
            return null;
        }
        int iK0 = i - k0(J(0));
        if (iK0 >= 0 && iK0 < iK) {
            View viewJ = J(iK0);
            if (k0(viewJ) == i) {
                return viewJ;
            }
        }
        return super.D(i);
    }

    public void D2(boolean z) {
        h(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E() {
        return new RecyclerView.q(-2, -2);
    }

    public final boolean E2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        View viewI2;
        boolean z = false;
        if (K() == 0) {
            return false;
        }
        View viewW = W();
        if (viewW != null && aVar.d(viewW, zVar)) {
            aVar.c(viewW, k0(viewW));
            return true;
        }
        boolean z2 = this.v;
        boolean z3 = this.y;
        if (z2 != z3 || (viewI2 = i2(vVar, zVar, aVar.d, z3)) == null) {
            return false;
        }
        aVar.b(viewI2, k0(viewI2));
        if (!zVar.e() && O1()) {
            int iG = this.u.g(viewI2);
            int iD = this.u.d(viewI2);
            int iM = this.u.m();
            int i = this.u.i();
            boolean z4 = iD <= iM && iG < iM;
            if (iG >= i && iD > i) {
                z = true;
            }
            if (z4 || z) {
                if (aVar.d) {
                    iM = i;
                }
                aVar.c = iM;
            }
        }
        return true;
    }

    public final boolean F2(RecyclerView.z zVar, a aVar) {
        int i;
        if (!zVar.e() && (i = this.A) != -1) {
            if (i >= 0 && i < zVar.b()) {
                aVar.b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z = this.D.D;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.u.i() - this.D.C;
                    } else {
                        aVar.c = this.u.m() + this.D.C;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.m() + this.B;
                    }
                    return true;
                }
                View viewD = D(this.A);
                if (viewD == null) {
                    if (K() > 0) {
                        aVar.d = (this.A < k0(J(0))) == this.x;
                    }
                    aVar.a();
                } else {
                    if (this.u.e(viewD) > this.u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.u.g(viewD) - this.u.m() < 0) {
                        aVar.c = this.u.m();
                        aVar.d = false;
                        return true;
                    }
                    if (this.u.i() - this.u.d(viewD) < 0) {
                        aVar.c = this.u.i();
                        aVar.d = true;
                        return true;
                    }
                    aVar.c = aVar.d ? this.u.d(viewD) + this.u.o() : this.u.g(viewD);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void G2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar) {
        if (F2(zVar, aVar) || E2(vVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.y ? zVar.b() - 1 : 0;
    }

    public final void H2(int i, int i2, boolean z, RecyclerView.z zVar) {
        int iM;
        this.t.m = y2();
        this.t.f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        P1(zVar, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z2 = i == 1;
        c cVar = this.t;
        int i3 = z2 ? iMax2 : iMax;
        cVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View viewL2 = l2();
            c cVar2 = this.t;
            cVar2.e = this.x ? -1 : 1;
            int iK0 = k0(viewL2);
            c cVar3 = this.t;
            cVar2.d = iK0 + cVar3.e;
            cVar3.b = this.u.d(viewL2);
            iM = this.u.d(viewL2) - this.u.i();
        } else {
            View viewM2 = m2();
            this.t.h += this.u.m();
            c cVar4 = this.t;
            cVar4.e = this.x ? 1 : -1;
            int iK02 = k0(viewM2);
            c cVar5 = this.t;
            cVar4.d = iK02 + cVar5.e;
            cVar5.b = this.u.g(viewM2);
            iM = (-this.u.g(viewM2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - iM;
        }
        cVar6.g = iM;
    }

    public final void I2(int i, int i2) {
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        cVar.e = this.x ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean J1() {
        return (Y() == 1073741824 || s0() == 1073741824 || !t0()) ? false : true;
    }

    public final void J2(a aVar) {
        I2(aVar.b, aVar.c);
    }

    public final void K2(int i, int i2) {
        this.t.c = i2 - this.u.m();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.L0(recyclerView, vVar);
        if (this.C) {
            n1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        M1(gVar);
    }

    public final void L2(a aVar) {
        K2(aVar.b, aVar.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View M0(View view, int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int iU1;
        z2();
        if (K() == 0 || (iU1 = U1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        W1();
        H2(iU1, (int) (this.u.n() * 0.33333334f), false, zVar);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        X1(vVar, cVar, zVar, true);
        View viewH2 = iU1 == -1 ? h2() : g2();
        View viewM2 = iU1 == -1 ? m2() : l2();
        if (!viewM2.hasFocusable()) {
            return viewH2;
        }
        if (viewH2 == null) {
            return null;
        }
        return viewM2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(AccessibilityEvent accessibilityEvent) {
        super.N0(accessibilityEvent);
        if (K() > 0) {
            accessibilityEvent.setFromIndex(b2());
            accessibilityEvent.setToIndex(d2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean O1() {
        return this.D == null && this.v == this.y;
    }

    public void P1(RecyclerView.z zVar, int[] iArr) {
        int i;
        int iN2 = n2(zVar);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = iN2;
            iN2 = 0;
        }
        iArr[0] = iN2;
        iArr[1] = i;
    }

    public void Q1(RecyclerView.z zVar, c cVar, RecyclerView.p.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= zVar.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    public final int R1(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        W1();
        return l.a(zVar, this.u, a2(!this.z, true), Z1(!this.z, true), this, this.z);
    }

    public final int S1(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        W1();
        return l.b(zVar, this.u, a2(!this.z, true), Z1(!this.z, true), this, this.z, this.x);
    }

    public final int T1(RecyclerView.z zVar) {
        if (K() == 0) {
            return 0;
        }
        W1();
        return l.c(zVar, this.u, a2(!this.z, true), Z1(!this.z, true), this, this.z);
    }

    public int U1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && p2()) ? -1 : 1 : (this.s != 1 && p2()) ? 1 : -1;
    }

    public c V1() {
        return new c();
    }

    public void W1() {
        if (this.t == null) {
            this.t = V1();
        }
    }

    public int X1(RecyclerView.v vVar, c cVar, RecyclerView.z zVar, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            u2(vVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            r2(vVar, zVar, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !zVar.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    u2(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public final View Y1() {
        return e2(0, K());
    }

    public View Z1(boolean z, boolean z2) {
        return this.x ? f2(0, K(), z, z2) : f2(K() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView.v vVar, RecyclerView.z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iJ2;
        int i5;
        View viewD;
        int iG;
        int i6;
        int i7 = -1;
        if (!(this.D == null && this.A == -1) && zVar.b() == 0) {
            n1(vVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.B;
        }
        W1();
        this.t.a = false;
        z2();
        View viewW = W();
        a aVar = this.E;
        if (!aVar.e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.d = this.x ^ this.y;
            G2(vVar, zVar, aVar2);
            this.E.e = true;
        } else if (viewW != null && (this.u.g(viewW) >= this.u.i() || this.u.d(viewW) <= this.u.m())) {
            this.E.c(viewW, k0(viewW));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        P1(zVar, iArr);
        int iMax = Math.max(0, this.H[0]) + this.u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.u.j();
        if (zVar.e() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewD = D(i5)) != null) {
            if (this.x) {
                i6 = this.u.i() - this.u.d(viewD);
                iG = this.B;
            } else {
                iG = this.u.g(viewD) - this.u.m();
                i6 = this.B;
            }
            int i8 = i6 - iG;
            if (i8 > 0) {
                iMax += i8;
            } else {
                iMax2 -= i8;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.d ? !this.x : this.x) {
            i7 = 1;
        }
        t2(vVar, zVar, aVar3, i7);
        x(vVar);
        this.t.m = y2();
        this.t.j = zVar.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.d) {
            L2(aVar4);
            c cVar2 = this.t;
            cVar2.h = iMax;
            X1(vVar, cVar2, zVar, false);
            c cVar3 = this.t;
            i2 = cVar3.b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                iMax2 += i10;
            }
            J2(this.E);
            c cVar4 = this.t;
            cVar4.h = iMax2;
            cVar4.d += cVar4.e;
            X1(vVar, cVar4, zVar, false);
            c cVar5 = this.t;
            i = cVar5.b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                K2(i9, i2);
                c cVar6 = this.t;
                cVar6.h = i11;
                X1(vVar, cVar6, zVar, false);
                i2 = this.t.b;
            }
        } else {
            J2(aVar4);
            c cVar7 = this.t;
            cVar7.h = iMax2;
            X1(vVar, cVar7, zVar, false);
            c cVar8 = this.t;
            i = cVar8.b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                iMax += i13;
            }
            L2(this.E);
            c cVar9 = this.t;
            cVar9.h = iMax;
            cVar9.d += cVar9.e;
            X1(vVar, cVar9, zVar, false);
            c cVar10 = this.t;
            i2 = cVar10.b;
            int i14 = cVar10.c;
            if (i14 > 0) {
                I2(i12, i);
                c cVar11 = this.t;
                cVar11.h = i14;
                X1(vVar, cVar11, zVar, false);
                i = this.t.b;
            }
        }
        if (K() > 0) {
            if (this.x ^ this.y) {
                int iJ22 = j2(i, vVar, zVar, true);
                i3 = i2 + iJ22;
                i4 = i + iJ22;
                iJ2 = k2(i3, vVar, zVar, false);
            } else {
                int iK2 = k2(i2, vVar, zVar, true);
                i3 = i2 + iK2;
                i4 = i + iK2;
                iJ2 = j2(i4, vVar, zVar, false);
            }
            i2 = i3 + iJ2;
            i = i4 + iJ2;
        }
        s2(vVar, zVar, i2, i);
        if (zVar.e()) {
            this.E.e();
        } else {
            this.u.s();
        }
        this.v = this.y;
    }

    public View a2(boolean z, boolean z2) {
        return this.x ? f2(K() - 1, -1, z, z2) : f2(0, K(), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF b(int i) {
        if (K() == 0) {
            return null;
        }
        int i2 = (i < k0(J(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.z zVar) {
        super.b1(zVar);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int b2() {
        View viewF2 = f2(0, K(), false, true);
        if (viewF2 == null) {
            return -1;
        }
        return k0(viewF2);
    }

    public final View c2() {
        return e2(K() - 1, -1);
    }

    public int d2() {
        View viewF2 = f2(K() - 1, -1, false, true);
        if (viewF2 == null) {
            return -1;
        }
        return k0(viewF2);
    }

    public View e2(int i, int i2) {
        int i3;
        int i4;
        W1();
        if (i2 <= i && i2 >= i) {
            return J(i);
        }
        if (this.u.g(J(i)) < this.u.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.b();
            }
            w1();
        }
    }

    public View f2(int i, int i2, boolean z, boolean z2) {
        W1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable g1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (K() <= 0) {
            savedState.b();
            return savedState;
        }
        W1();
        boolean z = this.v ^ this.x;
        savedState.D = z;
        if (z) {
            View viewL2 = l2();
            savedState.C = this.u.i() - this.u.d(viewL2);
            savedState.B = k0(viewL2);
            return savedState;
        }
        View viewM2 = m2();
        savedState.B = k0(viewM2);
        savedState.C = this.u.g(viewM2) - this.u.m();
        return savedState;
    }

    public final View g2() {
        return this.x ? Y1() : c2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h(String str) {
        if (this.D == null) {
            super.h(str);
        }
    }

    public final View h2() {
        return this.x ? c2() : Y1();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View i2(androidx.recyclerview.widget.RecyclerView.v r17, androidx.recyclerview.widget.RecyclerView.z r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.W1()
            int r1 = r0.K()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.K()
            int r1 = r1 - r3
            r4 = -1
            r5 = -1
            goto L18
        L15:
            r4 = r1
            r1 = 0
            r5 = 1
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.i r7 = r0.u
            int r7 = r7.m()
            androidx.recyclerview.widget.i r8 = r0.u
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.J(r1)
            int r13 = r0.k0(r12)
            androidx.recyclerview.widget.i r14 = r0.u
            int r14 = r14.g(r12)
            androidx.recyclerview.widget.i r15 = r0.u
            int r15 = r15.d(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = 1
            goto L5c
        L5b:
            r13 = 0
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = 1
            goto L63
        L62:
            r14 = 0
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean, boolean):android.view.View");
    }

    public final int j2(int i, RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -A2(-i3, vVar, zVar);
        int i5 = i + i4;
        if (!z || (i2 = this.u.i() - i5) <= 0) {
            return i4;
        }
        this.u.r(i2);
        return i2 + i4;
    }

    public final int k2(int i, RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        int iM;
        int iM2 = i - this.u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -A2(iM2, vVar, zVar);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.u.m()) <= 0) {
            return i2;
        }
        this.u.r(-iM);
        return i2 - iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.s == 0;
    }

    public final View l2() {
        return J(this.x ? 0 : K() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m() {
        return this.s == 1;
    }

    public final View m2() {
        return J(this.x ? K() - 1 : 0);
    }

    public int n2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.u.n();
        }
        return 0;
    }

    public int o2() {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i, int i2, RecyclerView.z zVar, RecyclerView.p.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (K() == 0 || i == 0) {
            return;
        }
        W1();
        H2(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
        Q1(zVar, this.t, cVar);
    }

    public boolean p2() {
        return a0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void q(int i, RecyclerView.p.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.D;
        if (savedState == null || !savedState.a()) {
            z2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z = savedState2.D;
            i2 = savedState2.B;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public boolean q2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.z zVar) {
        return R1(zVar);
    }

    public void r2(RecyclerView.v vVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iG0;
        int iF;
        int i5;
        int i6;
        View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                e(viewD);
            } else {
                f(viewD, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                c(viewD);
            } else {
                d(viewD, 0);
            }
        }
        D0(viewD, 0, 0);
        bVar.a = this.u.e(viewD);
        if (this.s == 1) {
            if (p2()) {
                iF = r0() - h0();
                iG0 = iF - this.u.f(viewD);
            } else {
                iG0 = g0();
                iF = this.u.f(viewD) + iG0;
            }
            if (cVar.f == -1) {
                i6 = cVar.b;
                i5 = i6 - bVar.a;
            } else {
                i5 = cVar.b;
                i6 = bVar.a + i5;
            }
            int i7 = iG0;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = iF;
        } else {
            int iJ0 = j0();
            int iF2 = this.u.f(viewD) + iJ0;
            if (cVar.f == -1) {
                int i8 = cVar.b;
                i3 = i8 - bVar.a;
                i = i8;
                i2 = iF2;
            } else {
                int i9 = cVar.b;
                i = bVar.a + i9;
                i2 = iF2;
                i3 = i9;
            }
            i4 = iJ0;
        }
        C0(viewD, i3, i4, i, i2);
        if (qVar.c() || qVar.b()) {
            bVar.c = true;
        }
        bVar.d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.z zVar) {
        return S1(zVar);
    }

    public final void s2(RecyclerView.v vVar, RecyclerView.z zVar, int i, int i2) {
        if (!zVar.g() || K() == 0 || zVar.e() || !O1()) {
            return;
        }
        List listK = vVar.k();
        int size = listK.size();
        int iK0 = k0(J(0));
        int iE = 0;
        int iE2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.D d = (RecyclerView.D) listK.get(i3);
            if (!d.z()) {
                if ((d.q() < iK0) != this.x) {
                    iE += this.u.e(d.a);
                } else {
                    iE2 += this.u.e(d.a);
                }
            }
        }
        this.t.l = listK;
        if (iE > 0) {
            K2(k0(m2()), i);
            c cVar = this.t;
            cVar.h = iE;
            cVar.c = 0;
            cVar.a();
            X1(vVar, this.t, zVar, false);
        }
        if (iE2 > 0) {
            I2(k0(l2()), i2);
            c cVar2 = this.t;
            cVar2.h = iE2;
            cVar2.c = 0;
            cVar2.a();
            X1(vVar, this.t, zVar, false);
        }
        this.t.l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.z zVar) {
        return T1(zVar);
    }

    public void t2(RecyclerView.v vVar, RecyclerView.z zVar, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.z zVar) {
        return R1(zVar);
    }

    public final void u2(RecyclerView.v vVar, c cVar) {
        if (!cVar.a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            w2(vVar, i, i2);
        } else {
            x2(vVar, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.z zVar) {
        return S1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v0() {
        return true;
    }

    public final void v2(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                q1(i, vVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                q1(i3, vVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.z zVar) {
        return T1(zVar);
    }

    public final void w2(RecyclerView.v vVar, int i, int i2) {
        int iK = K();
        if (i < 0) {
            return;
        }
        int iH = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < iK; i3++) {
                View viewJ = J(i3);
                if (this.u.g(viewJ) < iH || this.u.q(viewJ) < iH) {
                    v2(vVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = iK - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View viewJ2 = J(i5);
            if (this.u.g(viewJ2) < iH || this.u.q(viewJ2) < iH) {
                v2(vVar, i4, i5);
                return;
            }
        }
    }

    public final void x2(RecyclerView.v vVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int iK = K();
        if (!this.x) {
            for (int i4 = 0; i4 < iK; i4++) {
                View viewJ = J(i4);
                if (this.u.d(viewJ) > i3 || this.u.p(viewJ) > i3) {
                    v2(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = iK - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View viewJ2 = J(i6);
            if (this.u.d(viewJ2) > i3 || this.u.p(viewJ2) > i3) {
                v2(vVar, i5, i6);
                return;
            }
        }
    }

    public boolean y2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (this.s == 1) {
            return 0;
        }
        return A2(i, vVar, zVar);
    }

    public final void z2() {
        if (this.s == 1 || !p2()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        B2(i);
        C2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d dVarL0 = RecyclerView.p.l0(context, attributeSet, i, i2);
        B2(dVarL0.a);
        C2(dVarL0.c);
        D2(dVarL0.d);
    }
}
