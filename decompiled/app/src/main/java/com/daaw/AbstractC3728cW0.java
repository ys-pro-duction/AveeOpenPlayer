package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3728cW0 {

    /* JADX INFO: renamed from: com.daaw.cW0$a */
    public static final class a extends E71 {
        public final /* synthetic */ List d;

        public a(List list) {
            this.d = list;
        }

        @Override // com.daaw.E71
        public InterfaceC6440m81 k(C71 c71) {
            G10.g(c71, SubscriberAttributeKt.JSON_NAME_KEY);
            if (!this.d.contains(c71)) {
                return null;
            }
            InterfaceC10240zl interfaceC10240zlC = c71.c();
            G10.e(interfaceC10240zlC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return D81.s((Z71) interfaceC10240zlC);
        }
    }

    public static final I80 a(List list, List list2, AbstractC8670u80 abstractC8670u80) {
        I80 i80P = C8957v81.g(new a(list)).p((I80) AbstractC2455Um.e0(list2), EnumC1042Hc1.H);
        if (i80P != null) {
            return i80P;
        }
        YS0 ys0Y = abstractC8670u80.y();
        G10.f(ys0Y, "getDefaultBound(...)");
        return ys0Y;
    }

    public static final I80 b(Z71 z71) {
        G10.g(z71, "<this>");
        InterfaceC8612tw interfaceC8612twB = z71.b();
        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
        if (interfaceC8612twB instanceof InterfaceC0339Al) {
            List parameters = ((InterfaceC0339Al) interfaceC8612twB).k().getParameters();
            G10.f(parameters, "getParameters(...)");
            List list = parameters;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Z71) it.next()).k());
            }
            List upperBounds = z71.getUpperBounds();
            G10.f(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, AbstractC8400tA.m(z71));
        }
        if (!(interfaceC8612twB instanceof InterfaceC8468tR)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((InterfaceC8468tR) interfaceC8612twB).getTypeParameters();
        G10.f(typeParameters, "getTypeParameters(...)");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Z71) it2.next()).k());
        }
        List upperBounds2 = z71.getUpperBounds();
        G10.f(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, AbstractC8400tA.m(z71));
    }
}
