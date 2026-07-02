package com.daaw;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.yE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9819yE0 implements InterfaceC2595Vv {
    public final Resources a;
    public final InterfaceC5299i51 b;
    public Uri c;
    public AssetFileDescriptor d;
    public InputStream e;
    public long f;
    public boolean g;

    /* JADX INFO: renamed from: com.daaw.yE0$a */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C9819yE0(Context context, InterfaceC5299i51 interfaceC5299i51) {
        this.a = context.getResources();
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
                InputStream inputStream = this.e;
                if (inputStream != null) {
                    inputStream.close();
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
            if (!TextUtils.equals("rawresource", uri.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                this.d = this.a.openRawResourceFd(Integer.parseInt(this.c.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.d.getFileDescriptor());
                this.e = fileInputStream;
                fileInputStream.skip(this.d.getStartOffset());
                if (this.e.skip(c2907Yv.d) < c2907Yv.d) {
                    throw new EOFException();
                }
                long j = c2907Yv.e;
                long j2 = -1;
                if (j != -1) {
                    this.f = j;
                } else {
                    long length = this.d.getLength();
                    if (length != -1) {
                        j2 = length - c2907Yv.d;
                    }
                    this.f = j2;
                }
                this.g = true;
                InterfaceC5299i51 interfaceC5299i51 = this.b;
                if (interfaceC5299i51 != null) {
                    interfaceC5299i51.c(this, c2907Yv);
                }
                return this.f;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public Uri e() {
        return this.c;
    }
}
