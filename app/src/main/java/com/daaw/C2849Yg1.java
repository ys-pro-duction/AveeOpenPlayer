package com.daaw;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Yg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2849Yg1 implements WildcardType, Type {
    public static final a c = new a(null);
    public static final C2849Yg1 d = new C2849Yg1(null, null);
    public final Type a;
    public final Type b;

    /* JADX INFO: renamed from: com.daaw.Yg1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C2849Yg1 a() {
            return C2849Yg1.d;
        }

        public a() {
        }
    }

    public C2849Yg1(Type type, Type type2) {
        this.a = type;
        this.b = type2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.b != null) {
            return "? super " + AbstractC5319i91.h(this.b);
        }
        Type type = this.a;
        if (type == null || G10.c(type, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC5319i91.h(this.a);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
