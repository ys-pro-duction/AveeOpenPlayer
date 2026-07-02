package com.daaw;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.zw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10295zw1 {
    public static boolean a = false;
    public static MessageDigest b;
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final CountDownLatch e = new CountDownLatch(1);

    public static String a(byte[] bArr, String str) {
        byte[] bArrG;
        Vector vectorB = b(bArr, 255);
        if (vectorB == null || vectorB.isEmpty()) {
            bArrG = g(f(4096).h(), str, true);
        } else {
            C6383lw1 c6383lw1M = C6662mw1.M();
            int size = vectorB.size();
            for (int i = 0; i < size; i++) {
                c6383lw1M.n(AbstractC9213w33.T(g((byte[]) vectorB.get(i), str, false), 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            }
            byte[] bArrE = e(bArr);
            AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
            c6383lw1M.o(AbstractC9213w33.T(bArrE, 0, bArrE.length));
            bArrG = ((C6662mw1) c6383lw1M.j()).h();
        }
        return AbstractC7499pw1.a(bArrG, true);
    }

    public static Vector b(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void d() {
        synchronized (d) {
            try {
                if (!a) {
                    a = true;
                    new Thread(new RunnableC10016yw1(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] e(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (c) {
            try {
                d();
                MessageDigest messageDigest2 = null;
                try {
                    if (e.await(2L, TimeUnit.SECONDS) && (messageDigest = b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static C3013Zv1 f(int i) {
        C9733xv1 c9733xv1M0 = C3013Zv1.m0();
        c9733xv1M0.r(4096L);
        return (C3013Zv1) c9733xv1M0.j();
    }

    public static byte[] g(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = f(4096).h();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i2).put(b2).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i2).put(b2).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(PSKKeyManager.MAX_KEY_LENGTH_BYTES).put(e(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        InterfaceC0385Aw1[] interfaceC0385Aw1Arr = new C4703fx1().G2;
        int length3 = interfaceC0385Aw1Arr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            interfaceC0385Aw1Arr[i3].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new C6941nw1(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
