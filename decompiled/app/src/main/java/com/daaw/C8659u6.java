package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8659u6 extends AbstractC5801jt {
    public static final c N = new c(null);
    public static final int O = 8;
    public static final O90 P = AbstractC3192ab0.a(a.B);
    public static final ThreadLocal Q = new b();
    public final Choreographer D;
    public final Handler E;
    public final Object F;
    public final C1863Pa G;
    public List H;
    public List I;
    public boolean J;
    public boolean K;
    public final d L;
    public final InterfaceC5203hl0 M;

    /* JADX INFO: renamed from: com.daaw.u6$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        /* JADX INFO: renamed from: com.daaw.u6$a$a, reason: collision with other inner class name */
        public static final class C0237a extends SZ0 implements InterfaceC3429bR {
            public int F;

            public C0237a(InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new C0237a(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                I10.c();
                if (this.F != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
                return Choreographer.getInstance();
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((C0237a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4684ft invoke() {
            AbstractC2911Yw abstractC2911Yw = null;
            Choreographer choreographer = AbstractC8945v6.b() ? Choreographer.getInstance() : (Choreographer) AbstractC8539th.e(C7850rC.c(), new C0237a(null));
            G10.f(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler handlerA = AbstractC9603xU.a(Looper.getMainLooper());
            G10.f(handlerA, "createAsync(Looper.getMainLooper())");
            C8659u6 c8659u6 = new C8659u6(choreographer, handlerA, abstractC2911Yw);
            return c8659u6.U(c8659u6.t1());
        }
    }

    /* JADX INFO: renamed from: com.daaw.u6$b */
    public static final class b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC4684ft initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            G10.f(choreographer, "getInstance()");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            Handler handlerA = AbstractC9603xU.a(looperMyLooper);
            G10.f(handlerA, "createAsync(\n           …d\")\n                    )");
            C8659u6 c8659u6 = new C8659u6(choreographer, handlerA, null);
            return c8659u6.U(c8659u6.t1());
        }
    }

    /* JADX INFO: renamed from: com.daaw.u6$c */
    public static final class c {
        public /* synthetic */ c(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC4684ft a() {
            if (AbstractC8945v6.b()) {
                return b();
            }
            InterfaceC4684ft interfaceC4684ft = (InterfaceC4684ft) C8659u6.Q.get();
            if (interfaceC4684ft != null) {
                return interfaceC4684ft;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final InterfaceC4684ft b() {
            return (InterfaceC4684ft) C8659u6.P.getValue();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.u6$d */
    public static final class d implements Choreographer.FrameCallback, Runnable {
        public d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            C8659u6.this.E.removeCallbacks(this);
            C8659u6.this.w1();
            C8659u6.this.v1(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            C8659u6.this.w1();
            Object obj = C8659u6.this.F;
            C8659u6 c8659u6 = C8659u6.this;
            synchronized (obj) {
                try {
                    if (c8659u6.H.isEmpty()) {
                        c8659u6.s1().removeFrameCallback(this);
                        c8659u6.K = false;
                    }
                    G91 g91 = G91.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ C8659u6(Choreographer choreographer, Handler handler, AbstractC2911Yw abstractC2911Yw) {
        this(choreographer, handler);
    }

    @Override // com.daaw.AbstractC5801jt
    public void g1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        G10.g(interfaceC4684ft, "context");
        G10.g(runnable, "block");
        synchronized (this.F) {
            try {
                this.G.addLast(runnable);
                if (!this.J) {
                    this.J = true;
                    this.E.post(this.L);
                    if (!this.K) {
                        this.K = true;
                        this.D.postFrameCallback(this.L);
                    }
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Choreographer s1() {
        return this.D;
    }

    public final InterfaceC5203hl0 t1() {
        return this.M;
    }

    public final Runnable u1() {
        Runnable runnable;
        synchronized (this.F) {
            runnable = (Runnable) this.G.L();
        }
        return runnable;
    }

    public final void v1(long j) {
        synchronized (this.F) {
            if (this.K) {
                this.K = false;
                List list = this.H;
                this.H = this.I;
                this.I = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    public final void w1() {
        boolean z;
        do {
            Runnable runnableU1 = u1();
            while (runnableU1 != null) {
                runnableU1.run();
                runnableU1 = u1();
            }
            synchronized (this.F) {
                if (this.G.isEmpty()) {
                    z = false;
                    this.J = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public final void x1(Choreographer.FrameCallback frameCallback) {
        G10.g(frameCallback, "callback");
        synchronized (this.F) {
            try {
                this.H.add(frameCallback);
                if (!this.K) {
                    this.K = true;
                    this.D.postFrameCallback(this.L);
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y1(Choreographer.FrameCallback frameCallback) {
        G10.g(frameCallback, "callback");
        synchronized (this.F) {
            this.H.remove(frameCallback);
        }
    }

    public C8659u6(Choreographer choreographer, Handler handler) {
        this.D = choreographer;
        this.E = handler;
        this.F = new Object();
        this.G = new C1863Pa();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.L = new d();
        this.M = new C9224w6(choreographer);
    }
}
