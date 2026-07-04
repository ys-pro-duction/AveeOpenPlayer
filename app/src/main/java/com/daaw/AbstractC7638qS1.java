package com.daaw;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: com.daaw.qS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7638qS1 {
    public static AbstractC7638qS1 a;

    public static AbstractC7638qS1 a(Context context) {
        AbstractC7638qS1 abstractC7638qS1;
        synchronized (AbstractC7638qS1.class) {
            try {
                if (a == null) {
                    C7207ot1 c7207ot1 = new C7207ot1(null);
                    c7207ot1.b((Application) context.getApplicationContext());
                    a = c7207ot1.a();
                }
                abstractC7638qS1 = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC7638qS1;
    }

    public abstract Ve3 b();

    public abstract C10131zM1 c();
}
