package com.daaw;

/* JADX INFO: renamed from: com.daaw.o30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6972o30 {
    public static final InterfaceC6972o30 a = new a();

    /* JADX INFO: renamed from: com.daaw.o30$a */
    public static class a implements InterfaceC6972o30 {
        public static /* synthetic */ void f(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.InterfaceC6972o30
        public void a(T20 t20, InterfaceC7195or interfaceC7195or) {
            if (t20 == null) {
                f(3);
            }
            if (interfaceC7195or == null) {
                f(4);
            }
        }

        @Override // com.daaw.InterfaceC6972o30
        public void b(V20 v20, InterfaceC4476fA0 interfaceC4476fA0) {
            if (v20 == null) {
                f(5);
            }
            if (interfaceC4476fA0 == null) {
                f(6);
            }
        }

        @Override // com.daaw.InterfaceC6972o30
        public void c(C20 c20, InterfaceC4923gl interfaceC4923gl) {
            if (c20 == null) {
                f(7);
            }
            if (interfaceC4923gl == null) {
                f(8);
            }
        }

        @Override // com.daaw.InterfaceC6972o30
        public InterfaceC4923gl d(AP ap) {
            if (ap != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // com.daaw.InterfaceC6972o30
        public void e(InterfaceC3327b30 interfaceC3327b30, IS0 is0) {
            if (interfaceC3327b30 == null) {
                f(1);
            }
            if (is0 == null) {
                f(2);
            }
        }
    }

    void a(T20 t20, InterfaceC7195or interfaceC7195or);

    void b(V20 v20, InterfaceC4476fA0 interfaceC4476fA0);

    void c(C20 c20, InterfaceC4923gl interfaceC4923gl);

    InterfaceC4923gl d(AP ap);

    void e(InterfaceC3327b30 interfaceC3327b30, IS0 is0);
}
