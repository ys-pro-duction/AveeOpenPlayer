package com.daaw;

import com.daaw.AbstractC2335Ti;
import com.daaw.InterfaceC2231Si;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.t10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8356t10 implements InterfaceC2231Si {
    public final Method a;
    public final List b;
    public final Type c;

    /* JADX INFO: renamed from: com.daaw.t10$a */
    public static final class a extends AbstractC8356t10 implements InterfaceC8255sg {
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, AbstractC1599Mm.k(), null);
            G10.g(method, "unboxMethod");
            this.d = obj;
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) {
            G10.g(objArr, "args");
            d(objArr);
            return c(this.d, objArr);
        }
    }

    /* JADX INFO: renamed from: com.daaw.t10$b */
    public static final class b extends AbstractC8356t10 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, AbstractC1496Lm.e(method.getDeclaringClass()), null);
            G10.g(method, "unboxMethod");
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) {
            G10.g(objArr, "args");
            d(objArr);
            Object obj = objArr[0];
            AbstractC2335Ti.d dVar = AbstractC2335Ti.e;
            return c(obj, objArr.length <= 1 ? new Object[0] : AbstractC5152hb.n(objArr, 1, objArr.length));
        }
    }

    public /* synthetic */ AbstractC8356t10(Method method, List list, AbstractC2911Yw abstractC2911Yw) {
        this(method, list);
    }

    @Override // com.daaw.InterfaceC2231Si
    public final List a() {
        return this.b;
    }

    public final Object c(Object obj, Object[] objArr) {
        G10.g(objArr, "args");
        return this.a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    public void d(Object[] objArr) {
        InterfaceC2231Si.a.a(this, objArr);
    }

    @Override // com.daaw.InterfaceC2231Si
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    @Override // com.daaw.InterfaceC2231Si
    public final Type getReturnType() {
        return this.c;
    }

    public AbstractC8356t10(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        G10.f(returnType, "getReturnType(...)");
        this.c = returnType;
    }
}
