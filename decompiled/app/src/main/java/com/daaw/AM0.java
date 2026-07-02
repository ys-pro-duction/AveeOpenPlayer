package com.daaw;

import com.daaw.InterfaceC4684ft;

/* JADX INFO: loaded from: classes4.dex */
public final class AM0 extends AbstractC1623Ms implements InterfaceC7337pN, InterfaceC8320st {
    public final InterfaceC7337pN E;
    public final InterfaceC4684ft F;
    public final int G;
    public InterfaceC4684ft H;
    public InterfaceC1416Ks I;

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        public final Integer a(int i, InterfaceC4684ft.b bVar) {
            return Integer.valueOf(i + 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (InterfaceC4684ft.b) obj2);
        }
    }

    public AM0(InterfaceC7337pN interfaceC7337pN, InterfaceC4684ft interfaceC4684ft) {
        super(C5777jo0.B, C5905kG.B);
        this.E = interfaceC7337pN;
        this.F = interfaceC4684ft;
        this.G = ((Number) interfaceC4684ft.c1(0, a.B)).intValue();
    }

    @Override // com.daaw.InterfaceC7337pN
    public Object c(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        try {
            Object objW = w(interfaceC1416Ks, obj);
            if (objW == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objW == I10.c() ? objW : G91.a;
        } catch (Throwable th) {
            this.H = new C6181lD(th, interfaceC1416Ks.getContext());
            throw th;
        }
    }

    @Override // com.daaw.AbstractC1623Ms, com.daaw.InterfaceC1416Ks
    public InterfaceC4684ft getContext() {
        InterfaceC4684ft interfaceC4684ft = this.H;
        return interfaceC4684ft == null ? C5905kG.B : interfaceC4684ft;
    }

    @Override // com.daaw.AbstractC7409pe, com.daaw.InterfaceC8320st
    public InterfaceC8320st h() {
        InterfaceC1416Ks interfaceC1416Ks = this.I;
        if (interfaceC1416Ks instanceof InterfaceC8320st) {
            return (InterfaceC8320st) interfaceC1416Ks;
        }
        return null;
    }

    @Override // com.daaw.AbstractC7409pe
    public StackTraceElement n() {
        return null;
    }

    @Override // com.daaw.AbstractC7409pe
    public Object q(Object obj) {
        Throwable thB = AbstractC4512fJ0.b(obj);
        if (thB != null) {
            this.H = new C6181lD(thB, getContext());
        }
        InterfaceC1416Ks interfaceC1416Ks = this.I;
        if (interfaceC1416Ks != null) {
            interfaceC1416Ks.x(obj);
        }
        return I10.c();
    }

    @Override // com.daaw.AbstractC1623Ms, com.daaw.AbstractC7409pe
    public void s() {
        super.s();
    }

    public final void u(InterfaceC4684ft interfaceC4684ft, InterfaceC4684ft interfaceC4684ft2, Object obj) {
        if (interfaceC4684ft2 instanceof C6181lD) {
            z((C6181lD) interfaceC4684ft2, obj);
        }
        CM0.a(this, interfaceC4684ft);
    }

    public final Object w(InterfaceC1416Ks interfaceC1416Ks, Object obj) {
        InterfaceC4684ft context = interfaceC1416Ks.getContext();
        AbstractC3053a40.i(context);
        InterfaceC4684ft interfaceC4684ft = this.H;
        if (interfaceC4684ft != context) {
            u(context, interfaceC4684ft, obj);
            this.H = context;
        }
        this.I = interfaceC1416Ks;
        InterfaceC3986dR interfaceC3986dR = BM0.a;
        InterfaceC7337pN interfaceC7337pN = this.E;
        G10.e(interfaceC7337pN, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        G10.e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = interfaceC3986dR.invoke(interfaceC7337pN, obj, this);
        if (!G10.c(objInvoke, I10.c())) {
            this.I = null;
        }
        return objInvoke;
    }

    public final void z(C6181lD c6181lD, Object obj) {
        throw new IllegalStateException(AbstractC8497tY0.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c6181lD.B + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
