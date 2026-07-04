package com.daaw;

import com.daaw.AA;
import com.daaw.InterfaceC1560Mc0;
import com.daaw.InterfaceC2280Su0;
import com.daaw.InterfaceC4680fs0;
import com.daaw.J40;
import com.daaw.Z2;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: renamed from: com.daaw.yA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9802yA {
    public static final a b = new a(null);
    public final C9523xA a;

    /* JADX INFO: renamed from: com.daaw.yA$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.yA$a$a, reason: collision with other inner class name */
        public static final class C0255a {
            public final C9802yA a;
            public final ZA b;

            public C0255a(C9802yA c9802yA, ZA za) {
                G10.g(c9802yA, "deserializationComponentsForJava");
                G10.g(za, "deserializedDescriptorResolver");
                this.a = c9802yA;
                this.b = za;
            }

            public final C9802yA a() {
                return this.a;
            }

            public final ZA b() {
                return this.b;
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C0255a a(InterfaceC8956v80 interfaceC8956v80, InterfaceC8956v80 interfaceC8956v802, H20 h20, String str, InterfaceC8993vH interfaceC8993vH, InterfaceC8645u30 interfaceC8645u30) {
            G10.g(interfaceC8956v80, "kotlinClassFinder");
            G10.g(interfaceC8956v802, "jvmBuiltInsKotlinClassFinder");
            G10.g(h20, "javaClassFinder");
            G10.g(str, "moduleName");
            G10.g(interfaceC8993vH, "errorReporter");
            G10.g(interfaceC8645u30, "javaSourceElementFactory");
            C9085vd0 c9085vd0 = new C9085vd0("DeserializationComponentsForJava.ModuleData");
            J40 j40 = new J40(c9085vd0, J40.a.B);
            C2352Tm0 c2352Tm0O = C2352Tm0.o('<' + str + '>');
            G10.f(c2352Tm0O, "special(...)");
            C3799cl0 c3799cl0 = new C3799cl0(c2352Tm0O, c9085vd0, j40, null, null, null, 56, null);
            j40.E0(c3799cl0);
            j40.M0(c3799cl0, true);
            ZA za = new ZA();
            C7919rT0 c7919rT0 = new C7919rT0();
            C0560Co0 c0560Co0 = new C0560Co0(c9085vd0, c3799cl0);
            C9907ya0 c9907ya0B = AbstractC10081zA.b(h20, c3799cl0, c9085vd0, c0560Co0, interfaceC8956v80, za, interfaceC8993vH, interfaceC8645u30, c7919rT0, (AdRequest.MAX_CONTENT_URL_LENGTH & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? InterfaceC4680fs0.a.a : null);
            C9802yA c9802yAA = AbstractC10081zA.a(c3799cl0, c9085vd0, c0560Co0, c9907ya0B, interfaceC8956v80, za, interfaceC8993vH, C4740g50.i);
            za.p(c9802yAA);
            InterfaceC6972o30 interfaceC6972o30 = InterfaceC6972o30.a;
            G10.f(interfaceC6972o30, "EMPTY");
            Q20 q20 = new Q20(c9907ya0B, interfaceC6972o30);
            c7919rT0.c(q20);
            V40 v40 = new V40(c9085vd0, interfaceC8956v802, c3799cl0, c0560Co0, j40.L0(), j40.L0(), AA.a.a, InterfaceC2668Wn0.b.a(), new MM0(c9085vd0, AbstractC1599Mm.k()));
            c3799cl0.W0(c3799cl0);
            c3799cl0.O0(new C0459Bp(AbstractC1599Mm.n(q20.a(), v40), "CompositeProvider@RuntimeModuleData for " + c3799cl0));
            return new C0255a(c9802yAA, za);
        }

        public a() {
        }
    }

    public C9802yA(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, AA aa, E20 e20, C0948Gf c0948Gf, C9907ya0 c9907ya0, C0560Co0 c0560Co0, InterfaceC8993vH interfaceC8993vH, InterfaceC8246se0 interfaceC8246se0, InterfaceC2061Qs interfaceC2061Qs, InterfaceC2668Wn0 interfaceC2668Wn0, C8108s71 c8108s71) {
        InterfaceC2280Su0 interfaceC2280Su0L0;
        Z2 z2L0;
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2968Zk0, "moduleDescriptor");
        G10.g(aa, "configuration");
        G10.g(e20, "classDataFinder");
        G10.g(c0948Gf, "annotationAndConstantLoader");
        G10.g(c9907ya0, "packageFragmentProvider");
        G10.g(c0560Co0, "notFoundClasses");
        G10.g(interfaceC8993vH, "errorReporter");
        G10.g(interfaceC8246se0, "lookupTracker");
        G10.g(interfaceC2061Qs, "contractDeserializer");
        G10.g(interfaceC2668Wn0, "kotlinTypeChecker");
        G10.g(c8108s71, "typeAttributeTranslators");
        AbstractC8670u80 abstractC8670u80P = interfaceC2968Zk0.p();
        J40 j40 = abstractC8670u80P instanceof J40 ? (J40) abstractC8670u80P : null;
        this.a = new C9523xA(interfaceC10174zX0, interfaceC2968Zk0, aa, e20, c0948Gf, c9907ya0, InterfaceC1560Mc0.a.a, interfaceC8993vH, interfaceC8246se0, W20.a, AbstractC1599Mm.k(), c0560Co0, interfaceC2061Qs, (j40 == null || (z2L0 = j40.L0()) == null) ? Z2.a.a : z2L0, (j40 == null || (interfaceC2280Su0L0 = j40.L0()) == null) ? InterfaceC2280Su0.b.a : interfaceC2280Su0L0, C7540q50.a.a(), interfaceC2668Wn0, new MM0(interfaceC10174zX0, AbstractC1599Mm.k()), c8108s71.a(), C3058a50.a);
    }

    public final C9523xA a() {
        return this.a;
    }
}
