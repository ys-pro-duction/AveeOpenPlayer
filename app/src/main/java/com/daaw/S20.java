package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S20 {
    public static final AbstractC8965vA a;
    public static final AbstractC8965vA b;
    public static final AbstractC8965vA c;
    public static final Map d;

    public static class a extends AbstractC0920Fy {
        public a(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "fromPackage";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i == 2 || i == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            return S20.d(interfaceC0383Aw, interfaceC8612tw);
        }
    }

    public static class b extends AbstractC0920Fy {
        public b(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            return S20.e(te0, interfaceC0383Aw, interfaceC8612tw);
        }
    }

    public static class c extends AbstractC0920Fy {
        public c(AbstractC0742Ef1 abstractC0742Ef1) {
            super(abstractC0742Ef1);
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.AbstractC8965vA
        public boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw, boolean z) {
            if (interfaceC0383Aw == null) {
                g(0);
            }
            if (interfaceC8612tw == null) {
                g(1);
            }
            return S20.e(te0, interfaceC0383Aw, interfaceC8612tw);
        }
    }

    static {
        a aVar = new a(P30.c);
        a = aVar;
        b bVar = new b(R30.c);
        b = bVar;
        c cVar = new c(Q30.c);
        c = cVar;
        d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean d(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2) {
        if (interfaceC8612tw == null) {
            a(2);
        }
        if (interfaceC8612tw2 == null) {
            a(3);
        }
        InterfaceC2372Tr0 interfaceC2372Tr0 = (InterfaceC2372Tr0) AbstractC7006oA.r(interfaceC8612tw, InterfaceC2372Tr0.class, false);
        InterfaceC2372Tr0 interfaceC2372Tr02 = (InterfaceC2372Tr0) AbstractC7006oA.r(interfaceC8612tw2, InterfaceC2372Tr0.class, false);
        return (interfaceC2372Tr02 == null || interfaceC2372Tr0 == null || !interfaceC2372Tr0.d().equals(interfaceC2372Tr02.d())) ? false : true;
    }

    public static boolean e(TE0 te0, InterfaceC0383Aw interfaceC0383Aw, InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC0383Aw == null) {
            a(0);
        }
        if (interfaceC8612tw == null) {
            a(1);
        }
        if (d(AbstractC7006oA.M(interfaceC0383Aw), interfaceC8612tw)) {
            return true;
        }
        return AbstractC8679uA.c.e(te0, interfaceC0383Aw, interfaceC8612tw, false);
    }

    public static void f(AbstractC8965vA abstractC8965vA) {
        d.put(abstractC8965vA.b(), abstractC8965vA);
    }

    public static AbstractC8965vA g(AbstractC0742Ef1 abstractC0742Ef1) {
        if (abstractC0742Ef1 == null) {
            a(4);
        }
        AbstractC8965vA abstractC8965vA = (AbstractC8965vA) d.get(abstractC0742Ef1);
        if (abstractC8965vA != null) {
            return abstractC8965vA;
        }
        AbstractC8965vA abstractC8965vAJ = AbstractC8679uA.j(abstractC0742Ef1);
        if (abstractC8965vAJ == null) {
            a(5);
        }
        return abstractC8965vAJ;
    }
}
