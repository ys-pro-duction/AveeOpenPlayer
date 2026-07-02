package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.nZ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6830nZ2 implements YT2 {
    public static final C6830nZ2 a = new C6830nZ2();
    public static final LX2 b = LX2.b(new JX2() { // from class: com.daaw.kZ2
        @Override // com.daaw.JX2
        public final Object a(AbstractC8758uT2 abstractC8758uT2) {
            return CZ2.b((C6264lX2) abstractC8758uT2);
        }
    }, C6264lX2.class, LT2.class);

    public static void b() {
        AbstractC3165aU2.g(a);
        C9339wX2.a().e(b);
    }

    @Override // com.daaw.YT2
    public final /* bridge */ /* synthetic */ Object a(XT2 xt2) throws GeneralSecurityException {
        Iterator it = xt2.d().iterator();
        while (it.hasNext()) {
            for (PT2 pt2 : (List) it.next()) {
                if (pt2.b() instanceof AbstractC5425iZ2) {
                    AbstractC5425iZ2 abstractC5425iZ2 = (AbstractC5425iZ2) pt2.b();
                    Y23 y23B = Y23.b(pt2.g());
                    if (!y23B.equals(abstractC5425iZ2.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(abstractC5425iZ2.a()) + " has wrong output prefix (" + abstractC5425iZ2.b().toString() + ") instead of (" + y23B.toString() + ")");
                    }
                }
            }
        }
        return new C6551mZ2(xt2, null);
    }

    @Override // com.daaw.YT2
    public final Class zza() {
        return LT2.class;
    }

    @Override // com.daaw.YT2
    public final Class zzb() {
        return LT2.class;
    }
}
