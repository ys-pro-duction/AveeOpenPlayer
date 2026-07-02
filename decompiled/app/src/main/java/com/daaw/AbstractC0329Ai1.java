package com.daaw;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ai1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0329Ai1 {
    public static AbstractC0329Ai1 d(Context context) {
        return C0537Ci1.k(context);
    }

    public static void e(Context context, androidx.work.a aVar) {
        C0537Ci1.e(context, aVar);
    }

    public abstract InterfaceC2054Qq0 a(String str);

    public final InterfaceC2054Qq0 b(AbstractC1585Mi1 abstractC1585Mi1) {
        return c(Collections.singletonList(abstractC1585Mi1));
    }

    public abstract InterfaceC2054Qq0 c(List list);
}
