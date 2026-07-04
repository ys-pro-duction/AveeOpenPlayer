package com.daaw;

import com.daaw.InterfaceC2280Su0;
import com.daaw.Z2;
import com.daaw.ZG;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9523xA {
    public final InterfaceC10174zX0 a;
    public final InterfaceC2968Zk0 b;
    public final AA c;
    public final InterfaceC4077dl d;
    public final F7 e;
    public final InterfaceC2580Vr0 f;
    public final InterfaceC1560Mc0 g;
    public final InterfaceC8993vH h;
    public final InterfaceC8246se0 i;
    public final VM j;
    public final Iterable k;
    public final C0560Co0 l;
    public final InterfaceC2061Qs m;
    public final Z2 n;
    public final InterfaceC2280Su0 o;
    public final C6763nJ p;
    public final InterfaceC2668Wn0 q;
    public final LM0 r;
    public final List s;
    public final ZG t;
    public final C6328ll u;

    public C9523xA(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, AA aa, InterfaceC4077dl interfaceC4077dl, F7 f7, InterfaceC2580Vr0 interfaceC2580Vr0, InterfaceC1560Mc0 interfaceC1560Mc0, InterfaceC8993vH interfaceC8993vH, InterfaceC8246se0 interfaceC8246se0, VM vm, Iterable iterable, C0560Co0 c0560Co0, InterfaceC2061Qs interfaceC2061Qs, Z2 z2, InterfaceC2280Su0 interfaceC2280Su0, C6763nJ c6763nJ, InterfaceC2668Wn0 interfaceC2668Wn0, LM0 lm0, List list, ZG zg) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC2968Zk0, "moduleDescriptor");
        G10.g(aa, "configuration");
        G10.g(interfaceC4077dl, "classDataFinder");
        G10.g(f7, "annotationAndConstantLoader");
        G10.g(interfaceC2580Vr0, "packageFragmentProvider");
        G10.g(interfaceC1560Mc0, "localClassifierTypeSettings");
        G10.g(interfaceC8993vH, "errorReporter");
        G10.g(interfaceC8246se0, "lookupTracker");
        G10.g(vm, "flexibleTypeDeserializer");
        G10.g(iterable, "fictitiousClassDescriptorFactories");
        G10.g(c0560Co0, "notFoundClasses");
        G10.g(interfaceC2061Qs, "contractDeserializer");
        G10.g(z2, "additionalClassPartsProvider");
        G10.g(interfaceC2280Su0, "platformDependentDeclarationFilter");
        G10.g(c6763nJ, "extensionRegistryLite");
        G10.g(interfaceC2668Wn0, "kotlinTypeChecker");
        G10.g(lm0, "samConversionResolver");
        G10.g(list, "typeAttributeTranslators");
        G10.g(zg, "enumEntriesDeserializationSupport");
        this.a = interfaceC10174zX0;
        this.b = interfaceC2968Zk0;
        this.c = aa;
        this.d = interfaceC4077dl;
        this.e = f7;
        this.f = interfaceC2580Vr0;
        this.g = interfaceC1560Mc0;
        this.h = interfaceC8993vH;
        this.i = interfaceC8246se0;
        this.j = vm;
        this.k = iterable;
        this.l = c0560Co0;
        this.m = interfaceC2061Qs;
        this.n = z2;
        this.o = interfaceC2280Su0;
        this.p = c6763nJ;
        this.q = interfaceC2668Wn0;
        this.r = lm0;
        this.s = list;
        this.t = zg;
        this.u = new C6328ll(this);
    }

    public final BA a(InterfaceC2372Tr0 interfaceC2372Tr0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, C10202zd1 c10202zd1, AbstractC1156If abstractC1156If, WA wa) {
        G10.g(interfaceC2372Tr0, "descriptor");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        G10.g(c10202zd1, "versionRequirementTable");
        G10.g(abstractC1156If, "metadataVersion");
        return new BA(this, interfaceC2664Wm0, interfaceC2372Tr0, b81, c10202zd1, abstractC1156If, wa, null, AbstractC1599Mm.k());
    }

    public final InterfaceC4923gl b(C6607ml c6607ml) {
        G10.g(c6607ml, "classId");
        return C6328ll.f(this.u, c6607ml, null, 2, null);
    }

    public final Z2 c() {
        return this.n;
    }

    public final F7 d() {
        return this.e;
    }

    public final InterfaceC4077dl e() {
        return this.d;
    }

    public final C6328ll f() {
        return this.u;
    }

    public final AA g() {
        return this.c;
    }

    public final InterfaceC2061Qs h() {
        return this.m;
    }

    public final ZG i() {
        return this.t;
    }

    public final InterfaceC8993vH j() {
        return this.h;
    }

    public final C6763nJ k() {
        return this.p;
    }

    public final Iterable l() {
        return this.k;
    }

    public final VM m() {
        return this.j;
    }

    public final InterfaceC2668Wn0 n() {
        return this.q;
    }

    public final InterfaceC1560Mc0 o() {
        return this.g;
    }

    public final InterfaceC8246se0 p() {
        return this.i;
    }

    public final InterfaceC2968Zk0 q() {
        return this.b;
    }

    public final C0560Co0 r() {
        return this.l;
    }

    public final InterfaceC2580Vr0 s() {
        return this.f;
    }

    public final InterfaceC2280Su0 t() {
        return this.o;
    }

    public final InterfaceC10174zX0 u() {
        return this.a;
    }

    public final List v() {
        return this.s;
    }

    public /* synthetic */ C9523xA(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, AA aa, InterfaceC4077dl interfaceC4077dl, F7 f7, InterfaceC2580Vr0 interfaceC2580Vr0, InterfaceC1560Mc0 interfaceC1560Mc0, InterfaceC8993vH interfaceC8993vH, InterfaceC8246se0 interfaceC8246se0, VM vm, Iterable iterable, C0560Co0 c0560Co0, InterfaceC2061Qs interfaceC2061Qs, Z2 z2, InterfaceC2280Su0 interfaceC2280Su0, C6763nJ c6763nJ, InterfaceC2668Wn0 interfaceC2668Wn0, LM0 lm0, List list, ZG zg, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC10174zX0, interfaceC2968Zk0, aa, interfaceC4077dl, f7, interfaceC2580Vr0, interfaceC1560Mc0, interfaceC8993vH, interfaceC8246se0, vm, iterable, c0560Co0, interfaceC2061Qs, (i & 8192) != 0 ? Z2.a.a : z2, (i & 16384) != 0 ? InterfaceC2280Su0.a.a : interfaceC2280Su0, c6763nJ, (65536 & i) != 0 ? InterfaceC2668Wn0.b.a() : interfaceC2668Wn0, lm0, (262144 & i) != 0 ? AbstractC1496Lm.e(C6668my.a) : list, (i & 524288) != 0 ? ZG.a.a : zg);
    }
}
