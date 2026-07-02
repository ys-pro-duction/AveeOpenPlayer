package com.daaw;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.Objects;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.daaw.Mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1571Mf implements OI0 {
    public Bitmap.CompressFormat a;
    public int b;

    public C1571Mf() {
        this(null, 90);
    }

    @Override // com.daaw.CG
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(KI0 ki0, OutputStream outputStream) {
        Bitmap bitmap = (Bitmap) ki0.get();
        long jB = AbstractC1357Kd0.b();
        Bitmap.CompressFormat compressFormatC = c(bitmap);
        bitmap.compress(compressFormatC, this.b, outputStream);
        if (!Log.isLoggable("BitmapEncoder", 2)) {
            return true;
        }
        Objects.toString(compressFormatC);
        AbstractC6559mb1.f(bitmap);
        AbstractC1357Kd0.a(jB);
        return true;
    }

    public final Bitmap.CompressFormat c(Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat = this.a;
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.daaw.CG
    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    public C1571Mf(Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }
}
