package com.daaw;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Os0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1832Os0 implements ParameterizedType, Type {
    public final Class a;
    public final Type b;
    public final Type[] c;

    /* JADX INFO: renamed from: com.daaw.Os0$a */
    public /* synthetic */ class a extends AbstractC9591xR implements NQ {
        public static final a B = new a();

        public a() {
            super(1, AbstractC5319i91.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type type) {
            G10.g(type, "p0");
            return AbstractC5319i91.h(type);
        }
    }

    public C1832Os0(Class cls, Type type, List list) {
        G10.g(cls, "rawType");
        G10.g(list, "typeArguments");
        this.a = cls;
        this.b = type;
        this.c = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return G10.c(this.a, parameterizedType.getRawType()) && G10.c(this.b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() throws IOException {
        StringBuilder sb = new StringBuilder();
        Type type = this.b;
        if (type != null) {
            sb.append(AbstractC5319i91.h(type));
            sb.append("$");
            sb.append(this.a.getSimpleName());
        } else {
            sb.append(AbstractC5319i91.h(this.a));
        }
        Type[] typeArr = this.c;
        if (!(typeArr.length == 0)) {
            AbstractC5431ib.M(typeArr, sb, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.B);
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode();
        Type type = this.b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
