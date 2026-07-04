package com.daaw;

import com.daaw.C6607ml;
import com.daaw.C9514x80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.wa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9349wa0 extends AbstractC2476Ur0 {
    public static final /* synthetic */ W60[] P = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C9349wa0.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C9349wa0.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    public final InterfaceC5565j30 H;
    public final C0504Ca0 I;
    public final C4740g50 J;
    public final InterfaceC0881Fo0 K;
    public final C6424m50 L;
    public final InterfaceC0881Fo0 M;
    public final InterfaceC3072a8 N;
    public final InterfaceC0881Fo0 O;

    /* JADX INFO: renamed from: com.daaw.wa0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C9514x80.a.values().length];
            try {
                iArr[C9514x80.a.J.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C9514x80.a.G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9349wa0(C0504Ca0 c0504Ca0, InterfaceC5565j30 interfaceC5565j30) {
        super(c0504Ca0.d(), interfaceC5565j30.d());
        G10.g(c0504Ca0, "outerContext");
        G10.g(interfaceC5565j30, "jPackage");
        this.H = interfaceC5565j30;
        C0504Ca0 c0504Ca0F = AbstractC10275zs.f(c0504Ca0, this, null, 0, 6, null);
        this.I = c0504Ca0F;
        this.J = CA.a(c0504Ca0.a().b().f().g());
        this.K = c0504Ca0F.e().h(new C8505ta0(this));
        this.L = new C6424m50(c0504Ca0F, interfaceC5565j30, this);
        this.M = c0504Ca0F.e().e(new C8784ua0(this), AbstractC1599Mm.k());
        this.N = c0504Ca0F.a().i().b() ? InterfaceC3072a8.b.b() : AbstractC3744ca0.a(c0504Ca0F, interfaceC5565j30);
        this.O = c0504Ca0F.e().h(new C9070va0(this));
    }

    public static final Map M0(C9349wa0 c9349wa0) {
        G10.g(c9349wa0, "this$0");
        InterfaceC4680fs0 interfaceC4680fs0O = c9349wa0.I.a().o();
        String strB = c9349wa0.d().b();
        G10.f(strB, "asString(...)");
        List<String> listA = interfaceC4680fs0O.a(strB);
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            C6607ml.a aVar = C6607ml.d;
            AP apE = Y40.d(str).e();
            G10.f(apE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            InterfaceC10072z80 interfaceC10072z80A = AbstractC9235w80.a(c9349wa0.I.a().j(), aVar.c(apE), c9349wa0.J);
            C0576Cs0 c0576Cs0A = interfaceC10072z80A != null ? D61.a(str, interfaceC10072z80A) : null;
            if (c0576Cs0A != null) {
                arrayList.add(c0576Cs0A);
            }
        }
        return AbstractC1473Lg0.t(arrayList);
    }

    public static final HashMap R0(C9349wa0 c9349wa0) {
        G10.g(c9349wa0, "this$0");
        HashMap map = new HashMap();
        for (Map.Entry entry : c9349wa0.O0().entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC10072z80 interfaceC10072z80 = (InterfaceC10072z80) entry.getValue();
            Y40 y40D = Y40.d(str);
            G10.f(y40D, "byInternalName(...)");
            C9514x80 c9514x80A = interfaceC10072z80.a();
            int i = a.a[c9514x80A.c().ordinal()];
            if (i == 1) {
                String strE = c9514x80A.e();
                if (strE != null) {
                    map.put(y40D, Y40.d(strE));
                }
            } else if (i == 2) {
                map.put(y40D, y40D);
            }
        }
        return map;
    }

    public static final List S0(C9349wa0 c9349wa0) {
        G10.g(c9349wa0, "this$0");
        Collection collectionZ = c9349wa0.H.z();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collectionZ, 10));
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5565j30) it.next()).d());
        }
        return arrayList;
    }

    public final InterfaceC4923gl N0(C20 c20) {
        G10.g(c20, "jClass");
        return this.L.i().k0(c20);
    }

    public final Map O0() {
        return (Map) AbstractC9895yX0.a(this.K, this, P[0]);
    }

    @Override // com.daaw.InterfaceC2372Tr0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C6424m50 q() {
        return this.L;
    }

    public final List Q0() {
        return (List) this.M.invoke();
    }

    @Override // com.daaw.C7, com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        return this.N;
    }

    @Override // com.daaw.AbstractC2476Ur0, com.daaw.AbstractC9456ww, com.daaw.InterfaceC10293zw
    public RU0 j() {
        return new A80(this);
    }

    @Override // com.daaw.AbstractC2476Ur0, com.daaw.AbstractC8898uw
    public String toString() {
        return "Lazy Java package fragment: " + d() + " of module " + this.I.a().m();
    }
}
