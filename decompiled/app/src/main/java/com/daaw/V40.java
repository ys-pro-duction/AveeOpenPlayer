package com.daaw;

import com.daaw.InterfaceC1560Mc0;
import com.daaw.InterfaceC8246se0;
import com.daaw.VM;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class V40 extends B {
    public static final a f = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V40(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8956v80 interfaceC8956v80, InterfaceC2968Zk0 interfaceC2968Zk0, C0560Co0 c0560Co0, Z2 z2, InterfaceC2280Su0 interfaceC2280Su0, AA aa, InterfaceC2668Wn0 interfaceC2668Wn0, LM0 lm0) {
        super(interfaceC10174zX0, interfaceC8956v80, interfaceC2968Zk0);
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC8956v80, "finder");
        G10.g(interfaceC2968Zk0, "moduleDescriptor");
        G10.g(c0560Co0, "notFoundClasses");
        G10.g(z2, "additionalClassPartsProvider");
        G10.g(interfaceC2280Su0, "platformDependentDeclarationFilter");
        G10.g(aa, "deserializationConfiguration");
        G10.g(interfaceC2668Wn0, "kotlinTypeChecker");
        G10.g(lm0, "samConversionResolver");
        GA ga = new GA(this);
        C10220zh c10220zh = C10220zh.r;
        G7 g7 = new G7(interfaceC2968Zk0, c0560Co0, c10220zh);
        InterfaceC1560Mc0.a aVar = InterfaceC1560Mc0.a.a;
        InterfaceC8993vH interfaceC8993vH = InterfaceC8993vH.a;
        G10.f(interfaceC8993vH, "DO_NOTHING");
        k(new C9523xA(interfaceC10174zX0, interfaceC2968Zk0, aa, ga, g7, this, aVar, interfaceC8993vH, InterfaceC8246se0.a.a, VM.a.a, AbstractC1599Mm.n(new C9941yh(interfaceC10174zX0, interfaceC2968Zk0), new F40(interfaceC10174zX0, interfaceC2968Zk0, null, 4, null)), c0560Co0, InterfaceC2061Qs.a.a(), z2, interfaceC2280Su0, c10220zh.e(), interfaceC2668Wn0, lm0, null, C3058a50.a, 262144, null));
    }

    @Override // com.daaw.B
    public AbstractC8404tB e(AP ap) {
        G10.g(ap, "fqName");
        InputStream inputStreamC = h().c(ap);
        if (inputStreamC != null) {
            return C0852Fh.P.a(ap, j(), i(), inputStreamC, false);
        }
        return null;
    }
}
