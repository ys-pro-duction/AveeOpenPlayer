package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.h;
import androidx.lifecycle.g;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC7855rD0;
import com.daaw.C4260eQ;
import com.daaw.C4828gQ;
import com.daaw.InterfaceC0417Be1;
import com.daaw.QP;
import com.daaw.SP;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public final SP a;
    public final C4260eQ b;
    public final c c;
    public boolean d = false;
    public int e = -1;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View B;

        public a(View view) {
            this.B = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.B.removeOnAttachStateChangeListener(this);
            AbstractC2317Td1.m0(this.B);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.b.values().length];
            a = iArr;
            try {
                iArr[g.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f(SP sp, C4260eQ c4260eQ, c cVar) {
        this.a = sp;
        this.b = c4260eQ;
        this.c = cVar;
    }

    public void a() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        Bundle bundle = this.c.C;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.c.S0(bundle2);
        this.a.a(this.c, bundle2, false);
    }

    public void b() {
        c cVarM0 = FragmentManager.m0(this.c.k0);
        c cVarH = this.c.H();
        if (cVarM0 != null && !cVarM0.equals(cVarH)) {
            c cVar = this.c;
            C4828gQ.j(cVar, cVarM0, cVar.b0);
        }
        int iJ = this.b.j(this.c);
        c cVar2 = this.c;
        cVar2.k0.addView(cVar2.l0, iJ);
    }

    public void c() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        c cVar = this.c;
        c cVar2 = cVar.I;
        f fVarN = null;
        if (cVar2 != null) {
            f fVarN2 = this.b.n(cVar2.G);
            if (fVarN2 == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.I + " that does not belong to this FragmentManager!");
            }
            c cVar3 = this.c;
            cVar3.J = cVar3.I.G;
            cVar3.I = null;
            fVarN = fVarN2;
        } else {
            String str = cVar.J;
            if (str != null && (fVarN = this.b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.J + " that does not belong to this FragmentManager!");
            }
        }
        if (fVarN != null) {
            fVarN.m();
        }
        c cVar4 = this.c;
        cVar4.X = cVar4.W.w0();
        c cVar5 = this.c;
        cVar5.Z = cVar5.W.z0();
        this.a.g(this.c, false);
        this.c.T0();
        this.a.b(this.c, false);
    }

    public int d() {
        c cVar = this.c;
        if (cVar.W == null) {
            return cVar.B;
        }
        int iMin = this.e;
        int i = b.a[cVar.v0.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        c cVar2 = this.c;
        if (cVar2.Q) {
            if (cVar2.R) {
                iMin = Math.max(this.e, 2);
                View view = this.c.l0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, cVar2.B) : Math.min(iMin, 1);
            }
        }
        c cVar3 = this.c;
        if (cVar3.S && cVar3.k0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.c.M) {
            iMin = Math.min(iMin, 1);
        }
        c cVar4 = this.c;
        ViewGroup viewGroup = cVar4.k0;
        h.d.a aVarS = viewGroup != null ? h.u(viewGroup, cVar4.I()).s(this) : null;
        if (aVarS == h.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == h.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            c cVar5 = this.c;
            if (cVar5.N) {
                iMin = cVar5.f0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        c cVar6 = this.c;
        if (cVar6.m0 && cVar6.B < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.c.O) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.J0(2)) {
            Objects.toString(this.c);
        }
        return iMin;
    }

    public void e() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        Bundle bundle = this.c.C;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        c cVar = this.c;
        if (cVar.t0) {
            cVar.B = 1;
            cVar.u1();
        } else {
            this.a.h(cVar, bundle2, false);
            this.c.W0(bundle2);
            this.a.c(this.c, bundle2, false);
        }
    }

    public void f() {
        String resourceName;
        if (this.c.Q) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        Bundle bundle = this.c.C;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterC1 = this.c.c1(bundle2);
        c cVar = this.c;
        ViewGroup viewGroup2 = cVar.k0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = cVar.b0;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) cVar.W.s0().k(this.c.b0);
                if (viewGroup == null) {
                    c cVar2 = this.c;
                    if (!cVar2.T && !cVar2.S) {
                        try {
                            resourceName = cVar2.O().getResourceName(this.c.b0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.b0) + " (" + resourceName + ") for fragment " + this.c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C4828gQ.i(this.c, viewGroup);
                }
            }
        }
        c cVar3 = this.c;
        cVar3.k0 = viewGroup;
        cVar3.Y0(layoutInflaterC1, viewGroup, bundle2);
        if (this.c.l0 != null) {
            if (FragmentManager.J0(3)) {
                Objects.toString(this.c);
            }
            this.c.l0.setSaveFromParentEnabled(false);
            c cVar4 = this.c;
            cVar4.l0.setTag(AbstractC7855rD0.a, cVar4);
            if (viewGroup != null) {
                b();
            }
            c cVar5 = this.c;
            if (cVar5.d0) {
                cVar5.l0.setVisibility(8);
            }
            if (this.c.l0.isAttachedToWindow()) {
                AbstractC2317Td1.m0(this.c.l0);
            } else {
                View view = this.c.l0;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.c.p1();
            SP sp = this.a;
            c cVar6 = this.c;
            sp.m(cVar6, cVar6.l0, bundle2, false);
            int visibility = this.c.l0.getVisibility();
            this.c.C1(this.c.l0.getAlpha());
            c cVar7 = this.c;
            if (cVar7.k0 != null && visibility == 0) {
                View viewFindFocus = cVar7.l0.findFocus();
                if (viewFindFocus != null) {
                    this.c.z1(viewFindFocus);
                    if (FragmentManager.J0(2)) {
                        viewFindFocus.toString();
                        Objects.toString(this.c);
                    }
                }
                this.c.l0.setAlpha(0.0f);
            }
        }
        this.c.B = 2;
    }

    public void g() {
        c cVarF;
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        c cVar = this.c;
        boolean zIsChangingConfigurations = true;
        boolean z = cVar.N && !cVar.f0();
        if (z) {
            c cVar2 = this.c;
            if (!cVar2.P) {
                this.b.B(cVar2.G, null);
            }
        }
        if (!z && !this.b.p().q(this.c)) {
            String str = this.c.J;
            if (str != null && (cVarF = this.b.f(str)) != null && cVarF.f0) {
                this.c.I = cVarF;
            }
            this.c.B = 0;
            return;
        }
        QP qp = this.c.X;
        if (qp instanceof InterfaceC0417Be1) {
            zIsChangingConfigurations = this.b.p().n();
        } else if (qp.r() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) qp.r()).isChangingConfigurations();
        }
        if ((z && !this.c.P) || zIsChangingConfigurations) {
            this.b.p().f(this.c, false);
        }
        this.c.Z0();
        this.a.d(this.c, false);
        for (f fVar : this.b.k()) {
            if (fVar != null) {
                c cVarK = fVar.k();
                if (this.c.G.equals(cVarK.J)) {
                    cVarK.I = this.c;
                    cVarK.J = null;
                }
            }
        }
        c cVar3 = this.c;
        String str2 = cVar3.J;
        if (str2 != null) {
            cVar3.I = this.b.f(str2);
        }
        this.b.s(this);
    }

    public void h() {
        View view;
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        c cVar = this.c;
        ViewGroup viewGroup = cVar.k0;
        if (viewGroup != null && (view = cVar.l0) != null) {
            viewGroup.removeView(view);
        }
        this.c.a1();
        this.a.n(this.c, false);
        c cVar2 = this.c;
        cVar2.k0 = null;
        cVar2.l0 = null;
        cVar2.x0 = null;
        cVar2.y0.l(null);
        this.c.R = false;
    }

    public void i() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        this.c.b1();
        this.a.e(this.c, false);
        c cVar = this.c;
        cVar.B = -1;
        cVar.X = null;
        cVar.Z = null;
        cVar.W = null;
        if ((!cVar.N || cVar.f0()) && !this.b.p().q(this.c)) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        this.c.b0();
    }

    public void j() {
        c cVar = this.c;
        if (cVar.Q && cVar.R && !cVar.U) {
            if (FragmentManager.J0(3)) {
                Objects.toString(this.c);
            }
            Bundle bundle = this.c.C;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            c cVar2 = this.c;
            cVar2.Y0(cVar2.c1(bundle2), null, bundle2);
            View view = this.c.l0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                c cVar3 = this.c;
                cVar3.l0.setTag(AbstractC7855rD0.a, cVar3);
                c cVar4 = this.c;
                if (cVar4.d0) {
                    cVar4.l0.setVisibility(8);
                }
                this.c.p1();
                SP sp = this.a;
                c cVar5 = this.c;
                sp.m(cVar5, cVar5.l0, bundle2, false);
                this.c.B = 2;
            }
        }
    }

    public c k() {
        return this.c;
    }

    public final boolean l(View view) {
        if (view == this.c.l0) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.l0) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (FragmentManager.J0(2)) {
                Objects.toString(k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int iD = d();
                c cVar = this.c;
                int i = cVar.B;
                if (iD == i) {
                    if (!z && i == -1 && cVar.N && !cVar.f0() && !this.c.P) {
                        if (FragmentManager.J0(3)) {
                            Objects.toString(this.c);
                        }
                        this.b.p().f(this.c, true);
                        this.b.s(this);
                        if (FragmentManager.J0(3)) {
                            Objects.toString(this.c);
                        }
                        this.c.b0();
                    }
                    c cVar2 = this.c;
                    if (cVar2.r0) {
                        if (cVar2.l0 != null && (viewGroup = cVar2.k0) != null) {
                            h hVarU = h.u(viewGroup, cVar2.I());
                            if (this.c.d0) {
                                hVarU.k(this);
                            } else {
                                hVarU.m(this);
                            }
                        }
                        c cVar3 = this.c;
                        FragmentManager fragmentManager = cVar3.W;
                        if (fragmentManager != null) {
                            fragmentManager.H0(cVar3);
                        }
                        c cVar4 = this.c;
                        cVar4.r0 = false;
                        cVar4.B0(cVar4.d0);
                        this.c.Y.J();
                    }
                    this.d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (cVar.P && this.b.q(cVar.G) == null) {
                                this.b.B(this.c.G, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.c.B = 1;
                            break;
                        case 2:
                            cVar.R = false;
                            cVar.B = 2;
                            break;
                        case 3:
                            if (FragmentManager.J0(3)) {
                                Objects.toString(this.c);
                            }
                            c cVar5 = this.c;
                            if (cVar5.P) {
                                this.b.B(cVar5.G, q());
                            } else if (cVar5.l0 != null && cVar5.D == null) {
                                r();
                            }
                            c cVar6 = this.c;
                            if (cVar6.l0 != null && (viewGroup2 = cVar6.k0) != null) {
                                h.u(viewGroup2, cVar6.I()).l(this);
                            }
                            this.c.B = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            cVar.B = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (cVar.l0 != null && (viewGroup3 = cVar.k0) != null) {
                                h.u(viewGroup3, cVar.I()).j(h.d.b.g(this.c.l0.getVisibility()), this);
                            }
                            this.c.B = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            cVar.B = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void n() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        this.c.h1();
        this.a.f(this.c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.c.C;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.c.C.getBundle("savedInstanceState") == null) {
            this.c.C.putBundle("savedInstanceState", new Bundle());
        }
        try {
            c cVar = this.c;
            cVar.D = cVar.C.getSparseParcelableArray("viewState");
            c cVar2 = this.c;
            cVar2.E = cVar2.C.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.c.C.getParcelable("state");
            if (fragmentState != null) {
                c cVar3 = this.c;
                cVar3.J = fragmentState.N;
                cVar3.K = fragmentState.O;
                Boolean bool = cVar3.F;
                if (bool != null) {
                    cVar3.n0 = bool.booleanValue();
                    this.c.F = null;
                } else {
                    cVar3.n0 = fragmentState.P;
                }
            }
            c cVar4 = this.c;
            if (cVar4.n0) {
                return;
            }
            cVar4.m0 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e);
        }
    }

    public void p() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        View viewC = this.c.C();
        if (viewC != null && l(viewC)) {
            viewC.requestFocus();
            if (FragmentManager.J0(2)) {
                viewC.toString();
                Objects.toString(this.c);
                Objects.toString(this.c.l0.findFocus());
            }
        }
        this.c.z1(null);
        this.c.l1();
        this.a.i(this.c, false);
        this.b.B(this.c.G, null);
        c cVar = this.c;
        cVar.C = null;
        cVar.D = null;
        cVar.E = null;
    }

    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        c cVar = this.c;
        if (cVar.B == -1 && (bundle = cVar.C) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.c));
        if (this.c.B > -1) {
            Bundle bundle3 = new Bundle();
            this.c.m1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(this.c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.c.A0.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleI1 = this.c.Y.i1();
            if (!bundleI1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleI1);
            }
            if (this.c.l0 != null) {
                r();
            }
            SparseArray<? extends Parcelable> sparseArray = this.c.D;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.c.E;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.c.H;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void r() {
        if (this.c.l0 == null) {
            return;
        }
        if (FragmentManager.J0(2)) {
            Objects.toString(this.c);
            Objects.toString(this.c.l0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.l0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.D = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.x0.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.E = bundle;
    }

    public void s(int i) {
        this.e = i;
    }

    public void t() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        this.c.n1();
        this.a.k(this.c, false);
    }

    public void u() {
        if (FragmentManager.J0(3)) {
            Objects.toString(this.c);
        }
        this.c.o1();
        this.a.l(this.c, false);
    }

    public f(SP sp, C4260eQ c4260eQ, ClassLoader classLoader, e eVar, Bundle bundle) {
        this.a = sp;
        this.b = c4260eQ;
        c cVarA = ((FragmentState) bundle.getParcelable("state")).a(eVar, classLoader);
        this.c = cVarA;
        cVarA.C = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        cVarA.y1(bundle2);
        if (FragmentManager.J0(2)) {
            Objects.toString(cVarA);
        }
    }

    public f(SP sp, C4260eQ c4260eQ, c cVar, Bundle bundle) {
        this.a = sp;
        this.b = c4260eQ;
        this.c = cVar;
        cVar.D = null;
        cVar.E = null;
        cVar.V = 0;
        cVar.R = false;
        cVar.M = false;
        c cVar2 = cVar.I;
        cVar.J = cVar2 != null ? cVar2.G : null;
        cVar.I = null;
        cVar.C = bundle;
        cVar.H = bundle.getBundle("arguments");
    }
}
