package com.daaw;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7394pb implements InterfaceC2595Vv {
    public final AssetManager a;
    public final InterfaceC5299i51 b;
    public Uri c;
    public InputStream d;
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: com.daaw.pb$a */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C7394pb(Context context, InterfaceC5299i51 interfaceC5299i51) {
        this.a = context.getAssets();
        this.b = interfaceC5299i51;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public int c(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
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
        int i3 = this.d.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - ((long) i3);
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
                InputStream inputStream = this.d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.d = null;
            if (this.f) {
                this.f = false;
                InterfaceC5299i51 interfaceC5299i51 = this.b;
                if (interfaceC5299i51 != null) {
                    interfaceC5299i51.b(this);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public long d(C2907Yv c2907Yv) throws a {
        try {
            Uri uri = c2907Yv.a;
            this.c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.a.open(path, 1);
            this.d = inputStreamOpen;
            if (inputStreamOpen.skip(c2907Yv.d) < c2907Yv.d) {
                throw new EOFException();
            }
            long j = c2907Yv.e;
            if (j != -1) {
                this.e = j;
            } else {
                long jAvailable = this.d.available();
                this.e = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.e = -1L;
                }
            }
            this.f = true;
            InterfaceC5299i51 interfaceC5299i51 = this.b;
            if (interfaceC5299i51 != null) {
                interfaceC5299i51.c(this, c2907Yv);
            }
            return this.e;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public Uri e() {
        return this.c;
    }
}
