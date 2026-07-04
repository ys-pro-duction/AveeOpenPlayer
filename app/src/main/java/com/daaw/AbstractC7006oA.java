package com.daaw;

import com.daaw.InterfaceC1583Mi;
import com.google.ads.AdSize;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.oA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7006oA {
    public static final AP a = new AP("kotlin.jvm.JvmName");

    public static boolean A(InterfaceC8612tw interfaceC8612tw) {
        return D(interfaceC8612tw, EnumC6886nl.E);
    }

    public static boolean B(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(36);
        }
        return D(interfaceC8612tw, EnumC6886nl.F);
    }

    public static boolean C(InterfaceC8612tw interfaceC8612tw) {
        return D(interfaceC8612tw, EnumC6886nl.D);
    }

    public static boolean D(InterfaceC8612tw interfaceC8612tw, EnumC6886nl enumC6886nl) {
        if (enumC6886nl == null) {
            a(37);
        }
        return (interfaceC8612tw instanceof InterfaceC4923gl) && ((InterfaceC4923gl) interfaceC8612tw).i() == enumC6886nl;
    }

    public static boolean E(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(1);
        }
        while (interfaceC8612tw != null) {
            if (u(interfaceC8612tw) || y(interfaceC8612tw)) {
                return true;
            }
            interfaceC8612tw = interfaceC8612tw.b();
        }
        return false;
    }

    public static boolean F(I80 i80, InterfaceC8612tw interfaceC8612tw) {
        if (i80 == null) {
            a(30);
        }
        if (interfaceC8612tw == null) {
            a(31);
        }
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC == null) {
            return false;
        }
        InterfaceC8612tw interfaceC8612twA = interfaceC10240zlC.a();
        return (interfaceC8612twA instanceof InterfaceC10240zl) && (interfaceC8612tw instanceof InterfaceC10240zl) && ((InterfaceC10240zl) interfaceC8612tw).k().equals(((InterfaceC10240zl) interfaceC8612twA).k());
    }

    public static boolean G(InterfaceC8612tw interfaceC8612tw) {
        return (D(interfaceC8612tw, EnumC6886nl.C) || D(interfaceC8612tw, EnumC6886nl.D)) && ((InterfaceC4923gl) interfaceC8612tw).l() == EnumC0336Ak0.D;
    }

    public static boolean H(InterfaceC4923gl interfaceC4923gl, InterfaceC4923gl interfaceC4923gl2) {
        if (interfaceC4923gl == null) {
            a(28);
        }
        if (interfaceC4923gl2 == null) {
            a(29);
        }
        return I(interfaceC4923gl.s(), interfaceC4923gl2.a());
    }

    public static boolean I(I80 i80, InterfaceC8612tw interfaceC8612tw) {
        if (i80 == null) {
            a(32);
        }
        if (interfaceC8612tw == null) {
            a(33);
        }
        if (F(i80, interfaceC8612tw)) {
            return true;
        }
        Iterator it = i80.N0().b().iterator();
        while (it.hasNext()) {
            if (I((I80) it.next(), interfaceC8612tw)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(InterfaceC8612tw interfaceC8612tw) {
        return interfaceC8612tw != null && (interfaceC8612tw.b() instanceof InterfaceC2372Tr0);
    }

    public static boolean K(InterfaceC0626Dc1 interfaceC0626Dc1, I80 i80) {
        if (interfaceC0626Dc1 == null) {
            a(66);
        }
        if (i80 == null) {
            a(67);
        }
        if (interfaceC0626Dc1.f0() || N80.a(i80)) {
            return false;
        }
        if (D81.b(i80)) {
            return true;
        }
        AbstractC8670u80 abstractC8670u80M = AbstractC8400tA.m(interfaceC0626Dc1);
        if (!AbstractC8670u80.s0(i80)) {
            J80 j80 = J80.a;
            if (!j80.d(abstractC8670u80M.W(), i80) && !j80.d(abstractC8670u80M.K().s(), i80) && !j80.d(abstractC8670u80M.i(), i80) && !C4302ea1.d(i80)) {
                return false;
            }
        }
        return true;
    }

    public static InterfaceC1583Mi L(InterfaceC1583Mi interfaceC1583Mi) {
        if (interfaceC1583Mi == null) {
            a(59);
        }
        while (interfaceC1583Mi.i() == InterfaceC1583Mi.a.FAKE_OVERRIDE) {
            Collection collectionE = interfaceC1583Mi.e();
            if (collectionE.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC1583Mi);
            }
            interfaceC1583Mi = (InterfaceC1583Mi) collectionE.iterator().next();
        }
        return interfaceC1583Mi;
    }

    public static InterfaceC0383Aw M(InterfaceC0383Aw interfaceC0383Aw) {
        if (interfaceC0383Aw == null) {
            a(64);
        }
        if (interfaceC0383Aw instanceof InterfaceC1583Mi) {
            return L((InterfaceC1583Mi) interfaceC0383Aw);
        }
        if (interfaceC0383Aw == null) {
            a(65);
        }
        return interfaceC0383Aw;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[0] = "second";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case AdSize.LARGE_AD_HEIGHT /* 90 */:
            case ModuleDescriptor.MODULE_VERSION /* 92 */:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[2] = "areInSameModule";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case AdSize.LARGE_AD_HEIGHT /* 90 */:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 92 */:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2) {
        if (interfaceC8612tw == null) {
            a(16);
        }
        if (interfaceC8612tw2 == null) {
            a(17);
        }
        return g(interfaceC8612tw).equals(g(interfaceC8612tw2));
    }

    public static void c(InterfaceC1376Ki interfaceC1376Ki, Set set) {
        if (interfaceC1376Ki == null) {
            a(73);
        }
        if (set == null) {
            a(74);
        }
        if (set.contains(interfaceC1376Ki)) {
            return;
        }
        Iterator it = interfaceC1376Ki.a().e().iterator();
        while (it.hasNext()) {
            InterfaceC1376Ki interfaceC1376KiA = ((InterfaceC1376Ki) it.next()).a();
            c(interfaceC1376KiA, set);
            set.add(interfaceC1376KiA);
        }
    }

    public static Set d(InterfaceC1376Ki interfaceC1376Ki) {
        if (interfaceC1376Ki == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(interfaceC1376Ki.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static InterfaceC4923gl e(I80 i80) {
        if (i80 == null) {
            a(45);
        }
        return f(i80.N0());
    }

    public static InterfaceC4923gl f(C71 c71) {
        if (c71 == null) {
            a(46);
        }
        InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) c71.c();
        if (interfaceC4923gl == null) {
            a(47);
        }
        return interfaceC4923gl;
    }

    public static InterfaceC2968Zk0 g(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(21);
        }
        InterfaceC2968Zk0 interfaceC2968Zk0H = h(interfaceC8612tw);
        if (interfaceC2968Zk0H == null) {
            a(22);
        }
        return interfaceC2968Zk0H;
    }

    public static InterfaceC2968Zk0 h(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(23);
        }
        while (interfaceC8612tw != null) {
            if (interfaceC8612tw instanceof InterfaceC2968Zk0) {
                return (InterfaceC2968Zk0) interfaceC8612tw;
            }
            if (interfaceC8612tw instanceof InterfaceC5516is0) {
                return ((InterfaceC5516is0) interfaceC8612tw).t0();
            }
            interfaceC8612tw = interfaceC8612tw.b();
        }
        return null;
    }

    public static InterfaceC2968Zk0 i(I80 i80) {
        if (i80 == null) {
            a(20);
        }
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC == null) {
            return null;
        }
        return h(interfaceC10240zlC);
    }

    public static SU0 j(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(82);
        }
        if (interfaceC8612tw instanceof InterfaceC7565qA0) {
            interfaceC8612tw = ((InterfaceC7565qA0) interfaceC8612tw).A0();
        }
        if (interfaceC8612tw instanceof InterfaceC10293zw) {
            SU0 su0A = ((InterfaceC10293zw) interfaceC8612tw).j().a();
            if (su0A == null) {
                a(83);
            }
            return su0A;
        }
        SU0 su0 = SU0.a;
        if (su0 == null) {
            a(84);
        }
        return su0;
    }

    public static AbstractC8965vA k(InterfaceC4923gl interfaceC4923gl, boolean z) {
        if (interfaceC4923gl == null) {
            a(48);
        }
        EnumC6886nl enumC6886nlI = interfaceC4923gl.i();
        if (enumC6886nlI == EnumC6886nl.E || enumC6886nlI.c()) {
            AbstractC8965vA abstractC8965vA = AbstractC8679uA.a;
            if (abstractC8965vA == null) {
                a(49);
            }
            return abstractC8965vA;
        }
        if (G(interfaceC4923gl)) {
            if (z) {
                AbstractC8965vA abstractC8965vA2 = AbstractC8679uA.c;
                if (abstractC8965vA2 == null) {
                    a(50);
                }
                return abstractC8965vA2;
            }
            AbstractC8965vA abstractC8965vA3 = AbstractC8679uA.a;
            if (abstractC8965vA3 == null) {
                a(51);
            }
            return abstractC8965vA3;
        }
        if (u(interfaceC4923gl)) {
            AbstractC8965vA abstractC8965vA4 = AbstractC8679uA.l;
            if (abstractC8965vA4 == null) {
                a(52);
            }
            return abstractC8965vA4;
        }
        AbstractC8965vA abstractC8965vA5 = AbstractC8679uA.e;
        if (abstractC8965vA5 == null) {
            a(53);
        }
        return abstractC8965vA5;
    }

    public static RE0 l(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(0);
        }
        if (interfaceC8612tw instanceof InterfaceC4923gl) {
            return ((InterfaceC4923gl) interfaceC8612tw).J0();
        }
        return null;
    }

    public static BP m(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(2);
        }
        AP apO = o(interfaceC8612tw);
        return apO != null ? apO.j() : p(interfaceC8612tw);
    }

    public static AP n(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(3);
        }
        AP apO = o(interfaceC8612tw);
        if (apO == null) {
            apO = p(interfaceC8612tw).l();
        }
        if (apO == null) {
            a(4);
        }
        return apO;
    }

    public static AP o(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(5);
        }
        if ((interfaceC8612tw instanceof InterfaceC2968Zk0) || BH.m(interfaceC8612tw)) {
            return AP.c;
        }
        if (interfaceC8612tw instanceof InterfaceC5516is0) {
            return ((InterfaceC5516is0) interfaceC8612tw).d();
        }
        if (interfaceC8612tw instanceof InterfaceC2372Tr0) {
            return ((InterfaceC2372Tr0) interfaceC8612tw).d();
        }
        return null;
    }

    public static BP p(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(6);
        }
        BP bpC = m(interfaceC8612tw.b()).c(interfaceC8612tw.getName());
        if (bpC == null) {
            a(7);
        }
        return bpC;
    }

    public static InterfaceC8612tw q(InterfaceC8612tw interfaceC8612tw, Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(interfaceC8612tw, cls, true);
    }

    public static InterfaceC8612tw r(InterfaceC8612tw interfaceC8612tw, Class cls, boolean z) {
        if (cls == null) {
            a(19);
        }
        if (interfaceC8612tw == null) {
            return null;
        }
        if (z) {
            interfaceC8612tw = interfaceC8612tw.b();
        }
        while (interfaceC8612tw != null) {
            if (cls.isInstance(interfaceC8612tw)) {
                return interfaceC8612tw;
            }
            interfaceC8612tw = interfaceC8612tw.b();
        }
        return null;
    }

    public static InterfaceC4923gl s(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(44);
        }
        Iterator it = interfaceC4923gl.k().b().iterator();
        while (it.hasNext()) {
            InterfaceC4923gl interfaceC4923glE = e((I80) it.next());
            if (interfaceC4923glE.i() != EnumC6886nl.D) {
                return interfaceC4923glE;
            }
        }
        return null;
    }

    public static boolean t(InterfaceC8612tw interfaceC8612tw) {
        return D(interfaceC8612tw, EnumC6886nl.G);
    }

    public static boolean u(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(34);
        }
        return v(interfaceC8612tw) && interfaceC8612tw.getName().equals(C7091oV0.b);
    }

    public static boolean v(InterfaceC8612tw interfaceC8612tw) {
        return D(interfaceC8612tw, EnumC6886nl.C);
    }

    public static boolean w(InterfaceC8612tw interfaceC8612tw) {
        return v(interfaceC8612tw) || A(interfaceC8612tw);
    }

    public static boolean x(InterfaceC8612tw interfaceC8612tw) {
        return D(interfaceC8612tw, EnumC6886nl.H) && ((InterfaceC4923gl) interfaceC8612tw).x();
    }

    public static boolean y(InterfaceC8612tw interfaceC8612tw) {
        return (interfaceC8612tw instanceof InterfaceC0383Aw) && ((InterfaceC0383Aw) interfaceC8612tw).getVisibility() == AbstractC8679uA.f;
    }

    public static boolean z(InterfaceC4923gl interfaceC4923gl, InterfaceC4923gl interfaceC4923gl2) {
        if (interfaceC4923gl == null) {
            a(26);
        }
        if (interfaceC4923gl2 == null) {
            a(27);
        }
        Iterator it = interfaceC4923gl.k().b().iterator();
        while (it.hasNext()) {
            if (F((I80) it.next(), interfaceC4923gl2.a())) {
                return true;
            }
        }
        return false;
    }
}
