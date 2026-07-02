package com.daaw;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g;
import com.daaw.C3267aq0;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.aq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3267aq0 {
    public final Runnable a;
    public final InterfaceC8589tr b;
    public final C1863Pa c;
    public AbstractC2884Yp0 d;
    public OnBackInvokedCallback e;
    public OnBackInvokedDispatcher f;
    public boolean g;
    public boolean h;

    /* JADX INFO: renamed from: com.daaw.aq0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public a() {
            super(1);
        }

        public final void a(C2419Ud c2419Ud) {
            G10.g(c2419Ud, "backEvent");
            C3267aq0.this.m(c2419Ud);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2419Ud) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public b() {
            super(1);
        }

        public final void a(C2419Ud c2419Ud) {
            G10.g(c2419Ud, "backEvent");
            C3267aq0.this.l(c2419Ud);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2419Ud) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$c */
    public static final class c extends AbstractC4192e90 implements LQ {
        public c() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m40invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m40invoke() {
            C3267aq0.this.k();
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$d */
    public static final class d extends AbstractC4192e90 implements LQ {
        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m41invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m41invoke() {
            C3267aq0.this.j();
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$e */
    public static final class e extends AbstractC4192e90 implements LQ {
        public e() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m42invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m42invoke() {
            C3267aq0.this.k();
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$f */
    public static final class f {
        public static final f a = new f();

        public static final void c(LQ lq) {
            G10.g(lq, "$onBackInvoked");
            lq.invoke();
        }

        public final OnBackInvokedCallback b(final LQ lq) {
            G10.g(lq, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: com.daaw.bq0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    C3267aq0.f.c(lq);
                }
            };
        }

        public final void d(Object obj, int i, Object obj2) {
            G10.g(obj, "dispatcher");
            G10.g(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            G10.g(obj, "dispatcher");
            G10.g(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$g */
    public static final class g {
        public static final g a = new g();

        /* JADX INFO: renamed from: com.daaw.aq0$g$a */
        public static final class a implements OnBackAnimationCallback {
            public final /* synthetic */ NQ a;
            public final /* synthetic */ NQ b;
            public final /* synthetic */ LQ c;
            public final /* synthetic */ LQ d;

            public a(NQ nq, NQ nq2, LQ lq, LQ lq2) {
                this.a = nq;
                this.b = nq2;
                this.c = lq;
                this.d = lq2;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                this.d.invoke();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.c.invoke();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                G10.g(backEvent, "backEvent");
                this.b.invoke(new C2419Ud(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                G10.g(backEvent, "backEvent");
                this.a.invoke(new C2419Ud(backEvent));
            }
        }

        public final OnBackInvokedCallback a(NQ nq, NQ nq2, LQ lq, LQ lq2) {
            G10.g(nq, "onBackStarted");
            G10.g(nq2, "onBackProgressed");
            G10.g(lq, "onBackInvoked");
            G10.g(lq2, "onBackCancelled");
            return new a(nq, nq2, lq, lq2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$h */
    public final class h implements androidx.lifecycle.j, InterfaceC3510bj {
        public final androidx.lifecycle.g B;
        public final AbstractC2884Yp0 C;
        public InterfaceC3510bj D;
        public final /* synthetic */ C3267aq0 E;

        public h(C3267aq0 c3267aq0, androidx.lifecycle.g gVar, AbstractC2884Yp0 abstractC2884Yp0) {
            G10.g(gVar, "lifecycle");
            G10.g(abstractC2884Yp0, "onBackPressedCallback");
            this.E = c3267aq0;
            this.B = gVar;
            this.C = abstractC2884Yp0;
            gVar.a(this);
        }

        @Override // androidx.lifecycle.j
        public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
            G10.g(interfaceC1764Ob0, "source");
            G10.g(aVar, "event");
            if (aVar == g.a.ON_START) {
                this.D = this.E.i(this.C);
                return;
            }
            if (aVar != g.a.ON_STOP) {
                if (aVar == g.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC3510bj interfaceC3510bj = this.D;
                if (interfaceC3510bj != null) {
                    interfaceC3510bj.cancel();
                }
            }
        }

        @Override // com.daaw.InterfaceC3510bj
        public void cancel() {
            this.B.d(this);
            this.C.i(this);
            InterfaceC3510bj interfaceC3510bj = this.D;
            if (interfaceC3510bj != null) {
                interfaceC3510bj.cancel();
            }
            this.D = null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$i */
    public final class i implements InterfaceC3510bj {
        public final AbstractC2884Yp0 B;
        public final /* synthetic */ C3267aq0 C;

        public i(C3267aq0 c3267aq0, AbstractC2884Yp0 abstractC2884Yp0) {
            G10.g(abstractC2884Yp0, "onBackPressedCallback");
            this.C = c3267aq0;
            this.B = abstractC2884Yp0;
        }

        @Override // com.daaw.InterfaceC3510bj
        public void cancel() {
            this.C.c.remove(this.B);
            if (G10.c(this.C.d, this.B)) {
                this.B.c();
                this.C.d = null;
            }
            this.B.i(this);
            LQ lqB = this.B.b();
            if (lqB != null) {
                lqB.invoke();
            }
            this.B.k(null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$j */
    public /* synthetic */ class j extends AbstractC9591xR implements LQ {
        public j(Object obj) {
            super(0, obj, C3267aq0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            o();
            return G91.a;
        }

        public final void o() {
            ((C3267aq0) this.receiver).p();
        }
    }

    /* JADX INFO: renamed from: com.daaw.aq0$k */
    public /* synthetic */ class k extends AbstractC9591xR implements LQ {
        public k(Object obj) {
            super(0, obj, C3267aq0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            o();
            return G91.a;
        }

        public final void o() {
            ((C3267aq0) this.receiver).p();
        }
    }

    public C3267aq0(Runnable runnable, InterfaceC8589tr interfaceC8589tr) {
        this.a = runnable;
        this.b = interfaceC8589tr;
        this.c = new C1863Pa();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.e = i2 >= 34 ? g.a.a(new a(), new b(), new c(), new d()) : f.a.b(new e());
        }
    }

    public final void h(InterfaceC1764Ob0 interfaceC1764Ob0, AbstractC2884Yp0 abstractC2884Yp0) {
        G10.g(interfaceC1764Ob0, "owner");
        G10.g(abstractC2884Yp0, "onBackPressedCallback");
        androidx.lifecycle.g gVarW = interfaceC1764Ob0.w();
        if (gVarW.b() == g.b.DESTROYED) {
            return;
        }
        abstractC2884Yp0.a(new h(this, gVarW, abstractC2884Yp0));
        p();
        abstractC2884Yp0.k(new j(this));
    }

    public final InterfaceC3510bj i(AbstractC2884Yp0 abstractC2884Yp0) {
        G10.g(abstractC2884Yp0, "onBackPressedCallback");
        this.c.add(abstractC2884Yp0);
        i iVar = new i(this, abstractC2884Yp0);
        abstractC2884Yp0.a(iVar);
        p();
        abstractC2884Yp0.k(new k(this));
        return iVar;
    }

    public final void j() {
        Object objPrevious;
        AbstractC2884Yp0 abstractC2884Yp0 = this.d;
        if (abstractC2884Yp0 == null) {
            C1863Pa c1863Pa = this.c;
            ListIterator<E> listIterator = c1863Pa.listIterator(c1863Pa.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC2884Yp0) objPrevious).g()) {
                        break;
                    }
                }
            }
            abstractC2884Yp0 = (AbstractC2884Yp0) objPrevious;
        }
        this.d = null;
        if (abstractC2884Yp0 != null) {
            abstractC2884Yp0.c();
        }
    }

    public final void k() {
        Object objPrevious;
        AbstractC2884Yp0 abstractC2884Yp0 = this.d;
        if (abstractC2884Yp0 == null) {
            C1863Pa c1863Pa = this.c;
            ListIterator<E> listIterator = c1863Pa.listIterator(c1863Pa.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC2884Yp0) objPrevious).g()) {
                        break;
                    }
                }
            }
            abstractC2884Yp0 = (AbstractC2884Yp0) objPrevious;
        }
        this.d = null;
        if (abstractC2884Yp0 != null) {
            abstractC2884Yp0.d();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void l(C2419Ud c2419Ud) {
        Object objPrevious;
        AbstractC2884Yp0 abstractC2884Yp0 = this.d;
        if (abstractC2884Yp0 == null) {
            C1863Pa c1863Pa = this.c;
            ListIterator<E> listIterator = c1863Pa.listIterator(c1863Pa.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC2884Yp0) objPrevious).g()) {
                        break;
                    }
                }
            }
            abstractC2884Yp0 = (AbstractC2884Yp0) objPrevious;
        }
        if (abstractC2884Yp0 != null) {
            abstractC2884Yp0.e(c2419Ud);
        }
    }

    public final void m(C2419Ud c2419Ud) {
        Object objPrevious;
        C1863Pa c1863Pa = this.c;
        ListIterator<E> listIterator = c1863Pa.listIterator(c1863Pa.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((AbstractC2884Yp0) objPrevious).g()) {
                    break;
                }
            }
        }
        AbstractC2884Yp0 abstractC2884Yp0 = (AbstractC2884Yp0) objPrevious;
        if (this.d != null) {
            j();
        }
        this.d = abstractC2884Yp0;
        if (abstractC2884Yp0 != null) {
            abstractC2884Yp0.f(c2419Ud);
        }
    }

    public final void n(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        G10.g(onBackInvokedDispatcher, "invoker");
        this.f = onBackInvokedDispatcher;
        o(this.h);
    }

    public final void o(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.g) {
            f.a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.g = true;
        } else {
            if (z || !this.g) {
                return;
            }
            f.a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.g = false;
        }
    }

    public final void p() {
        boolean z = this.h;
        C1863Pa c1863Pa = this.c;
        boolean z2 = false;
        if (!AbstractC2988Zp0.a(c1863Pa) || !c1863Pa.isEmpty()) {
            Iterator<E> it = c1863Pa.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC2884Yp0) it.next()).g()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.h = z2;
        if (z2 != z) {
            InterfaceC8589tr interfaceC8589tr = this.b;
            if (interfaceC8589tr != null) {
                interfaceC8589tr.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z2);
            }
        }
    }

    public C3267aq0(Runnable runnable) {
        this(runnable, null);
    }
}
