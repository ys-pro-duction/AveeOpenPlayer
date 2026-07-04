package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sX2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8216sX2 {
    public static final KZ2 a = new C7937rX2(null);

    public static QZ2 a(XT2 xt2) {
        C10160zT2 c10160zT2;
        MZ2 mz2 = new MZ2();
        mz2.b(xt2.b());
        Iterator it = xt2.d().iterator();
        while (it.hasNext()) {
            for (PT2 pt2 : (List) it.next()) {
                int iH = pt2.h() - 2;
                if (iH == 1) {
                    c10160zT2 = C10160zT2.b;
                } else if (iH == 2) {
                    c10160zT2 = C10160zT2.c;
                } else {
                    if (iH != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    c10160zT2 = C10160zT2.d;
                }
                int iA = pt2.a();
                String strF = pt2.f();
                if (strF.startsWith("type.googleapis.com/google.crypto.")) {
                    strF = strF.substring(34);
                }
                mz2.a(c10160zT2, iA, strF, pt2.c().name());
            }
        }
        if (xt2.a() != null) {
            mz2.c(xt2.a().a());
        }
        try {
            return mz2.d();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
