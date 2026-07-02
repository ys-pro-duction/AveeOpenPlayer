package com.daaw;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public final class AF0 extends AbstractC10102zF0 implements InterfaceC8082s20 {
    public final Annotation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AF0(C2352Tm0 c2352Tm0, Annotation annotation) {
        super(c2352Tm0, null);
        G10.g(annotation, "annotation");
        this.c = annotation;
    }

    @Override // com.daaw.InterfaceC8082s20
    public InterfaceC7525q20 a() {
        return new C9823yF0(this.c);
    }
}
