package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KT2 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static JT2 a(String str) throws GeneralSecurityException {
        Iterator it = a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        AbstractC6314li0.a(it.next());
        throw null;
    }
}
