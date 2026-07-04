package com.daaw;

import android.view.Choreographer;
import com.daaw.AbstractC4512fJ0;
import com.daaw.InterfaceC4684ft;
import com.daaw.InterfaceC5203hl0;

/* JADX INFO: renamed from: com.daaw.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9224w6 implements InterfaceC5203hl0 {
    public final Choreographer B;

    /* JADX INFO: renamed from: com.daaw.w6$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C8659u6 B;
        public final /* synthetic */ Choreographer.FrameCallback C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8659u6 c8659u6, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.B = c8659u6;
            this.C = frameCallback;
        }

        public final void a(Throwable th) {
            this.B.y1(this.C);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.w6$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Choreographer.FrameCallback C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.C = frameCallback;
        }

        public final void a(Throwable th) {
            C9224w6.this.b().removeFrameCallback(this.C);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.w6$c */
    public static final class c implements Choreographer.FrameCallback {
        public final /* synthetic */ InterfaceC3788cj B;
        public final /* synthetic */ C9224w6 C;
        public final /* synthetic */ NQ D;

        public c(InterfaceC3788cj interfaceC3788cj, C9224w6 c9224w6, NQ nq) {
            this.B = interfaceC3788cj;
            this.C = c9224w6;
            this.D = nq;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objA;
            InterfaceC3788cj interfaceC3788cj = this.B;
            NQ nq = this.D;
            try {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                objA = AbstractC4512fJ0.a(nq.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
                objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
            }
            interfaceC3788cj.x(objA);
        }
    }

    public C9224w6(Choreographer choreographer) {
        G10.g(choreographer, "choreographer");
        this.B = choreographer;
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft Q0(InterfaceC4684ft.c cVar) {
        return InterfaceC5203hl0.a.c(this, cVar);
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft U(InterfaceC4684ft interfaceC4684ft) {
        return InterfaceC5203hl0.a.d(this, interfaceC4684ft);
    }

    @Override // com.daaw.InterfaceC4684ft.b, com.daaw.InterfaceC4684ft
    public InterfaceC4684ft.b a(InterfaceC4684ft.c cVar) {
        return InterfaceC5203hl0.a.b(this, cVar);
    }

    public final Choreographer b() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC4684ft
    public Object c1(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return InterfaceC5203hl0.a.a(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC4684ft.b
    public /* synthetic */ InterfaceC4684ft.c getKey() {
        return AbstractC4924gl0.a(this);
    }

    @Override // com.daaw.InterfaceC5203hl0
    public Object p0(NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        InterfaceC4684ft.b bVarA = interfaceC1416Ks.getContext().a(InterfaceC1727Ns.e);
        C8659u6 c8659u6 = bVarA instanceof C8659u6 ? (C8659u6) bVarA : null;
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        c cVar = new c(c4067dj, this, nq);
        if (c8659u6 == null || !G10.c(c8659u6.s1(), b())) {
            b().postFrameCallback(cVar);
            c4067dj.r(new b(cVar));
        } else {
            c8659u6.x1(cVar);
            c4067dj.r(new a(c8659u6, cVar));
        }
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU;
    }
}
