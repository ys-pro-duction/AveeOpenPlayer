package com.daaw;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.aG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3107aG0 extends OF0 implements O30 {
    public final YF0 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public C3107aG0(YF0 yf0, Annotation[] annotationArr, String str, boolean z) {
        G10.g(yf0, "type");
        G10.g(annotationArr, "reflectAnnotations");
        this.a = yf0;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // com.daaw.O30
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public YF0 getType() {
        return this.a;
    }

    @Override // com.daaw.O30
    public boolean a() {
        return this.d;
    }

    @Override // com.daaw.O30
    public C2352Tm0 getName() {
        String str = this.c;
        if (str != null) {
            return C2352Tm0.k(str);
        }
        return null;
    }

    @Override // com.daaw.InterfaceC9205w20
    public boolean n() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3107aG0.class.getName());
        sb.append(": ");
        sb.append(a() ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }

    @Override // com.daaw.InterfaceC9205w20
    public List getAnnotations() {
        return CF0.b(this.b);
    }

    @Override // com.daaw.InterfaceC9205w20
    public C9823yF0 i(AP ap) {
        G10.g(ap, "fqName");
        return CF0.a(this.b, ap);
    }
}
