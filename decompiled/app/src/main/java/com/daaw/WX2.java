package com.daaw;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class WX2 {
    public final Map a;
    public final Map b;

    public /* synthetic */ WX2(OX2 ox2, VX2 vx2) {
        this.a = new HashMap(ox2.a);
        this.b = new HashMap(ox2.b);
    }

    public final Class a(Class cls) throws GeneralSecurityException {
        if (this.b.containsKey(cls)) {
            return ((YT2) this.b.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object b(AbstractC8758uT2 abstractC8758uT2, Class cls) throws GeneralSecurityException {
        QX2 qx2 = new QX2(abstractC8758uT2.getClass(), cls, null);
        if (this.a.containsKey(qx2)) {
            return ((LX2) this.a.get(qx2)).a(abstractC8758uT2);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + qx2.toString() + " available");
    }

    public final Object c(XT2 xt2, Class cls) throws GeneralSecurityException {
        if (!this.b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        YT2 yt2 = (YT2) this.b.get(cls);
        if (xt2.c().equals(yt2.zza()) && yt2.zza().equals(xt2.c())) {
            return yt2.a(xt2);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
