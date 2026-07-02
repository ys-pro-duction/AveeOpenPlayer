package com.daaw;

import com.daaw.InterfaceC1583Mi;

/* JADX INFO: renamed from: com.daaw.wA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9244wA {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(InterfaceC1583Mi interfaceC1583Mi) {
        InterfaceC3401bK interfaceC3401bKN0;
        if (interfaceC1583Mi == null) {
            a(3);
        }
        if ((interfaceC1583Mi instanceof InterfaceC4476fA0) && (interfaceC3401bKN0 = ((InterfaceC4476fA0) interfaceC1583Mi).n0()) != null && interfaceC3401bKN0.getAnnotations().z(C10052z40.b)) {
            return true;
        }
        return interfaceC1583Mi.getAnnotations().z(C10052z40.b);
    }

    public static boolean c(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(1);
        }
        return AbstractC7006oA.x(interfaceC8612tw) && AbstractC7006oA.w(interfaceC8612tw.b()) && !d((InterfaceC4923gl) interfaceC8612tw);
    }

    public static boolean d(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(2);
        }
        return AbstractC0772En.a(C0668Dn.a, interfaceC4923gl);
    }

    public static boolean e(InterfaceC4476fA0 interfaceC4476fA0) {
        if (interfaceC4476fA0 == null) {
            a(0);
        }
        if (interfaceC4476fA0.i() == InterfaceC1583Mi.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(interfaceC4476fA0.b())) {
            return true;
        }
        return AbstractC7006oA.x(interfaceC4476fA0.b()) && b(interfaceC4476fA0);
    }
}
