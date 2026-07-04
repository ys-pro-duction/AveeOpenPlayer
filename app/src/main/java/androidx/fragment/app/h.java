package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.daaw.AbstractC2141Rm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC7855rD0;
import com.daaw.C2419Ud;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC6254lV0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final a f = new a(null);
    public final ViewGroup a;
    public final List b;
    public final List c;
    public boolean d;
    public boolean e;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final h a(ViewGroup viewGroup, FragmentManager fragmentManager) {
            G10.g(viewGroup, "container");
            G10.g(fragmentManager, "fragmentManager");
            InterfaceC6254lV0 interfaceC6254lV0B0 = fragmentManager.B0();
            G10.f(interfaceC6254lV0B0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, interfaceC6254lV0B0);
        }

        public final h b(ViewGroup viewGroup, InterfaceC6254lV0 interfaceC6254lV0) {
            G10.g(viewGroup, "container");
            G10.g(interfaceC6254lV0, "factory");
            Object tag = viewGroup.getTag(AbstractC7855rD0.b);
            if (tag instanceof h) {
                return (h) tag;
            }
            h hVarA = interfaceC6254lV0.a(viewGroup);
            G10.f(hVarA, "factory.createController(container)");
            viewGroup.setTag(AbstractC7855rD0.b, hVarA);
            return hVarA;
        }

        public a() {
        }
    }

    public static class b {
        public final boolean a;
        public boolean b;
        public boolean c;

        public final void a(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            if (!this.c) {
                c(viewGroup);
            }
            this.c = true;
        }

        public boolean b() {
            return this.a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(C2419Ud c2419Ud, ViewGroup viewGroup) {
            G10.g(c2419Ud, "backEvent");
            G10.g(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            if (!this.b) {
                f(viewGroup);
            }
            this.b = true;
        }
    }

    public static final class c extends d {
        public final f l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b bVar, d.a aVar, f fVar) {
            G10.g(bVar, "finalState");
            G10.g(aVar, "lifecycleImpact");
            G10.g(fVar, "fragmentStateManager");
            androidx.fragment.app.c cVarK = fVar.k();
            G10.f(cVarK, "fragmentStateManager.fragment");
            super(bVar, aVar, cVarK);
            this.l = fVar;
        }

        @Override // androidx.fragment.app.h.d
        public void e() {
            super.e();
            i().O = false;
            this.l.m();
        }

        @Override // androidx.fragment.app.h.d
        public void q() {
            if (o()) {
                return;
            }
            super.q();
            if (j() != d.a.ADDING) {
                if (j() == d.a.REMOVING) {
                    androidx.fragment.app.c cVarK = this.l.k();
                    G10.f(cVarK, "fragmentStateManager.fragment");
                    View viewT1 = cVarK.t1();
                    G10.f(viewT1, "fragment.requireView()");
                    if (FragmentManager.J0(2)) {
                        Objects.toString(viewT1.findFocus());
                        viewT1.toString();
                        cVarK.toString();
                    }
                    viewT1.clearFocus();
                    return;
                }
                return;
            }
            androidx.fragment.app.c cVarK2 = this.l.k();
            G10.f(cVarK2, "fragmentStateManager.fragment");
            View viewFindFocus = cVarK2.l0.findFocus();
            if (viewFindFocus != null) {
                cVarK2.z1(viewFindFocus);
                if (FragmentManager.J0(2)) {
                    viewFindFocus.toString();
                    cVarK2.toString();
                }
            }
            View viewT12 = i().t1();
            G10.f(viewT12, "this.fragment.requireView()");
            if (viewT12.getParent() == null) {
                this.l.b();
                viewT12.setAlpha(0.0f);
            }
            if (viewT12.getAlpha() == 0.0f && viewT12.getVisibility() == 0) {
                viewT12.setVisibility(4);
            }
            viewT12.setAlpha(cVarK2.M());
        }
    }

    public static class d {
        public b a;
        public a b;
        public final androidx.fragment.app.c c;
        public final List d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public final List j;
        public final List k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a B = new a(null);

            public static final class a {
                public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
                    this();
                }

                public final b a(View view) {
                    G10.g(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i) {
                    if (i == 0) {
                        return b.VISIBLE;
                    }
                    if (i == 4) {
                        return b.INVISIBLE;
                    }
                    if (i == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }

                public a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.h$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0019b {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            public static final b g(int i) {
                return B.b(i);
            }

            public final void c(View view, ViewGroup viewGroup) {
                G10.g(view, "view");
                G10.g(viewGroup, "container");
                int i = C0019b.a[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (FragmentManager.J0(2)) {
                            view.toString();
                            viewGroup2.toString();
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.J0(2)) {
                        Objects.toString(view);
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.J0(2)) {
                            view.toString();
                            Objects.toString(viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.J0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i != 4) {
                        return;
                    }
                    if (FragmentManager.J0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        public /* synthetic */ class c {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public d(b bVar, a aVar, androidx.fragment.app.c cVar) {
            G10.g(bVar, "finalState");
            G10.g(aVar, "lifecycleImpact");
            G10.g(cVar, "fragment");
            this.a = bVar;
            this.b = aVar;
            this.c = cVar;
            this.d = new ArrayList();
            this.i = true;
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            this.k = arrayList;
        }

        public final void a(Runnable runnable) {
            G10.g(runnable, "listener");
            this.d.add(runnable);
        }

        public final void b(b bVar) {
            G10.g(bVar, "effect");
            this.j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            this.h = false;
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.j.isEmpty()) {
                e();
                return;
            }
            Iterator it = AbstractC2455Um.M0(this.k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(viewGroup);
            }
        }

        public final void d(ViewGroup viewGroup, boolean z) {
            G10.g(viewGroup, "container");
            if (this.e) {
                return;
            }
            if (z) {
                this.g = true;
            }
            c(viewGroup);
        }

        public void e() {
            this.h = false;
            if (this.f) {
                return;
            }
            if (FragmentManager.J0(2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(b bVar) {
            G10.g(bVar, "effect");
            if (this.j.remove(bVar) && this.j.isEmpty()) {
                e();
            }
        }

        public final List g() {
            return this.k;
        }

        public final b h() {
            return this.a;
        }

        public final androidx.fragment.app.c i() {
            return this.c;
        }

        public final a j() {
            return this.b;
        }

        public final boolean k() {
            return this.i;
        }

        public final boolean l() {
            return this.e;
        }

        public final boolean m() {
            return this.f;
        }

        public final boolean n() {
            return this.g;
        }

        public final boolean o() {
            return this.h;
        }

        public final void p(b bVar, a aVar) {
            G10.g(bVar, "finalState");
            G10.g(aVar, "lifecycleImpact");
            int i = c.a[aVar.ordinal()];
            if (i == 1) {
                if (this.a == b.REMOVED) {
                    if (FragmentManager.J0(2)) {
                        Objects.toString(this.c);
                        Objects.toString(this.b);
                    }
                    this.a = b.VISIBLE;
                    this.b = a.ADDING;
                    this.i = true;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.J0(2)) {
                    Objects.toString(this.c);
                    Objects.toString(this.a);
                    Objects.toString(this.b);
                }
                this.a = b.REMOVED;
                this.b = a.REMOVING;
                this.i = true;
                return;
            }
            if (i == 3 && this.a != b.REMOVED) {
                if (FragmentManager.J0(2)) {
                    Objects.toString(this.c);
                    Objects.toString(this.a);
                    Objects.toString(bVar);
                }
                this.a = bVar;
            }
        }

        public void q() {
            this.h = true;
        }

        public final void r(boolean z) {
            this.i = z;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + '}';
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public h(ViewGroup viewGroup) {
        G10.g(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final void h(h hVar, c cVar) {
        G10.g(hVar, "this$0");
        G10.g(cVar, "$operation");
        if (hVar.b.contains(cVar)) {
            d.b bVarH = cVar.h();
            View view = cVar.i().l0;
            G10.f(view, "operation.fragment.mView");
            bVarH.c(view, hVar.a);
        }
    }

    public static final void i(h hVar, c cVar) {
        G10.g(hVar, "this$0");
        G10.g(cVar, "$operation");
        hVar.b.remove(cVar);
        hVar.c.remove(cVar);
    }

    public static final h u(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f.a(viewGroup, fragmentManager);
    }

    public static final h v(ViewGroup viewGroup, InterfaceC6254lV0 interfaceC6254lV0) {
        return f.b(viewGroup, interfaceC6254lV0);
    }

    public final void A() {
        for (d dVar : this.b) {
            if (dVar.j() == d.a.ADDING) {
                View viewT1 = dVar.i().t1();
                G10.f(viewT1, "fragment.requireView()");
                dVar.p(d.b.B.b(viewT1.getVisibility()), d.a.NONE);
            }
        }
    }

    public final void B(boolean z) {
        this.d = z;
    }

    public final void c(d dVar) {
        G10.g(dVar, "operation");
        if (dVar.k()) {
            d.b bVarH = dVar.h();
            View viewT1 = dVar.i().t1();
            G10.f(viewT1, "operation.fragment.requireView()");
            bVarH.c(viewT1, this.a);
            dVar.r(false);
        }
    }

    public abstract void d(List list, boolean z);

    public void e(List list) {
        G10.g(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList, ((d) it.next()).g());
        }
        List listM0 = AbstractC2455Um.M0(AbstractC2455Um.Q0(arrayList));
        int size = listM0.size();
        for (int i = 0; i < size; i++) {
            ((b) listM0.get(i)).d(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c((d) list.get(i2));
        }
        List listM02 = AbstractC2455Um.M0(list);
        int size3 = listM02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            d dVar = (d) listM02.get(i3);
            if (dVar.g().isEmpty()) {
                dVar.e();
            }
        }
    }

    public final void f() {
        FragmentManager.J0(3);
        z(this.c);
        e(this.c);
    }

    public final void g(d.b bVar, d.a aVar, f fVar) {
        synchronized (this.b) {
            try {
                androidx.fragment.app.c cVarK = fVar.k();
                G10.f(cVarK, "fragmentStateManager.fragment");
                d dVarO = o(cVarK);
                if (dVarO == null) {
                    if (fVar.k().O) {
                        androidx.fragment.app.c cVarK2 = fVar.k();
                        G10.f(cVarK2, "fragmentStateManager.fragment");
                        dVarO = p(cVarK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.p(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, fVar);
                this.b.add(cVar);
                cVar.a(new Runnable() { // from class: com.daaw.jV0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.h.h(this.B, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: com.daaw.kV0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.h.i(this.B, cVar);
                    }
                });
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(d.b bVar, f fVar) {
        G10.g(bVar, "finalState");
        G10.g(fVar, "fragmentStateManager");
        if (FragmentManager.J0(2)) {
            Objects.toString(fVar.k());
        }
        g(bVar, d.a.ADDING, fVar);
    }

    public final void k(f fVar) {
        G10.g(fVar, "fragmentStateManager");
        if (FragmentManager.J0(2)) {
            Objects.toString(fVar.k());
        }
        g(d.b.GONE, d.a.NONE, fVar);
    }

    public final void l(f fVar) {
        G10.g(fVar, "fragmentStateManager");
        if (FragmentManager.J0(2)) {
            Objects.toString(fVar.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fVar);
    }

    public final void m(f fVar) {
        G10.g(fVar, "fragmentStateManager");
        if (FragmentManager.J0(2)) {
            Objects.toString(fVar.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.n():void");
    }

    public final d o(androidx.fragment.app.c cVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (G10.c(dVar.i(), cVar) && !dVar.l()) {
                break;
            }
        }
        return (d) next;
    }

    public final d p(androidx.fragment.app.c cVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (G10.c(dVar.i(), cVar) && !dVar.l()) {
                break;
            }
        }
        return (d) next;
    }

    public final void q() {
        FragmentManager.J0(2);
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                A();
                z(this.b);
                for (d dVar : AbstractC2455Um.O0(this.c)) {
                    if (FragmentManager.J0(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(dVar);
                    }
                    dVar.c(this.a);
                }
                for (d dVar2 : AbstractC2455Um.O0(this.b)) {
                    if (FragmentManager.J0(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(dVar2);
                    }
                    dVar2.c(this.a);
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.e) {
            FragmentManager.J0(2);
            this.e = false;
            n();
        }
    }

    public final d.a s(f fVar) {
        G10.g(fVar, "fragmentStateManager");
        androidx.fragment.app.c cVarK = fVar.k();
        G10.f(cVarK, "fragmentStateManager.fragment");
        d dVarO = o(cVarK);
        d.a aVarJ = dVarO != null ? dVarO.j() : null;
        d dVarP = p(cVarK);
        d.a aVarJ2 = dVarP != null ? dVarP.j() : null;
        int i = aVarJ == null ? -1 : e.a[aVarJ.ordinal()];
        return (i == -1 || i == 1) ? aVarJ2 : aVarJ;
    }

    public final ViewGroup t() {
        return this.a;
    }

    public final boolean w() {
        return !this.b.isEmpty();
    }

    public final void x() {
        Object objPrevious;
        synchronized (this.b) {
            try {
                A();
                List list = this.b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    d dVar = (d) objPrevious;
                    d.b.a aVar = d.b.B;
                    View view = dVar.i().l0;
                    G10.f(view, "operation.fragment.mView");
                    d.b bVarA = aVar.a(view);
                    d.b bVarH = dVar.h();
                    d.b bVar = d.b.VISIBLE;
                    if (bVarH == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) objPrevious;
                androidx.fragment.app.c cVarI = dVar2 != null ? dVar2.i() : null;
                this.e = cVarI != null ? cVarI.h0() : false;
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(C2419Ud c2419Ud) {
        G10.g(c2419Ud, "backEvent");
        if (FragmentManager.J0(2)) {
            c2419Ud.a();
        }
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList, ((d) it.next()).g());
        }
        List listM0 = AbstractC2455Um.M0(AbstractC2455Um.Q0(arrayList));
        int size = listM0.size();
        for (int i = 0; i < size; i++) {
            ((b) listM0.get(i)).e(c2419Ud, this.a);
        }
    }

    public final void z(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((d) list.get(i)).q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList, ((d) it.next()).g());
        }
        List listM0 = AbstractC2455Um.M0(AbstractC2455Um.Q0(arrayList));
        int size2 = listM0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((b) listM0.get(i2)).g(this.a);
        }
    }
}
