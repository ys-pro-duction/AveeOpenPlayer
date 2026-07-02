package com.daaw;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class OX2 {
    public final Map a;
    public final Map b;

    public /* synthetic */ OX2(NX2 nx2) {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final OX2 a(LX2 lx2) throws GeneralSecurityException {
        QX2 qx2 = new QX2(lx2.c(), lx2.d(), null);
        if (!this.a.containsKey(qx2)) {
            this.a.put(qx2, lx2);
            return this;
        }
        LX2 lx22 = (LX2) this.a.get(qx2);
        if (lx22.equals(lx2) && lx2.equals(lx22)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(qx2.toString()));
    }

    public final OX2 b(YT2 yt2) throws GeneralSecurityException {
        Map map = this.b;
        Class clsZzb = yt2.zzb();
        if (!map.containsKey(clsZzb)) {
            this.b.put(clsZzb, yt2);
            return this;
        }
        YT2 yt22 = (YT2) this.b.get(clsZzb);
        if (yt22.equals(yt2) && yt2.equals(yt22)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    public /* synthetic */ OX2(WX2 wx2, NX2 nx2) {
        this.a = new HashMap(wx2.a);
        this.b = new HashMap(wx2.b);
    }
}
