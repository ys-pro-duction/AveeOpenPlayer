package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0860Fj {

    /* JADX INFO: renamed from: com.daaw.Fj$a */
    public static final class a extends AbstractC1024Gy {
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC8392t81 abstractC8392t81, boolean z) {
            super(abstractC8392t81);
            this.d = z;
        }

        @Override // com.daaw.AbstractC8392t81
        public boolean b() {
            return this.d;
        }

        @Override // com.daaw.AbstractC1024Gy, com.daaw.AbstractC8392t81
        public InterfaceC6440m81 e(I80 i80) {
            G10.g(i80, SubscriberAttributeKt.JSON_NAME_KEY);
            InterfaceC6440m81 interfaceC6440m81E = super.e(i80);
            if (interfaceC6440m81E == null) {
                return null;
            }
            InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
            return AbstractC0860Fj.c(interfaceC6440m81E, interfaceC10240zlC instanceof Z71 ? (Z71) interfaceC10240zlC : null);
        }
    }

    public static final InterfaceC6440m81 c(InterfaceC6440m81 interfaceC6440m81, Z71 z71) {
        if (z71 == null || interfaceC6440m81.b() == EnumC1042Hc1.F) {
            return interfaceC6440m81;
        }
        if (z71.o() != interfaceC6440m81.b()) {
            return new C6998o81(e(interfaceC6440m81));
        }
        if (!interfaceC6440m81.c()) {
            return new C6998o81(interfaceC6440m81.getType());
        }
        InterfaceC10174zX0 interfaceC10174zX0 = C9085vd0.e;
        G10.f(interfaceC10174zX0, "NO_LOCKS");
        return new C6998o81(new C8231sb0(interfaceC10174zX0, new C0756Ej(interfaceC6440m81)));
    }

    public static final I80 d(InterfaceC6440m81 interfaceC6440m81) {
        G10.g(interfaceC6440m81, "$this_createCapturedIfNeeded");
        I80 type = interfaceC6440m81.getType();
        G10.f(type, "getType(...)");
        return type;
    }

    public static final I80 e(InterfaceC6440m81 interfaceC6440m81) {
        G10.g(interfaceC6440m81, "typeProjection");
        return new C10230zj(interfaceC6440m81, null, false, null, 14, null);
    }

    public static final boolean f(I80 i80) {
        G10.g(i80, "<this>");
        return i80.N0() instanceof InterfaceC0539Cj;
    }

    public static final AbstractC8392t81 g(AbstractC8392t81 abstractC8392t81, boolean z) {
        G10.g(abstractC8392t81, "<this>");
        if (!(abstractC8392t81 instanceof C8221sZ)) {
            return new a(abstractC8392t81, z);
        }
        C8221sZ c8221sZ = (C8221sZ) abstractC8392t81;
        Z71[] z71ArrJ = c8221sZ.j();
        List<C0576Cs0> listW0 = AbstractC5431ib.w0(c8221sZ.i(), c8221sZ.j());
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listW0, 10));
        for (C0576Cs0 c0576Cs0 : listW0) {
            arrayList.add(c((InterfaceC6440m81) c0576Cs0.c(), (Z71) c0576Cs0.d()));
        }
        return new C8221sZ(z71ArrJ, (InterfaceC6440m81[]) arrayList.toArray(new InterfaceC6440m81[0]), z);
    }

    public static /* synthetic */ AbstractC8392t81 h(AbstractC8392t81 abstractC8392t81, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return g(abstractC8392t81, z);
    }
}
