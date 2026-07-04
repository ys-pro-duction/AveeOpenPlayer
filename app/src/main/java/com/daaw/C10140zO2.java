package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10140zO2 {
    public final TN2 a;
    public final InterfaceC9861yO2 b;

    public C10140zO2(InterfaceC9861yO2 interfaceC9861yO2) {
        SN2 sn2 = SN2.C;
        this.b = interfaceC9861yO2;
        this.a = sn2;
    }

    public static C10140zO2 b(int i) {
        return new C10140zO2(new C9024vO2(4000));
    }

    public static C10140zO2 c(TN2 tn2) {
        return new C10140zO2(new C8459tO2(tn2));
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new C9303wO2(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.b.a(this, charSequence);
    }
}
