package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: renamed from: com.daaw.Xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2767Xm extends ColorDrawable {
    public float a;
    public Paint b;
    public Paint c;
    public Paint d;

    public C2767Xm(int i) {
        super(i);
        this.b = AbstractC8874us0.c().e(Paint.Style.STROKE).d(this.a).b(-6381922).a();
        this.c = AbstractC8874us0.c().e(Paint.Style.FILL).b(0).a();
        this.d = AbstractC8874us0.c().c(AbstractC8874us0.b(26)).a();
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawColor(0);
        float width = canvas.getWidth() / 2.0f;
        float f = width / 8.0f;
        this.a = f;
        this.b.setStrokeWidth(f);
        this.c.setColor(getColor());
        canvas.drawCircle(width, width, width - this.a, this.d);
        canvas.drawCircle(width, width, width - this.a, this.c);
        canvas.drawCircle(width, width, width - this.a, this.b);
    }

    @Override // android.graphics.drawable.ColorDrawable
    public void setColor(int i) {
        super.setColor(i);
        invalidateSelf();
    }
}
