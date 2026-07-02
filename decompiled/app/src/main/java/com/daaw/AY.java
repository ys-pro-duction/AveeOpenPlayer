package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class AY {
    public final InputStream a;
    public final ParcelFileDescriptor b;

    public AY(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = inputStream;
        this.b = parcelFileDescriptor;
    }

    public ParcelFileDescriptor a() {
        return this.b;
    }

    public InputStream b() {
        return this.a;
    }
}
