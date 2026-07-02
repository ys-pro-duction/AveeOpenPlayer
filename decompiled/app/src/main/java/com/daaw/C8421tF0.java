package com.daaw;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: com.daaw.tF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8421tF0 implements RU0 {
    public final Annotation b;

    public C8421tF0(Annotation annotation) {
        G10.g(annotation, "annotation");
        this.b = annotation;
    }

    @Override // com.daaw.RU0
    public SU0 a() {
        SU0 su0 = SU0.a;
        G10.f(su0, "NO_SOURCE_FILE");
        return su0;
    }

    public final Annotation d() {
        return this.b;
    }
}
