package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3271ar {
    public static final C3271ar a = new C3271ar();

    public static final I80 d(EnumC8067rz0 enumC8067rz0, InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(enumC8067rz0, "$componentType");
        G10.g(interfaceC2968Zk0, "it");
        YS0 ys0O = interfaceC2968Zk0.p().O(enumC8067rz0);
        G10.f(ys0O, "getPrimitiveArrayKotlinType(...)");
        return ys0O;
    }

    public static /* synthetic */ AbstractC2887Yq f(C3271ar c3271ar, Object obj, InterfaceC2968Zk0 interfaceC2968Zk0, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC2968Zk0 = null;
        }
        return c3271ar.e(obj, interfaceC2968Zk0);
    }

    public final C4027db b(List list, I80 i80) {
        G10.g(list, "value");
        G10.g(i80, "type");
        return new O81(list, i80);
    }

    public final C4027db c(List list, InterfaceC2968Zk0 interfaceC2968Zk0, EnumC8067rz0 enumC8067rz0) {
        List listM0 = AbstractC2455Um.M0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            AbstractC2887Yq abstractC2887YqF = f(this, it.next(), null, 2, null);
            if (abstractC2887YqF != null) {
                arrayList.add(abstractC2887YqF);
            }
        }
        if (interfaceC2968Zk0 == null) {
            return new C4027db(arrayList, new C2991Zq(enumC8067rz0));
        }
        YS0 ys0O = interfaceC2968Zk0.p().O(enumC8067rz0);
        G10.f(ys0O, "getPrimitiveArrayKotlinType(...)");
        return new O81(arrayList, ys0O);
    }

    public final AbstractC2887Yq e(Object obj, InterfaceC2968Zk0 interfaceC2968Zk0) {
        if (obj instanceof Byte) {
            return new C5187hi(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new WR0(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new L00(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C7410pe0(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C9677xk(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C5654jN(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C5611jD(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C6582mg(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C7103oY0((String) obj);
        }
        if (obj instanceof byte[]) {
            return c(AbstractC5431ib.b0((byte[]) obj), interfaceC2968Zk0, EnumC8067rz0.J);
        }
        if (obj instanceof short[]) {
            return c(AbstractC5431ib.i0((short[]) obj), interfaceC2968Zk0, EnumC8067rz0.K);
        }
        if (obj instanceof int[]) {
            return c(AbstractC5431ib.f0((int[]) obj), interfaceC2968Zk0, EnumC8067rz0.L);
        }
        if (obj instanceof long[]) {
            return c(AbstractC5431ib.g0((long[]) obj), interfaceC2968Zk0, EnumC8067rz0.N);
        }
        if (obj instanceof char[]) {
            return c(AbstractC5431ib.c0((char[]) obj), interfaceC2968Zk0, EnumC8067rz0.I);
        }
        if (obj instanceof float[]) {
            return c(AbstractC5431ib.e0((float[]) obj), interfaceC2968Zk0, EnumC8067rz0.M);
        }
        if (obj instanceof double[]) {
            return c(AbstractC5431ib.d0((double[]) obj), interfaceC2968Zk0, EnumC8067rz0.O);
        }
        if (obj instanceof boolean[]) {
            return c(AbstractC5431ib.j0((boolean[]) obj), interfaceC2968Zk0, EnumC8067rz0.H);
        }
        if (obj == null) {
            return new C2568Vo0();
        }
        return null;
    }
}
