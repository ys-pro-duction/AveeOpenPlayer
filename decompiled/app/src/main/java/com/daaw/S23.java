package com.daaw;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class S23 extends ThreadLocal {
    public final /* synthetic */ T23 a;

    public S23(T23 t23) {
        this.a = t23;
    }

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) G23.c.a(this.a.b);
            mac.init(this.a.c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
