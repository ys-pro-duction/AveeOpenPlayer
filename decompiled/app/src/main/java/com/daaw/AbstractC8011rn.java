package com.daaw;

import com.daaw.C1032Ha;
import com.daaw.H3;

/* JADX INFO: renamed from: com.daaw.rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8011rn {
    public static final InterfaceC0957Gh0 a;

    /* JADX INFO: renamed from: com.daaw.rn$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC5111hR {
        public static final a B = new a();

        public a() {
            super(5);
        }

        public final void a(int i, int[] iArr, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz, int[] iArr2) {
            G10.g(iArr, "size");
            G10.g(enumC7560q90, "<anonymous parameter 2>");
            G10.g(interfaceC4988gz, "density");
            G10.g(iArr2, "outPosition");
            C1032Ha.a.d().c(interfaceC4988gz, i, iArr, iArr2);
        }

        @Override // com.daaw.InterfaceC5111hR
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a(((Number) obj).intValue(), (int[]) obj2, (EnumC7560q90) obj3, (InterfaceC4988gz) obj4, (int[]) obj5);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.rn$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC5111hR {
        public final /* synthetic */ C1032Ha.k B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1032Ha.k kVar) {
            super(5);
            this.B = kVar;
        }

        public final void a(int i, int[] iArr, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz, int[] iArr2) {
            G10.g(iArr, "size");
            G10.g(enumC7560q90, "<anonymous parameter 2>");
            G10.g(interfaceC4988gz, "density");
            G10.g(iArr2, "outPosition");
            this.B.c(interfaceC4988gz, i, iArr, iArr2);
        }

        @Override // com.daaw.InterfaceC5111hR
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a(((Number) obj).intValue(), (int[]) obj2, (EnumC7560q90) obj3, (InterfaceC4988gz) obj4, (int[]) obj5);
            return G91.a;
        }
    }

    static {
        L90 l90 = L90.Vertical;
        float fA = C1032Ha.a.d().a();
        AbstractC0696Du abstractC0696DuA = AbstractC0696Du.a.a(H3.a.f());
        a = AbstractC6210lK0.m(l90, a.B, fA, CT0.Wrap, abstractC0696DuA);
    }

    public static final InterfaceC0957Gh0 a(C1032Ha.k kVar, H3.b bVar, InterfaceC5781jp interfaceC5781jp, int i) {
        InterfaceC0957Gh0 interfaceC0957Gh0M;
        G10.g(kVar, "verticalArrangement");
        G10.g(bVar, "horizontalAlignment");
        interfaceC5781jp.e(1089876336);
        interfaceC5781jp.e(511388516);
        boolean zP = interfaceC5781jp.P(kVar) | interfaceC5781jp.P(bVar);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            if (G10.c(kVar, C1032Ha.a.d()) && G10.c(bVar, H3.a.f())) {
                interfaceC0957Gh0M = a;
            } else {
                L90 l90 = L90.Vertical;
                float fA = kVar.a();
                AbstractC0696Du abstractC0696DuA = AbstractC0696Du.a.a(bVar);
                interfaceC0957Gh0M = AbstractC6210lK0.m(l90, new b(kVar), fA, CT0.Wrap, abstractC0696DuA);
            }
            objF = interfaceC0957Gh0M;
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        InterfaceC0957Gh0 interfaceC0957Gh0 = (InterfaceC0957Gh0) objF;
        interfaceC5781jp.L();
        return interfaceC0957Gh0;
    }
}
