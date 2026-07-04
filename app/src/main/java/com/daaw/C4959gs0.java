package com.daaw;

import com.daaw.C6607ml;
import com.daaw.C9514x80;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.gs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4959gs0 {
    public final ZA a;
    public final C4221eG0 b;
    public final ConcurrentHashMap c;

    public C4959gs0(ZA za, C4221eG0 c4221eG0) {
        G10.g(za, "resolver");
        G10.g(c4221eG0, "kotlinClassFinder");
        this.a = za;
        this.b = c4221eG0;
        this.c = new ConcurrentHashMap();
    }

    public final InterfaceC4346ej0 a(C3943dG0 c3943dG0) {
        Collection collectionE;
        G10.g(c3943dG0, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.c;
        C6607ml c6607mlE = c3943dG0.e();
        Object obj = concurrentHashMap.get(c6607mlE);
        if (obj == null) {
            AP apF = c3943dG0.e().f();
            if (c3943dG0.a().c() == C9514x80.a.I) {
                List<String> listF = c3943dG0.a().f();
                collectionE = new ArrayList();
                for (String str : listF) {
                    C6607ml.a aVar = C6607ml.d;
                    AP apE = Y40.d(str).e();
                    G10.f(apE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    InterfaceC10072z80 interfaceC10072z80A = AbstractC9235w80.a(this.b, aVar.c(apE), CA.a(this.a.f().g()));
                    if (interfaceC10072z80A != null) {
                        collectionE.add(interfaceC10072z80A);
                    }
                }
            } else {
                collectionE = AbstractC1496Lm.e(c3943dG0);
            }
            C7588qG c7588qG = new C7588qG(this.a.f().q(), apF);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                InterfaceC4346ej0 interfaceC4346ej0C = this.a.c(c7588qG, (InterfaceC10072z80) it.next());
                if (interfaceC4346ej0C != null) {
                    arrayList.add(interfaceC4346ej0C);
                }
            }
            List listM0 = AbstractC2455Um.M0(arrayList);
            InterfaceC4346ej0 interfaceC4346ej0A = C2859Yj.d.a("package " + apF + " (" + c3943dG0 + ')', listM0);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c6607mlE, interfaceC4346ej0A);
            obj = objPutIfAbsent == null ? interfaceC4346ej0A : objPutIfAbsent;
        }
        G10.f(obj, "getOrPut(...)");
        return (InterfaceC4346ej0) obj;
    }
}
