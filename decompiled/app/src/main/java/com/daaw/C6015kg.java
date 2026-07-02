package com.daaw;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: renamed from: com.daaw.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6015kg {
    public static volatile C6015kg b;
    public Toast a;

    public C6015kg(Toast toast) {
        if (toast == null) {
            throw new NullPointerException("Boast.Boast(Toast) requires a non-null parameter.");
        }
        this.a = toast;
    }

    public static C6015kg b(Context context, int i) {
        return new C6015kg(Toast.makeText(context, i, 0));
    }

    public static C6015kg c(Context context, CharSequence charSequence) {
        return new C6015kg(Toast.makeText(context, charSequence, 0));
    }

    public static C6015kg d(Context context, CharSequence charSequence, int i) {
        return new C6015kg(Toast.makeText(context, charSequence, i));
    }

    public void a() {
        this.a.cancel();
    }

    public void e() {
        f(true);
    }

    public void f(boolean z) {
        if (z && b != null) {
            b.a();
        }
        b = this;
        this.a.show();
    }
}
