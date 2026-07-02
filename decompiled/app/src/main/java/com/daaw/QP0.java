package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class QP0 {

    public static final class a implements KP0 {
        public final /* synthetic */ InterfaceC3429bR a;

        public a(InterfaceC3429bR interfaceC3429bR) {
            this.a = interfaceC3429bR;
        }

        @Override // com.daaw.KP0
        public Iterator iterator() {
            return QP0.a(this.a);
        }
    }

    public static final Iterator a(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "block");
        MP0 mp0 = new MP0();
        mp0.h(H10.a(interfaceC3429bR, mp0, mp0));
        return mp0;
    }

    public static KP0 b(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "block");
        return new a(interfaceC3429bR);
    }
}
