package com.daaw;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class B2 {

    public static final class a {
        public final Object a;

        public a(Object obj) {
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public a b(Context context, Object obj) {
        G10.g(context, "context");
        return null;
    }

    public abstract Object c(int i, Intent intent);
}
