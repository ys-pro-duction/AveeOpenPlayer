package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.r42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7815r42 {
    public final List a;

    public C7815r42(List list) {
        this.a = list;
    }

    public static InterfaceC2682Wq2 a(InterfaceC2682Wq2 interfaceC2682Wq2) {
        return new C2786Xq2(interfaceC2682Wq2, new WN2() { // from class: com.daaw.q42
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return new C7815r42((AbstractC4448f42) obj);
            }
        });
    }

    public C7815r42(AbstractC4448f42 abstractC4448f42) {
        this.a = Collections.singletonList(AbstractC7360pS2.h(abstractC4448f42));
    }
}
