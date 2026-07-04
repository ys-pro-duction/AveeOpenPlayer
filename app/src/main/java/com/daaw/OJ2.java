package com.daaw;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class OJ2 extends RJ2 {
    public static final OJ2 E = new OJ2();

    public static OJ2 i() {
        return E;
    }

    @Override // com.daaw.RJ2
    public final void b(boolean z) {
        Iterator it = PJ2.a().c().iterator();
        while (it.hasNext()) {
            AbstractC4807gK2 abstractC4807gK2G = ((CJ2) it.next()).g();
            if (abstractC4807gK2G.l()) {
                ZJ2.a().b(abstractC4807gK2G.a(), "setState", true != z ? "backgrounded" : "foregrounded");
            }
        }
    }

    @Override // com.daaw.RJ2
    public final boolean c() {
        Iterator it = PJ2.a().b().iterator();
        while (it.hasNext()) {
            View viewF = ((CJ2) it.next()).f();
            if (viewF != null && viewF.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
