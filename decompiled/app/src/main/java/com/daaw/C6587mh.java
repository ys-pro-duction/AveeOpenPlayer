package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C6587mh implements InterfaceC3236ak {
    public static final AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(C6587mh.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater F = AtomicLongFieldUpdater.newUpdater(C6587mh.class, "receivers");
    public static final AtomicLongFieldUpdater G = AtomicLongFieldUpdater.newUpdater(C6587mh.class, "bufferEnd");
    public static final AtomicLongFieldUpdater H = AtomicLongFieldUpdater.newUpdater(C6587mh.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater I = AtomicReferenceFieldUpdater.newUpdater(C6587mh.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater J = AtomicReferenceFieldUpdater.newUpdater(C6587mh.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater K = AtomicReferenceFieldUpdater.newUpdater(C6587mh.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(C6587mh.class, Object.class, "_closeCause");
    public static final AtomicReferenceFieldUpdater M = AtomicReferenceFieldUpdater.newUpdater(C6587mh.class, Object.class, "closeHandler");
    public final int B;
    public final NQ C;
    public final InterfaceC3986dR D;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* JADX INFO: renamed from: com.daaw.mh$a */
    public final class a implements InterfaceC5756jk, InterfaceC4332eg1 {
        public Object B = AbstractC6866nh.p;
        public C4067dj C;

        public a() {
        }

        @Override // com.daaw.InterfaceC5756jk
        public Object a(InterfaceC1416Ks interfaceC1416Ks) {
            C6587mh c6587mh = C6587mh.this;
            C7718qk c7718qk = (C7718qk) C6587mh.J.get(c6587mh);
            while (!c6587mh.T()) {
                long andIncrement = C6587mh.F.getAndIncrement(c6587mh);
                int i = AbstractC6866nh.b;
                long j = andIncrement / ((long) i);
                int i2 = (int) (andIncrement % ((long) i));
                if (c7718qk.D != j) {
                    C7718qk c7718qkF = c6587mh.F(j, c7718qk);
                    if (c7718qkF == null) {
                        continue;
                    } else {
                        c7718qk = c7718qkF;
                    }
                }
                Object objZ0 = c6587mh.z0(c7718qk, i2, andIncrement, null);
                if (objZ0 == AbstractC6866nh.m) {
                    throw new IllegalStateException("unreachable");
                }
                if (objZ0 != AbstractC6866nh.o) {
                    if (objZ0 == AbstractC6866nh.n) {
                        return f(c7718qk, i2, andIncrement, interfaceC1416Ks);
                    }
                    c7718qk.b();
                    this.B = objZ0;
                    return AbstractC0527Cg.a(true);
                }
                if (andIncrement < c6587mh.M()) {
                    c7718qk.b();
                }
            }
            return AbstractC0527Cg.a(g());
        }

        @Override // com.daaw.InterfaceC4332eg1
        public void b(GO0 go0, int i) {
            C4067dj c4067dj = this.C;
            if (c4067dj != null) {
                c4067dj.b(go0, i);
            }
        }

        public final Object f(C7718qk c7718qk, int i, long j, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
            Boolean boolA;
            C7718qk c7718qkF;
            C6587mh c6587mh = C6587mh.this;
            C4067dj c4067djB = AbstractC4634fj.b(H10.b(interfaceC1416Ks));
            try {
                this.C = c4067djB;
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object objZ0 = c6587mh.z0(c7718qk, i, j, this);
                if (objZ0 == AbstractC6866nh.m) {
                    c6587mh.k0(this, c7718qk, i);
                } else {
                    NQ nqA = null;
                    if (objZ0 == AbstractC6866nh.o) {
                        if (j < c6587mh.M()) {
                            c7718qk.b();
                        }
                        C7718qk c7718qk2 = (C7718qk) C6587mh.J.get(c6587mh);
                        while (true) {
                            if (c6587mh.T()) {
                                h();
                                break;
                            }
                            long andIncrement = C6587mh.F.getAndIncrement(c6587mh);
                            int i2 = AbstractC6866nh.b;
                            long j2 = andIncrement / ((long) i2);
                            int i3 = (int) (andIncrement % ((long) i2));
                            if (c7718qk2.D != j2) {
                                c7718qkF = c6587mh.F(j2, c7718qk2);
                                if (c7718qkF == null) {
                                }
                            } else {
                                c7718qkF = c7718qk2;
                            }
                            Object objZ02 = c6587mh.z0(c7718qkF, i3, andIncrement, this);
                            if (objZ02 == AbstractC6866nh.m) {
                                c6587mh.k0(this, c7718qkF, i3);
                                break;
                            }
                            if (objZ02 == AbstractC6866nh.o) {
                                if (andIncrement < c6587mh.M()) {
                                    c7718qkF.b();
                                }
                                c7718qk2 = c7718qkF;
                            } else {
                                if (objZ02 == AbstractC6866nh.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c7718qkF.b();
                                this.B = objZ02;
                                this.C = null;
                                boolA = AbstractC0527Cg.a(true);
                                NQ nq = c6587mh.C;
                                if (nq != null) {
                                    nqA = AbstractC0785Eq0.a(nq, objZ02, c4067djB.getContext());
                                }
                            }
                        }
                    } else {
                        c7718qk.b();
                        this.B = objZ0;
                        this.C = null;
                        boolA = AbstractC0527Cg.a(true);
                        NQ nq2 = c6587mh.C;
                        if (nq2 != null) {
                            nqA = AbstractC0785Eq0.a(nq2, objZ0, c4067djB.getContext());
                        }
                    }
                    c4067djB.K(boolA, nqA);
                }
                Object objU = c4067djB.u();
                if (objU == I10.c()) {
                    AbstractC7497pw.c(interfaceC1416Ks);
                }
                return objU;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                c4067djB.I();
                throw th3;
            }
        }

        public final boolean g() throws Throwable {
            this.B = AbstractC6866nh.z();
            Throwable thI = C6587mh.this.I();
            if (thI == null) {
                return false;
            }
            throw RV0.a(thI);
        }

        public final void h() {
            C4067dj c4067dj = this.C;
            G10.d(c4067dj);
            this.C = null;
            this.B = AbstractC6866nh.z();
            Throwable thI = C6587mh.this.I();
            if (thI == null) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                c4067dj.x(AbstractC4512fJ0.a(Boolean.FALSE));
            } else {
                AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
                c4067dj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(thI)));
            }
        }

        public final boolean i(Object obj) {
            C4067dj c4067dj = this.C;
            G10.d(c4067dj);
            this.C = null;
            this.B = obj;
            Boolean bool = Boolean.TRUE;
            NQ nq = C6587mh.this.C;
            return AbstractC6866nh.B(c4067dj, bool, nq != null ? AbstractC0785Eq0.a(nq, obj, c4067dj.getContext()) : null);
        }

        public final void j() {
            C4067dj c4067dj = this.C;
            G10.d(c4067dj);
            this.C = null;
            this.B = AbstractC6866nh.z();
            Throwable thI = C6587mh.this.I();
            if (thI == null) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                c4067dj.x(AbstractC4512fJ0.a(Boolean.FALSE));
            } else {
                AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
                c4067dj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(thI)));
            }
        }

        @Override // com.daaw.InterfaceC5756jk
        public Object next() throws Throwable {
            Object obj = this.B;
            if (obj == AbstractC6866nh.p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.B = AbstractC6866nh.p;
            if (obj != AbstractC6866nh.z()) {
                return obj;
            }
            throw RV0.a(C6587mh.this.J());
        }
    }

    /* JADX INFO: renamed from: com.daaw.mh$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {

        /* JADX INFO: renamed from: com.daaw.mh$b$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ Object B;
            public final /* synthetic */ C6587mh C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, C6587mh c6587mh, InterfaceC5104hP0 interfaceC5104hP0) {
                super(1);
                this.B = obj;
                this.C = c6587mh;
            }

            public final void a(Throwable th) {
                if (this.B == AbstractC6866nh.z()) {
                    return;
                }
                NQ nq = this.C.C;
                throw null;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return G91.a;
            }
        }

        public b() {
            super(3);
        }

        public final NQ a(InterfaceC5104hP0 interfaceC5104hP0, Object obj, Object obj2) {
            return new a(obj2, C6587mh.this, interfaceC5104hP0);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            AbstractC6314li0.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public C6587mh(int i, NQ nq) {
        this.B = i;
        this.C = nq;
        if (i < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
        }
        this.bufferEnd = AbstractC6866nh.A(i);
        this.completedExpandBuffersAndPauseFlag = H();
        C7718qk c7718qk = new C7718qk(0L, null, this, 3);
        this.sendSegment = c7718qk;
        this.receiveSegment = c7718qk;
        if (Y()) {
            c7718qk = AbstractC6866nh.a;
            G10.e(c7718qk, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = c7718qk;
        this.D = nq != null ? new b() : null;
        this._closeCause = AbstractC6866nh.s;
    }

    public static /* synthetic */ void P(C6587mh c6587mh, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        c6587mh.O(j);
    }

    public static /* synthetic */ Object m0(C6587mh c6587mh, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        C7718qk c7718qk;
        C7718qk c7718qk2 = (C7718qk) J.get(c6587mh);
        while (!c6587mh.T()) {
            long andIncrement = F.getAndIncrement(c6587mh);
            int i = AbstractC6866nh.b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (c7718qk2.D != j) {
                C7718qk c7718qkF = c6587mh.F(j, c7718qk2);
                if (c7718qkF == null) {
                    continue;
                } else {
                    c7718qk = c7718qkF;
                }
            } else {
                c7718qk = c7718qk2;
            }
            C6587mh c6587mh2 = c6587mh;
            Object objZ0 = c6587mh2.z0(c7718qk, i2, andIncrement, null);
            if (objZ0 == AbstractC6866nh.m) {
                throw new IllegalStateException("unexpected");
            }
            if (objZ0 != AbstractC6866nh.o) {
                if (objZ0 == AbstractC6866nh.n) {
                    return c6587mh2.n0(c7718qk, i2, andIncrement, interfaceC1416Ks);
                }
                c7718qk.b();
                return objZ0;
            }
            if (andIncrement < c6587mh2.M()) {
                c7718qk.b();
            }
            c6587mh = c6587mh2;
            c7718qk2 = c7718qk;
        }
        throw RV0.a(c6587mh.J());
    }

    public static /* synthetic */ Object s0(C6587mh c6587mh, Object obj, InterfaceC1416Ks interfaceC1416Ks) throws IllegalAccessException, InvocationTargetException {
        C7718qk c7718qk;
        C7718qk c7718qk2 = (C7718qk) I.get(c6587mh);
        while (true) {
            long andIncrement = E.getAndIncrement(c6587mh);
            long j = andIncrement & 1152921504606846975L;
            boolean zW = c6587mh.W(andIncrement);
            int i = AbstractC6866nh.b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (c7718qk2.D != j2) {
                C7718qk c7718qkG = c6587mh.G(j2, c7718qk2);
                if (c7718qkG != null) {
                    c7718qk = c7718qkG;
                } else if (zW) {
                    Object objG0 = c6587mh.g0(obj, interfaceC1416Ks);
                    if (objG0 == I10.c()) {
                        return objG0;
                    }
                }
            } else {
                c7718qk = c7718qk2;
            }
            C6587mh c6587mh2 = c6587mh;
            Object obj2 = obj;
            int iB0 = c6587mh2.B0(c7718qk, i2, obj2, j, null, zW);
            if (iB0 == 0) {
                c7718qk.b();
                break;
            }
            if (iB0 == 1) {
                break;
            }
            if (iB0 != 2) {
                if (iB0 == 3) {
                    Object objT0 = c6587mh2.t0(c7718qk, i2, obj2, j, interfaceC1416Ks);
                    if (objT0 == I10.c()) {
                        return objT0;
                    }
                } else if (iB0 != 4) {
                    if (iB0 == 5) {
                        c7718qk.b();
                    }
                    c6587mh = c6587mh2;
                    c7718qk2 = c7718qk;
                    obj = obj2;
                } else {
                    if (j < c6587mh2.K()) {
                        c7718qk.b();
                    }
                    Object objG02 = c6587mh2.g0(obj2, interfaceC1416Ks);
                    if (objG02 == I10.c()) {
                        return objG02;
                    }
                }
            } else if (zW) {
                c7718qk.p();
                Object objG03 = c6587mh2.g0(obj2, interfaceC1416Ks);
                if (objG03 == I10.c()) {
                    return objG03;
                }
            }
        }
        return G91.a;
    }

    public final C7718qk A(long j) {
        C7718qk c7718qkX = x();
        if (X()) {
            long jZ = Z(c7718qkX);
            if (jZ != -1) {
                C(jZ);
            }
        }
        w(c7718qkX, j);
        return c7718qkX;
    }

    public final Object A0(C7718qk c7718qk, int i, long j, Object obj) {
        while (true) {
            Object objW = c7718qk.w(i);
            if (objW == null || objW == AbstractC6866nh.e) {
                if (j < (E.get(this) & 1152921504606846975L)) {
                    if (c7718qk.r(i, objW, AbstractC6866nh.h)) {
                        D();
                        return AbstractC6866nh.o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC6866nh.n;
                    }
                    if (c7718qk.r(i, objW, obj)) {
                        D();
                        return AbstractC6866nh.m;
                    }
                }
            } else {
                if (objW != AbstractC6866nh.d) {
                    if (objW != AbstractC6866nh.j && objW != AbstractC6866nh.h) {
                        if (objW == AbstractC6866nh.z()) {
                            D();
                            return AbstractC6866nh.o;
                        }
                        if (objW != AbstractC6866nh.g && c7718qk.r(i, objW, AbstractC6866nh.f)) {
                            boolean z = objW instanceof C4621fg1;
                            if (z) {
                                objW = ((C4621fg1) objW).a;
                            }
                            if (w0(objW, c7718qk, i)) {
                                c7718qk.A(i, AbstractC6866nh.i);
                                D();
                                return c7718qk.y(i);
                            }
                            c7718qk.A(i, AbstractC6866nh.j);
                            c7718qk.x(i, false);
                            if (z) {
                                D();
                            }
                            return AbstractC6866nh.o;
                        }
                    }
                    return AbstractC6866nh.o;
                }
                if (c7718qk.r(i, objW, AbstractC6866nh.i)) {
                    D();
                    return c7718qk.y(i);
                }
            }
        }
    }

    public final void B() {
        V();
    }

    public final int B0(C7718qk c7718qk, int i, Object obj, long j, Object obj2, boolean z) {
        c7718qk.B(i, obj);
        if (z) {
            return C0(c7718qk, i, obj, j, obj2, z);
        }
        Object objW = c7718qk.w(i);
        if (objW == null) {
            if (u(j)) {
                if (c7718qk.r(i, null, AbstractC6866nh.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c7718qk.r(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objW instanceof InterfaceC4332eg1) {
            c7718qk.s(i);
            if (v0(objW, obj)) {
                c7718qk.A(i, AbstractC6866nh.i);
                i0();
                return 0;
            }
            if (c7718qk.t(i, AbstractC6866nh.k) == AbstractC6866nh.k) {
                return 5;
            }
            c7718qk.x(i, true);
            return 5;
        }
        return C0(c7718qk, i, obj, j, obj2, z);
    }

    public final void C(long j) {
        C9520x91 c9520x91D;
        C7718qk c7718qk = (C7718qk) J.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = F;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.B) + j2, H())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                int i = AbstractC6866nh.b;
                long j3 = j2 / ((long) i);
                int i2 = (int) (j2 % ((long) i));
                if (c7718qk.D != j3) {
                    C7718qk c7718qkF = F(j3, c7718qk);
                    if (c7718qkF == null) {
                        continue;
                    } else {
                        c7718qk = c7718qkF;
                    }
                }
                C7718qk c7718qk2 = c7718qk;
                Object objZ0 = z0(c7718qk2, i2, j2, null);
                if (objZ0 != AbstractC6866nh.o) {
                    c7718qk2.b();
                    NQ nq = this.C;
                    if (nq != null && (c9520x91D = AbstractC0785Eq0.d(nq, objZ0, null, 2, null)) != null) {
                        throw c9520x91D;
                    }
                } else if (j2 < M()) {
                    c7718qk2.b();
                }
                c7718qk = c7718qk2;
            }
        }
    }

    public final int C0(C7718qk c7718qk, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objW = c7718qk.w(i);
            if (objW == null) {
                if (!u(j) || z) {
                    if (z) {
                        if (c7718qk.r(i, null, AbstractC6866nh.j)) {
                            c7718qk.x(i, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c7718qk.r(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c7718qk.r(i, null, AbstractC6866nh.d)) {
                    return 1;
                }
            } else {
                if (objW != AbstractC6866nh.e) {
                    if (objW == AbstractC6866nh.k) {
                        c7718qk.s(i);
                        return 5;
                    }
                    if (objW == AbstractC6866nh.h) {
                        c7718qk.s(i);
                        return 5;
                    }
                    if (objW == AbstractC6866nh.z()) {
                        c7718qk.s(i);
                        B();
                        return 4;
                    }
                    c7718qk.s(i);
                    if (objW instanceof C4621fg1) {
                        objW = ((C4621fg1) objW).a;
                    }
                    if (v0(objW, obj)) {
                        c7718qk.A(i, AbstractC6866nh.i);
                        i0();
                        return 0;
                    }
                    if (c7718qk.t(i, AbstractC6866nh.k) != AbstractC6866nh.k) {
                        c7718qk.x(i, true);
                    }
                    return 5;
                }
                if (c7718qk.r(i, objW, AbstractC6866nh.d)) {
                    return 1;
                }
            }
        }
    }

    public final void D() {
        if (Y()) {
            return;
        }
        C7718qk c7718qk = (C7718qk) K.get(this);
        while (true) {
            long andIncrement = G.getAndIncrement(this);
            int i = AbstractC6866nh.b;
            long j = andIncrement / ((long) i);
            if (M() <= andIncrement) {
                if (c7718qk.D < j && c7718qk.e() != null) {
                    d0(j, c7718qk);
                }
                P(this, 0L, 1, null);
                return;
            }
            if (c7718qk.D != j) {
                C7718qk c7718qkE = E(j, c7718qk, andIncrement);
                if (c7718qkE == null) {
                    continue;
                } else {
                    c7718qk = c7718qkE;
                }
            }
            if (x0(c7718qk, (int) (andIncrement % ((long) i)), andIncrement)) {
                P(this, 0L, 1, null);
                return;
            }
            P(this, 0L, 1, null);
        }
    }

    public final void D0(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = F;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
            long j3 = j;
            if (F.compareAndSet(this, j2, j3)) {
                return;
            } else {
                j = j3;
            }
        }
    }

    public final C7718qk E(long j, C7718qk c7718qk, long j2) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K;
        InterfaceC3429bR interfaceC3429bR = (InterfaceC3429bR) AbstractC6866nh.y();
        loop0: while (true) {
            objC = AbstractC3823cq.c(c7718qk, j, interfaceC3429bR);
            if (!PO0.c(objC)) {
                GO0 go0B = PO0.b(objC);
                while (true) {
                    GO0 go0 = (GO0) atomicReferenceFieldUpdater.get(this);
                    if (go0.D >= go0B.D) {
                        break loop0;
                    }
                    if (!go0B.q()) {
                        break;
                    }
                    if (AbstractC5549j0.a(atomicReferenceFieldUpdater, this, go0, go0B)) {
                        if (go0.m()) {
                            go0.k();
                        }
                    } else if (go0B.m()) {
                        go0B.k();
                    }
                }
            } else {
                break;
            }
        }
        if (PO0.c(objC)) {
            B();
            d0(j, c7718qk);
            P(this, 0L, 1, null);
            return null;
        }
        C7718qk c7718qk2 = (C7718qk) PO0.b(objC);
        long j3 = c7718qk2.D;
        if (j3 <= j) {
            return c7718qk2;
        }
        int i = AbstractC6866nh.b;
        if (G.compareAndSet(this, j2 + 1, j3 * ((long) i))) {
            O((c7718qk2.D * ((long) i)) - j2);
        } else {
            P(this, 0L, 1, null);
        }
        return null;
    }

    public final void E0(long j) {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = E;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                return;
            }
        } while (!E.compareAndSet(this, j2, AbstractC6866nh.w(j3, (int) (j2 >> 60))));
    }

    public final C7718qk F(long j, C7718qk c7718qk) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = J;
        InterfaceC3429bR interfaceC3429bR = (InterfaceC3429bR) AbstractC6866nh.y();
        loop0: while (true) {
            objC = AbstractC3823cq.c(c7718qk, j, interfaceC3429bR);
            if (!PO0.c(objC)) {
                GO0 go0B = PO0.b(objC);
                while (true) {
                    GO0 go0 = (GO0) atomicReferenceFieldUpdater.get(this);
                    if (go0.D >= go0B.D) {
                        break loop0;
                    }
                    if (!go0B.q()) {
                        break;
                    }
                    if (AbstractC5549j0.a(atomicReferenceFieldUpdater, this, go0, go0B)) {
                        if (go0.m()) {
                            go0.k();
                        }
                    } else if (go0B.m()) {
                        go0B.k();
                    }
                }
            } else {
                break;
            }
        }
        if (PO0.c(objC)) {
            B();
            if (c7718qk.D * ((long) AbstractC6866nh.b) < M()) {
                c7718qk.b();
            }
            return null;
        }
        C7718qk c7718qk2 = (C7718qk) PO0.b(objC);
        if (!Y() && j <= H() / ((long) AbstractC6866nh.b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = K;
            while (true) {
                GO0 go02 = (GO0) atomicReferenceFieldUpdater2.get(this);
                if (go02.D >= c7718qk2.D || !c7718qk2.q()) {
                    break;
                }
                if (AbstractC5549j0.a(atomicReferenceFieldUpdater2, this, go02, c7718qk2)) {
                    if (go02.m()) {
                        go02.k();
                    }
                } else if (c7718qk2.m()) {
                    c7718qk2.k();
                }
            }
        }
        long j2 = c7718qk2.D;
        if (j2 <= j) {
            return c7718qk2;
        }
        int i = AbstractC6866nh.b;
        D0(j2 * ((long) i));
        if (c7718qk2.D * ((long) i) < M()) {
            c7718qk2.b();
        }
        return null;
    }

    public final void F0(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C6587mh c6587mh = this;
        if (c6587mh.Y()) {
            return;
        }
        while (c6587mh.H() <= j) {
            c6587mh = this;
        }
        int i = AbstractC6866nh.c;
        for (int i2 = 0; i2 < i; i2++) {
            long jH = c6587mh.H();
            if (jH == (4611686018427387903L & H.get(c6587mh)) && jH == c6587mh.H()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = H;
        while (true) {
            long j2 = atomicLongFieldUpdater2.get(c6587mh);
            if (atomicLongFieldUpdater2.compareAndSet(c6587mh, j2, AbstractC6866nh.v(j2 & 4611686018427387903L, true))) {
                break;
            } else {
                c6587mh = this;
            }
        }
        while (true) {
            long jH2 = c6587mh.H();
            atomicLongFieldUpdater = H;
            long j3 = atomicLongFieldUpdater.get(c6587mh);
            long j4 = j3 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j3) != 0;
            if (jH2 == j4 && jH2 == c6587mh.H()) {
                break;
            }
            if (z) {
                c6587mh = this;
            } else {
                c6587mh = this;
                atomicLongFieldUpdater.compareAndSet(c6587mh, j3, AbstractC6866nh.v(j4, true));
            }
        }
        while (true) {
            long j5 = atomicLongFieldUpdater.get(c6587mh);
            if (atomicLongFieldUpdater.compareAndSet(c6587mh, j5, AbstractC6866nh.v(j5 & 4611686018427387903L, false))) {
                return;
            } else {
                c6587mh = this;
            }
        }
    }

    public final C7718qk G(long j, C7718qk c7718qk) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I;
        InterfaceC3429bR interfaceC3429bR = (InterfaceC3429bR) AbstractC6866nh.y();
        loop0: while (true) {
            objC = AbstractC3823cq.c(c7718qk, j, interfaceC3429bR);
            if (!PO0.c(objC)) {
                GO0 go0B = PO0.b(objC);
                while (true) {
                    GO0 go0 = (GO0) atomicReferenceFieldUpdater.get(this);
                    if (go0.D >= go0B.D) {
                        break loop0;
                    }
                    if (!go0B.q()) {
                        break;
                    }
                    if (AbstractC5549j0.a(atomicReferenceFieldUpdater, this, go0, go0B)) {
                        if (go0.m()) {
                            go0.k();
                        }
                    } else if (go0B.m()) {
                        go0B.k();
                    }
                }
            } else {
                break;
            }
        }
        if (PO0.c(objC)) {
            B();
            if (c7718qk.D * ((long) AbstractC6866nh.b) < K()) {
                c7718qk.b();
            }
            return null;
        }
        C7718qk c7718qk2 = (C7718qk) PO0.b(objC);
        long j2 = c7718qk2.D;
        if (j2 <= j) {
            return c7718qk2;
        }
        int i = AbstractC6866nh.b;
        E0(j2 * ((long) i));
        if (c7718qk2.D * ((long) i) < K()) {
            c7718qk2.b();
        }
        return null;
    }

    public final long H() {
        return G.get(this);
    }

    public final Throwable I() {
        return (Throwable) L.get(this);
    }

    public final Throwable J() {
        Throwable thI = I();
        return thI == null ? new C8006rm("Channel was closed") : thI;
    }

    public final long K() {
        return F.get(this);
    }

    public final Throwable L() {
        Throwable thI = I();
        return thI == null ? new C8564tm("Channel was closed") : thI;
    }

    public final long M() {
        return E.get(this) & 1152921504606846975L;
    }

    public final boolean N() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = J;
            C7718qk c7718qkF = (C7718qk) atomicReferenceFieldUpdater.get(this);
            long jK = K();
            if (M() <= jK) {
                return false;
            }
            int i = AbstractC6866nh.b;
            long j = jK / ((long) i);
            if (c7718qkF.D == j || (c7718qkF = F(j, c7718qkF)) != null) {
                c7718qkF.b();
                if (R(c7718qkF, (int) (jK % ((long) i)), jK)) {
                    return true;
                }
                F.compareAndSet(this, jK, jK + 1);
            } else if (((C7718qk) atomicReferenceFieldUpdater.get(this)).D < j) {
                return false;
            }
        }
    }

    public final void O(long j) {
        if ((H.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((H.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void Q() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC5549j0.a(atomicReferenceFieldUpdater, this, obj, obj == null ? AbstractC6866nh.q : AbstractC6866nh.r));
        if (obj == null) {
            return;
        }
        ((NQ) obj).invoke(I());
    }

    public final boolean R(C7718qk c7718qk, int i, long j) {
        Object objW;
        do {
            objW = c7718qk.w(i);
            if (objW != null && objW != AbstractC6866nh.e) {
                if (objW == AbstractC6866nh.d) {
                    return true;
                }
                if (objW == AbstractC6866nh.j || objW == AbstractC6866nh.z() || objW == AbstractC6866nh.i || objW == AbstractC6866nh.h) {
                    return false;
                }
                if (objW == AbstractC6866nh.g) {
                    return true;
                }
                return objW != AbstractC6866nh.f && j == K();
            }
        } while (!c7718qk.r(i, objW, AbstractC6866nh.h));
        D();
        return false;
    }

    public final boolean S(long j, boolean z) throws IllegalAccessException, InvocationTargetException {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            A(j & 1152921504606846975L);
            return (z && N()) ? false : true;
        }
        if (i == 3) {
            z(j & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i).toString());
    }

    public boolean T() {
        return U(E.get(this));
    }

    public final boolean U(long j) {
        return S(j, true);
    }

    public boolean V() {
        return W(E.get(this));
    }

    public final boolean W(long j) {
        return S(j, false);
    }

    public boolean X() {
        return false;
    }

    public final boolean Y() {
        long jH = H();
        return jH == 0 || jH == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r9 = (com.daaw.C7718qk) r9.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Z(com.daaw.C7718qk r9) {
        /*
            r8 = this;
        L0:
            int r0 = com.daaw.AbstractC6866nh.b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.D
            int r5 = com.daaw.AbstractC6866nh.b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r8.K()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1b
            return r1
        L1b:
            java.lang.Object r1 = r9.w(r0)
            if (r1 == 0) goto L2d
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.k()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.d
            if (r1 != r2) goto L3a
            return r3
        L2d:
            com.daaw.YZ0 r2 = com.daaw.AbstractC6866nh.z()
            boolean r1 = r9.r(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.p()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            com.daaw.dq r9 = r9.g()
            com.daaw.qk r9 = (com.daaw.C7718qk) r9
            if (r9 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6587mh.Z(com.daaw.qk):long");
    }

    public final void a0() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = E;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, AbstractC6866nh.w(1152921504606846975L & j, 1)));
    }

    @Override // com.daaw.QE0
    public Object b(InterfaceC1416Ks interfaceC1416Ks) {
        return m0(this, interfaceC1416Ks);
    }

    public final void b0() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = E;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, AbstractC6866nh.w(1152921504606846975L & j, 3)));
    }

    public final void c0() {
        long j;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = E;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jW = AbstractC6866nh.w(1152921504606846975L & j, 2);
            } else if (i != 1) {
                return;
            } else {
                jW = AbstractC6866nh.w(1152921504606846975L & j, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, jW));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0(long r6, com.daaw.C7718qk r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.D
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            com.daaw.dq r0 = r8.e()
            com.daaw.qk r0 = (com.daaw.C7718qk) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.h()
            if (r6 == 0) goto L22
            com.daaw.dq r6 = r8.e()
            com.daaw.qk r6 = (com.daaw.C7718qk) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = com.daaw.C6587mh.K
        L24:
            java.lang.Object r7 = r6.get(r5)
            com.daaw.GO0 r7 = (com.daaw.GO0) r7
            long r0 = r7.D
            long r2 = r8.D
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            return
        L33:
            boolean r0 = r8.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = com.daaw.AbstractC5549j0.a(r6, r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.m()
            if (r6 == 0) goto L49
            r7.k()
        L49:
            return
        L4a:
            boolean r7 = r8.m()
            if (r7 == 0) goto L24
            r8.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6587mh.d0(long, com.daaw.qk):void");
    }

    @Override // com.daaw.HP0
    public Object e(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        return s0(this, obj, interfaceC1416Ks);
    }

    @Override // com.daaw.QE0
    public Object f() {
        C7718qk c7718qkF;
        long j = F.get(this);
        long j2 = E.get(this);
        if (U(j2)) {
            return AbstractC7160ok.a.a(I());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return AbstractC7160ok.a.b();
        }
        Object obj = AbstractC6866nh.k;
        C7718qk c7718qk = (C7718qk) J.get(this);
        while (!T()) {
            long andIncrement = F.getAndIncrement(this);
            int i = AbstractC6866nh.b;
            long j3 = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (c7718qk.D != j3) {
                c7718qkF = F(j3, c7718qk);
                if (c7718qkF == null) {
                    continue;
                }
            } else {
                c7718qkF = c7718qk;
            }
            Object objZ0 = z0(c7718qkF, i2, andIncrement, obj);
            if (objZ0 == AbstractC6866nh.m) {
                InterfaceC4332eg1 interfaceC4332eg1 = obj instanceof InterfaceC4332eg1 ? (InterfaceC4332eg1) obj : null;
                if (interfaceC4332eg1 != null) {
                    k0(interfaceC4332eg1, c7718qkF, i2);
                }
                F0(andIncrement);
                c7718qkF.p();
                return AbstractC7160ok.a.b();
            }
            if (objZ0 != AbstractC6866nh.o) {
                if (objZ0 == AbstractC6866nh.n) {
                    throw new IllegalStateException("unexpected");
                }
                c7718qkF.b();
                return AbstractC7160ok.a.c(objZ0);
            }
            if (andIncrement < M()) {
                c7718qkF.b();
            }
            c7718qk = c7718qkF;
        }
        return AbstractC7160ok.a.a(I());
    }

    public final void f0(InterfaceC3788cj interfaceC3788cj) {
        AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
        interfaceC3788cj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(J())));
    }

    @Override // com.daaw.HP0
    public boolean g(Throwable th) {
        return y(th, false);
    }

    public final Object g0(Object obj, InterfaceC1416Ks interfaceC1416Ks) throws IllegalAccessException, InvocationTargetException {
        C9520x91 c9520x91D;
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        NQ nq = this.C;
        if (nq == null || (c9520x91D = AbstractC0785Eq0.d(nq, obj, null, 2, null)) == null) {
            Throwable thL = L();
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            c4067dj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(thL)));
        } else {
            AbstractC7596qI.a(c9520x91D, L());
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            c4067dj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(c9520x91D)));
        }
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU == I10.c() ? objU : G91.a;
    }

    public final void h0(Object obj, InterfaceC3788cj interfaceC3788cj) throws IllegalAccessException, InvocationTargetException {
        NQ nq = this.C;
        if (nq != null) {
            AbstractC0785Eq0.b(nq, obj, interfaceC3788cj.getContext());
        }
        Throwable thL = L();
        AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
        interfaceC3788cj.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(thL)));
    }

    @Override // com.daaw.QE0
    public InterfaceC5756jk iterator() {
        return new a();
    }

    @Override // com.daaw.QE0
    public final void j(CancellationException cancellationException) {
        v(cancellationException);
    }

    @Override // com.daaw.HP0
    public Object k(Object obj) {
        C7718qk c7718qkG;
        long j;
        C6587mh c6587mh;
        if (u0(E.get(this))) {
            return AbstractC7160ok.a.b();
        }
        Object obj2 = AbstractC6866nh.j;
        C7718qk c7718qk = (C7718qk) I.get(this);
        while (true) {
            long andIncrement = E.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean zW = W(andIncrement);
            int i = AbstractC6866nh.b;
            long j3 = j2 / ((long) i);
            int i2 = (int) (j2 % ((long) i));
            if (c7718qk.D != j3) {
                c7718qkG = G(j3, c7718qk);
                if (c7718qkG != null) {
                    c6587mh = this;
                    j = j2;
                } else if (zW) {
                    return AbstractC7160ok.a.a(L());
                }
            } else {
                c7718qkG = c7718qk;
                j = j2;
                c6587mh = this;
            }
            Object obj3 = obj;
            int iB0 = c6587mh.B0(c7718qkG, i2, obj3, j, obj2, zW);
            c7718qk = c7718qkG;
            if (iB0 == 0) {
                c7718qk.b();
                return AbstractC7160ok.a.c(G91.a);
            }
            if (iB0 == 1) {
                return AbstractC7160ok.a.c(G91.a);
            }
            if (iB0 == 2) {
                if (zW) {
                    c7718qk.p();
                    return AbstractC7160ok.a.a(L());
                }
                InterfaceC4332eg1 interfaceC4332eg1 = obj2 instanceof InterfaceC4332eg1 ? (InterfaceC4332eg1) obj2 : null;
                if (interfaceC4332eg1 != null) {
                    l0(interfaceC4332eg1, c7718qk, i2);
                }
                c7718qk.p();
                return AbstractC7160ok.a.b();
            }
            if (iB0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iB0 == 4) {
                if (j < K()) {
                    c7718qk.b();
                }
                return AbstractC7160ok.a.a(L());
            }
            if (iB0 == 5) {
                c7718qk.b();
            }
            obj = obj3;
        }
    }

    public final void k0(InterfaceC4332eg1 interfaceC4332eg1, C7718qk c7718qk, int i) {
        j0();
        interfaceC4332eg1.b(c7718qk, i);
    }

    public final void l0(InterfaceC4332eg1 interfaceC4332eg1, C7718qk c7718qk, int i) {
        interfaceC4332eg1.b(c7718qk, i + AbstractC6866nh.b);
    }

    public final Object n0(C7718qk c7718qk, int i, long j, InterfaceC1416Ks interfaceC1416Ks) {
        C7718qk c7718qk2;
        C4067dj c4067djB = AbstractC4634fj.b(H10.b(interfaceC1416Ks));
        try {
            Object objZ0 = z0(c7718qk, i, j, c4067djB);
            if (objZ0 == AbstractC6866nh.m) {
                k0(c4067djB, c7718qk, i);
            } else {
                NQ nqA = null;
                nqA = null;
                if (objZ0 == AbstractC6866nh.o) {
                    if (j < M()) {
                        c7718qk.b();
                    }
                    C7718qk c7718qk3 = (C7718qk) J.get(this);
                    while (true) {
                        if (T()) {
                            f0(c4067djB);
                            break;
                        }
                        long andIncrement = F.getAndIncrement(this);
                        int i2 = AbstractC6866nh.b;
                        long j2 = andIncrement / ((long) i2);
                        int i3 = (int) (andIncrement % ((long) i2));
                        if (c7718qk3.D != j2) {
                            C7718qk c7718qkF = F(j2, c7718qk3);
                            if (c7718qkF != null) {
                                c7718qk2 = c7718qkF;
                            }
                        } else {
                            c7718qk2 = c7718qk3;
                        }
                        objZ0 = z0(c7718qk2, i3, andIncrement, c4067djB);
                        C7718qk c7718qk4 = c7718qk2;
                        if (objZ0 == AbstractC6866nh.m) {
                            C4067dj c4067dj = AbstractC2988Zp0.a(c4067djB) ? c4067djB : null;
                            if (c4067dj != null) {
                                k0(c4067dj, c7718qk4, i3);
                            }
                        } else if (objZ0 == AbstractC6866nh.o) {
                            if (andIncrement < M()) {
                                c7718qk4.b();
                            }
                            c7718qk3 = c7718qk4;
                        } else {
                            if (objZ0 == AbstractC6866nh.n) {
                                throw new IllegalStateException("unexpected");
                            }
                            c7718qk4.b();
                            NQ nq = this.C;
                            if (nq != null) {
                                nqA = AbstractC0785Eq0.a(nq, objZ0, c4067djB.getContext());
                            }
                        }
                    }
                } else {
                    c7718qk.b();
                    NQ nq2 = this.C;
                    if (nq2 != null) {
                        nqA = AbstractC0785Eq0.a(nq2, objZ0, c4067djB.getContext());
                    }
                }
                c4067djB.K(objZ0, nqA);
            }
            Object objU = c4067djB.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU;
        } catch (Throwable th) {
            c4067djB.I();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        r13 = (com.daaw.C7718qk) r13.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0(com.daaw.C7718qk r13) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6587mh.o0(com.daaw.qk):void");
    }

    public final void p0(InterfaceC4332eg1 interfaceC4332eg1) {
        r0(interfaceC4332eg1, true);
    }

    public final void q0(InterfaceC4332eg1 interfaceC4332eg1) {
        r0(interfaceC4332eg1, false);
    }

    public final void r0(InterfaceC4332eg1 interfaceC4332eg1, boolean z) {
        if (interfaceC4332eg1 instanceof InterfaceC3788cj) {
            InterfaceC1416Ks interfaceC1416Ks = (InterfaceC1416Ks) interfaceC4332eg1;
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            interfaceC1416Ks.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(z ? J() : L())));
        } else {
            if (interfaceC4332eg1 instanceof a) {
                ((a) interfaceC4332eg1).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC4332eg1).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t0(com.daaw.C7718qk r17, int r18, java.lang.Object r19, long r20, com.daaw.InterfaceC1416Ks r22) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6587mh.t0(com.daaw.qk, int, java.lang.Object, long, com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ba, code lost:
    
        r3 = (com.daaw.C7718qk) r3.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6587mh.toString():java.lang.String");
    }

    public final boolean u(long j) {
        return j < H() || j < K() + ((long) this.B);
    }

    public final boolean u0(long j) {
        if (W(j)) {
            return false;
        }
        return !u(j & 1152921504606846975L);
    }

    public boolean v(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return y(th, true);
    }

    public final boolean v0(Object obj, Object obj2) {
        if (obj instanceof a) {
            G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC3788cj) {
            G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC3788cj interfaceC3788cj = (InterfaceC3788cj) obj;
            NQ nq = this.C;
            return AbstractC6866nh.B(interfaceC3788cj, obj2, nq != null ? AbstractC0785Eq0.a(nq, obj2, interfaceC3788cj.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final void w(C7718qk c7718qk, long j) {
        Object objB = KZ.b(null, 1, null);
        loop0: while (c7718qk != null) {
            for (int i = AbstractC6866nh.b - 1; -1 < i; i--) {
                if ((c7718qk.D * ((long) AbstractC6866nh.b)) + ((long) i) < j) {
                    break loop0;
                }
                while (true) {
                    Object objW = c7718qk.w(i);
                    if (objW != null && objW != AbstractC6866nh.e) {
                        if (!(objW instanceof C4621fg1)) {
                            if (!(objW instanceof InterfaceC4332eg1)) {
                                break;
                            }
                            if (c7718qk.r(i, objW, AbstractC6866nh.z())) {
                                objB = KZ.c(objB, objW);
                                c7718qk.x(i, true);
                                break;
                            }
                        } else {
                            if (c7718qk.r(i, objW, AbstractC6866nh.z())) {
                                objB = KZ.c(objB, ((C4621fg1) objW).a);
                                c7718qk.x(i, true);
                                break;
                            }
                        }
                    } else {
                        if (c7718qk.r(i, objW, AbstractC6866nh.z())) {
                            c7718qk.p();
                            break;
                        }
                    }
                }
            }
            c7718qk = (C7718qk) c7718qk.g();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                p0((InterfaceC4332eg1) objB);
                return;
            }
            G10.e(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                p0((InterfaceC4332eg1) arrayList.get(size));
            }
        }
    }

    public final boolean w0(Object obj, C7718qk c7718qk, int i) {
        if (obj instanceof InterfaceC3788cj) {
            G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC6866nh.C((InterfaceC3788cj) obj, G91.a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final C7718qk x() {
        Object obj = K.get(this);
        C7718qk c7718qk = (C7718qk) I.get(this);
        if (c7718qk.D > ((C7718qk) obj).D) {
            obj = c7718qk;
        }
        C7718qk c7718qk2 = (C7718qk) J.get(this);
        if (c7718qk2.D > ((C7718qk) obj).D) {
            obj = c7718qk2;
        }
        return (C7718qk) AbstractC3823cq.b((AbstractC4101dq) obj);
    }

    public final boolean x0(C7718qk c7718qk, int i, long j) {
        Object objW = c7718qk.w(i);
        if (!(objW instanceof InterfaceC4332eg1) || j < F.get(this) || !c7718qk.r(i, objW, AbstractC6866nh.g)) {
            return y0(c7718qk, i, j);
        }
        if (w0(objW, c7718qk, i)) {
            c7718qk.A(i, AbstractC6866nh.d);
            return true;
        }
        c7718qk.A(i, AbstractC6866nh.j);
        c7718qk.x(i, false);
        return false;
    }

    public boolean y(Throwable th, boolean z) {
        if (z) {
            a0();
        }
        boolean zA = AbstractC5549j0.a(L, this, AbstractC6866nh.s, th);
        if (z) {
            b0();
        } else {
            c0();
        }
        B();
        e0();
        if (zA) {
            Q();
        }
        return zA;
    }

    public final boolean y0(C7718qk c7718qk, int i, long j) {
        while (true) {
            Object objW = c7718qk.w(i);
            if (objW instanceof InterfaceC4332eg1) {
                if (j < F.get(this)) {
                    if (c7718qk.r(i, objW, new C4621fg1((InterfaceC4332eg1) objW))) {
                        return true;
                    }
                } else if (c7718qk.r(i, objW, AbstractC6866nh.g)) {
                    if (w0(objW, c7718qk, i)) {
                        c7718qk.A(i, AbstractC6866nh.d);
                        return true;
                    }
                    c7718qk.A(i, AbstractC6866nh.j);
                    c7718qk.x(i, false);
                    return false;
                }
            } else {
                if (objW == AbstractC6866nh.j) {
                    return false;
                }
                if (objW == null) {
                    if (c7718qk.r(i, objW, AbstractC6866nh.e)) {
                        return true;
                    }
                } else {
                    if (objW == AbstractC6866nh.d || objW == AbstractC6866nh.h || objW == AbstractC6866nh.i || objW == AbstractC6866nh.k || objW == AbstractC6866nh.z()) {
                        return true;
                    }
                    if (objW != AbstractC6866nh.f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objW).toString());
                    }
                }
            }
        }
    }

    public final void z(long j) throws IllegalAccessException, InvocationTargetException {
        o0(A(j));
    }

    public final Object z0(C7718qk c7718qk, int i, long j, Object obj) {
        Object objW = c7718qk.w(i);
        if (objW == null) {
            if (j >= (E.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC6866nh.n;
                }
                if (c7718qk.r(i, objW, obj)) {
                    D();
                    return AbstractC6866nh.m;
                }
            }
        } else if (objW == AbstractC6866nh.d && c7718qk.r(i, objW, AbstractC6866nh.i)) {
            D();
            return c7718qk.y(i);
        }
        return A0(c7718qk, i, j, obj);
    }

    public void e0() {
    }

    public void i0() {
    }

    public void j0() {
    }
}
