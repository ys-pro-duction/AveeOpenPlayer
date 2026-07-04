package com.daaw;

import com.daaw.AbstractC4451f50;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.d50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3894d50 {

    /* JADX INFO: renamed from: com.daaw.d50$a */
    public static final class a extends AbstractC3894d50 {
        public final Class a;
        public final List b;

        /* JADX INFO: renamed from: com.daaw.d50$a$a, reason: collision with other inner class name */
        public static final class C0164a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC1188In.a(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(null);
            G10.g(cls, "jClass");
            this.a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            G10.f(declaredMethods, "getDeclaredMethods(...)");
            this.b = AbstractC5431ib.Y(declaredMethods, new C0164a());
        }

        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            G10.f(returnType, "getReturnType(...)");
            return AbstractC9544xF0.f(returnType);
        }

        @Override // com.daaw.AbstractC3894d50
        public String a() {
            return AbstractC2455Um.n0(this.b, "", "<init>(", ")V", 0, null, C3615c50.B, 24, null);
        }

        public final List d() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.d50$b */
    public static final class b extends AbstractC3894d50 {
        public final Constructor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            G10.g(constructor, "constructor");
            this.a = constructor;
        }

        public static final CharSequence c(Class cls) {
            G10.d(cls);
            return AbstractC9544xF0.f(cls);
        }

        @Override // com.daaw.AbstractC3894d50
        public String a() {
            Class<?>[] parameterTypes = this.a.getParameterTypes();
            G10.f(parameterTypes, "getParameterTypes(...)");
            return AbstractC5431ib.P(parameterTypes, "", "<init>(", ")V", 0, null, C4172e50.B, 24, null);
        }

        public final Constructor d() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.d50$c */
    public static final class c extends AbstractC3894d50 {
        public final Method a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            G10.g(method, "method");
            this.a = method;
        }

        @Override // com.daaw.AbstractC3894d50
        public String a() {
            return AbstractC10122zK0.d(this.a);
        }

        public final Method b() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.d50$d */
    public static final class d extends AbstractC3894d50 {
        public final AbstractC4451f50.b a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC4451f50.b bVar) {
            super(null);
            G10.g(bVar, "signature");
            this.a = bVar;
            this.b = bVar.a();
        }

        @Override // com.daaw.AbstractC3894d50
        public String a() {
            return this.b;
        }

        public final String b() {
            return this.a.d();
        }
    }

    /* JADX INFO: renamed from: com.daaw.d50$e */
    public static final class e extends AbstractC3894d50 {
        public final AbstractC4451f50.b a;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC4451f50.b bVar) {
            super(null);
            G10.g(bVar, "signature");
            this.a = bVar;
            this.b = bVar.a();
        }

        @Override // com.daaw.AbstractC3894d50
        public String a() {
            return this.b;
        }

        public final String b() {
            return this.a.d();
        }

        public final String c() {
            return this.a.e();
        }
    }

    public /* synthetic */ AbstractC3894d50(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public abstract String a();

    public AbstractC3894d50() {
    }
}
