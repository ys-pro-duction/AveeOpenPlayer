package com.daaw;

import com.daaw.C0525Cf1;

/* JADX INFO: loaded from: classes4.dex */
public final class Q30 extends AbstractC0742Ef1 {
    public static final Q30 c = new Q30();

    public Q30() {
        super("protected_and_package", true);
    }

    @Override // com.daaw.AbstractC0742Ef1
    public Integer a(AbstractC0742Ef1 abstractC0742Ef1) {
        G10.g(abstractC0742Ef1, "visibility");
        if (G10.c(this, abstractC0742Ef1)) {
            return 0;
        }
        if (abstractC0742Ef1 == C0525Cf1.b.c) {
            return null;
        }
        return C0525Cf1.a.b(abstractC0742Ef1) ? 1 : -1;
    }

    @Override // com.daaw.AbstractC0742Ef1
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // com.daaw.AbstractC0742Ef1
    public AbstractC0742Ef1 d() {
        return C0525Cf1.g.c;
    }
}
