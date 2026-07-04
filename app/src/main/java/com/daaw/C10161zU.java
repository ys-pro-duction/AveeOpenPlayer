package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.zU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10161zU extends AU implements InterfaceC10301zy {
    public final Handler D;
    public final String E;
    public final boolean F;
    public final C10161zU G;
    private volatile C10161zU _immediate;

    /* JADX INFO: renamed from: com.daaw.zU$a */
    public static final class a implements Runnable {
        public final /* synthetic */ InterfaceC3788cj B;
        public final /* synthetic */ C10161zU C;

        public a(InterfaceC3788cj interfaceC3788cj, C10161zU c10161zU) {
            this.B = interfaceC3788cj;
            this.C = c10161zU;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.B.C(this.C, G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zU$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Runnable C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.C = runnable;
        }

        public final void a(Throwable th) {
            C10161zU.this.D.removeCallbacks(this.C);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    public C10161zU(Handler handler, String str, boolean z) {
        super(null);
        this.D = handler;
        this.E = str;
        this.F = z;
        this._immediate = z ? this : null;
        C10161zU c10161zU = this._immediate;
        if (c10161zU == null) {
            c10161zU = new C10161zU(handler, str, true);
            this._immediate = c10161zU;
        }
        this.G = c10161zU;
    }

    public static final void r1(C10161zU c10161zU, Runnable runnable) {
        c10161zU.D.removeCallbacks(runnable);
    }

    @Override // com.daaw.InterfaceC10301zy
    public void N(long j, InterfaceC3788cj interfaceC3788cj) {
        a aVar = new a(interfaceC3788cj, this);
        if (this.D.postDelayed(aVar, AbstractC8417tE0.i(j, 4611686018427387903L))) {
            interfaceC3788cj.r(new b(aVar));
        } else {
            p1(interfaceC3788cj.getContext(), aVar);
        }
    }

    @Override // com.daaw.InterfaceC10301zy
    public InterfaceC9531xC Y0(long j, final Runnable runnable, InterfaceC4684ft interfaceC4684ft) {
        if (this.D.postDelayed(runnable, AbstractC8417tE0.i(j, 4611686018427387903L))) {
            return new InterfaceC9531xC() { // from class: com.daaw.yU
                @Override // com.daaw.InterfaceC9531xC
                public final void a() {
                    C10161zU.r1(this.B, runnable);
                }
            };
        }
        p1(interfaceC4684ft, runnable);
        return C8575to0.B;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10161zU) && ((C10161zU) obj).D == this.D;
    }

    @Override // com.daaw.AbstractC5801jt
    public void g1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        if (this.D.post(runnable)) {
            return;
        }
        p1(interfaceC4684ft, runnable);
    }

    public int hashCode() {
        return System.identityHashCode(this.D);
    }

    @Override // com.daaw.AbstractC5801jt
    public boolean i1(InterfaceC4684ft interfaceC4684ft) {
        return (this.F && G10.c(Looper.myLooper(), this.D.getLooper())) ? false : true;
    }

    public final void p1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        AbstractC3053a40.c(interfaceC4684ft, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C7850rC.b().g1(interfaceC4684ft, runnable);
    }

    @Override // com.daaw.AU
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C10161zU m1() {
        return this.G;
    }

    @Override // com.daaw.AbstractC5801jt
    public String toString() {
        String strL1 = l1();
        if (strL1 != null) {
            return strL1;
        }
        String string = this.E;
        if (string == null) {
            string = this.D.toString();
        }
        if (!this.F) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ C10161zU(Handler handler, String str, int i, AbstractC2911Yw abstractC2911Yw) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public C10161zU(Handler handler, String str) {
        this(handler, str, false);
    }
}
