package com.daaw;

import android.graphics.Bitmap;
import com.daaw.HS;

/* JADX INFO: renamed from: com.daaw.zS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10153zS implements HS.a {
    public final InterfaceC1883Pf a;

    public C10153zS(InterfaceC1883Pf interfaceC1883Pf) {
        this.a = interfaceC1883Pf;
    }

    @Override // com.daaw.HS.a
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.a.e(i, i2, config);
    }

    @Override // com.daaw.HS.a
    public void b(Bitmap bitmap) {
        if (this.a.a(bitmap)) {
            return;
        }
        bitmap.recycle();
    }
}
