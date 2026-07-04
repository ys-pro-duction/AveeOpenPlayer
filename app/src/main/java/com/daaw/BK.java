package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class BK implements InterfaceC2595Vv {
    public final InterfaceC5299i51 a;
    public RandomAccessFile b;
    public Uri c;
    public long d;
    public boolean e;

    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public BK(InterfaceC5299i51 interfaceC5299i51) {
        this.a = interfaceC5299i51;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public int c(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        try {
            int i3 = this.b.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.d -= (long) i3;
                InterfaceC5299i51 interfaceC5299i51 = this.a;
                if (interfaceC5299i51 != null) {
                    interfaceC5299i51.a(this, i3);
                }
            }
            return i3;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public void close() {
        this.c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.b = null;
            if (this.e) {
                this.e = false;
                InterfaceC5299i51 interfaceC5299i51 = this.a;
                if (interfaceC5299i51 != null) {
                    interfaceC5299i51.b(this);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public long d(C2907Yv c2907Yv) throws a {
        try {
            this.c = c2907Yv.a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c2907Yv.a.getPath(), "r");
            this.b = randomAccessFile;
            randomAccessFile.seek(c2907Yv.d);
            long length = c2907Yv.e;
            if (length == -1) {
                length = this.b.length() - c2907Yv.d;
            }
            this.d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.e = true;
            InterfaceC5299i51 interfaceC5299i51 = this.a;
            if (interfaceC5299i51 != null) {
                interfaceC5299i51.c(this, c2907Yv);
            }
            return this.d;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public Uri e() {
        return this.c;
    }
}
