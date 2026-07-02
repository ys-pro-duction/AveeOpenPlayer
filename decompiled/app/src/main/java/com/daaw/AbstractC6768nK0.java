package com.daaw;

import com.daaw.C1032Ha;
import com.daaw.H3;

/* JADX INFO: renamed from: com.daaw.nK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6768nK0 {
    public static final InterfaceC0957Gh0 a;

    /* JADX INFO: renamed from: com.daaw.nK0$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC5111hR {
        public static final a B = new a();

        public a() {
            super(5);
        }

        public final void a(int i, int[] iArr, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz, int[] iArr2) {
            G10.g(iArr, "size");
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(interfaceC4988gz, "density");
            G10.g(iArr2, "outPosition");
            C1032Ha.a.c().b(interfaceC4988gz, i, iArr, enumC7560q90, iArr2);
        }

        @Override // com.daaw.InterfaceC5111hR
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a(((Number) obj).intValue(), (int[]) obj2, (EnumC7560q90) obj3, (InterfaceC4988gz) obj4, (int[]) obj5);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.nK0$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC5111hR {
        public final /* synthetic */ C1032Ha.d B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1032Ha.d dVar) {
            super(5);
            this.B = dVar;
        }

        public final void a(int i, int[] iArr, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz, int[] iArr2) {
            G10.g(iArr, "size");
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(interfaceC4988gz, "density");
            G10.g(iArr2, "outPosition");
            this.B.b(interfaceC4988gz, i, iArr, enumC7560q90, iArr2);
        }

        @Override // com.daaw.InterfaceC5111hR
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a(((Number) obj).intValue(), (int[]) obj2, (EnumC7560q90) obj3, (InterfaceC4988gz) obj4, (int[]) obj5);
            return G91.a;
        }
    }

    static {
        L90 l90 = L90.Horizontal;
        float fA = C1032Ha.a.c().a();
        AbstractC0696Du abstractC0696DuB = AbstractC0696Du.a.b(H3.a.g());
        a = AbstractC6210lK0.m(l90, a.B, fA, CT0.Wrap, abstractC0696DuB);
    }

    public static final InterfaceC0957Gh0 a(C1032Ha.d dVar, H3.c cVar, InterfaceC5781jp interfaceC5781jp, int i) {
        InterfaceC0957Gh0 interfaceC0957Gh0M;
        G10.g(dVar, "horizontalArrangement");
        G10.g(cVar, "verticalAlignment");
        interfaceC5781jp.e(-837807694);
        interfaceC5781jp.e(511388516);
        boolean zP = interfaceC5781jp.P(dVar) | interfaceC5781jp.P(cVar);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            if (G10.c(dVar, C1032Ha.a.c()) && G10.c(cVar, H3.a.g())) {
                interfaceC0957Gh0M = a;
            } else {
                L90 l90 = L90.Horizontal;
                float fA = dVar.a();
                AbstractC0696Du abstractC0696DuB = AbstractC0696Du.a.b(cVar);
                interfaceC0957Gh0M = AbstractC6210lK0.m(l90, new b(dVar), fA, CT0.Wrap, abstractC0696DuB);
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
