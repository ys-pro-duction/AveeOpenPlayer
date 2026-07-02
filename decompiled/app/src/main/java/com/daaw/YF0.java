package com.daaw;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class YF0 implements InterfaceC10047z30 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final YF0 a(Type type) {
            G10.g(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new WF0(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new EF0(type) : type instanceof WildcardType ? new C3386bG0((WildcardType) type) : new MF0(type);
        }

        public a() {
        }
    }

    public abstract Type R();

    public boolean equals(Object obj) {
        return (obj instanceof YF0) && G10.c(R(), ((YF0) obj).R());
    }

    public int hashCode() {
        return R().hashCode();
    }

    @Override // com.daaw.InterfaceC9205w20
    public InterfaceC7525q20 i(AP ap) {
        Object obj;
        G10.g(ap, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C6607ml c6607mlE = ((InterfaceC7525q20) next).e();
            if (G10.c(c6607mlE != null ? c6607mlE.a() : null, ap)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC7525q20) obj;
    }

    public String toString() {
        return getClass().getName() + ": " + R();
    }
}
