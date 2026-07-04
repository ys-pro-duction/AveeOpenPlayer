package com.daaw;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.pT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7364pT2 extends TT2 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public C7364pT2(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws LS2 {
        try {
            Uri uri = c5835k03.a;
            this.f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m(c5835k03);
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(c5835k03.f) < c5835k03.f) {
                throw new LS2(null, 2008);
            }
            long j = c5835k03.g;
            if (j != -1) {
                this.h = j;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            n(c5835k03);
            return this.h;
        } catch (LS2 e) {
            throw e;
        } catch (IOException e2) {
            throw new LS2(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws LS2 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new LS2(e, 2000);
            }
        }
        InputStream inputStream = this.g;
        int i3 = AbstractC9004vJ2.a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - ((long) i4);
        }
        b(i4);
        return i4;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    l();
                }
            } catch (IOException e) {
                throw new LS2(e, 2000);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
                l();
            }
            throw th;
        }
    }
}
