package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.ff1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4616ff1 extends C4049df1 {
    public static boolean h = true;

    @Override // com.daaw.AbstractC5733jf1
    public void e(View view, int i, int i2, int i3, int i4) {
        if (h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
