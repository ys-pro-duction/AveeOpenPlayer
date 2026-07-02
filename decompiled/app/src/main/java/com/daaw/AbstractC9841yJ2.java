package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.yJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9841yJ2 {
    public static AbstractC9841yJ2 a(C10120zJ2 c10120zJ2, AJ2 aj2) {
        if (AbstractC9283wJ2.b()) {
            return new CJ2(c10120zJ2, aj2);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b(View view, FJ2 fj2, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
