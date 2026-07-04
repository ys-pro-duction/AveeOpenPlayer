package com.daaw;

import com.daaw.C9514x80;
import com.daaw.InterfaceC10072z80;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class EE0 implements InterfaceC10072z80.c {
    public static boolean j;
    public static final Map k;
    public int[] a = null;
    public String b = null;
    public int c = 0;
    public String d = null;
    public String[] e = null;
    public String[] f = null;
    public String[] g = null;
    public C9514x80.a h = null;
    public String[] i = null;

    public static abstract class b implements InterfaceC10072z80.b {
        public final List a = new ArrayList();

        private static /* synthetic */ void f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.InterfaceC10072z80.b
        public void a() {
            g((String[]) this.a.toArray(new String[0]));
        }

        @Override // com.daaw.InterfaceC10072z80.b
        public void b(Object obj) {
            if (obj instanceof String) {
                this.a.add((String) obj);
            }
        }

        @Override // com.daaw.InterfaceC10072z80.b
        public void c(C6607ml c6607ml, C2352Tm0 c2352Tm0) {
            if (c6607ml == null) {
                f(0);
            }
            if (c2352Tm0 == null) {
                f(1);
            }
        }

        @Override // com.daaw.InterfaceC10072z80.b
        public InterfaceC10072z80.a d(C6607ml c6607ml) {
            if (c6607ml != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // com.daaw.InterfaceC10072z80.b
        public void e(C7165ol c7165ol) {
            if (c7165ol == null) {
                f(2);
            }
        }

        public abstract void g(String[] strArr);
    }

    static {
        try {
            j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            j = false;
        }
        HashMap map = new HashMap();
        k = map;
        map.put(C6607ml.k(new AP("kotlin.jvm.internal.KotlinClass")), C9514x80.a.F);
        map.put(C6607ml.k(new AP("kotlin.jvm.internal.KotlinFileFacade")), C9514x80.a.G);
        map.put(C6607ml.k(new AP("kotlin.jvm.internal.KotlinMultifileClass")), C9514x80.a.I);
        map.put(C6607ml.k(new AP("kotlin.jvm.internal.KotlinMultifileClassPart")), C9514x80.a.J);
        map.put(C6607ml.k(new AP("kotlin.jvm.internal.KotlinSyntheticClass")), C9514x80.a.H);
    }

    public static /* synthetic */ void d(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // com.daaw.InterfaceC10072z80.c
    public InterfaceC10072z80.a c(C6607ml c6607ml, RU0 ru0) {
        C9514x80.a aVar;
        if (c6607ml == null) {
            d(0);
        }
        if (ru0 == null) {
            d(1);
        }
        AP apA = c6607ml.a();
        if (apA.equals(B40.a)) {
            return new c();
        }
        if (apA.equals(B40.t)) {
            return new d();
        }
        if (j || this.h != null || (aVar = (C9514x80.a) k.get(c6607ml)) == null) {
            return null;
        }
        this.h = aVar;
        return new e();
    }

    public C9514x80 m(C4740g50 c4740g50) {
        if (this.h == null || this.a == null) {
            return null;
        }
        C4740g50 c4740g502 = new C4740g50(this.a, (this.c & 8) != 0);
        if (!c4740g502.h(c4740g50)) {
            this.g = this.e;
            this.e = null;
        } else if (o() && this.e == null) {
            return null;
        }
        String[] strArr = this.i;
        return new C9514x80(this.h, c4740g502, this.e, this.g, this.f, this.b, this.c, this.d, strArr != null ? AbstractC1260Jf.e(strArr) : null);
    }

    public C9514x80 n() {
        return m(C4740g50.i);
    }

    public final boolean o() {
        C9514x80.a aVar = this.h;
        return aVar == C9514x80.a.F || aVar == C9514x80.a.G || aVar == C9514x80.a.J;
    }

    public class c implements InterfaceC10072z80.a {

        public class a extends b {
            public a() {
            }

            public static /* synthetic */ void f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // com.daaw.EE0.b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                EE0.this.e = strArr;
            }
        }

        public class b extends b {
            public b() {
            }

            private static /* synthetic */ void f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // com.daaw.EE0.b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                EE0.this.f = strArr;
            }
        }

        public c() {
        }

        public static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void b(C2352Tm0 c2352Tm0, C7165ol c7165ol) {
            if (c7165ol == null) {
                g(0);
            }
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public InterfaceC10072z80.b c(C2352Tm0 c2352Tm0) {
            String strC = c2352Tm0 != null ? c2352Tm0.c() : null;
            if ("d1".equals(strC)) {
                return h();
            }
            if ("d2".equals(strC)) {
                return i();
            }
            return null;
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void d(C2352Tm0 c2352Tm0, Object obj) {
            if (c2352Tm0 == null) {
                return;
            }
            String strC = c2352Tm0.c();
            if ("k".equals(strC)) {
                if (obj instanceof Integer) {
                    EE0.this.h = C9514x80.a.g(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(strC)) {
                if (obj instanceof int[]) {
                    EE0.this.a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strC)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    EE0.this.b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strC)) {
                if (obj instanceof Integer) {
                    EE0.this.c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(strC) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                EE0.this.d = str2;
            }
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void e(C2352Tm0 c2352Tm0, C6607ml c6607ml, C2352Tm0 c2352Tm02) {
            if (c6607ml == null) {
                g(1);
            }
            if (c2352Tm02 == null) {
                g(2);
            }
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public InterfaceC10072z80.a f(C2352Tm0 c2352Tm0, C6607ml c6607ml) {
            if (c6607ml != null) {
                return null;
            }
            g(3);
            return null;
        }

        public final InterfaceC10072z80.b h() {
            return new a();
        }

        public final InterfaceC10072z80.b i() {
            return new b();
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void a() {
        }
    }

    public class d implements InterfaceC10072z80.a {

        public class a extends b {
            public a() {
            }

            private static /* synthetic */ void f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // com.daaw.EE0.b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                EE0.this.i = strArr;
            }
        }

        public d() {
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void b(C2352Tm0 c2352Tm0, C7165ol c7165ol) {
            if (c7165ol == null) {
                g(0);
            }
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public InterfaceC10072z80.b c(C2352Tm0 c2352Tm0) {
            if ("b".equals(c2352Tm0 != null ? c2352Tm0.c() : null)) {
                return h();
            }
            return null;
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void e(C2352Tm0 c2352Tm0, C6607ml c6607ml, C2352Tm0 c2352Tm02) {
            if (c6607ml == null) {
                g(1);
            }
            if (c2352Tm02 == null) {
                g(2);
            }
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public InterfaceC10072z80.a f(C2352Tm0 c2352Tm0, C6607ml c6607ml) {
            if (c6607ml != null) {
                return null;
            }
            g(3);
            return null;
        }

        public final InterfaceC10072z80.b h() {
            return new a();
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void a() {
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void d(C2352Tm0 c2352Tm0, Object obj) {
        }
    }

    public class e implements InterfaceC10072z80.a {

        public class a extends b {
            public a() {
            }

            private static /* synthetic */ void f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // com.daaw.EE0.b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                EE0.this.e = strArr;
            }
        }

        public class b extends b {
            public b() {
            }

            private static /* synthetic */ void f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // com.daaw.EE0.b
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                EE0.this.f = strArr;
            }
        }

        public e() {
        }

        private static /* synthetic */ void g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private InterfaceC10072z80.b h() {
            return new a();
        }

        private InterfaceC10072z80.b i() {
            return new b();
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void b(C2352Tm0 c2352Tm0, C7165ol c7165ol) {
            if (c7165ol == null) {
                g(0);
            }
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public InterfaceC10072z80.b c(C2352Tm0 c2352Tm0) {
            String strC = c2352Tm0 != null ? c2352Tm0.c() : null;
            if ("data".equals(strC) || "filePartClassNames".equals(strC)) {
                return h();
            }
            if ("strings".equals(strC)) {
                return i();
            }
            return null;
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void d(C2352Tm0 c2352Tm0, Object obj) {
            if (c2352Tm0 == null) {
                return;
            }
            String strC = c2352Tm0.c();
            if ("version".equals(strC)) {
                if (obj instanceof int[]) {
                    EE0.this.a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strC)) {
                EE0.this.b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void e(C2352Tm0 c2352Tm0, C6607ml c6607ml, C2352Tm0 c2352Tm02) {
            if (c6607ml == null) {
                g(1);
            }
            if (c2352Tm02 == null) {
                g(2);
            }
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public InterfaceC10072z80.a f(C2352Tm0 c2352Tm0, C6607ml c6607ml) {
            if (c6607ml != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void a() {
        }
    }

    @Override // com.daaw.InterfaceC10072z80.c
    public void a() {
    }
}
