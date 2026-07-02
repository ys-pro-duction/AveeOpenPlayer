package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.E90;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WJ0 extends E90.h {
    public static final WJ0 b = new WJ0();

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

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC0584Cu0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC0584Cu0 abstractC0584Cu0) {
            super(1);
            this.B = abstractC0584Cu0;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.p(aVar, this.B, 0, 0, 0.0f, null, 12, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ List B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.B = list;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            List list = this.B;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AbstractC0584Cu0.a.p(aVar, (AbstractC0584Cu0) list.get(i), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    public WJ0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // com.daaw.InterfaceC0957Gh0
    public InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(list, "measurables");
        if (list.isEmpty()) {
            return AbstractC1165Ih0.b(interfaceC1269Jh0, C6079kr.p(j), C6079kr.o(j), null, a.B, 4, null);
        }
        if (list.size() == 1) {
            AbstractC0584Cu0 abstractC0584Cu0G = ((InterfaceC0645Dh0) list.get(0)).G(j);
            return AbstractC1165Ih0.b(interfaceC1269Jh0, AbstractC6916nr.g(j, abstractC0584Cu0G.q0()), AbstractC6916nr.f(j, abstractC0584Cu0G.l0()), null, new b(abstractC0584Cu0G), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((InterfaceC0645Dh0) list.get(i)).G(j));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC0584Cu0 abstractC0584Cu0 = (AbstractC0584Cu0) arrayList.get(i2);
            iMax = Math.max(abstractC0584Cu0.q0(), iMax);
            iMax2 = Math.max(abstractC0584Cu0.l0(), iMax2);
        }
        return AbstractC1165Ih0.b(interfaceC1269Jh0, AbstractC6916nr.g(j, iMax), AbstractC6916nr.f(j, iMax2), null, new c(arrayList), 4, null);
    }
}
