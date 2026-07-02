package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: com.daaw.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2891Yr implements InterfaceC2595Vv {
    public final ContentResolver a;
    public final InterfaceC5299i51 b;
    public Uri c;
    public AssetFileDescriptor d;
    public FileInputStream e;
    public long f;
    public boolean g;

    /* JADX INFO: renamed from: com.daaw.Yr$a */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C2891Yr(Context context, InterfaceC5299i51 interfaceC5299i51) {
        this.a = context.getContentResolver();
        this.b = interfaceC5299i51;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public int c(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        int i3 = this.e.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - ((long) i3);
        }
        InterfaceC5299i51 interfaceC5299i51 = this.b;
        if (interfaceC5299i51 != null) {
            interfaceC5299i51.a(this, i3);
        }
        return i3;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public void close() {
        this.c = null;
        try {
            try {
                FileInputStream fileInputStream = this.e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e);
                    }
                } finally {
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        InterfaceC5299i51 interfaceC5299i51 = this.b;
                        if (interfaceC5299i51 != null) {
                            interfaceC5299i51.b(this);
                        }
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        InterfaceC5299i51 interfaceC5299i512 = this.b;
                        if (interfaceC5299i512 != null) {
                            interfaceC5299i512.b(this);
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(e3);
                }
            } finally {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    InterfaceC5299i51 interfaceC5299i513 = this.b;
                    if (interfaceC5299i513 != null) {
                        interfaceC5299i513.b(this);
                    }
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public long d(C2907Yv c2907Yv) throws a {
        try {
            Uri uri = c2907Yv.a;
            this.c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.a.openAssetFileDescriptor(uri, "r");
            this.d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.c);
            }
            this.e = new FileInputStream(this.d.getFileDescriptor());
            long startOffset = this.d.getStartOffset();
            long jSkip = this.e.skip(c2907Yv.d + startOffset) - startOffset;
            if (jSkip != c2907Yv.d) {
                throw new EOFException();
            }
            long j = c2907Yv.e;
            long jPosition = -1;
            if (j != -1) {
                this.f = j;
            } else {
                long length = this.d.getLength();
                if (length == -1) {
                    FileChannel channel = this.e.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        jPosition = size - channel.position();
                    }
                    this.f = jPosition;
                } else {
                    this.f = length - jSkip;
                }
            }
            this.g = true;
            InterfaceC5299i51 interfaceC5299i51 = this.b;
            if (interfaceC5299i51 != null) {
                interfaceC5299i51.c(this, c2907Yv);
            }
            return this.f;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public Uri e() {
        return this.c;
    }
}
