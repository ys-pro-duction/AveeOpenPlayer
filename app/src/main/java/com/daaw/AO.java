package com.daaw;

import com.daaw.InterfaceC4193e91;
import com.daaw.InterfaceC6089kt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AO {
    public static final a c = new a(null);
    public static final DO d = new DO();
    public static final InterfaceC6089kt e = new c(InterfaceC6089kt.f);
    public final C0611Db a;
    public InterfaceC7484pt b;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ C8788ub G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C8788ub c8788ub, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = c8788ub;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new b(this.G, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                C8788ub c8788ub = this.G;
                this.F = 1;
                if (c8788ub.o(this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public AO(C0611Db c0611Db, InterfaceC4684ft interfaceC4684ft) {
        G10.g(c0611Db, "asyncTypefaceCache");
        G10.g(interfaceC4684ft, "injectedContext");
        this.a = c0611Db;
        this.b = AbstractC7763qt.a(e.U(interfaceC4684ft).U(AbstractC10182zZ0.a((U30) interfaceC4684ft.a(U30.k))));
    }

    public InterfaceC4193e91 a(C3636c91 c3636c91, InterfaceC2592Vu0 interfaceC2592Vu0, NQ nq, NQ nq2) {
        G10.g(c3636c91, "typefaceRequest");
        G10.g(interfaceC2592Vu0, "platformFontLoader");
        G10.g(nq, "onAsyncCompletion");
        G10.g(nq2, "createDefaultTypeface");
        if (!(c3636c91.c() instanceof C10137zO)) {
            return null;
        }
        C0576Cs0 c0576Cs0B = BO.b(d.a(((C10137zO) c3636c91.c()).s(), c3636c91.f(), c3636c91.d()), c3636c91, this.a, interfaceC2592Vu0, nq2);
        List list = (List) c0576Cs0B.a();
        Object objB = c0576Cs0B.b();
        if (list == null) {
            return new InterfaceC4193e91.b(objB, false, 2, null);
        }
        C8788ub c8788ub = new C8788ub(list, objB, c3636c91, this.a, nq, interfaceC2592Vu0);
        AbstractC9104vh.d(this.b, null, EnumC8599tt.UNDISPATCHED, new b(c8788ub, null), 1, null);
        return new InterfaceC4193e91.a(c8788ub);
    }

    public /* synthetic */ AO(C0611Db c0611Db, InterfaceC4684ft interfaceC4684ft, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? new C0611Db() : c0611Db, (i & 2) != 0 ? C5905kG.B : interfaceC4684ft);
    }

    public static final class c extends AbstractC9751y implements InterfaceC6089kt {
        public c(InterfaceC6089kt.a aVar) {
            super(aVar);
        }

        @Override // com.daaw.InterfaceC6089kt
        public void f1(InterfaceC4684ft interfaceC4684ft, Throwable th) {
        }
    }
}
