package com.daaw;

import kotlin.Metadata;

/* JADX INFO: renamed from: com.daaw.hG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5068hG0 {

    /* JADX INFO: renamed from: com.daaw.hG0$a */
    public /* synthetic */ class a extends AbstractC9312wR implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "loadFunction";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(C3511bj0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final IS0 invoke(C3511bj0 c3511bj0, CA0 ca0) {
            G10.g(c3511bj0, "p0");
            G10.g(ca0, "p1");
            return c3511bj0.s(ca0);
        }
    }

    public static final InterfaceC8381t60 a(InterfaceC5390iR interfaceC5390iR) {
        G10.g(interfaceC5390iR, "<this>");
        Metadata metadata = (Metadata) interfaceC5390iR.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        C0576Cs0 c0576Cs0J = C7540q50.j(strArrD1, metadata.d2());
        C5019h50 c5019h50 = (C5019h50) c0576Cs0J.a();
        CA0 ca0 = (CA0) c0576Cs0J.b();
        C4740g50 c4740g50 = new C4740g50(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = interfaceC5390iR.getClass();
        NA0 na0Q0 = ca0.q0();
        G10.f(na0Q0, "getTypeTable(...)");
        return new C9504x60(C5623jG.E, (IS0) AbstractC8511tb1.h(cls, ca0, c5019h50, new B81(na0Q0), c4740g50, a.B));
    }
}
