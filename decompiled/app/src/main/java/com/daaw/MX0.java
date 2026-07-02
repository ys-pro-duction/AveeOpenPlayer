package com.daaw;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class MX0 extends AbstractC7673qb {
    public MX0(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.daaw.AbstractC7673qb
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.daaw.AbstractC7673qb
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
