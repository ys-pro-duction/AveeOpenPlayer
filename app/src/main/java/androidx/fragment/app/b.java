package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.b;
import androidx.fragment.app.d;
import androidx.fragment.app.h;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2141Rm;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC3765ce1;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC5945kQ;
import com.daaw.AbstractC6314li0;
import com.daaw.C0576Cs0;
import com.daaw.C2407Ua;
import com.daaw.C2419Ud;
import com.daaw.C5386iQ;
import com.daaw.C5470ij;
import com.daaw.C6748nF0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.LQ;
import com.daaw.NQ;
import com.daaw.ViewTreeObserverOnPreDrawListenerC1201Iq0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.fragment.app.h {

    public static final class a extends h.b {
        public final C0016b d;

        /* JADX INFO: renamed from: androidx.fragment.app.b$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0015a implements Animation.AnimationListener {
            public final /* synthetic */ h.d a;
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ View c;
            public final /* synthetic */ a d;

            public AnimationAnimationListenerC0015a(h.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.a = dVar;
                this.b = viewGroup;
                this.c = view;
                this.d = aVar;
            }

            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                G10.g(viewGroup, "$container");
                G10.g(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().f(aVar);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                G10.g(animation, "animation");
                final ViewGroup viewGroup = this.b;
                final View view = this.c;
                final a aVar = this.d;
                viewGroup.post(new Runnable() { // from class: com.daaw.Vx
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a.AnimationAnimationListenerC0015a.b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.J0(2)) {
                    Objects.toString(this.a);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                G10.g(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                G10.g(animation, "animation");
                if (FragmentManager.J0(2)) {
                    Objects.toString(this.a);
                }
            }
        }

        public a(C0016b c0016b) {
            G10.g(c0016b, "animationInfo");
            this.d = c0016b;
        }

        @Override // androidx.fragment.app.h.b
        public void c(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            h.d dVarA = this.d.a();
            View view = dVarA.i().l0;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.d.a().f(this);
            if (FragmentManager.J0(2)) {
                dVarA.toString();
            }
        }

        @Override // androidx.fragment.app.h.b
        public void d(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            if (this.d.b()) {
                this.d.a().f(this);
                return;
            }
            Context context = viewGroup.getContext();
            h.d dVarA = this.d.a();
            View view = dVarA.i().l0;
            C0016b c0016b = this.d;
            G10.f(context, "context");
            d.a aVarC = c0016b.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dVarA.h() != h.d.b.REMOVED) {
                view.startAnimation(animation);
                this.d.a().f(this);
                return;
            }
            viewGroup.startViewTransition(view);
            d.b bVar = new d.b(animation, viewGroup, view);
            bVar.setAnimationListener(new AnimationAnimationListenerC0015a(dVarA, viewGroup, view, this));
            view.startAnimation(bVar);
            if (FragmentManager.J0(2)) {
                dVarA.toString();
            }
        }

        public final C0016b h() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    public static final class C0016b extends f {
        public final boolean b;
        public boolean c;
        public d.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0016b(h.d dVar, boolean z) {
            super(dVar);
            G10.g(dVar, "operation");
            this.b = z;
        }

        public final d.a c(Context context) {
            G10.g(context, "context");
            if (this.c) {
                return this.d;
            }
            d.a aVarB = androidx.fragment.app.d.b(context, a().i(), a().h() == h.d.b.VISIBLE, this.b);
            this.d = aVarB;
            this.c = true;
            return aVarB;
        }
    }

    public static final class c extends h.b {
        public final C0016b d;
        public AnimatorSet e;

        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ ViewGroup a;
            public final /* synthetic */ View b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ h.d d;
            public final /* synthetic */ c e;

            public a(ViewGroup viewGroup, View view, boolean z, h.d dVar, c cVar) {
                this.a = viewGroup;
                this.b = view;
                this.c = z;
                this.d = dVar;
                this.e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                G10.g(animator, "anim");
                this.a.endViewTransition(this.b);
                if (this.c) {
                    h.d.b bVarH = this.d.h();
                    View view = this.b;
                    G10.f(view, "viewToAnimate");
                    bVarH.c(view, this.a);
                }
                this.e.h().a().f(this.e);
                if (FragmentManager.J0(2)) {
                    Objects.toString(this.d);
                }
            }
        }

        public c(C0016b c0016b) {
            G10.g(c0016b, "animatorInfo");
            this.d = c0016b;
        }

        @Override // androidx.fragment.app.h.b
        public boolean b() {
            return true;
        }

        @Override // androidx.fragment.app.h.b
        public void c(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
                return;
            }
            h.d dVarA = this.d.a();
            if (!dVarA.n()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.a.a(animatorSet);
            }
            if (FragmentManager.J0(2)) {
                dVarA.toString();
                dVarA.n();
            }
        }

        @Override // androidx.fragment.app.h.b
        public void d(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            h.d dVarA = this.d.a();
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.J0(2)) {
                Objects.toString(dVarA);
            }
        }

        @Override // androidx.fragment.app.h.b
        public void e(C2419Ud c2419Ud, ViewGroup viewGroup) {
            G10.g(c2419Ud, "backEvent");
            G10.g(viewGroup, "container");
            h.d dVarA = this.d.a();
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !dVarA.i().O) {
                return;
            }
            if (FragmentManager.J0(2)) {
                dVarA.toString();
            }
            long jA = d.a.a(animatorSet);
            long jA2 = (long) (c2419Ud.a() * jA);
            if (jA2 == 0) {
                jA2 = 1;
            }
            if (jA2 == jA) {
                jA2 = jA - 1;
            }
            if (FragmentManager.J0(2)) {
                animatorSet.toString();
                dVarA.toString();
            }
            e.a.b(animatorSet, jA2);
        }

        @Override // androidx.fragment.app.h.b
        public void f(ViewGroup viewGroup) {
            c cVar;
            G10.g(viewGroup, "container");
            if (this.d.b()) {
                return;
            }
            Context context = viewGroup.getContext();
            C0016b c0016b = this.d;
            G10.f(context, "context");
            d.a aVarC = c0016b.c(context);
            this.e = aVarC != null ? aVarC.b : null;
            h.d dVarA = this.d.a();
            androidx.fragment.app.c cVarI = dVarA.i();
            boolean z = dVarA.h() == h.d.b.GONE;
            View view = cVarI.l0;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(viewGroup, view, z, dVarA, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final C0016b h() {
            return this.d;
        }
    }

    public static final class d {
        public static final d a = new d();

        public final long a(AnimatorSet animatorSet) {
            G10.g(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    public static final class e {
        public static final e a = new e();

        public final void a(AnimatorSet animatorSet) {
            G10.g(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j) {
            G10.g(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    public static class f {
        public final h.d a;

        public f(h.d dVar) {
            G10.g(dVar, "operation");
            this.a = dVar;
        }

        public final h.d a() {
            return this.a;
        }

        public final boolean b() {
            View view = this.a.i().l0;
            h.d.b bVarA = view != null ? h.d.b.B.a(view) : null;
            h.d.b bVarH = this.a.h();
            if (bVarA == bVarH) {
                return true;
            }
            h.d.b bVar = h.d.b.VISIBLE;
            return (bVarA == bVar || bVarH == bVar) ? false : true;
        }
    }

    public static final class g extends h.b {
        public final List d;
        public final h.d e;
        public final h.d f;
        public final AbstractC5945kQ g;
        public final Object h;
        public final ArrayList i;
        public final ArrayList j;
        public final C2407Ua k;
        public final ArrayList l;
        public final ArrayList m;
        public final C2407Ua n;
        public final C2407Ua o;
        public final boolean p;
        public final C5470ij q;
        public Object r;

        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ ViewGroup C;
            public final /* synthetic */ Object D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.C = viewGroup;
                this.D = obj;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m1invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1invoke() {
                g.this.v().e(this.C, this.D);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.b$g$b, reason: collision with other inner class name */
        public static final class C0017b extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ ViewGroup C;
            public final /* synthetic */ Object D;
            public final /* synthetic */ C6748nF0 E;

            /* JADX INFO: renamed from: androidx.fragment.app.b$g$b$a */
            public static final class a extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ g B;
                public final /* synthetic */ ViewGroup C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, ViewGroup viewGroup) {
                    super(0);
                    this.B = gVar;
                    this.C = viewGroup;
                }

                public static final void c(g gVar, ViewGroup viewGroup) {
                    G10.g(gVar, "this$0");
                    G10.g(viewGroup, "$container");
                    Iterator it = gVar.w().iterator();
                    while (it.hasNext()) {
                        h.d dVarA = ((h) it.next()).a();
                        View viewX = dVarA.i().X();
                        if (viewX != null) {
                            dVarA.h().c(viewX, viewGroup);
                        }
                    }
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3invoke() {
                    FragmentManager.J0(2);
                    AbstractC5945kQ abstractC5945kQV = this.B.v();
                    Object objS = this.B.s();
                    G10.d(objS);
                    final g gVar = this.B;
                    final ViewGroup viewGroup = this.C;
                    abstractC5945kQV.d(objS, new Runnable() { // from class: com.daaw.dy
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.g.C0017b.a.c(gVar, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0017b(ViewGroup viewGroup, Object obj, C6748nF0 c6748nF0) {
                super(0);
                this.C = viewGroup;
                this.D = obj;
                this.E = c6748nF0;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m2invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2invoke() {
                g gVar = g.this;
                gVar.C(gVar.v().j(this.C, this.D));
                boolean z = g.this.s() != null;
                Object obj = this.D;
                ViewGroup viewGroup = this.C;
                if (z) {
                    this.E.B = new a(g.this, viewGroup);
                    if (FragmentManager.J0(2)) {
                        Objects.toString(g.this.t());
                        Objects.toString(g.this.u());
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
            }
        }

        public g(List list, h.d dVar, h.d dVar2, AbstractC5945kQ abstractC5945kQ, Object obj, ArrayList arrayList, ArrayList arrayList2, C2407Ua c2407Ua, ArrayList arrayList3, ArrayList arrayList4, C2407Ua c2407Ua2, C2407Ua c2407Ua3, boolean z) {
            G10.g(list, "transitionInfos");
            G10.g(abstractC5945kQ, "transitionImpl");
            G10.g(arrayList, "sharedElementFirstOutViews");
            G10.g(arrayList2, "sharedElementLastInViews");
            G10.g(c2407Ua, "sharedElementNameMapping");
            G10.g(arrayList3, "enteringNames");
            G10.g(arrayList4, "exitingNames");
            G10.g(c2407Ua2, "firstOutViews");
            G10.g(c2407Ua3, "lastInViews");
            this.d = list;
            this.e = dVar;
            this.f = dVar2;
            this.g = abstractC5945kQ;
            this.h = obj;
            this.i = arrayList;
            this.j = arrayList2;
            this.k = c2407Ua;
            this.l = arrayList3;
            this.m = arrayList4;
            this.n = c2407Ua2;
            this.o = c2407Ua3;
            this.p = z;
            this.q = new C5470ij();
        }

        public static final void A(h.d dVar, g gVar) {
            G10.g(dVar, "$operation");
            G10.g(gVar, "this$0");
            if (FragmentManager.J0(2)) {
                Objects.toString(dVar);
            }
            dVar.f(gVar);
        }

        public static final void p(h.d dVar, h.d dVar2, g gVar) {
            G10.g(gVar, "this$0");
            C5386iQ.a(dVar.i(), dVar2.i(), gVar.p, gVar.o, false);
        }

        public static final void q(AbstractC5945kQ abstractC5945kQ, View view, Rect rect) {
            G10.g(abstractC5945kQ, "$impl");
            G10.g(rect, "$lastInEpicenterRect");
            abstractC5945kQ.k(view, rect);
        }

        public static final void r(ArrayList arrayList) {
            G10.g(arrayList, "$transitioningViews");
            C5386iQ.d(arrayList, 4);
        }

        public static final void y(h.d dVar, g gVar) {
            G10.g(dVar, "$operation");
            G10.g(gVar, "this$0");
            if (FragmentManager.J0(2)) {
                Objects.toString(dVar);
            }
            dVar.f(gVar);
        }

        public static final void z(C6748nF0 c6748nF0) {
            G10.g(c6748nF0, "$seekCancelLambda");
            LQ lq = (LQ) c6748nF0.B;
            if (lq != null) {
                lq.invoke();
            }
        }

        public final void B(ArrayList arrayList, ViewGroup viewGroup, LQ lq) {
            C5386iQ.d(arrayList, 4);
            ArrayList arrayListQ = this.g.q(this.j);
            if (FragmentManager.J0(2)) {
                for (Object obj : this.i) {
                    G10.f(obj, "sharedElementFirstOutViews");
                    View view = (View) obj;
                    Objects.toString(view);
                    AbstractC2317Td1.M(view);
                }
                for (Object obj2 : this.j) {
                    G10.f(obj2, "sharedElementLastInViews");
                    View view2 = (View) obj2;
                    Objects.toString(view2);
                    AbstractC2317Td1.M(view2);
                }
            }
            lq.invoke();
            this.g.y(viewGroup, this.i, this.j, arrayListQ, this.k);
            C5386iQ.d(arrayList, 0);
            this.g.A(this.h, this.i, this.j);
        }

        public final void C(Object obj) {
            this.r = obj;
        }

        @Override // androidx.fragment.app.h.b
        public boolean b() {
            if (!this.g.m()) {
                return false;
            }
            List<h> list = this.d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.g.n(hVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.h;
            return obj == null || this.g.n(obj);
        }

        @Override // androidx.fragment.app.h.b
        public void c(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            this.q.a();
        }

        @Override // androidx.fragment.app.h.b
        public void d(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.d) {
                    h.d dVarA = hVar.a();
                    if (FragmentManager.J0(2)) {
                        viewGroup.toString();
                        Objects.toString(dVarA);
                    }
                    hVar.a().f(this);
                }
                return;
            }
            Object obj = this.r;
            if (obj != null) {
                AbstractC5945kQ abstractC5945kQ = this.g;
                G10.d(obj);
                abstractC5945kQ.c(obj);
                if (FragmentManager.J0(2)) {
                    Objects.toString(this.e);
                    Objects.toString(this.f);
                    return;
                }
                return;
            }
            C0576Cs0 c0576Cs0O = o(viewGroup, this.f, this.e);
            ArrayList arrayList = (ArrayList) c0576Cs0O.a();
            Object objB = c0576Cs0O.b();
            List list = this.d;
            ArrayList<h.d> arrayList2 = new ArrayList(AbstractC1703Nm.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (final h.d dVar : arrayList2) {
                this.g.w(dVar.i(), objB, this.q, new Runnable() { // from class: com.daaw.Yx
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.g.y(dVar, this);
                    }
                });
            }
            B(arrayList, viewGroup, new a(viewGroup, objB));
            if (FragmentManager.J0(2)) {
                Objects.toString(this.e);
                Objects.toString(this.f);
            }
        }

        @Override // androidx.fragment.app.h.b
        public void e(C2419Ud c2419Ud, ViewGroup viewGroup) {
            G10.g(c2419Ud, "backEvent");
            G10.g(viewGroup, "container");
            Object obj = this.r;
            if (obj != null) {
                this.g.t(obj, c2419Ud.a());
            }
        }

        @Override // androidx.fragment.app.h.b
        public void f(ViewGroup viewGroup) {
            G10.g(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    h.d dVarA = ((h) it.next()).a();
                    if (FragmentManager.J0(2)) {
                        viewGroup.toString();
                        Objects.toString(dVarA);
                    }
                }
                return;
            }
            if (x() && this.h != null && !b()) {
                Objects.toString(this.h);
                Objects.toString(this.e);
                Objects.toString(this.f);
            }
            if (b() && x()) {
                final C6748nF0 c6748nF0 = new C6748nF0();
                C0576Cs0 c0576Cs0O = o(viewGroup, this.f, this.e);
                ArrayList arrayList = (ArrayList) c0576Cs0O.a();
                Object objB = c0576Cs0O.b();
                List list = this.d;
                ArrayList<h.d> arrayList2 = new ArrayList(AbstractC1703Nm.v(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (final h.d dVar : arrayList2) {
                    this.g.x(dVar.i(), objB, this.q, new Runnable() { // from class: com.daaw.Wx
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.g.z(c6748nF0);
                        }
                    }, new Runnable() { // from class: com.daaw.Xx
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.g.A(dVar, this);
                        }
                    });
                }
                B(arrayList, viewGroup, new C0017b(viewGroup, objB, c6748nF0));
            }
        }

        public final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC3765ce1.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    G10.f(childAt, "child");
                    n(arrayList, childAt);
                }
            }
        }

        public final C0576Cs0 o(ViewGroup viewGroup, h.d dVar, final h.d dVar2) {
            final h.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.d.iterator();
            View view2 = null;
            boolean z = false;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar3 != null && !this.k.isEmpty() && this.h != null) {
                    C5386iQ.a(dVar3.i(), dVar2.i(), this.p, this.n, true);
                    ViewTreeObserverOnPreDrawListenerC1201Iq0.a(viewGroup, new Runnable() { // from class: com.daaw.Zx
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.g.p(dVar3, dVar2, this);
                        }
                    });
                    this.i.addAll(this.n.values());
                    if (!this.m.isEmpty()) {
                        Object obj = this.m.get(0);
                        G10.f(obj, "exitingNames[0]");
                        view2 = (View) this.n.get((String) obj);
                        this.g.v(this.h, view2);
                    }
                    this.j.addAll(this.o.values());
                    if (!this.l.isEmpty()) {
                        Object obj2 = this.l.get(0);
                        G10.f(obj2, "enteringNames[0]");
                        final View view3 = (View) this.o.get((String) obj2);
                        if (view3 != null) {
                            final AbstractC5945kQ abstractC5945kQ = this.g;
                            ViewTreeObserverOnPreDrawListenerC1201Iq0.a(viewGroup, new Runnable() { // from class: com.daaw.ay
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.g.q(abstractC5945kQ, view3, rect);
                                }
                            });
                            z = true;
                        }
                    }
                    this.g.z(this.h, view, this.i);
                    AbstractC5945kQ abstractC5945kQ2 = this.g;
                    Object obj3 = this.h;
                    abstractC5945kQ2.s(obj3, null, null, null, null, obj3, this.j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.d.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                h.d dVarA = hVar.a();
                Object objH = this.g.h(hVar.f());
                if (objH != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    boolean z2 = z;
                    View view4 = dVarA.i().l0;
                    Iterator it3 = it2;
                    G10.f(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.h != null && (dVarA == dVar2 || dVarA == dVar3)) {
                        if (dVarA == dVar2) {
                            arrayList2.removeAll(AbstractC2455Um.Q0(this.i));
                        } else {
                            arrayList2.removeAll(AbstractC2455Um.Q0(this.j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.g.a(objH, view);
                    } else {
                        this.g.b(objH, arrayList2);
                        this.g.s(objH, objH, arrayList2, null, null, null, null);
                        if (dVarA.h() == h.d.b.GONE) {
                            dVarA.r(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(dVarA.i().l0);
                            this.g.r(objH, dVarA.i().l0, arrayList3);
                            ViewTreeObserverOnPreDrawListenerC1201Iq0.a(viewGroup, new Runnable() { // from class: com.daaw.cy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarA.h() == h.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z2) {
                            this.g.u(objH, rect);
                        }
                        if (FragmentManager.J0(2)) {
                            objH.toString();
                            for (Object obj4 : arrayList2) {
                                G10.f(obj4, "transitioningViews");
                                Objects.toString((View) obj4);
                            }
                        }
                    } else {
                        this.g.v(objH, view2);
                        if (FragmentManager.J0(2)) {
                            objH.toString();
                            for (Object obj5 : arrayList2) {
                                G10.f(obj5, "transitioningViews");
                                Objects.toString((View) obj5);
                            }
                        }
                    }
                    if (hVar.h()) {
                        objP = this.g.p(objP, objH, null);
                    } else {
                        objP2 = this.g.p(objP2, objH, null);
                    }
                    dVar3 = dVar;
                    z = z2;
                    it2 = it3;
                } else {
                    dVar3 = dVar;
                }
            }
            Object objO = this.g.o(objP, objP2, this.h);
            if (FragmentManager.J0(2)) {
                Objects.toString(objO);
            }
            return new C0576Cs0(arrayList, objO);
        }

        public final Object s() {
            return this.r;
        }

        public final h.d t() {
            return this.e;
        }

        public final h.d u() {
            return this.f;
        }

        public final AbstractC5945kQ v() {
            return this.g;
        }

        public final List w() {
            return this.d;
        }

        public final boolean x() {
            List list = this.d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().i().O) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class h extends f {
        public final Object b;
        public final boolean c;
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(h.d dVar, boolean z, boolean z2) {
            Object objP;
            super(dVar);
            G10.g(dVar, "operation");
            h.d.b bVarH = dVar.h();
            h.d.b bVar = h.d.b.VISIBLE;
            if (bVarH == bVar) {
                androidx.fragment.app.c cVarI = dVar.i();
                objP = z ? cVarI.N() : cVarI.x();
            } else {
                androidx.fragment.app.c cVarI2 = dVar.i();
                objP = z ? cVarI2.P() : cVarI2.A();
            }
            this.b = objP;
            this.c = dVar.h() == bVar ? z ? dVar.i().q() : dVar.i().o() : true;
            this.d = z2 ? z ? dVar.i().R() : dVar.i().Q() : null;
        }

        public final AbstractC5945kQ c() {
            AbstractC5945kQ abstractC5945kQD = d(this.b);
            AbstractC5945kQ abstractC5945kQD2 = d(this.d);
            if (abstractC5945kQD == null || abstractC5945kQD2 == null || abstractC5945kQD == abstractC5945kQD2) {
                return abstractC5945kQD == null ? abstractC5945kQD2 : abstractC5945kQD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().i() + " returned Transition " + this.b + " which uses a different Transition  type than its shared element transition " + this.d).toString());
        }

        public final AbstractC5945kQ d(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC5945kQ abstractC5945kQ = C5386iQ.b;
            if (abstractC5945kQ != null && abstractC5945kQ.g(obj)) {
                return abstractC5945kQ;
            }
            AbstractC5945kQ abstractC5945kQ2 = C5386iQ.c;
            if (abstractC5945kQ2 != null && abstractC5945kQ2.g(obj)) {
                return abstractC5945kQ2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().i() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object e() {
            return this.d;
        }

        public final Object f() {
            return this.b;
        }

        public final boolean g() {
            return this.d != null;
        }

        public final boolean h() {
            return this.c;
        }
    }

    public static final class i extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Collection B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.B = collection;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            G10.g(entry, "entry");
            return Boolean.valueOf(AbstractC2455Um.W(this.B, AbstractC2317Td1.M((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewGroup viewGroup) {
        super(viewGroup);
        G10.g(viewGroup, "container");
    }

    public static final void E(b bVar, h.d dVar) {
        G10.g(bVar, "this$0");
        G10.g(dVar, "$operation");
        bVar.c(dVar);
    }

    public final void D(List list) {
        ArrayList<C0016b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList2, ((C0016b) it.next()).a().g());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            C0016b c0016b = (C0016b) it2.next();
            Context context = t().getContext();
            h.d dVarA = c0016b.a();
            G10.f(context, "context");
            d.a aVarC = c0016b.c(context);
            if (aVarC != null) {
                if (aVarC.b == null) {
                    arrayList.add(c0016b);
                } else {
                    androidx.fragment.app.c cVarI = dVarA.i();
                    if (dVarA.g().isEmpty()) {
                        if (dVarA.h() == h.d.b.GONE) {
                            dVarA.r(false);
                        }
                        dVarA.b(new c(c0016b));
                        z = true;
                    } else if (FragmentManager.J0(2)) {
                        Objects.toString(cVarI);
                    }
                }
            }
        }
        for (C0016b c0016b2 : arrayList) {
            h.d dVarA2 = c0016b2.a();
            androidx.fragment.app.c cVarI2 = dVarA2.i();
            if (zIsEmpty) {
                if (!z) {
                    dVarA2.b(new a(c0016b2));
                } else if (FragmentManager.J0(2)) {
                    Objects.toString(cVarI2);
                }
            } else if (FragmentManager.J0(2)) {
                Objects.toString(cVarI2);
            }
        }
    }

    public final void F(List list, boolean z, h.d dVar, h.d dVar2) {
        Object objB;
        C0576Cs0 c0576Cs0A;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((h) obj).b()) {
                arrayList.add(obj);
            }
        }
        ArrayList<h> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((h) obj2).c() != null) {
                arrayList2.add(obj2);
            }
        }
        AbstractC5945kQ abstractC5945kQ = null;
        for (h hVar : arrayList2) {
            AbstractC5945kQ abstractC5945kQC = hVar.c();
            if (abstractC5945kQ != null && abstractC5945kQC != abstractC5945kQ) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().i() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC5945kQ = abstractC5945kQC;
        }
        if (abstractC5945kQ == null) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C2407Ua c2407Ua = new C2407Ua();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C2407Ua c2407Ua2 = new C2407Ua();
        C2407Ua c2407Ua3 = new C2407Ua();
        ArrayList<String> arrayListT = arrayList5;
        ArrayList<String> arrayListS = arrayList6;
        loop3: while (true) {
            objB = null;
            for (h hVar2 : arrayList2) {
                if (hVar2.g() && dVar != null && dVar2 != null) {
                    objB = abstractC5945kQ.B(abstractC5945kQ.h(hVar2.e()));
                    arrayListS = dVar2.i().S();
                    G10.f(arrayListS, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList arrayListS2 = dVar.i().S();
                    G10.f(arrayListS2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList arrayListT2 = dVar.i().T();
                    G10.f(arrayListT2, "firstOut.fragment.sharedElementTargetNames");
                    int size = arrayListT2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        int iIndexOf = arrayListS.indexOf(arrayListT2.get(i2));
                        ArrayList arrayList7 = arrayListT2;
                        if (iIndexOf != -1) {
                            arrayListS.set(iIndexOf, arrayListS2.get(i2));
                        }
                        i2++;
                        arrayListT2 = arrayList7;
                    }
                    arrayListT = dVar2.i().T();
                    G10.f(arrayListT, "lastIn.fragment.sharedElementTargetNames");
                    if (z) {
                        dVar.i().y();
                        dVar2.i().B();
                        c0576Cs0A = D61.a(null, null);
                    } else {
                        dVar.i().B();
                        dVar2.i().y();
                        c0576Cs0A = D61.a(null, null);
                    }
                    AbstractC6314li0.a(c0576Cs0A.a());
                    AbstractC6314li0.a(c0576Cs0A.b());
                    int i3 = 0;
                    for (int size2 = arrayListS.size(); i3 < size2; size2 = size2) {
                        Object obj3 = arrayListS.get(i3);
                        G10.f(obj3, "exitingNames[i]");
                        Object obj4 = arrayListT.get(i3);
                        G10.f(obj4, "enteringNames[i]");
                        c2407Ua.put((String) obj3, (String) obj4);
                        i3++;
                    }
                    if (FragmentManager.J0(2)) {
                        for (String str : arrayListT) {
                        }
                        for (String str2 : arrayListS) {
                        }
                    }
                    View view = dVar.i().l0;
                    G10.f(view, "firstOut.fragment.mView");
                    G(c2407Ua2, view);
                    c2407Ua2.p(arrayListS);
                    c2407Ua.p(c2407Ua2.keySet());
                    View view2 = dVar2.i().l0;
                    G10.f(view2, "lastIn.fragment.mView");
                    G(c2407Ua3, view2);
                    c2407Ua3.p(arrayListT);
                    c2407Ua3.p(c2407Ua.values());
                    C5386iQ.c(c2407Ua, c2407Ua3);
                    Collection collectionKeySet = c2407Ua.keySet();
                    G10.f(collectionKeySet, "sharedElementNameMapping.keys");
                    H(c2407Ua2, collectionKeySet);
                    Collection collectionValues = c2407Ua.values();
                    G10.f(collectionValues, "sharedElementNameMapping.values");
                    H(c2407Ua3, collectionValues);
                    if (c2407Ua.isEmpty()) {
                        break;
                    }
                }
            }
            Objects.toString(objB);
            dVar.toString();
            dVar2.toString();
            arrayList3.clear();
            arrayList4.clear();
        }
        if (objB == null) {
            if (arrayList2.isEmpty()) {
                return;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList2, dVar, dVar2, abstractC5945kQ, objB, arrayList3, arrayList4, c2407Ua, arrayListT, arrayListS, c2407Ua2, c2407Ua3, z);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).a().b(gVar);
        }
    }

    public final void G(Map map, View view) {
        String strM = AbstractC2317Td1.M(view);
        if (strM != null) {
            map.put(strM, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    G10.f(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    public final void H(C2407Ua c2407Ua, Collection collection) {
        Set setEntrySet = c2407Ua.entrySet();
        G10.f(setEntrySet, "entries");
        AbstractC2141Rm.K(setEntrySet, new i(collection));
    }

    public final void I(List list) {
        androidx.fragment.app.c cVarI = ((h.d) AbstractC2455Um.p0(list)).i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h.d dVar = (h.d) it.next();
            dVar.i().o0.c = cVarI.o0.c;
            dVar.i().o0.d = cVarI.o0.d;
            dVar.i().o0.e = cVarI.o0.e;
            dVar.i().o0.f = cVarI.o0.f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    @Override // androidx.fragment.app.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.util.List r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "operations"
            com.daaw.G10.g(r9, r0)
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.fragment.app.h$d r4 = (androidx.fragment.app.h.d) r4
            androidx.fragment.app.h$d$b$a r5 = androidx.fragment.app.h.d.b.B
            androidx.fragment.app.c r6 = r4.i()
            android.view.View r6 = r6.l0
            com.daaw.G10.f(r6, r3)
            androidx.fragment.app.h$d$b r5 = r5.a(r6)
            androidx.fragment.app.h$d$b r6 = androidx.fragment.app.h.d.b.VISIBLE
            if (r5 != r6) goto Lc
            androidx.fragment.app.h$d$b r4 = r4.h()
            if (r4 == r6) goto Lc
            goto L37
        L36:
            r1 = r2
        L37:
            androidx.fragment.app.h$d r1 = (androidx.fragment.app.h.d) r1
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L41:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r0.previous()
            r5 = r4
            androidx.fragment.app.h$d r5 = (androidx.fragment.app.h.d) r5
            androidx.fragment.app.h$d$b$a r6 = androidx.fragment.app.h.d.b.B
            androidx.fragment.app.c r7 = r5.i()
            android.view.View r7 = r7.l0
            com.daaw.G10.f(r7, r3)
            androidx.fragment.app.h$d$b r6 = r6.a(r7)
            androidx.fragment.app.h$d$b r7 = androidx.fragment.app.h.d.b.VISIBLE
            if (r6 == r7) goto L41
            androidx.fragment.app.h$d$b r5 = r5.h()
            if (r5 != r7) goto L41
            r2 = r4
        L68:
            androidx.fragment.app.h$d r2 = (androidx.fragment.app.h.d) r2
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.J0(r0)
            if (r0 == 0) goto L77
            j$.util.Objects.toString(r1)
            j$.util.Objects.toString(r2)
        L77:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.I(r9)
            java.util.Iterator r9 = r9.iterator()
        L88:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lb8
            java.lang.Object r4 = r9.next()
            androidx.fragment.app.h$d r4 = (androidx.fragment.app.h.d) r4
            androidx.fragment.app.b$b r5 = new androidx.fragment.app.b$b
            r5.<init>(r4, r10)
            r0.add(r5)
            androidx.fragment.app.b$h r5 = new androidx.fragment.app.b$h
            r6 = 0
            r7 = 1
            if (r10 == 0) goto La6
            if (r4 != r1) goto La9
        La4:
            r6 = 1
            goto La9
        La6:
            if (r4 != r2) goto La9
            goto La4
        La9:
            r5.<init>(r4, r10, r6)
            r3.add(r5)
            com.daaw.Ux r5 = new com.daaw.Ux
            r5.<init>()
            r4.a(r5)
            goto L88
        Lb8:
            r8.F(r3, r10, r1, r2)
            r8.D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.d(java.util.List, boolean):void");
    }
}
