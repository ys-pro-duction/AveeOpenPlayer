package com.daaw;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.daaw.lS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6241lS implements GenericArrayType, Type {
    public final Type a;

    public C6241lS(Type type) {
        G10.g(type, "elementType");
        this.a = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && G10.c(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return AbstractC5319i91.h(this.a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
