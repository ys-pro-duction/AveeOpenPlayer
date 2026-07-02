package com.daaw;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class V83 extends TT2 {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public InputStream i;
    public long j;
    public boolean k;

    public V83(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.daaw.InterfaceC7659qX2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.daaw.C5835k03 r18) throws com.daaw.R83 {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.V83.a(com.daaw.k03):long");
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws R83 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new R83(null, e, 2000);
            }
        }
        InputStream inputStream = this.i;
        int i3 = AbstractC9004vJ2.a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new R83("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - ((long) i4);
        }
        b(i4);
        return i4;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.g;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        this.g = null;
        try {
            try {
                InputStream inputStream = this.i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new R83(null, e, 2000);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        l();
                    }
                }
            } catch (Throwable th) {
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            l();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.h = null;
                        if (this.k) {
                            this.k = false;
                            l();
                        }
                        throw th2;
                    }
                } catch (IOException e2) {
                    throw new R83(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new R83(null, e3, 2000);
        }
    }
}
