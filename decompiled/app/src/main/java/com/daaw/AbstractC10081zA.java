package com.daaw;

import com.daaw.AA;
import com.daaw.E30;
import com.daaw.InterfaceC6414m30;
import com.daaw.InterfaceC7530q30;
import com.daaw.InterfaceC8246se0;
import com.daaw.InterfaceC9624xZ0;
import com.daaw.J20;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10081zA {

    /* JADX INFO: renamed from: com.daaw.zA$a */
    public static final class a implements InterfaceC4441f30 {
        @Override // com.daaw.InterfaceC4441f30
        public List a(C6607ml c6607ml) {
            G10.g(c6607ml, "classId");
            return null;
        }
    }

    public static final C9802yA a(InterfaceC2968Zk0 interfaceC2968Zk0, InterfaceC10174zX0 interfaceC10174zX0, C0560Co0 c0560Co0, C9907ya0 c9907ya0, InterfaceC8956v80 interfaceC8956v80, ZA za, InterfaceC8993vH interfaceC8993vH, C4740g50 c4740g50) {
        G10.g(interfaceC2968Zk0, "module");
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(c0560Co0, "notFoundClasses");
        G10.g(c9907ya0, "lazyJavaPackageFragmentProvider");
        G10.g(interfaceC8956v80, "reflectKotlinClassFinder");
        G10.g(za, "deserializedDescriptorResolver");
        G10.g(interfaceC8993vH, "errorReporter");
        G10.g(c4740g50, "jvmMetadataVersion");
        return new C9802yA(interfaceC10174zX0, interfaceC2968Zk0, AA.a.a, new E20(interfaceC8956v80, za), AbstractC1052Hf.a(interfaceC2968Zk0, c0560Co0, interfaceC10174zX0, interfaceC8956v80, c4740g50), c9907ya0, c0560Co0, interfaceC8993vH, InterfaceC8246se0.a.a, InterfaceC2061Qs.a.a(), InterfaceC2668Wn0.b.a(), new C8108s71(AbstractC1496Lm.e(C6668my.a)));
    }

    public static final C9907ya0 b(H20 h20, InterfaceC2968Zk0 interfaceC2968Zk0, InterfaceC10174zX0 interfaceC10174zX0, C0560Co0 c0560Co0, InterfaceC8956v80 interfaceC8956v80, ZA za, InterfaceC8993vH interfaceC8993vH, InterfaceC8645u30 interfaceC8645u30, InterfaceC2552Vk0 interfaceC2552Vk0, InterfaceC4680fs0 interfaceC4680fs0) {
        G10.g(h20, "javaClassFinder");
        G10.g(interfaceC2968Zk0, "module");
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(c0560Co0, "notFoundClasses");
        G10.g(interfaceC8956v80, "reflectKotlinClassFinder");
        G10.g(za, "deserializedDescriptorResolver");
        G10.g(interfaceC8993vH, "errorReporter");
        G10.g(interfaceC8645u30, "javaSourceElementFactory");
        G10.g(interfaceC2552Vk0, "singleModuleClassResolver");
        G10.g(interfaceC4680fs0, "packagePartProvider");
        InterfaceC9596xS0 interfaceC9596xS0 = InterfaceC9596xS0.a;
        G10.f(interfaceC9596xS0, "DO_NOTHING");
        InterfaceC6972o30 interfaceC6972o30 = InterfaceC6972o30.a;
        G10.f(interfaceC6972o30, "EMPTY");
        InterfaceC6414m30.a aVar = InterfaceC6414m30.a.a;
        MM0 mm0 = new MM0(interfaceC10174zX0, AbstractC1599Mm.k());
        InterfaceC9624xZ0.a aVar2 = InterfaceC9624xZ0.a.a;
        InterfaceC8246se0.a aVar3 = InterfaceC8246se0.a.a;
        C7867rG0 c7867rG0 = new C7867rG0(interfaceC2968Zk0, c0560Co0);
        E30.b bVar = E30.d;
        V7 v7 = new V7(bVar.a());
        InterfaceC7530q30.a aVar4 = InterfaceC7530q30.a.a;
        return new C9907ya0(new C7251p30(interfaceC10174zX0, h20, interfaceC8956v80, za, interfaceC9596xS0, interfaceC8993vH, interfaceC6972o30, aVar, mm0, interfaceC8645u30, interfaceC2552Vk0, interfaceC4680fs0, aVar2, aVar3, interfaceC2968Zk0, c7867rG0, v7, new C8752uS0(new D30(aVar4)), J20.a.a, aVar4, InterfaceC2668Wn0.b.a(), bVar.a(), new a(), null, 8388608, null));
    }
}
