package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0443Bl {

    /* JADX INFO: renamed from: com.daaw.Bl$a */
    public static final class a implements InterfaceC0443Bl {
        public static final a a = new a();

        @Override // com.daaw.InterfaceC0443Bl
        public String a(InterfaceC10240zl interfaceC10240zl, AbstractC2923Yz abstractC2923Yz) {
            G10.g(interfaceC10240zl, "classifier");
            G10.g(abstractC2923Yz, "renderer");
            if (interfaceC10240zl instanceof Z71) {
                C2352Tm0 name = ((Z71) interfaceC10240zl).getName();
                G10.f(name, "getName(...)");
                return abstractC2923Yz.T(name, false);
            }
            BP bpM = AbstractC7006oA.m(interfaceC10240zl);
            G10.f(bpM, "getFqName(...)");
            return abstractC2923Yz.S(bpM);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bl$b */
    public static final class b implements InterfaceC0443Bl {
        public static final b a = new b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.daaw.zl, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.daaw.cn0, com.daaw.tw] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.daaw.tw] */
        @Override // com.daaw.InterfaceC0443Bl
        public String a(InterfaceC10240zl interfaceC10240zl, AbstractC2923Yz abstractC2923Yz) {
            G10.g(interfaceC10240zl, "classifier");
            G10.g(abstractC2923Yz, "renderer");
            if (interfaceC10240zl instanceof Z71) {
                C2352Tm0 name = ((Z71) interfaceC10240zl).getName();
                G10.f(name, "getName(...)");
                return abstractC2923Yz.T(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(interfaceC10240zl.getName());
                interfaceC10240zl = interfaceC10240zl.b();
            } while (interfaceC10240zl instanceof InterfaceC4923gl);
            return AbstractC3394bI0.c(AbstractC2247Sm.Q(arrayList));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Bl$c */
    public static final class c implements InterfaceC0443Bl {
        public static final c a = new c();

        @Override // com.daaw.InterfaceC0443Bl
        public String a(InterfaceC10240zl interfaceC10240zl, AbstractC2923Yz abstractC2923Yz) {
            G10.g(interfaceC10240zl, "classifier");
            G10.g(abstractC2923Yz, "renderer");
            return b(interfaceC10240zl);
        }

        public final String b(InterfaceC10240zl interfaceC10240zl) {
            C2352Tm0 name = interfaceC10240zl.getName();
            G10.f(name, "getName(...)");
            String strB = AbstractC3394bI0.b(name);
            if (interfaceC10240zl instanceof Z71) {
                return strB;
            }
            InterfaceC8612tw interfaceC8612twB = interfaceC10240zl.b();
            G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
            String strC = c(interfaceC8612twB);
            if (strC == null || G10.c(strC, "")) {
                return strB;
            }
            return strC + '.' + strB;
        }

        public final String c(InterfaceC8612tw interfaceC8612tw) {
            if (interfaceC8612tw instanceof InterfaceC4923gl) {
                return b((InterfaceC10240zl) interfaceC8612tw);
            }
            if (!(interfaceC8612tw instanceof InterfaceC2372Tr0)) {
                return null;
            }
            BP bpJ = ((InterfaceC2372Tr0) interfaceC8612tw).d().j();
            G10.f(bpJ, "toUnsafe(...)");
            return AbstractC3394bI0.a(bpJ);
        }
    }

    String a(InterfaceC10240zl interfaceC10240zl, AbstractC2923Yz abstractC2923Yz);
}
