package com.daaw;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.daaw.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8086s3 implements InterfaceC2595Vv {
    public final InterfaceC2595Vv a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public C8086s3(InterfaceC2595Vv interfaceC2595Vv, byte[] bArr, byte[] bArr2) {
        this.a = interfaceC2595Vv;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public int c(byte[] bArr, int i, int i2) throws IOException {
        AbstractC7115ob.f(this.d != null);
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public long d(C2907Yv c2907Yv) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                C2803Xv c2803Xv = new C2803Xv(this.a, c2907Yv);
                this.d = new CipherInputStream(c2803Xv, cipher);
                c2803Xv.d();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public Uri e() {
        return this.a.e();
    }
}
