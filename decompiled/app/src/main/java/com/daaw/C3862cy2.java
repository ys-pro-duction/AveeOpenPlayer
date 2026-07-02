package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.cy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3862cy2 extends AbstractC5341iE2 {
    public C3862cy2(int i) {
        super(i, null);
    }

    @Override // com.daaw.AbstractC5341iE2
    public final void b() {
        if (!k()) {
            if (c() > 0) {
                AbstractC6314li0.a(h(0).getKey());
                throw null;
            }
            Iterator it = d().iterator();
            if (it.hasNext()) {
                AbstractC6314li0.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.b();
    }
}
