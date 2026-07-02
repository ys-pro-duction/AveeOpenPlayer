package com.daaw;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DK extends AbstractC7673qb {
    public DK(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.daaw.AbstractC7673qb
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.daaw.AbstractC7673qb
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor d(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
