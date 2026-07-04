package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5013h4 extends AbstractC3958dK {
    public final List B = new ArrayList();

    @Override // com.daaw.AbstractC3958dK
    public AbstractC3958dK a(InterfaceC4236eK interfaceC4236eK) {
        return interfaceC4236eK.f(this);
    }

    @Override // com.daaw.AbstractC3958dK
    public String c() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.B.size() - 1; i++) {
            sb.append(((AbstractC3958dK) this.B.get(i)).c());
            sb.append(",");
        }
        if (this.B.size() > 0) {
            sb.append(((AbstractC3958dK) this.B.get(r1.size() - 1)).c());
        }
        return sb.toString();
    }

    public C5013h4 e(AbstractC3958dK abstractC3958dK) {
        this.B.add(abstractC3958dK);
        return this;
    }

    public List f() {
        return DesugarCollections.unmodifiableList(this.B);
    }
}
