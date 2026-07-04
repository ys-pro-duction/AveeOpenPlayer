package com.daaw;

import com.daaw.InterfaceC2280Su0;
import com.daaw.YV0;
import com.daaw.Z2;
import com.google.ads.AdSize;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.u80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8670u80 {
    public static final C2352Tm0 g = C2352Tm0.o("<built-ins module>");
    public C3799cl0 a;
    public InterfaceC0881Fo0 b;
    public final InterfaceC0881Fo0 c;
    public final InterfaceC0881Fo0 d;
    public final InterfaceC5471ij0 e;
    public final InterfaceC10174zX0 f;

    /* JADX INFO: renamed from: com.daaw.u80$a */
    public class a implements LQ {
        public a() {
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            return Arrays.asList(AbstractC8670u80.this.r().r0(YV0.A), AbstractC8670u80.this.r().r0(YV0.C), AbstractC8670u80.this.r().r0(YV0.D), AbstractC8670u80.this.r().r0(YV0.B));
        }
    }

    /* JADX INFO: renamed from: com.daaw.u80$b */
    public class b implements LQ {
        public b() {
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(EnumC8067rz0.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (EnumC8067rz0 enumC8067rz0 : EnumC8067rz0.values()) {
                YS0 ys0Q = AbstractC8670u80.this.q(enumC8067rz0.o().c());
                YS0 ys0Q2 = AbstractC8670u80.this.q(enumC8067rz0.l().c());
                enumMap.put(enumC8067rz0, ys0Q2);
                map.put(ys0Q, ys0Q2);
                map2.put(ys0Q2, ys0Q);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.u80$c */
    public class c implements NQ {
        public c() {
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC4923gl invoke(C2352Tm0 c2352Tm0) {
            InterfaceC10240zl interfaceC10240zlG = AbstractC8670u80.this.s().g(c2352Tm0, EnumC5496io0.E);
            if (interfaceC10240zlG == null) {
                throw new AssertionError("Built-in class " + YV0.A.c(c2352Tm0) + " is not found");
            }
            if (interfaceC10240zlG instanceof InterfaceC4923gl) {
                return (InterfaceC4923gl) interfaceC10240zlG;
            }
            throw new AssertionError("Must be a class descriptor " + c2352Tm0 + ", but was " + interfaceC10240zlG);
        }
    }

    /* JADX INFO: renamed from: com.daaw.u80$d */
    public class d implements LQ {
        public final /* synthetic */ C3799cl0 B;

        public d(C3799cl0 c3799cl0) {
            this.B = c3799cl0;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (AbstractC8670u80.this.a == null) {
                AbstractC8670u80.this.a = this.B;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + AbstractC8670u80.this.a + " (attempting to reset to " + this.B + ")");
        }
    }

    /* JADX INFO: renamed from: com.daaw.u80$e */
    public static class e {
        public final Map a;
        public final Map b;
        public final Map c;

        public /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public e(Map map, Map map2, Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.a = map;
            this.b = map2;
            this.c = map3;
        }
    }

    public AbstractC8670u80(InterfaceC10174zX0 interfaceC10174zX0) {
        if (interfaceC10174zX0 == null) {
            a(0);
        }
        this.f = interfaceC10174zX0;
        this.d = interfaceC10174zX0.h(new a());
        this.c = interfaceC10174zX0.h(new b());
        this.e = interfaceC10174zX0.g(new c());
    }

    public static I80 A(I80 i80, InterfaceC2968Zk0 interfaceC2968Zk0) {
        C6607ml c6607mlN;
        C6607ml c6607mlA;
        InterfaceC4923gl interfaceC4923glB;
        if (i80 == null) {
            a(72);
        }
        if (interfaceC2968Zk0 == null) {
            a(73);
        }
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC == null) {
            return null;
        }
        C4302ea1 c4302ea1 = C4302ea1.a;
        if (!c4302ea1.b(interfaceC10240zlC.getName()) || (c6607mlN = AbstractC8400tA.n(interfaceC10240zlC)) == null || (c6607mlA = c4302ea1.a(c6607mlN)) == null || (interfaceC4923glB = AbstractC5366iL.b(interfaceC2968Zk0, c6607mlA)) == null) {
            return null;
        }
        return interfaceC4923glB.s();
    }

    public static boolean A0(I80 i80) {
        if (i80 == null) {
            a(130);
        }
        return i0(i80, YV0.a.I0.j());
    }

    public static boolean B0(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(10);
        }
        while (interfaceC8612tw != null) {
            if (interfaceC8612tw instanceof InterfaceC2372Tr0) {
                return ((InterfaceC2372Tr0) interfaceC8612tw).d().i(YV0.z);
            }
            interfaceC8612tw = interfaceC8612tw.b();
        }
        return false;
    }

    public static boolean C0(I80 i80) {
        if (i80 == null) {
            a(143);
        }
        return m0(i80, YV0.a.f);
    }

    public static boolean D0(I80 i80) {
        if (i80 == null) {
            a(133);
        }
        return x0(i80) || A0(i80) || y0(i80) || z0(i80);
    }

    public static EnumC8067rz0 N(I80 i80) {
        if (i80 == null) {
            a(93);
        }
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (interfaceC10240zlC == null) {
            return null;
        }
        return P(interfaceC10240zlC);
    }

    public static EnumC8067rz0 P(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(78);
        }
        if (YV0.a.M0.contains(interfaceC8612tw.getName())) {
            return (EnumC8067rz0) YV0.a.O0.get(AbstractC7006oA.m(interfaceC8612tw));
        }
        return null;
    }

    public static EnumC8067rz0 S(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(77);
        }
        if (YV0.a.L0.contains(interfaceC8612tw.getName())) {
            return (EnumC8067rz0) YV0.a.N0.get(AbstractC7006oA.m(interfaceC8612tw));
        }
        return null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case AdSize.LARGE_AD_HEIGHT /* 90 */:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 54:
            case 89:
            case 91:
            case ModuleDescriptor.MODULE_VERSION /* 92 */:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case AdSize.LARGE_AD_HEIGHT /* 90 */:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 92 */:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean a0(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(109);
        }
        return e(interfaceC4923gl, YV0.a.b);
    }

    public static boolean b0(I80 i80) {
        if (i80 == null) {
            a(140);
        }
        return h0(i80, YV0.a.b);
    }

    public static boolean c0(I80 i80) {
        if (i80 == null) {
            a(89);
        }
        return h0(i80, YV0.a.i);
    }

    public static boolean d0(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(90);
        }
        return e(interfaceC4923gl, YV0.a.i) || P(interfaceC4923gl) != null;
    }

    public static boolean e(InterfaceC10240zl interfaceC10240zl, BP bp) {
        if (interfaceC10240zl == null) {
            a(104);
        }
        if (bp == null) {
            a(105);
        }
        return interfaceC10240zl.getName().equals(bp.i()) && bp.equals(AbstractC7006oA.m(interfaceC10240zl));
    }

    public static boolean e0(I80 i80) {
        if (i80 == null) {
            a(91);
        }
        return c0(i80) || q0(i80);
    }

    public static boolean f0(I80 i80) {
        if (i80 == null) {
            a(111);
        }
        return i0(i80, YV0.a.j);
    }

    public static boolean g0(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(9);
        }
        return AbstractC7006oA.r(interfaceC8612tw, InterfaceC0748Eh.class, false) != null;
    }

    public static boolean h0(I80 i80, BP bp) {
        if (i80 == null) {
            a(98);
        }
        if (bp == null) {
            a(99);
        }
        return w0(i80.N0(), bp);
    }

    public static boolean i0(I80 i80, BP bp) {
        if (i80 == null) {
            a(135);
        }
        if (bp == null) {
            a(136);
        }
        return h0(i80, bp) && !i80.O0();
    }

    public static boolean j0(I80 i80) {
        if (i80 == null) {
            a(142);
        }
        return p0(i80);
    }

    public static boolean k0(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            a(162);
        }
        if (interfaceC8612tw.a().getAnnotations().z(YV0.a.y)) {
            return true;
        }
        if (interfaceC8612tw instanceof InterfaceC4476fA0) {
            InterfaceC4476fA0 interfaceC4476fA0 = (InterfaceC4476fA0) interfaceC8612tw;
            boolean zF0 = interfaceC4476fA0.f0();
            InterfaceC5044hA0 interfaceC5044hA0F = interfaceC4476fA0.f();
            InterfaceC7565qA0 interfaceC7565qA0G = interfaceC4476fA0.g();
            if (interfaceC5044hA0F != null && k0(interfaceC5044hA0F) && (!zF0 || (interfaceC7565qA0G != null && k0(interfaceC7565qA0G)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(159);
        }
        return e(interfaceC4923gl, YV0.a.l0);
    }

    public static boolean m0(I80 i80, BP bp) {
        if (i80 == null) {
            a(106);
        }
        if (bp == null) {
            a(107);
        }
        return !i80.O0() && h0(i80, bp);
    }

    public static boolean n0(I80 i80) {
        if (i80 == null) {
            a(137);
        }
        return o0(i80) && !D81.l(i80);
    }

    public static boolean o0(I80 i80) {
        if (i80 == null) {
            a(139);
        }
        return h0(i80, YV0.a.c);
    }

    public static boolean p0(I80 i80) {
        if (i80 == null) {
            a(141);
        }
        return b0(i80) && i80.O0();
    }

    public static boolean q0(I80 i80) {
        if (i80 == null) {
            a(92);
        }
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        return (interfaceC10240zlC == null || P(interfaceC10240zlC) == null) ? false : true;
    }

    public static boolean r0(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(97);
        }
        return S(interfaceC4923gl) != null;
    }

    public static boolean s0(I80 i80) {
        if (i80 == null) {
            a(95);
        }
        return !i80.O0() && t0(i80);
    }

    public static boolean t0(I80 i80) {
        if (i80 == null) {
            a(96);
        }
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        return (interfaceC10240zlC instanceof InterfaceC4923gl) && r0((InterfaceC4923gl) interfaceC10240zlC);
    }

    public static boolean u0(InterfaceC4923gl interfaceC4923gl) {
        if (interfaceC4923gl == null) {
            a(108);
        }
        return e(interfaceC4923gl, YV0.a.b) || e(interfaceC4923gl, YV0.a.c);
    }

    public static boolean v0(I80 i80) {
        return i80 != null && m0(i80, YV0.a.h);
    }

    public static boolean w0(C71 c71, BP bp) {
        if (c71 == null) {
            a(102);
        }
        if (bp == null) {
            a(103);
        }
        InterfaceC10240zl interfaceC10240zlC = c71.c();
        return (interfaceC10240zlC instanceof InterfaceC4923gl) && e(interfaceC10240zlC, bp);
    }

    public static boolean x0(I80 i80) {
        if (i80 == null) {
            a(129);
        }
        return i0(i80, YV0.a.H0.j());
    }

    public static boolean y0(I80 i80) {
        if (i80 == null) {
            a(131);
        }
        return i0(i80, YV0.a.J0.j());
    }

    public static boolean z0(I80 i80) {
        if (i80 == null) {
            a(132);
        }
        return i0(i80, YV0.a.K0.j());
    }

    public YS0 B() {
        YS0 ys0R = R(EnumC8067rz0.M);
        if (ys0R == null) {
            a(61);
        }
        return ys0R;
    }

    public InterfaceC4923gl C(int i) {
        return p(YV0.b(i));
    }

    public YS0 D() {
        YS0 ys0R = R(EnumC8067rz0.L);
        if (ys0R == null) {
            a(59);
        }
        return ys0R;
    }

    public InterfaceC4923gl E() {
        InterfaceC4923gl interfaceC4923glO = o(YV0.a.l0.l());
        if (interfaceC4923glO == null) {
            a(21);
        }
        return interfaceC4923glO;
    }

    public void E0(C3799cl0 c3799cl0) {
        if (c3799cl0 == null) {
            a(1);
        }
        this.f.f(new d(c3799cl0));
    }

    public YS0 F() {
        YS0 ys0R = R(EnumC8067rz0.N);
        if (ys0R == null) {
            a(60);
        }
        return ys0R;
    }

    public InterfaceC4923gl G() {
        return p("Nothing");
    }

    public YS0 H() {
        YS0 ys0S = G().s();
        if (ys0S == null) {
            a(49);
        }
        return ys0S;
    }

    public YS0 I() {
        YS0 ys0U0 = i().R0(true);
        if (ys0U0 == null) {
            a(52);
        }
        return ys0U0;
    }

    public YS0 J() {
        YS0 ys0U0 = H().R0(true);
        if (ys0U0 == null) {
            a(50);
        }
        return ys0U0;
    }

    public InterfaceC4923gl K() {
        return p("Number");
    }

    public YS0 L() {
        YS0 ys0S = K().s();
        if (ys0S == null) {
            a(56);
        }
        return ys0S;
    }

    public InterfaceC2280Su0 M() {
        InterfaceC2280Su0.b bVar = InterfaceC2280Su0.b.a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public YS0 O(EnumC8067rz0 enumC8067rz0) {
        if (enumC8067rz0 == null) {
            a(74);
        }
        YS0 ys0 = (YS0) ((e) this.c.invoke()).a.get(enumC8067rz0);
        if (ys0 == null) {
            a(75);
        }
        return ys0;
    }

    public final InterfaceC4923gl Q(EnumC8067rz0 enumC8067rz0) {
        if (enumC8067rz0 == null) {
            a(16);
        }
        return p(enumC8067rz0.o().c());
    }

    public YS0 R(EnumC8067rz0 enumC8067rz0) {
        if (enumC8067rz0 == null) {
            a(54);
        }
        YS0 ys0S = Q(enumC8067rz0).s();
        if (ys0S == null) {
            a(55);
        }
        return ys0S;
    }

    public YS0 T() {
        YS0 ys0R = R(EnumC8067rz0.K);
        if (ys0R == null) {
            a(58);
        }
        return ys0R;
    }

    public InterfaceC10174zX0 U() {
        InterfaceC10174zX0 interfaceC10174zX0 = this.f;
        if (interfaceC10174zX0 == null) {
            a(6);
        }
        return interfaceC10174zX0;
    }

    public InterfaceC4923gl V() {
        return p("String");
    }

    public YS0 W() {
        YS0 ys0S = V().s();
        if (ys0S == null) {
            a(66);
        }
        return ys0S;
    }

    public InterfaceC4923gl X(int i) {
        InterfaceC4923gl interfaceC4923glO = o(YV0.s.c(C2352Tm0.l(YV0.d(i))));
        if (interfaceC4923glO == null) {
            a(18);
        }
        return interfaceC4923glO;
    }

    public InterfaceC4923gl Y() {
        return p("Unit");
    }

    public YS0 Z() {
        YS0 ys0S = Y().s();
        if (ys0S == null) {
            a(65);
        }
        return ys0S;
    }

    public void f(boolean z) {
        C3799cl0 c3799cl0 = new C3799cl0(g, this.f, this, null);
        this.a = c3799cl0;
        c3799cl0.O0(InterfaceC0531Ch.a.c().a(this.f, this.a, v(), M(), g(), z));
        C3799cl0 c3799cl02 = this.a;
        c3799cl02.W0(c3799cl02);
    }

    public Z2 g() {
        Z2.a aVar = Z2.a.a;
        if (aVar == null) {
            a(3);
        }
        return aVar;
    }

    public InterfaceC4923gl h() {
        return p("Any");
    }

    public YS0 i() {
        YS0 ys0S = h().s();
        if (ys0S == null) {
            a(51);
        }
        return ys0S;
    }

    public InterfaceC4923gl j() {
        return p("Array");
    }

    public I80 k(I80 i80) {
        I80 i80A;
        if (i80 == null) {
            a(68);
        }
        if (c0(i80)) {
            if (i80.L0().size() != 1) {
                throw new IllegalStateException();
            }
            I80 type = ((InterfaceC6440m81) i80.L0().get(0)).getType();
            if (type == null) {
                a(69);
            }
            return type;
        }
        I80 i80N = D81.n(i80);
        I80 i802 = (I80) ((e) this.c.invoke()).c.get(i80N);
        if (i802 != null) {
            return i802;
        }
        InterfaceC2968Zk0 interfaceC2968Zk0I = AbstractC7006oA.i(i80N);
        if (interfaceC2968Zk0I != null && (i80A = A(i80N, interfaceC2968Zk0I)) != null) {
            return i80A;
        }
        throw new IllegalStateException("not array: " + i80);
    }

    public YS0 l(EnumC1042Hc1 enumC1042Hc1, I80 i80) {
        if (enumC1042Hc1 == null) {
            a(83);
        }
        if (i80 == null) {
            a(84);
        }
        YS0 ys0M = m(enumC1042Hc1, i80, InterfaceC3072a8.b.b());
        if (ys0M == null) {
            a(85);
        }
        return ys0M;
    }

    public YS0 m(EnumC1042Hc1 enumC1042Hc1, I80 i80, InterfaceC3072a8 interfaceC3072a8) {
        if (enumC1042Hc1 == null) {
            a(79);
        }
        if (i80 == null) {
            a(80);
        }
        if (interfaceC3072a8 == null) {
            a(81);
        }
        YS0 ys0H = M80.h(AbstractC8666u71.b(interfaceC3072a8), j(), Collections.singletonList(new C6998o81(enumC1042Hc1, i80)));
        if (ys0H == null) {
            a(82);
        }
        return ys0H;
    }

    public YS0 n() {
        YS0 ys0R = R(EnumC8067rz0.H);
        if (ys0R == null) {
            a(64);
        }
        return ys0R;
    }

    public InterfaceC4923gl o(AP ap) {
        if (ap == null) {
            a(12);
        }
        InterfaceC4923gl interfaceC4923glD = AbstractC6727nA.d(r(), ap, EnumC5496io0.E);
        if (interfaceC4923glD == null) {
            a(13);
        }
        return interfaceC4923glD;
    }

    public final InterfaceC4923gl p(String str) {
        if (str == null) {
            a(14);
        }
        InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) this.e.invoke(C2352Tm0.l(str));
        if (interfaceC4923gl == null) {
            a(15);
        }
        return interfaceC4923gl;
    }

    public final YS0 q(String str) {
        if (str == null) {
            a(47);
        }
        YS0 ys0S = p(str).s();
        if (ys0S == null) {
            a(48);
        }
        return ys0S;
    }

    public C3799cl0 r() {
        if (this.a == null) {
            this.a = (C3799cl0) this.b.invoke();
        }
        C3799cl0 c3799cl0 = this.a;
        if (c3799cl0 == null) {
            a(7);
        }
        return c3799cl0;
    }

    public InterfaceC4346ej0 s() {
        InterfaceC4346ej0 interfaceC4346ej0Q = r().r0(YV0.A).q();
        if (interfaceC4346ej0Q == null) {
            a(11);
        }
        return interfaceC4346ej0Q;
    }

    public YS0 t() {
        YS0 ys0R = R(EnumC8067rz0.J);
        if (ys0R == null) {
            a(57);
        }
        return ys0R;
    }

    public YS0 u() {
        YS0 ys0R = R(EnumC8067rz0.I);
        if (ys0R == null) {
            a(63);
        }
        return ys0R;
    }

    public Iterable v() {
        List listSingletonList = Collections.singletonList(new C9941yh(this.f, r()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public InterfaceC4923gl w() {
        InterfaceC4923gl interfaceC4923glO = o(YV0.a.X);
        if (interfaceC4923glO == null) {
            a(35);
        }
        return interfaceC4923glO;
    }

    public InterfaceC4923gl x() {
        return p("Comparable");
    }

    public YS0 y() {
        YS0 ys0I = I();
        if (ys0I == null) {
            a(53);
        }
        return ys0I;
    }

    public YS0 z() {
        YS0 ys0R = R(EnumC8067rz0.O);
        if (ys0R == null) {
            a(62);
        }
        return ys0R;
    }
}
