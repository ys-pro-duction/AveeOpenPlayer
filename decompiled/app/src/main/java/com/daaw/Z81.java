package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class Z81 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final androidx.emoji2.text.f b;
    public volatile int c = 0;

    public Z81(androidx.emoji2.text.f fVar, int i) {
        this.b = fVar;
        this.a = i;
    }

    public void a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface typefaceG = this.b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.b.c(), this.a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return g().h(i);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final C4351ek0 g() {
        ThreadLocal threadLocal = d;
        C4351ek0 c4351ek0 = (C4351ek0) threadLocal.get();
        if (c4351ek0 == null) {
            c4351ek0 = new C4351ek0();
            threadLocal.set(c4351ek0);
        }
        this.b.d().j(c4351ek0, this.a);
        return c4351ek0;
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.c & 4) > 0;
    }

    public void l(boolean z) {
        int iD = d();
        if (z) {
            this.c = iD | 4;
        } else {
            this.c = iD;
        }
    }

    public void m(boolean z) {
        int i = this.c & 4;
        this.c = z ? i | 2 : i | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i = 0; i < iC; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
