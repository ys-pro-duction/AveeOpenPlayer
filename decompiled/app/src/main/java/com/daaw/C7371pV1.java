package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7371pV1 implements Iterable {
    public final List B = new ArrayList();

    public final C7092oV1 e(FU1 fu1) {
        Iterator it = iterator();
        while (it.hasNext()) {
            C7092oV1 c7092oV1 = (C7092oV1) it.next();
            if (c7092oV1.c == fu1) {
                return c7092oV1;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.B.iterator();
    }

    public final void m(C7092oV1 c7092oV1) {
        this.B.add(c7092oV1);
    }

    public final void p(C7092oV1 c7092oV1) {
        this.B.remove(c7092oV1);
    }

    public final boolean q(FU1 fu1) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            C7092oV1 c7092oV1 = (C7092oV1) it.next();
            if (c7092oV1.c == fu1) {
                arrayList.add(c7092oV1);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C7092oV1) it2.next()).d.k();
        }
        return true;
    }
}
