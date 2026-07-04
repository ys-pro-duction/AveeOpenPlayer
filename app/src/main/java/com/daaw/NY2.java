package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class NY2 implements YT2 {
    public static final NY2 a = new NY2();

    public static void b() {
        AbstractC3165aU2.g(a);
    }

    @Override // com.daaw.YT2
    public final /* bridge */ /* synthetic */ Object a(XT2 xt2) throws GeneralSecurityException {
        if (xt2.a() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = xt2.d().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new MY2(xt2, null);
    }

    @Override // com.daaw.YT2
    public final Class zza() {
        return KY2.class;
    }

    @Override // com.daaw.YT2
    public final Class zzb() {
        return KY2.class;
    }
}
