package com.daaw;

import android.graphics.RectF;
import java.util.Random;

/* JADX INFO: renamed from: com.daaw.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0720Ea implements HW {
    public Random a = new Random();

    @Override // com.daaw.HW
    public void l(RectF rectF, C1665Nc1 c1665Nc1, C1665Nc1 c1665Nc12, boolean z) {
        float fNextFloat = this.a.nextFloat();
        c1665Nc1.a = rectF.centerX();
        c1665Nc1.b = rectF.top + (rectF.height() * fNextFloat);
        c1665Nc1.c = 0.0f;
        c1665Nc12.a = 1.0f;
        c1665Nc12.b = 0.0f;
        c1665Nc12.c = 0.0f;
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
    }
}
