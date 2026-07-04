package com.daaw;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class C70 {
    public static final J50 a(InterfaceC5580j60 interfaceC5580j60) {
        Object obj;
        J50 j50B;
        G10.g(interfaceC5580j60, "<this>");
        if (interfaceC5580j60 instanceof J50) {
            return (J50) interfaceC5580j60;
        }
        if (!(interfaceC5580j60 instanceof InterfaceC9509x70)) {
            throw new E80("Cannot calculate JVM erasure for type: " + interfaceC5580j60);
        }
        List upperBounds = ((InterfaceC9509x70) interfaceC5580j60).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC7550q70 interfaceC7550q70 = (InterfaceC7550q70) next;
            G10.e(interfaceC7550q70, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC10240zl interfaceC10240zlC = ((C9230w70) interfaceC7550q70).w().N0().c();
            InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
            if (interfaceC4923gl != null && interfaceC4923gl.i() != EnumC6886nl.D && interfaceC4923gl.i() != EnumC6886nl.G) {
                obj = next;
                break;
            }
        }
        InterfaceC7550q70 interfaceC7550q702 = (InterfaceC7550q70) obj;
        if (interfaceC7550q702 == null) {
            interfaceC7550q702 = (InterfaceC7550q70) AbstractC2455Um.g0(upperBounds);
        }
        return (interfaceC7550q702 == null || (j50B = b(interfaceC7550q702)) == null) ? AbstractC5624jG0.b(Object.class) : j50B;
    }

    public static final J50 b(InterfaceC7550q70 interfaceC7550q70) {
        J50 j50A;
        G10.g(interfaceC7550q70, "<this>");
        InterfaceC5580j60 interfaceC5580j60J = interfaceC7550q70.j();
        if (interfaceC5580j60J != null && (j50A = a(interfaceC5580j60J)) != null) {
            return j50A;
        }
        throw new E80("Cannot calculate JVM erasure for type: " + interfaceC7550q70);
    }
}
