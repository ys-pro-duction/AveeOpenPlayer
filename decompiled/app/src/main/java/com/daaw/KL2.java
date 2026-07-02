package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class KL2 {
    public final C6116kz1 a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public KL2(C6116kz1 c6116kz1, File file, File file2, File file3) {
        this.a = c6116kz1;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }

    public final C6116kz1 a() {
        return this.a;
    }

    public final File b() {
        return this.c;
    }

    public final File c() {
        return this.b;
    }

    public final boolean d(long j) {
        return this.a.N() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] e() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrE;
        ArrayList arrayList;
        int iMin;
        FileInputStream fileInputStream2 = null;
        if (this.e == null) {
            try {
                fileInputStream = new FileInputStream(this.d);
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                arrayList = new ArrayList();
                iMin = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } catch (IOException unused2) {
                AbstractC7656qX.a(fileInputStream);
                bArrE = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC7656qX.a(fileInputStream2);
                throw th;
            }
            while (true) {
                byte[] bArr = new byte[iMin];
                int i = 0;
                while (i < iMin) {
                    int i2 = fileInputStream.read(bArr, i, iMin - i);
                    if (i2 == -1) {
                        break;
                    }
                    i += i2;
                }
                AbstractC9213w33 abstractC9213w33T = i == 0 ? null : AbstractC9213w33.T(bArr, 0, i);
                if (abstractC9213w33T == null) {
                    break;
                }
                arrayList.add(abstractC9213w33T);
                iMin = Math.min(iMin + iMin, 8192);
                this.e = bArrE;
            }
            bArrE = AbstractC9213w33.S(arrayList).e();
            AbstractC7656qX.a(fileInputStream);
            this.e = bArrE;
        }
        byte[] bArr2 = this.e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}
