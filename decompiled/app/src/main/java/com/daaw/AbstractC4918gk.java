package com.daaw;

import com.daaw.InterfaceC1727Ns;

/* JADX INFO: renamed from: com.daaw.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4918gk extends AbstractC4350ek {
    public final InterfaceC7058oN E;

    /* JADX INFO: renamed from: com.daaw.gk$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = AbstractC4918gk.this.new a(interfaceC1416Ks);
            aVar.G = obj;
            return aVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC7337pN interfaceC7337pN = (InterfaceC7337pN) this.G;
                AbstractC4918gk abstractC4918gk = AbstractC4918gk.this;
                this.F = 1;
                if (abstractC4918gk.s(interfaceC7337pN, this) == objC) {
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
        public final Object invoke(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7337pN, interfaceC1416Ks)).q(G91.a);
        }
    }

    public AbstractC4918gk(InterfaceC7058oN interfaceC7058oN, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        super(interfaceC4684ft, i, enumC5182hh);
        this.E = interfaceC7058oN;
    }

    public static /* synthetic */ Object p(AbstractC4918gk abstractC4918gk, InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        if (abstractC4918gk.C == -3) {
            InterfaceC4684ft context = interfaceC1416Ks.getContext();
            InterfaceC4684ft interfaceC4684ftD = AbstractC4963gt.d(context, abstractC4918gk.B);
            if (G10.c(interfaceC4684ftD, context)) {
                Object objS = abstractC4918gk.s(interfaceC7337pN, interfaceC1416Ks);
                return objS == I10.c() ? objS : G91.a;
            }
            InterfaceC1727Ns.b bVar = InterfaceC1727Ns.e;
            if (G10.c(interfaceC4684ftD.a(bVar), context.a(bVar))) {
                Object objR = abstractC4918gk.r(interfaceC7337pN, interfaceC4684ftD, interfaceC1416Ks);
                return objR == I10.c() ? objR : G91.a;
            }
        }
        Object objA = super.a(interfaceC7337pN, interfaceC1416Ks);
        return objA == I10.c() ? objA : G91.a;
    }

    public static /* synthetic */ Object q(AbstractC4918gk abstractC4918gk, InterfaceC1237Iz0 interfaceC1237Iz0, InterfaceC1416Ks interfaceC1416Ks) {
        Object objS = abstractC4918gk.s(new JP0(interfaceC1237Iz0), interfaceC1416Ks);
        return objS == I10.c() ? objS : G91.a;
    }

    @Override // com.daaw.AbstractC4350ek, com.daaw.InterfaceC7058oN
    public Object a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        return p(this, interfaceC7337pN, interfaceC1416Ks);
    }

    @Override // com.daaw.AbstractC4350ek
    public Object g(InterfaceC1237Iz0 interfaceC1237Iz0, InterfaceC1416Ks interfaceC1416Ks) {
        return q(this, interfaceC1237Iz0, interfaceC1416Ks);
    }

    public final Object r(InterfaceC7337pN interfaceC7337pN, InterfaceC4684ft interfaceC4684ft, InterfaceC1416Ks interfaceC1416Ks) {
        Object objC = AbstractC4639fk.c(interfaceC4684ft, AbstractC4639fk.d(interfaceC7337pN, interfaceC1416Ks.getContext()), null, new a(null), interfaceC1416Ks, 4, null);
        return objC == I10.c() ? objC : G91.a;
    }

    public abstract Object s(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks);

    @Override // com.daaw.AbstractC4350ek
    public String toString() {
        return this.E + " -> " + super.toString();
    }
}
