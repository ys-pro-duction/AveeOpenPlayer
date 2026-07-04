package com.daaw;

import com.daaw.AbstractC0584Cu0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UU0 implements InterfaceC0957Gh0 {
    public static final UU0 a = new UU0();

    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    @Override // com.daaw.InterfaceC0957Gh0
    public InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(list, "measurables");
        return AbstractC1165Ih0.b(interfaceC1269Jh0, C6079kr.l(j) ? C6079kr.n(j) : 0, C6079kr.k(j) ? C6079kr.m(j) : 0, null, a.B, 4, null);
    }
}
