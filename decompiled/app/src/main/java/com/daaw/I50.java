package com.daaw;

import com.daaw.C60;
import com.daaw.W60;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class I50 {
    public static final boolean a(InterfaceC9220w50 interfaceC9220w50) {
        InterfaceC2231Si interfaceC2231SiR;
        G10.g(interfaceC9220w50, "<this>");
        if (interfaceC9220w50 instanceof C60) {
            W60 w60 = (W60) interfaceC9220w50;
            Field fieldB = AbstractC3664cG0.b(w60);
            if (fieldB != null ? fieldB.isAccessible() : true) {
                Method methodC = AbstractC3664cG0.c(w60);
                if (methodC != null ? methodC.isAccessible() : true) {
                    Method methodE = AbstractC3664cG0.e((C60) interfaceC9220w50);
                    if (methodE != null ? methodE.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (interfaceC9220w50 instanceof W60) {
            W60 w602 = (W60) interfaceC9220w50;
            Field fieldB2 = AbstractC3664cG0.b(w602);
            if (fieldB2 != null ? fieldB2.isAccessible() : true) {
                Method methodC2 = AbstractC3664cG0.c(w602);
                if (methodC2 != null ? methodC2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (interfaceC9220w50 instanceof W60.b) {
            Field fieldB3 = AbstractC3664cG0.b(((W60.b) interfaceC9220w50).m());
            if (fieldB3 != null ? fieldB3.isAccessible() : true) {
                Method methodD = AbstractC3664cG0.d((InterfaceC8381t60) interfaceC9220w50);
                if (methodD != null ? methodD.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (interfaceC9220w50 instanceof C60.a) {
            Field fieldB4 = AbstractC3664cG0.b(((C60.a) interfaceC9220w50).m());
            if (fieldB4 != null ? fieldB4.isAccessible() : true) {
                Method methodD2 = AbstractC3664cG0.d((InterfaceC8381t60) interfaceC9220w50);
                if (methodD2 != null ? methodD2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(interfaceC9220w50 instanceof InterfaceC8381t60)) {
            throw new UnsupportedOperationException("Unknown callable: " + interfaceC9220w50 + " (" + interfaceC9220w50.getClass() + ')');
        }
        InterfaceC8381t60 interfaceC8381t60 = (InterfaceC8381t60) interfaceC9220w50;
        Method methodD3 = AbstractC3664cG0.d(interfaceC8381t60);
        if (methodD3 != null ? methodD3.isAccessible() : true) {
            H50 h50B = AbstractC8511tb1.b(interfaceC9220w50);
            Member memberB = (h50B == null || (interfaceC2231SiR = h50B.R()) == null) ? null : interfaceC2231SiR.b();
            AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorA = AbstractC3664cG0.a(interfaceC8381t60);
                if (constructorA != null ? constructorA.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }
}
