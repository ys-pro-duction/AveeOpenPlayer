package com.daaw;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public class HS {
    public static final String q = "HS";
    public static final Bitmap.Config r = Bitmap.Config.ARGB_8888;
    public int[] a;
    public ByteBuffer c;
    public short[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public int[] i;
    public int j;
    public byte[] k;
    public a m;
    public Bitmap n;
    public boolean o;
    public int p;
    public final int[] b = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public final byte[] d = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public QS l = new QS();

    public interface a {
        Bitmap a(int i, int i2, Bitmap.Config config);

        void b(Bitmap bitmap);
    }

    public HS(a aVar) {
        this.m = aVar;
    }

    public static void n(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }

    public void a() {
        this.j = (this.j + 1) % this.l.c;
    }

    public void b() {
        this.l = null;
        this.k = null;
        this.h = null;
        this.i = null;
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            this.m.b(bitmap);
        }
        this.n = null;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f A[PHI: r9
  0x013f: PHI (r9v11 int) = (r9v6 int), (r9v13 int), (r9v13 int) binds: [B:54:0x0125, B:60:0x013d, B:58:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v39, types: [short] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.daaw.MS r29) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.HS.c(com.daaw.MS):void");
    }

    public int d() {
        return this.j;
    }

    public int e(int i) {
        if (i < 0) {
            return -1;
        }
        QS qs = this.l;
        if (i < qs.c) {
            return ((MS) qs.e.get(i)).i;
        }
        return -1;
    }

    public int f() {
        return this.l.c;
    }

    public final Bitmap g() {
        a aVar = this.m;
        QS qs = this.l;
        int i = qs.f;
        int i2 = qs.g;
        Bitmap.Config config = r;
        Bitmap bitmapA = aVar.a(i, i2, config);
        if (bitmapA == null) {
            QS qs2 = this.l;
            bitmapA = Bitmap.createBitmap(qs2.f, qs2.g, config);
        }
        n(bitmapA);
        return bitmapA;
    }

    public int h() {
        int i;
        if (this.l.c <= 0 || (i = this.j) < 0) {
            return -1;
        }
        return e(i);
    }

    public synchronized Bitmap i() {
        try {
            if (this.l.c <= 0 || this.j < 0) {
                if (Log.isLoggable(q, 3)) {
                    int i = this.l.c;
                }
                this.p = 1;
            }
            int i2 = this.p;
            if (i2 != 1 && i2 != 2) {
                this.p = 0;
                MS ms = (MS) this.l.e.get(this.j);
                int i3 = this.j - 1;
                MS ms2 = i3 >= 0 ? (MS) this.l.e.get(i3) : null;
                int[] iArr = ms.k;
                if (iArr == null) {
                    iArr = this.l.a;
                }
                this.a = iArr;
                if (iArr == null) {
                    this.p = 1;
                    return null;
                }
                if (ms.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[ms.h] = 0;
                }
                return p(ms, ms2);
            }
            return null;
        } finally {
        }
    }

    public int j() {
        int i = this.l.m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    public final int k() {
        try {
            return this.c.get() & 255;
        } catch (Exception unused) {
            this.p = 1;
            return 0;
        }
    }

    public final int l() {
        int iK = k();
        int i = 0;
        if (iK > 0) {
            while (i < iK) {
                int i2 = iK - i;
                try {
                    this.c.get(this.d, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    this.p = 1;
                }
            }
        }
        return i;
    }

    public void m() {
        this.j = -1;
    }

    public void o(QS qs, byte[] bArr) {
        this.l = qs;
        this.k = bArr;
        this.p = 0;
        this.j = -1;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.c = byteBufferWrap;
        byteBufferWrap.rewind();
        this.c.order(ByteOrder.LITTLE_ENDIAN);
        this.o = false;
        Iterator it = qs.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((MS) it.next()).g == 3) {
                this.o = true;
                break;
            }
        }
        int i = qs.f;
        int i2 = qs.g;
        this.h = new byte[i * i2];
        this.i = new int[i * i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap p(com.daaw.MS r17, com.daaw.MS r18) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.HS.p(com.daaw.MS, com.daaw.MS):android.graphics.Bitmap");
    }
}
