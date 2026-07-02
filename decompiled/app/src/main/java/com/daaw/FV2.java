package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class FV2 extends TT2 {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public FV2(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws C3448bV2 {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = c5835k03.a.normalizeScheme();
                this.f = uriNormalizeScheme;
                m(c5835k03);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    try {
                        throw new C3448bV2(new IOException("Could not open file descriptor for: " + String.valueOf(uriNormalizeScheme)), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new C3448bV2(e, true != (e instanceof FileNotFoundException) ? 2000 : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && c5835k03.f > length) {
                    throw new C3448bV2(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(c5835k03.f + startOffset) - startOffset;
                if (jSkip != c5835k03.f) {
                    throw new C3448bV2(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.i = jPosition;
                        if (jPosition < 0) {
                            throw new C3448bV2(null, 2008);
                        }
                    }
                } else {
                    long j = length - jSkip;
                    this.i = j;
                    if (j < 0) {
                        throw new C3448bV2(null, 2008);
                    }
                    jPosition = j;
                }
                long jMin = c5835k03.g;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.i = jMin;
                }
                this.j = true;
                n(c5835k03);
                long j2 = c5835k03.g;
                return j2 != -1 ? j2 : this.i;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (C3448bV2 e3) {
            throw e3;
        }
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws C3448bV2 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C3448bV2(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = AbstractC9004vJ2.a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - ((long) i4);
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
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C3448bV2(e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        l();
                    }
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            l();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            l();
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    throw new C3448bV2(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C3448bV2(e3, 2000);
        }
    }
}
