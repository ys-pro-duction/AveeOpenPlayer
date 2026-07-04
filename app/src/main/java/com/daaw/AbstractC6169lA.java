package com.daaw;

import com.daaw.InterfaceC1583Mi;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.lA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6169lA {

    /* JADX INFO: renamed from: com.daaw.lA$a */
    public static class a extends AbstractC9419wo0 {
        public final /* synthetic */ InterfaceC8993vH a;
        public final /* synthetic */ Set b;
        public final /* synthetic */ boolean c;

        /* JADX INFO: renamed from: com.daaw.lA$a$a, reason: collision with other inner class name */
        public class C0204a implements NQ {
            public C0204a() {
            }

            private static /* synthetic */ void a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public G91 invoke(InterfaceC1583Mi interfaceC1583Mi) {
                if (interfaceC1583Mi == null) {
                    a(0);
                }
                a.this.a.a(interfaceC1583Mi);
                return G91.a;
            }
        }

        public a(InterfaceC8993vH interfaceC8993vH, Set set, boolean z) {
            this.a = interfaceC8993vH;
            this.b = set;
            this.c = z;
        }

        private static /* synthetic */ void f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC0685Dr0
        public void a(InterfaceC1583Mi interfaceC1583Mi) {
            if (interfaceC1583Mi == null) {
                f(0);
            }
            C0789Er0.K(interfaceC1583Mi, new C0204a());
            this.b.add(interfaceC1583Mi);
        }

        @Override // com.daaw.AbstractC0685Dr0
        public void d(InterfaceC1583Mi interfaceC1583Mi, Collection collection) {
            if (interfaceC1583Mi == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.c || interfaceC1583Mi.i() == InterfaceC1583Mi.a.FAKE_OVERRIDE) {
                super.d(interfaceC1583Mi, collection);
            }
        }

        @Override // com.daaw.AbstractC9419wo0
        public void e(InterfaceC1583Mi interfaceC1583Mi, InterfaceC1583Mi interfaceC1583Mi2) {
            if (interfaceC1583Mi == null) {
                f(1);
            }
            if (interfaceC1583Mi2 == null) {
                f(2);
            }
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[2] = "resolveOverrides";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static InterfaceC9918yc1 b(C2352Tm0 c2352Tm0, InterfaceC4923gl interfaceC4923gl) {
        if (c2352Tm0 == null) {
            a(19);
        }
        if (interfaceC4923gl == null) {
            a(20);
        }
        Collection collectionM = interfaceC4923gl.m();
        if (collectionM.size() != 1) {
            return null;
        }
        for (InterfaceC9918yc1 interfaceC9918yc1 : ((InterfaceC3241al) collectionM.iterator().next()).h()) {
            if (interfaceC9918yc1.getName().equals(c2352Tm0)) {
                return interfaceC9918yc1;
            }
        }
        return null;
    }

    public static Collection c(C2352Tm0 c2352Tm0, Collection collection, Collection collection2, InterfaceC4923gl interfaceC4923gl, InterfaceC8993vH interfaceC8993vH, C0789Er0 c0789Er0, boolean z) {
        if (c2352Tm0 == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (interfaceC4923gl == null) {
            a(15);
        }
        if (interfaceC8993vH == null) {
            a(16);
        }
        if (c0789Er0 == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c0789Er0.v(c2352Tm0, collection, collection2, interfaceC4923gl, new a(interfaceC8993vH, linkedHashSet, z));
        return linkedHashSet;
    }

    public static Collection d(C2352Tm0 c2352Tm0, Collection collection, Collection collection2, InterfaceC4923gl interfaceC4923gl, InterfaceC8993vH interfaceC8993vH, C0789Er0 c0789Er0) {
        if (c2352Tm0 == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (interfaceC4923gl == null) {
            a(3);
        }
        if (interfaceC8993vH == null) {
            a(4);
        }
        if (c0789Er0 == null) {
            a(5);
        }
        return c(c2352Tm0, collection, collection2, interfaceC4923gl, interfaceC8993vH, c0789Er0, false);
    }

    public static Collection e(C2352Tm0 c2352Tm0, Collection collection, Collection collection2, InterfaceC4923gl interfaceC4923gl, InterfaceC8993vH interfaceC8993vH, C0789Er0 c0789Er0) {
        if (c2352Tm0 == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (interfaceC4923gl == null) {
            a(9);
        }
        if (interfaceC8993vH == null) {
            a(10);
        }
        if (c0789Er0 == null) {
            a(11);
        }
        return c(c2352Tm0, collection, collection2, interfaceC4923gl, interfaceC8993vH, c0789Er0, true);
    }
}
