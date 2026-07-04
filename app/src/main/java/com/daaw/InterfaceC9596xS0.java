package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9596xS0 {
    public static final InterfaceC9596xS0 a = new a();

    /* JADX INFO: renamed from: com.daaw.xS0$a */
    public static class a implements InterfaceC9596xS0 {
        public static /* synthetic */ void c(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.InterfaceC9596xS0
        public void a(InterfaceC1583Mi interfaceC1583Mi, List list) {
            if (interfaceC1583Mi == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // com.daaw.InterfaceC9596xS0
        public b b(InterfaceC3605c30 interfaceC3605c30, InterfaceC4923gl interfaceC4923gl, I80 i80, I80 i802, List list, List list2) {
            if (interfaceC3605c30 == null) {
                c(0);
            }
            if (interfaceC4923gl == null) {
                c(1);
            }
            if (i80 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(i80, i802, list, list2, Collections.EMPTY_LIST, false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.xS0$b */
    public static class b {
        public final I80 a;
        public final I80 b;
        public final List c;
        public final List d;
        public final List e;
        public final boolean f;

        public b(I80 i80, I80 i802, List list, List list2, List list3, boolean z) {
            if (i80 == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.a = i80;
            this.b = i802;
            this.c = list;
            this.d = list2;
            this.e = list3;
            this.f = z;
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List b() {
            List list = this.e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public I80 c() {
            return this.b;
        }

        public I80 d() {
            I80 i80 = this.a;
            if (i80 == null) {
                a(4);
            }
            return i80;
        }

        public List e() {
            List list = this.d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List f() {
            List list = this.c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f;
        }
    }

    void a(InterfaceC1583Mi interfaceC1583Mi, List list);

    b b(InterfaceC3605c30 interfaceC3605c30, InterfaceC4923gl interfaceC4923gl, I80 i80, I80 i802, List list, List list2);
}
