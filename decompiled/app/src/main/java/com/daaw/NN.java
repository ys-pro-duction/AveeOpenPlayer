package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class NN {

    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ Z00 G;
        public final /* synthetic */ InterfaceC8007rm0 H;

        /* JADX INFO: renamed from: com.daaw.NN$a$a, reason: collision with other inner class name */
        public static final class C0095a implements InterfaceC7337pN {
            public final /* synthetic */ List B;
            public final /* synthetic */ InterfaceC8007rm0 C;

            public C0095a(List list, InterfaceC8007rm0 interfaceC8007rm0) {
                this.B = list;
                this.C = interfaceC8007rm0;
            }

            @Override // com.daaw.InterfaceC7337pN
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object c(Y00 y00, InterfaceC1416Ks interfaceC1416Ks) {
                if (y00 instanceof LN) {
                    this.B.add(y00);
                } else if (y00 instanceof MN) {
                    this.B.remove(((MN) y00).a());
                }
                this.C.setValue(AbstractC0527Cg.a(!this.B.isEmpty()));
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z00 z00, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = z00;
            this.H = interfaceC8007rm0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.G, this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC7058oN interfaceC7058oNB = this.G.b();
                C0095a c0095a = new C0095a(arrayList, this.H);
                this.F = 1;
                if (interfaceC7058oNB.a(c0095a, this) == objC) {
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
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final InterfaceC6258lW0 a(Z00 z00, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(z00, "<this>");
        interfaceC5781jp.e(-1805515472);
        interfaceC5781jp.e(-492369756);
        Object objF = interfaceC5781jp.f();
        if (objF == InterfaceC5781jp.a.a()) {
            objF = AbstractC9046vU0.d(Boolean.FALSE, null, 2, null);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
        AbstractC8420tF.c(z00, new a(z00, interfaceC8007rm0, null), interfaceC5781jp, i & 14);
        interfaceC5781jp.L();
        return interfaceC8007rm0;
    }
}
