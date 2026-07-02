package com.daaw;

/* JADX INFO: renamed from: com.daaw.sN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8173sN {

    /* JADX INFO: renamed from: com.daaw.sN$a */
    public static final class a implements InterfaceC7058oN {
        public final /* synthetic */ Object B;

        public a(Object obj) {
            this.B = obj;
        }

        @Override // com.daaw.InterfaceC7058oN
        public Object a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            Object objC = interfaceC7337pN.c(this.B, interfaceC1416Ks);
            return objC == I10.c() ? objC : G91.a;
        }
    }

    public static final InterfaceC7058oN a(InterfaceC3429bR interfaceC3429bR) {
        return new EM0(interfaceC3429bR);
    }

    public static final InterfaceC7058oN b(Object obj) {
        return new a(obj);
    }
}
