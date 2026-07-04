package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.u51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8656u51 implements Cloneable {
    public static final int[] h0 = {2, 1, 3, 4};
    public static final AbstractC8879ut0 i0 = new a();
    public static ThreadLocal j0 = new ThreadLocal();
    public ArrayList U;
    public ArrayList V;
    public e e0;
    public C2407Ua f0;
    public String B = getClass().getName();
    public long C = -1;
    public long D = -1;
    public TimeInterpolator E = null;
    public ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public ArrayList H = null;
    public ArrayList I = null;
    public ArrayList J = null;
    public ArrayList K = null;
    public ArrayList L = null;
    public ArrayList M = null;
    public ArrayList N = null;
    public ArrayList O = null;
    public ArrayList P = null;
    public C51 Q = new C51();
    public C51 R = new C51();
    public C9779y51 S = null;
    public int[] T = h0;
    public ViewGroup W = null;
    public boolean X = false;
    public ArrayList Y = new ArrayList();
    public int Z = 0;
    public boolean a0 = false;
    public boolean b0 = false;
    public ArrayList c0 = null;
    public ArrayList d0 = new ArrayList();
    public AbstractC8879ut0 g0 = i0;

    /* JADX INFO: renamed from: com.daaw.u51$a */
    public static class a extends AbstractC8879ut0 {
        @Override // com.daaw.AbstractC8879ut0
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: renamed from: com.daaw.u51$b */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ C2407Ua a;

        public b(C2407Ua c2407Ua) {
            this.a = c2407Ua;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            AbstractC8656u51.this.Y.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC8656u51.this.Y.add(animator);
        }
    }

    /* JADX INFO: renamed from: com.daaw.u51$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC8656u51.this.q();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.u51$d */
    public static class d {
        public View a;
        public String b;
        public B51 c;
        public InterfaceC4059dh1 d;
        public AbstractC8656u51 e;

        public d(View view, String str, AbstractC8656u51 abstractC8656u51, InterfaceC4059dh1 interfaceC4059dh1, B51 b51) {
            this.a = view;
            this.b = str;
            this.c = b51;
            this.d = interfaceC4059dh1;
            this.e = abstractC8656u51;
        }
    }

    /* JADX INFO: renamed from: com.daaw.u51$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: com.daaw.u51$f */
    public interface f {
        void a(AbstractC8656u51 abstractC8656u51);

        void b(AbstractC8656u51 abstractC8656u51);

        void c(AbstractC8656u51 abstractC8656u51);

        void d(AbstractC8656u51 abstractC8656u51);

        void e(AbstractC8656u51 abstractC8656u51);
    }

    public static boolean L(B51 b51, B51 b512, String str) {
        Object obj = b51.a.get(str);
        Object obj2 = b512.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void e(C51 c51, View view, B51 b51) {
        c51.a.put(view, b51);
        int id = view.getId();
        if (id >= 0) {
            if (c51.b.indexOfKey(id) >= 0) {
                c51.b.put(id, null);
            } else {
                c51.b.put(id, view);
            }
        }
        String strM = AbstractC2317Td1.M(view);
        if (strM != null) {
            if (c51.d.containsKey(strM)) {
                c51.d.put(strM, null);
            } else {
                c51.d.put(strM, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c51.c.i(itemIdAtPosition) < 0) {
                    AbstractC2317Td1.y0(view, true);
                    c51.c.k(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c51.c.g(itemIdAtPosition);
                if (view2 != null) {
                    AbstractC2317Td1.y0(view2, false);
                    c51.c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C2407Ua z() {
        C2407Ua c2407Ua = (C2407Ua) j0.get();
        if (c2407Ua != null) {
            return c2407Ua;
        }
        C2407Ua c2407Ua2 = new C2407Ua();
        j0.set(c2407Ua2);
        return c2407Ua2;
    }

    public long A() {
        return this.C;
    }

    public List B() {
        return this.F;
    }

    public List C() {
        return this.H;
    }

    public List D() {
        return this.I;
    }

    public List E() {
        return this.G;
    }

    public String[] G() {
        return null;
    }

    public B51 H(View view, boolean z) {
        C9779y51 c9779y51 = this.S;
        if (c9779y51 != null) {
            return c9779y51.H(view, z);
        }
        return (B51) (z ? this.Q : this.R).a.get(view);
    }

    public boolean J(B51 b51, B51 b512) {
        if (b51 != null && b512 != null) {
            String[] strArrG = G();
            if (strArrG != null) {
                for (String str : strArrG) {
                    if (L(b51, b512, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = b51.a.keySet().iterator();
                while (it.hasNext()) {
                    if (L(b51, b512, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean K(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.J;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.K;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.L;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.L.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.M != null && AbstractC2317Td1.M(view) != null && this.M.contains(AbstractC2317Td1.M(view))) {
            return false;
        }
        if ((this.F.size() == 0 && this.G.size() == 0 && (((arrayList = this.I) == null || arrayList.isEmpty()) && ((arrayList2 = this.H) == null || arrayList2.isEmpty()))) || this.F.contains(Integer.valueOf(id)) || this.G.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.H;
        if (arrayList6 != null && arrayList6.contains(AbstractC2317Td1.M(view))) {
            return true;
        }
        if (this.I != null) {
            for (int i2 = 0; i2 < this.I.size(); i2++) {
                if (((Class) this.I.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void M(C2407Ua c2407Ua, C2407Ua c2407Ua2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && K(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && K(view)) {
                B51 b51 = (B51) c2407Ua.get(view2);
                B51 b512 = (B51) c2407Ua2.get(view);
                if (b51 != null && b512 != null) {
                    this.U.add(b51);
                    this.V.add(b512);
                    c2407Ua.remove(view2);
                    c2407Ua2.remove(view);
                }
            }
        }
    }

    public final void O(C2407Ua c2407Ua, C2407Ua c2407Ua2) {
        B51 b51;
        for (int size = c2407Ua.size() - 1; size >= 0; size--) {
            View view = (View) c2407Ua.j(size);
            if (view != null && K(view) && (b51 = (B51) c2407Ua2.remove(view)) != null && K(b51.b)) {
                this.U.add((B51) c2407Ua.l(size));
                this.V.add(b51);
            }
        }
    }

    public final void P(C2407Ua c2407Ua, C2407Ua c2407Ua2, C7131oe0 c7131oe0, C7131oe0 c7131oe02) {
        View view;
        int iN = c7131oe0.n();
        for (int i = 0; i < iN; i++) {
            View view2 = (View) c7131oe0.o(i);
            if (view2 != null && K(view2) && (view = (View) c7131oe02.g(c7131oe0.j(i))) != null && K(view)) {
                B51 b51 = (B51) c2407Ua.get(view2);
                B51 b512 = (B51) c2407Ua2.get(view);
                if (b51 != null && b512 != null) {
                    this.U.add(b51);
                    this.V.add(b512);
                    c2407Ua.remove(view2);
                    c2407Ua2.remove(view);
                }
            }
        }
    }

    public final void Q(C2407Ua c2407Ua, C2407Ua c2407Ua2, C2407Ua c2407Ua3, C2407Ua c2407Ua4) {
        View view;
        int size = c2407Ua3.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) c2407Ua3.n(i);
            if (view2 != null && K(view2) && (view = (View) c2407Ua4.get(c2407Ua3.j(i))) != null && K(view)) {
                B51 b51 = (B51) c2407Ua.get(view2);
                B51 b512 = (B51) c2407Ua2.get(view);
                if (b51 != null && b512 != null) {
                    this.U.add(b51);
                    this.V.add(b512);
                    c2407Ua.remove(view2);
                    c2407Ua2.remove(view);
                }
            }
        }
    }

    public final void S(C51 c51, C51 c512) {
        C2407Ua c2407Ua = new C2407Ua(c51.a);
        C2407Ua c2407Ua2 = new C2407Ua(c512.a);
        int i = 0;
        while (true) {
            int[] iArr = this.T;
            if (i >= iArr.length) {
                d(c2407Ua, c2407Ua2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                O(c2407Ua, c2407Ua2);
            } else if (i2 == 2) {
                Q(c2407Ua, c2407Ua2, c51.d, c512.d);
            } else if (i2 == 3) {
                M(c2407Ua, c2407Ua2, c51.b, c512.b);
            } else if (i2 == 4) {
                P(c2407Ua, c2407Ua2, c51.c, c512.c);
            }
            i++;
        }
    }

    public void T(View view) {
        if (this.b0) {
            return;
        }
        C2407Ua c2407UaZ = z();
        int size = c2407UaZ.size();
        InterfaceC4059dh1 interfaceC4059dh1D = AbstractC2841Ye1.d(view);
        for (int i = size - 1; i >= 0; i--) {
            d dVar = (d) c2407UaZ.n(i);
            if (dVar.a != null && interfaceC4059dh1D.equals(dVar.d)) {
                AbstractC10066z7.b((Animator) c2407UaZ.j(i));
            }
        }
        ArrayList arrayList = this.c0;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.c0.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).b(this);
            }
        }
        this.a0 = true;
    }

    public void V(ViewGroup viewGroup) {
        d dVar;
        this.U = new ArrayList();
        this.V = new ArrayList();
        S(this.Q, this.R);
        C2407Ua c2407UaZ = z();
        int size = c2407UaZ.size();
        InterfaceC4059dh1 interfaceC4059dh1D = AbstractC2841Ye1.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) c2407UaZ.j(i);
            if (animator != null && (dVar = (d) c2407UaZ.get(animator)) != null && dVar.a != null && interfaceC4059dh1D.equals(dVar.d)) {
                B51 b51 = dVar.c;
                View view = dVar.a;
                B51 b51H = H(view, true);
                B51 b51V = v(view, true);
                if (b51H == null && b51V == null) {
                    b51V = (B51) this.R.a.get(view);
                }
                if ((b51H != null || b51V != null) && dVar.e.J(b51, b51V)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c2407UaZ.remove(animator);
                    }
                }
            }
        }
        p(viewGroup, this.Q, this.R, this.U, this.V);
        a0();
    }

    public AbstractC8656u51 W(f fVar) {
        ArrayList arrayList = this.c0;
        if (arrayList != null) {
            arrayList.remove(fVar);
            if (this.c0.size() == 0) {
                this.c0 = null;
            }
        }
        return this;
    }

    public AbstractC8656u51 X(View view) {
        this.G.remove(view);
        return this;
    }

    public void Y(View view) {
        if (this.a0) {
            if (!this.b0) {
                C2407Ua c2407UaZ = z();
                int size = c2407UaZ.size();
                InterfaceC4059dh1 interfaceC4059dh1D = AbstractC2841Ye1.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d dVar = (d) c2407UaZ.n(i);
                    if (dVar.a != null && interfaceC4059dh1D.equals(dVar.d)) {
                        AbstractC10066z7.c((Animator) c2407UaZ.j(i));
                    }
                }
                ArrayList arrayList = this.c0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.c0.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).e(this);
                    }
                }
            }
            this.a0 = false;
        }
    }

    public final void Z(Animator animator, C2407Ua c2407Ua) {
        if (animator != null) {
            animator.addListener(new b(c2407Ua));
            f(animator);
        }
    }

    public void a0() {
        h0();
        C2407Ua c2407UaZ = z();
        for (Animator animator : this.d0) {
            if (c2407UaZ.containsKey(animator)) {
                h0();
                Z(animator, c2407UaZ);
            }
        }
        this.d0.clear();
        q();
    }

    public AbstractC8656u51 b(f fVar) {
        if (this.c0 == null) {
            this.c0 = new ArrayList();
        }
        this.c0.add(fVar);
        return this;
    }

    public AbstractC8656u51 b0(long j) {
        this.D = j;
        return this;
    }

    public AbstractC8656u51 c(View view) {
        this.G.add(view);
        return this;
    }

    public void c0(e eVar) {
        this.e0 = eVar;
    }

    public final void d(C2407Ua c2407Ua, C2407Ua c2407Ua2) {
        for (int i = 0; i < c2407Ua.size(); i++) {
            B51 b51 = (B51) c2407Ua.n(i);
            if (K(b51.b)) {
                this.U.add(b51);
                this.V.add(null);
            }
        }
        for (int i2 = 0; i2 < c2407Ua2.size(); i2++) {
            B51 b512 = (B51) c2407Ua2.n(i2);
            if (K(b512.b)) {
                this.V.add(b512);
                this.U.add(null);
            }
        }
    }

    public AbstractC8656u51 d0(TimeInterpolator timeInterpolator) {
        this.E = timeInterpolator;
        return this;
    }

    public void e0(AbstractC8879ut0 abstractC8879ut0) {
        if (abstractC8879ut0 == null) {
            this.g0 = i0;
        } else {
            this.g0 = abstractC8879ut0;
        }
    }

    public void f(Animator animator) {
        if (animator == null) {
            q();
            return;
        }
        if (r() >= 0) {
            animator.setDuration(r());
        }
        if (A() >= 0) {
            animator.setStartDelay(A() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void g() {
        for (int size = this.Y.size() - 1; size >= 0; size--) {
            ((Animator) this.Y.get(size)).cancel();
        }
        ArrayList arrayList = this.c0;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.c0.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).c(this);
        }
    }

    public AbstractC8656u51 g0(long j) {
        this.C = j;
        return this;
    }

    public abstract void h(B51 b51);

    public void h0() {
        if (this.Z == 0) {
            ArrayList arrayList = this.c0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.c0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).d(this);
                }
            }
            this.b0 = false;
        }
        this.Z++;
    }

    public final void i(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.J;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.K;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.L;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.L.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    B51 b51 = new B51(view);
                    if (z) {
                        k(b51);
                    } else {
                        h(b51);
                    }
                    b51.c.add(this);
                    j(b51);
                    if (z) {
                        e(this.Q, view, b51);
                    } else {
                        e(this.R, view, b51);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.N;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.P;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (((Class) this.P.get(i2)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                i(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public String i0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.D != -1) {
            str2 = str2 + "dur(" + this.D + ") ";
        }
        if (this.C != -1) {
            str2 = str2 + "dly(" + this.C + ") ";
        }
        if (this.E != null) {
            str2 = str2 + "interp(" + this.E + ") ";
        }
        if (this.F.size() <= 0 && this.G.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.F.size() > 0) {
            for (int i = 0; i < this.F.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.F.get(i);
            }
        }
        if (this.G.size() > 0) {
            for (int i2 = 0; i2 < this.G.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.G.get(i2);
            }
        }
        return str3 + ")";
    }

    public abstract void k(B51 b51);

    public void l(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C2407Ua c2407Ua;
        m(z);
        if ((this.F.size() > 0 || this.G.size() > 0) && (((arrayList = this.H) == null || arrayList.isEmpty()) && ((arrayList2 = this.I) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.F.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.F.get(i)).intValue());
                if (viewFindViewById != null) {
                    B51 b51 = new B51(viewFindViewById);
                    if (z) {
                        k(b51);
                    } else {
                        h(b51);
                    }
                    b51.c.add(this);
                    j(b51);
                    if (z) {
                        e(this.Q, viewFindViewById, b51);
                    } else {
                        e(this.R, viewFindViewById, b51);
                    }
                }
            }
            for (int i2 = 0; i2 < this.G.size(); i2++) {
                View view = (View) this.G.get(i2);
                B51 b512 = new B51(view);
                if (z) {
                    k(b512);
                } else {
                    h(b512);
                }
                b512.c.add(this);
                j(b512);
                if (z) {
                    e(this.Q, view, b512);
                } else {
                    e(this.R, view, b512);
                }
            }
        } else {
            i(viewGroup, z);
        }
        if (z || (c2407Ua = this.f0) == null) {
            return;
        }
        int size = c2407Ua.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.Q.d.remove((String) this.f0.j(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.Q.d.put((String) this.f0.n(i4), view2);
            }
        }
    }

    public void m(boolean z) {
        if (z) {
            this.Q.a.clear();
            this.Q.b.clear();
            this.Q.c.c();
        } else {
            this.R.a.clear();
            this.R.b.clear();
            this.R.c.c();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: n */
    public AbstractC8656u51 clone() {
        try {
            AbstractC8656u51 abstractC8656u51 = (AbstractC8656u51) super.clone();
            abstractC8656u51.d0 = new ArrayList();
            abstractC8656u51.Q = new C51();
            abstractC8656u51.R = new C51();
            abstractC8656u51.U = null;
            abstractC8656u51.V = null;
            return abstractC8656u51;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, B51 b51, B51 b512) {
        return null;
    }

    public void p(ViewGroup viewGroup, C51 c51, C51 c512, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        B51 b51;
        View view2;
        Animator animator2;
        C2407Ua c2407UaZ = z();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            B51 b512 = (B51) arrayList.get(i);
            B51 b513 = (B51) arrayList2.get(i);
            if (b512 != null && !b512.c.contains(this)) {
                b512 = null;
            }
            if (b513 != null && !b513.c.contains(this)) {
                b513 = null;
            }
            if ((b512 != null || b513 != null) && (b512 == null || b513 == null || J(b512, b513))) {
                Animator animatorO = o(viewGroup, b512, b513);
                if (animatorO != null) {
                    if (b513 != null) {
                        View view3 = b513.b;
                        String[] strArrG = G();
                        if (strArrG != null && strArrG.length > 0) {
                            b51 = new B51(view3);
                            B51 b514 = (B51) c512.a.get(view3);
                            if (b514 != null) {
                                int i2 = 0;
                                while (i2 < strArrG.length) {
                                    Map map = b51.a;
                                    String[] strArr = strArrG;
                                    String str = strArr[i2];
                                    map.put(str, b514.a.get(str));
                                    i2++;
                                    strArrG = strArr;
                                }
                            }
                            int size2 = c2407UaZ.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    view2 = view3;
                                    animator2 = animatorO;
                                    break;
                                }
                                d dVar = (d) c2407UaZ.get((Animator) c2407UaZ.j(i3));
                                if (dVar.c != null && dVar.a == view3) {
                                    view2 = view3;
                                    if (dVar.b.equals(w()) && dVar.c.equals(b51)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i3++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = animatorO;
                            b51 = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = b512.b;
                        animator = animatorO;
                        b51 = null;
                    }
                    if (animator != null) {
                        c2407UaZ.put(animator, new d(view, w(), this, AbstractC2841Ye1.d(viewGroup), b51));
                        this.d0.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                Animator animator3 = (Animator) this.d0.get(sparseIntArray.keyAt(i4));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i4)) - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    public void q() {
        int i = this.Z - 1;
        this.Z = i;
        if (i == 0) {
            ArrayList arrayList = this.c0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.c0.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).a(this);
                }
            }
            for (int i3 = 0; i3 < this.Q.c.n(); i3++) {
                View view = (View) this.Q.c.o(i3);
                if (view != null) {
                    AbstractC2317Td1.y0(view, false);
                }
            }
            for (int i4 = 0; i4 < this.R.c.n(); i4++) {
                View view2 = (View) this.R.c.o(i4);
                if (view2 != null) {
                    AbstractC2317Td1.y0(view2, false);
                }
            }
            this.b0 = true;
        }
    }

    public long r() {
        return this.D;
    }

    public e t() {
        return this.e0;
    }

    public String toString() {
        return i0("");
    }

    public TimeInterpolator u() {
        return this.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (com.daaw.B51) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.B51 v(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            com.daaw.y51 r0 = r5.S
            if (r0 == 0) goto L9
            com.daaw.B51 r6 = r0.v(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.U
            goto L10
        Le:
            java.util.ArrayList r0 = r5.V
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            com.daaw.B51 r4 = (com.daaw.B51) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.V
            goto L36
        L34:
            java.util.ArrayList r6 = r5.U
        L36:
            java.lang.Object r6 = r6.get(r3)
            com.daaw.B51 r6 = (com.daaw.B51) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8656u51.v(android.view.View, boolean):com.daaw.B51");
    }

    public String w() {
        return this.B;
    }

    public AbstractC8879ut0 x() {
        return this.g0;
    }

    public AbstractC9500x51 y() {
        return null;
    }

    public void f0(AbstractC9500x51 abstractC9500x51) {
    }

    public void j(B51 b51) {
    }
}
