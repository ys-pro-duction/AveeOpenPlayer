package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.l60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6150l60 {

    /* JADX INFO: renamed from: com.daaw.l60$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[D70.values().length];
            try {
                iArr[D70.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D70.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D70.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final YS0 a(C8387t71 c8387t71, C71 c71, List list, boolean z) {
        AbstractC6719n81 c3450bW0;
        List parameters = c71.getParameters();
        G10.f(parameters, "getParameters(...)");
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            B70 b70 = (B70) obj;
            C9230w70 c9230w70 = (C9230w70) b70.c();
            I80 i80W = c9230w70 != null ? c9230w70.w() : null;
            D70 d70D = b70.d();
            int i3 = d70D == null ? -1 : a.a[d70D.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters.get(i);
                G10.f(obj2, "get(...)");
                c3450bW0 = new C3450bW0((Z71) obj2);
            } else if (i3 == 1) {
                EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.F;
                G10.d(i80W);
                c3450bW0 = new C6998o81(enumC1042Hc1, i80W);
            } else if (i3 == 2) {
                EnumC1042Hc1 enumC1042Hc12 = EnumC1042Hc1.G;
                G10.d(i80W);
                c3450bW0 = new C6998o81(enumC1042Hc12, i80W);
            } else {
                if (i3 != 3) {
                    throw new C6902no0();
                }
                EnumC1042Hc1 enumC1042Hc13 = EnumC1042Hc1.H;
                G10.d(i80W);
                c3450bW0 = new C6998o81(enumC1042Hc13, i80W);
            }
            arrayList.add(c3450bW0);
            i = i2;
        }
        return M80.k(c8387t71, c71, arrayList, z, null, 16, null);
    }

    public static final InterfaceC7550q70 b(InterfaceC5580j60 interfaceC5580j60, List list, boolean z, List list2) {
        InterfaceC10240zl interfaceC10240zlE;
        G10.g(interfaceC5580j60, "<this>");
        G10.g(list, "arguments");
        G10.g(list2, "annotations");
        LQ lq = null;
        byte b = 0;
        InterfaceC5862k60 interfaceC5862k60 = interfaceC5580j60 instanceof InterfaceC5862k60 ? (InterfaceC5862k60) interfaceC5580j60 : null;
        if (interfaceC5862k60 == null || (interfaceC10240zlE = interfaceC5862k60.e()) == null) {
            throw new E80("Cannot create type for an unsupported classifier: " + interfaceC5580j60 + " (" + interfaceC5580j60.getClass() + ')');
        }
        C71 c71K = interfaceC10240zlE.k();
        G10.f(c71K, "getTypeConstructor(...)");
        List parameters = c71K.getParameters();
        G10.f(parameters, "getParameters(...)");
        if (parameters.size() == list.size()) {
            return new C9230w70(a(list2.isEmpty() ? C8387t71.C.j() : C8387t71.C.j(), c71K, list, z), lq, 2, b == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
    }
}
