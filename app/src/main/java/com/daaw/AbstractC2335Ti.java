package com.daaw;

import com.daaw.InterfaceC2231Si;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2335Ti implements InterfaceC2231Si {
    public static final d e = new d(null);
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    /* JADX INFO: renamed from: com.daaw.Ti$a */
    public static final class a extends AbstractC2335Ti implements InterfaceC8255sg {
        public final Object f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor constructor, Object obj) {
            G10.g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            G10.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            G10.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : AbstractC5152hb.n(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f = obj;
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) {
            G10.g(objArr, "args");
            c(objArr);
            Constructor constructor = (Constructor) b();
            C9608xV0 c9608xV0 = new C9608xV0(3);
            c9608xV0.a(this.f);
            c9608xV0.b(objArr);
            c9608xV0.a(null);
            return constructor.newInstance(c9608xV0.d(new Object[c9608xV0.c()]));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ti$b */
    public static final class b extends AbstractC2335Ti {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor constructor) {
            G10.g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            G10.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            G10.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC5152hb.n(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) {
            G10.g(objArr, "args");
            c(objArr);
            Constructor constructor = (Constructor) b();
            C9608xV0 c9608xV0 = new C9608xV0(2);
            c9608xV0.b(objArr);
            c9608xV0.a(null);
            return constructor.newInstance(c9608xV0.d(new Object[c9608xV0.c()]));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ti$c */
    public static final class c extends AbstractC2335Ti implements InterfaceC8255sg {
        public final Object f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor constructor, Object obj) {
            G10.g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            G10.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            G10.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f = obj;
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) {
            G10.g(objArr, "args");
            c(objArr);
            Constructor constructor = (Constructor) b();
            C9608xV0 c9608xV0 = new C9608xV0(2);
            c9608xV0.a(this.f);
            c9608xV0.b(objArr);
            return constructor.newInstance(c9608xV0.d(new Object[c9608xV0.c()]));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ti$d */
    public static final class d {
        public /* synthetic */ d(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public d() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ti$e */
    public static final class e extends AbstractC2335Ti {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor constructor) {
            G10.g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            G10.f(declaringClass, "getDeclaringClass(...)");
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            G10.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) {
            G10.g(objArr, "args");
            c(objArr);
            return ((Constructor) b()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ti$f */
    public static abstract class f extends AbstractC2335Ti {

        /* JADX INFO: renamed from: com.daaw.Ti$f$a */
        public static final class a extends f implements InterfaceC8255sg {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                G10.g(field, "field");
                this.f = obj;
            }

            @Override // com.daaw.AbstractC2335Ti.f, com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) {
                G10.g(objArr, "args");
                c(objArr);
                return ((Field) b()).get(this.f);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$f$b */
        public static final class b extends f implements InterfaceC8255sg {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                G10.g(field, "field");
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$f$c */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                G10.g(field, "field");
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$f$d */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                G10.g(field, "field");
            }

            @Override // com.daaw.AbstractC2335Ti
            public void c(Object[] objArr) {
                G10.g(objArr, "args");
                super.c(objArr);
                d(AbstractC5431ib.G(objArr));
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$f$e */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                G10.g(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z, AbstractC2911Yw abstractC2911Yw) {
            this(field, z);
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) {
            G10.g(objArr, "args");
            c(objArr);
            return ((Field) b()).get(e() != null ? AbstractC5431ib.F(objArr) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public f(Field field, boolean z) {
            Type genericType = field.getGenericType();
            G10.f(genericType, "getGenericType(...)");
            super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ti$g */
    public static abstract class g extends AbstractC2335Ti {
        public final boolean f;

        /* JADX INFO: renamed from: com.daaw.Ti$g$a */
        public static final class a extends g implements InterfaceC8255sg {
            public final Object g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z, Object obj) {
                super(field, z, false, null);
                G10.g(field, "field");
                this.g = obj;
            }

            @Override // com.daaw.AbstractC2335Ti.g, com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) throws IllegalAccessException {
                G10.g(objArr, "args");
                c(objArr);
                ((Field) b()).set(this.g, AbstractC5431ib.F(objArr));
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$g$b */
        public static final class b extends g implements InterfaceC8255sg {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z) {
                super(field, z, false, null);
                G10.g(field, "field");
            }

            @Override // com.daaw.AbstractC2335Ti.g, com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) throws IllegalAccessException {
                G10.g(objArr, "args");
                c(objArr);
                ((Field) b()).set(null, AbstractC5431ib.Q(objArr));
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$g$c */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z) {
                super(field, z, true, null);
                G10.g(field, "field");
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$g$d */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z) {
                super(field, z, true, null);
                G10.g(field, "field");
            }

            @Override // com.daaw.AbstractC2335Ti.g, com.daaw.AbstractC2335Ti
            public void c(Object[] objArr) {
                G10.g(objArr, "args");
                super.c(objArr);
                d(AbstractC5431ib.G(objArr));
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$g$e */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z) {
                super(field, z, false, null);
                G10.g(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z, boolean z2, AbstractC2911Yw abstractC2911Yw) {
            this(field, z, z2);
        }

        @Override // com.daaw.AbstractC2335Ti
        public void c(Object[] objArr) {
            G10.g(objArr, "args");
            super.c(objArr);
            if (this.f && AbstractC5431ib.Q(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) throws IllegalAccessException {
            G10.g(objArr, "args");
            c(objArr);
            ((Field) b()).set(e() != null ? AbstractC5431ib.F(objArr) : null, AbstractC5431ib.Q(objArr));
            return G91.a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(Field field, boolean z, boolean z2) {
            Class cls = Void.TYPE;
            G10.f(cls, "TYPE");
            super(field, cls, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.f = z;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ti$h */
    public static abstract class h extends AbstractC2335Ti {
        public final boolean f;

        /* JADX INFO: renamed from: com.daaw.Ti$h$a */
        public static final class a extends h implements InterfaceC8255sg {
            public final Object g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                G10.g(method, "method");
                this.g = obj;
            }

            @Override // com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) {
                G10.g(objArr, "args");
                c(objArr);
                return f(this.g, objArr);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$h$b */
        public static final class b extends h implements InterfaceC8255sg {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                G10.g(method, "method");
            }

            @Override // com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) {
                G10.g(objArr, "args");
                c(objArr);
                return f(null, objArr);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$h$c */
        public static final class c extends h implements InterfaceC8255sg {
            public final Object g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, Object obj) {
                G10.g(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                G10.f(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC5152hb.n(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.g = obj;
            }

            @Override // com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) {
                G10.g(objArr, "args");
                c(objArr);
                C9608xV0 c9608xV0 = new C9608xV0(2);
                c9608xV0.a(this.g);
                c9608xV0.b(objArr);
                return f(null, c9608xV0.d(new Object[c9608xV0.c()]));
            }

            public final Object g() {
                return this.g;
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$h$d */
        public static final class d extends h implements InterfaceC8255sg {
            public final Object[] g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] objArr) {
                G10.g(method, "method");
                G10.g(objArr, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                G10.f(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) AbstractC5431ib.C(genericParameterTypes, objArr.length).toArray(new Type[0]), null);
                this.g = objArr;
            }

            @Override // com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) {
                G10.g(objArr, "args");
                c(objArr);
                C9608xV0 c9608xV0 = new C9608xV0(2);
                c9608xV0.b(this.g);
                c9608xV0.b(objArr);
                return f(null, c9608xV0.d(new Object[c9608xV0.c()]));
            }

            public final Object[] g() {
                return this.g;
            }

            public final int h() {
                return this.g.length;
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$h$e */
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                G10.g(method, "method");
            }

            @Override // com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) {
                G10.g(objArr, "args");
                c(objArr);
                return f(objArr[0], objArr.length <= 1 ? new Object[0] : AbstractC5152hb.n(objArr, 1, objArr.length));
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$h$f */
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                G10.g(method, "method");
            }

            @Override // com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) {
                G10.g(objArr, "args");
                c(objArr);
                d(AbstractC5431ib.G(objArr));
                return f(null, objArr.length <= 1 ? new Object[0] : AbstractC5152hb.n(objArr, 1, objArr.length));
            }
        }

        /* JADX INFO: renamed from: com.daaw.Ti$h$g */
        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                G10.g(method, "method");
            }

            @Override // com.daaw.InterfaceC2231Si
            public Object call(Object[] objArr) {
                G10.g(objArr, "args");
                c(objArr);
                return f(null, objArr);
            }
        }

        public /* synthetic */ h(Method method, boolean z, Type[] typeArr, AbstractC2911Yw abstractC2911Yw) {
            this(method, z, typeArr);
        }

        public final Object f(Object obj, Object[] objArr) {
            G10.g(objArr, "args");
            return this.f ? G91.a : ((Method) b()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        public /* synthetic */ h(Method method, boolean z, Type[] typeArr, int i, AbstractC2911Yw abstractC2911Yw) {
            this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, (i & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public h(Method method, boolean z, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            G10.f(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr, null);
            this.f = G10.c(getReturnType(), Void.TYPE);
        }
    }

    public /* synthetic */ AbstractC2335Ti(Member member, Type type, Class cls, Type[] typeArr, AbstractC2911Yw abstractC2911Yw) {
        this(member, type, cls, typeArr);
    }

    @Override // com.daaw.InterfaceC2231Si
    public List a() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC2231Si
    public final Member b() {
        return this.a;
    }

    public void c(Object[] objArr) {
        InterfaceC2231Si.a.a(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class e() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC2231Si
    public final Type getReturnType() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC2335Ti(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            if (r3 == 0) goto L27
            com.daaw.xV0 r1 = new com.daaw.xV0
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = com.daaw.AbstractC1599Mm.n(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = com.daaw.AbstractC5431ib.h0(r4)
        L2b:
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2335Ti.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
