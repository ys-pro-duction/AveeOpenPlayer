package com.daaw;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.daaw.Rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2113Rf implements KI0 {
    public final Bitmap a;
    public final InterfaceC1883Pf b;

    public C2113Rf(Bitmap bitmap, InterfaceC1883Pf interfaceC1883Pf) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (interfaceC1883Pf == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.a = bitmap;
        this.b = interfaceC1883Pf;
    }

    public static C2113Rf d(Bitmap bitmap, InterfaceC1883Pf interfaceC1883Pf) {
        if (bitmap == null) {
            return null;
        }
        return new C2113Rf(bitmap, interfaceC1883Pf);
    }

    @Override // com.daaw.KI0
    public int a() {
        return AbstractC6559mb1.f(this.a);
    }

    @Override // com.daaw.KI0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.a;
    }

    @Override // com.daaw.KI0
    public void c() {
        if (this.b.a(this.a)) {
            return;
        }
        this.a.recycle();
    }
}
