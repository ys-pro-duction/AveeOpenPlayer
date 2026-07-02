package com.daaw;

import com.daaw.AA;
import com.daaw.InterfaceC1560Mc0;
import com.daaw.InterfaceC8246se0;
import com.daaw.VM;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0644Dh implements InterfaceC0531Ch {
    public final C1060Hh b = new C1060Hh();

    /* JADX INFO: renamed from: com.daaw.Dh$a */
    public /* synthetic */ class a extends AbstractC9312wR implements NQ {
        public a(Object obj) {
            super(1, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "loadResource";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(C1060Hh.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String str) {
            G10.g(str, "p0");
            return ((C1060Hh) this.receiver).a(str);
        }
    }

    @Override // com.daaw.InterfaceC0531Ch
    public InterfaceC2580Vr0 a(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, Iterable iterable, InterfaceC2280Su0 interfaceC2280Su0, Z2 z2, boolean z) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2968Zk0, "builtInsModule");
        G10.g(iterable, "classDescriptorFactories");
        G10.g(interfaceC2280Su0, "platformDependentDeclarationFilter");
        G10.g(z2, "additionalClassPartsProvider");
        return b(interfaceC10174zX0, interfaceC2968Zk0, YV0.H, iterable, interfaceC2280Su0, z2, z, new a(this.b));
    }

    public final InterfaceC2580Vr0 b(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, Set set, Iterable iterable, InterfaceC2280Su0 interfaceC2280Su0, Z2 z2, boolean z, NQ nq) {
        InterfaceC10174zX0 interfaceC10174zX02 = interfaceC10174zX0;
        InterfaceC2968Zk0 interfaceC2968Zk02 = interfaceC2968Zk0;
        G10.g(interfaceC10174zX02, "storageManager");
        G10.g(interfaceC2968Zk02, "module");
        G10.g(set, "packageFqNames");
        G10.g(iterable, "classDescriptorFactories");
        G10.g(interfaceC2280Su0, "platformDependentDeclarationFilter");
        G10.g(z2, "additionalClassPartsProvider");
        G10.g(nq, "loadResource");
        Set<AP> set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(set2, 10));
        for (AP ap : set2) {
            String strR = C10220zh.r.r(ap);
            InputStream inputStream = (InputStream) nq.invoke(strR);
            if (inputStream == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strR);
            }
            InterfaceC2968Zk0 interfaceC2968Zk03 = interfaceC2968Zk02;
            interfaceC10174zX02 = interfaceC10174zX0;
            interfaceC2968Zk02 = interfaceC2968Zk03;
            arrayList.add(C0852Fh.P.a(ap, interfaceC10174zX0, interfaceC2968Zk03, inputStream, z));
        }
        C2892Yr0 c2892Yr0 = new C2892Yr0(arrayList);
        C0560Co0 c0560Co0 = new C0560Co0(interfaceC10174zX02, interfaceC2968Zk02);
        AA.a aVar = AA.a.a;
        GA ga = new GA(c2892Yr0);
        C10220zh c10220zh = C10220zh.r;
        G7 g7 = new G7(interfaceC2968Zk02, c0560Co0, c10220zh);
        InterfaceC1560Mc0.a aVar2 = InterfaceC1560Mc0.a.a;
        InterfaceC8993vH interfaceC8993vH = InterfaceC8993vH.a;
        G10.f(interfaceC8993vH, "DO_NOTHING");
        C9523xA c9523xA = new C9523xA(interfaceC10174zX02, interfaceC2968Zk0, aVar, ga, g7, c2892Yr0, aVar2, interfaceC8993vH, InterfaceC8246se0.a.a, VM.a.a, iterable, c0560Co0, InterfaceC2061Qs.a.a(), z2, interfaceC2280Su0, c10220zh.e(), null, new MM0(interfaceC10174zX02, AbstractC1599Mm.k()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0852Fh) it.next()).L0(c9523xA);
        }
        return c2892Yr0;
    }
}
