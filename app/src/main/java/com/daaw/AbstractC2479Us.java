package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.AbstractC7898rO;
import com.daaw.D7;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC4943gp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2479Us {
    public static final C0576Cs0 a = new C0576Cs0(AbstractC1599Mm.k(), AbstractC1599Mm.k());

    /* JADX INFO: renamed from: com.daaw.Us$a */
    public static final class a implements InterfaceC0957Gh0 {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.daaw.Us$a$a, reason: collision with other inner class name */
        public static final class C0124a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ List B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0124a(List list) {
                super(1);
                this.B = list;
            }

            public final void a(AbstractC0584Cu0.a aVar) {
                G10.g(aVar, "$this$layout");
                List list = this.B;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AbstractC0584Cu0.a.n(aVar, (AbstractC0584Cu0) list.get(i), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC0584Cu0.a) obj);
                return G91.a;
            }
        }

        @Override // com.daaw.InterfaceC0957Gh0
        public final InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            G10.g(interfaceC1269Jh0, "$this$Layout");
            G10.g(list, "children");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((InterfaceC0645Dh0) list.get(i)).G(j));
            }
            return AbstractC1165Ih0.b(interfaceC1269Jh0, C6079kr.n(j), C6079kr.m(j), null, new C0124a(arrayList), 4, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Us$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ D7 B;
        public final /* synthetic */ List C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D7 d7, List list, int i) {
            super(2);
            this.B = d7;
            this.C = list;
            this.D = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC2479Us.a(this.B, this.C, interfaceC5781jp, this.D | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(D7 d7, List list, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(d7, "text");
        G10.g(list, "inlineContents");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-110905764);
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            D7.b bVar = (D7.b) list.get(i2);
            InterfaceC3986dR interfaceC3986dR = (InterfaceC3986dR) bVar.a();
            int iB = bVar.b();
            int iC = bVar.c();
            a aVar = a.a;
            interfaceC5781jpQ.e(-1323940314);
            InterfaceC1073Hk0.a aVar2 = InterfaceC1073Hk0.m;
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jpQ.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jpQ.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jpQ.O(AbstractC2259Sp.i());
            InterfaceC4943gp.a aVar3 = InterfaceC4943gp.d;
            LQ lqA = aVar3.a();
            InterfaceC3986dR interfaceC3986dRA = B90.a(aVar2);
            if (!AbstractC2988Zp0.a(interfaceC5781jpQ.v())) {
                AbstractC3540bp.c();
            }
            interfaceC5781jpQ.s();
            if (interfaceC5781jpQ.n()) {
                interfaceC5781jpQ.E(lqA);
            } else {
                interfaceC5781jpQ.G();
            }
            interfaceC5781jpQ.u();
            InterfaceC5781jp interfaceC5781jpA = AbstractC5987ka1.a(interfaceC5781jpQ);
            AbstractC5987ka1.b(interfaceC5781jpA, aVar, aVar3.d());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar3.b());
            AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar3.c());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar3.f());
            interfaceC5781jpQ.i();
            interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jpQ)), interfaceC5781jpQ, 0);
            interfaceC5781jpQ.e(2058660585);
            interfaceC5781jpQ.e(-72427749);
            interfaceC3986dR.invoke(d7.subSequence(iB, iC).g(), interfaceC5781jpQ, 0);
            interfaceC5781jpQ.L();
            interfaceC5781jpQ.L();
            interfaceC5781jpQ.M();
            interfaceC5781jpQ.L();
            i2++;
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new b(d7, list, i));
    }

    public static final C0576Cs0 b(D7 d7, Map map) {
        G10.g(d7, "text");
        G10.g(map, "inlineContent");
        if (map.isEmpty()) {
            return a;
        }
        List listF = d7.f("androidx.compose.foundation.text.inlineContent", 0, d7.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listF.size();
        for (int i = 0; i < size; i++) {
            AbstractC6314li0.a(map.get(((D7.b) listF.get(i)).e()));
        }
        return new C0576Cs0(arrayList, arrayList2);
    }

    public static final R11 c(R11 r11, D7 d7, O21 o21, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar, boolean z, int i, int i2, List list) {
        int i3;
        int i4;
        G10.g(r11, "current");
        G10.g(d7, "text");
        G10.g(o21, "style");
        G10.g(interfaceC4988gz, "density");
        G10.g(bVar, "fontFamilyResolver");
        G10.g(list, "placeholders");
        if (G10.c(r11.j(), d7) && G10.c(r11.i(), o21) && r11.h() == z) {
            i3 = i;
            if (C21.d(r11.f(), i3)) {
                i4 = i2;
                if (r11.d() == i4 && G10.c(r11.a(), interfaceC4988gz) && G10.c(r11.g(), list) && r11.b() == bVar) {
                    return r11;
                }
            }
            return new R11(d7, o21, i4, z, i3, interfaceC4988gz, bVar, list, null);
        }
        i3 = i;
        i4 = i2;
        return new R11(d7, o21, i4, z, i3, interfaceC4988gz, bVar, list, null);
    }

    public static final R11 d(R11 r11, String str, O21 o21, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar, boolean z, int i, int i2) {
        int i3;
        G10.g(r11, "current");
        G10.g(str, "text");
        G10.g(o21, "style");
        G10.g(interfaceC4988gz, "density");
        G10.g(bVar, "fontFamilyResolver");
        if (G10.c(r11.j().g(), str) && G10.c(r11.i(), o21)) {
            if (r11.h() == z) {
                if (C21.d(r11.f(), i)) {
                    i3 = i2;
                    if (r11.d() == i3 && G10.c(r11.a(), interfaceC4988gz) && r11.b() == bVar) {
                        return r11;
                    }
                }
                return new R11(new D7(str, null, null, 6, null), o21, i3, z, i, interfaceC4988gz, bVar, null, 128, null);
            }
            i3 = i2;
            return new R11(new D7(str, null, null, 6, null), o21, i3, z, i, interfaceC4988gz, bVar, null, 128, null);
        }
        i3 = i2;
        return new R11(new D7(str, null, null, 6, null), o21, i3, z, i, interfaceC4988gz, bVar, null, 128, null);
    }
}
