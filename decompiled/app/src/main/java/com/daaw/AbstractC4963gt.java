package com.daaw;

import com.daaw.InterfaceC4684ft;

/* JADX INFO: renamed from: com.daaw.gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4963gt {

    /* JADX INFO: renamed from: com.daaw.gt$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4684ft invoke(InterfaceC4684ft interfaceC4684ft, InterfaceC4684ft.b bVar) {
            return interfaceC4684ft.U(bVar);
        }
    }

    /* JADX INFO: renamed from: com.daaw.gt$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C6748nF0 B;
        public final /* synthetic */ boolean C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6748nF0 c6748nF0, boolean z) {
            super(2);
            this.B = c6748nF0;
            this.C = z;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4684ft invoke(InterfaceC4684ft interfaceC4684ft, InterfaceC4684ft.b bVar) {
            return interfaceC4684ft.U(bVar);
        }
    }

    /* JADX INFO: renamed from: com.daaw.gt$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final c B = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z, InterfaceC4684ft.b bVar) {
            return Boolean.valueOf(z);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (InterfaceC4684ft.b) obj2);
        }
    }

    public static final InterfaceC4684ft a(InterfaceC4684ft interfaceC4684ft, InterfaceC4684ft interfaceC4684ft2, boolean z) {
        boolean zC = c(interfaceC4684ft);
        boolean zC2 = c(interfaceC4684ft2);
        if (!zC && !zC2) {
            return interfaceC4684ft.U(interfaceC4684ft2);
        }
        C6748nF0 c6748nF0 = new C6748nF0();
        c6748nF0.B = interfaceC4684ft2;
        C5905kG c5905kG = C5905kG.B;
        InterfaceC4684ft interfaceC4684ft3 = (InterfaceC4684ft) interfaceC4684ft.c1(c5905kG, new b(c6748nF0, z));
        if (zC2) {
            c6748nF0.B = ((InterfaceC4684ft) c6748nF0.B).c1(c5905kG, a.B);
        }
        return interfaceC4684ft3.U((InterfaceC4684ft) c6748nF0.B);
    }

    public static final String b(InterfaceC4684ft interfaceC4684ft) {
        return null;
    }

    public static final boolean c(InterfaceC4684ft interfaceC4684ft) {
        return ((Boolean) interfaceC4684ft.c1(Boolean.FALSE, c.B)).booleanValue();
    }

    public static final InterfaceC4684ft d(InterfaceC4684ft interfaceC4684ft, InterfaceC4684ft interfaceC4684ft2) {
        return !c(interfaceC4684ft2) ? interfaceC4684ft.U(interfaceC4684ft2) : a(interfaceC4684ft, interfaceC4684ft2, false);
    }

    public static final InterfaceC4684ft e(InterfaceC7484pt interfaceC7484pt, InterfaceC4684ft interfaceC4684ft) {
        InterfaceC4684ft interfaceC4684ftA = a(interfaceC7484pt.i(), interfaceC4684ft, true);
        return (interfaceC4684ftA == C7850rC.a() || interfaceC4684ftA.a(InterfaceC1727Ns.e) != null) ? interfaceC4684ftA : interfaceC4684ftA.U(C7850rC.a());
    }

    public static final C10078z91 f(InterfaceC8320st interfaceC8320st) {
        while (!(interfaceC8320st instanceof C6735nC) && (interfaceC8320st = interfaceC8320st.h()) != null) {
            if (interfaceC8320st instanceof C10078z91) {
                return (C10078z91) interfaceC8320st;
            }
        }
        return null;
    }

    public static final C10078z91 g(InterfaceC1416Ks interfaceC1416Ks, InterfaceC4684ft interfaceC4684ft, Object obj) {
        if (!(interfaceC1416Ks instanceof InterfaceC8320st) || interfaceC4684ft.a(B91.B) == null) {
            return null;
        }
        C10078z91 c10078z91F = f((InterfaceC8320st) interfaceC1416Ks);
        if (c10078z91F != null) {
            c10078z91F.W0(interfaceC4684ft, obj);
        }
        return c10078z91F;
    }
}
