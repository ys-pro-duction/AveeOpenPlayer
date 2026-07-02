package com.daaw;

import android.view.Choreographer;
import com.daaw.AbstractC4512fJ0;
import com.daaw.InterfaceC4684ft;
import com.daaw.InterfaceC5203hl0;

/* JADX INFO: renamed from: com.daaw.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2495Uw implements InterfaceC5203hl0 {
    public static final C2495Uw B = new C2495Uw();
    public static final Choreographer C = (Choreographer) AbstractC8539th.e(C7850rC.c().m1(), new a(null));

    /* JADX INFO: renamed from: com.daaw.Uw$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(interfaceC1416Ks);
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
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Uw$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Choreographer.FrameCallback B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.B = frameCallback;
        }

        public final void a(Throwable th) {
            C2495Uw.C.removeFrameCallback(this.B);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Uw$c */
    public static final class c implements Choreographer.FrameCallback {
        public final /* synthetic */ InterfaceC3788cj B;
        public final /* synthetic */ NQ C;

        public c(InterfaceC3788cj interfaceC3788cj, NQ nq) {
            this.B = interfaceC3788cj;
            this.C = nq;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objA;
            InterfaceC3788cj interfaceC3788cj = this.B;
            C2495Uw c2495Uw = C2495Uw.B;
            NQ nq = this.C;
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
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        c cVar = new c(c4067dj, nq);
        C.postFrameCallback(cVar);
        c4067dj.r(new b(cVar));
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU;
    }
}
