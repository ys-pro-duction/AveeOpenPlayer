package com.daaw;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: renamed from: com.daaw.a90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3078a90 extends Paint {
    public C3078a90() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(AbstractC9678xk0.c(i, 0, 255));
        } else {
            setColor((AbstractC9678xk0.c(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public C3078a90(int i) {
        super(i);
    }

    public C3078a90(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C3078a90(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
