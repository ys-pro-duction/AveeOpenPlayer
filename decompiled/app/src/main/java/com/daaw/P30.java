package com.daaw;

import com.daaw.C0525Cf1;

/* JADX INFO: loaded from: classes4.dex */
public final class P30 extends AbstractC0742Ef1 {
    public static final P30 c = new P30();

    public P30() {
        super("package", false);
    }

    @Override // com.daaw.AbstractC0742Ef1
    public Integer a(AbstractC0742Ef1 abstractC0742Ef1) {
        G10.g(abstractC0742Ef1, "visibility");
        if (this == abstractC0742Ef1) {
            return 0;
        }
        return C0525Cf1.a.b(abstractC0742Ef1) ? 1 : -1;
    }

    @Override // com.daaw.AbstractC0742Ef1
    public String b() {
        return "public/*package*/";
    }

    @Override // com.daaw.AbstractC0742Ef1
    public AbstractC0742Ef1 d() {
        return C0525Cf1.g.c;
    }
}
