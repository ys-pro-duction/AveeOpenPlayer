package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.daaw.i63, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5306i63 extends TT2 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public C5306i63() {
        super(false);
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws G53 {
        Uri uri = c5835k03.a;
        this.f = uri;
        m(c5835k03);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(c5835k03.f);
                long length = c5835k03.g;
                if (length == -1) {
                    length = this.e.length() - c5835k03.f;
                }
                this.g = length;
                if (length < 0) {
                    throw new G53(null, null, 2008);
                }
                this.h = true;
                n(c5835k03);
                return this.g;
            } catch (IOException e) {
                throw new G53(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new G53(e2, (AbstractC9004vJ2.a < 21 || !AbstractC6985o53.b(e2.getCause())) ? 2005 : 2006);
            }
            throw new G53(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new G53(e3, 2006);
        } catch (RuntimeException e4) {
            throw new G53(e4, 2000);
        }
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws G53 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = AbstractC9004vJ2.a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.g -= (long) i4;
                b(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new G53(e, 2000);
        }
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
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    l();
                }
            } catch (IOException e) {
                throw new G53(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                l();
            }
            throw th;
        }
    }
}
