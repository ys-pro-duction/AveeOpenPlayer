package com.daaw;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class Yt3 implements Xt3 {
    public final WindowManager a;

    public Yt3(WindowManager windowManager) {
        this.a = windowManager;
    }

    public static Xt3 b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new Yt3(windowManager);
        }
        return null;
    }

    @Override // com.daaw.Xt3
    public final void a(Tt3 tt3) {
        bu3.b(tt3.a, this.a.getDefaultDisplay());
    }

    @Override // com.daaw.Xt3
    public final void zza() {
    }
}
