package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class HK extends AbstractC3759cd0 {
    public HK(Context context, Uri uri) {
        super(context, uri);
    }

    @Override // com.daaw.AbstractC3759cd0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.daaw.AbstractC3759cd0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor d(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }
}
