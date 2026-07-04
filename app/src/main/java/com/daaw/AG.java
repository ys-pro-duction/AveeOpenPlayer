package com.daaw;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class AG {
    public static final String[] c = {"ISO-8859-1", "UTF-16LE", "UTF-16BE", "UTF-8"};
    public static final byte[] d = {0, 2, 1, 3};
    public static final byte[][] e = {new byte[0], new byte[]{-1, -2}, new byte[]{-2, -1}, new byte[0]};
    public static final byte[][] f = {new byte[]{0}, new byte[]{0, 0}, new byte[]{0, 0}, new byte[]{0}};
    public byte[] a;
    public byte b;

    public AG(byte b, byte[] bArr) {
        if (b == 1 && h(bArr) == 2) {
            this.b = (byte) 2;
        } else {
            this.b = b;
        }
        this.a = bArr;
        g();
    }

    public static CharBuffer a(byte[] bArr, String str) {
        return Charset.forName(str).newDecoder().decode(ByteBuffer.wrap(bArr));
    }

    public static String b(byte[] bArr, String str) {
        String string = a(bArr, str).toString();
        int iIndexOf = string.indexOf(0);
        return iIndexOf == -1 ? string : string.substring(0, iIndexOf);
    }

    public static byte[] c(CharBuffer charBuffer, String str) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = Charset.forName(str).newEncoder().encode(charBuffer);
        return AbstractC6308lh.e(byteBufferEncode.array(), 0, byteBufferEncode.limit());
    }

    public static String d(byte b) {
        try {
            return c[b];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Invalid text encoding " + ((int) b));
        }
    }

    public static byte[] f(String str, String str2) {
        try {
            return c(CharBuffer.wrap(str), str2);
        } catch (CharacterCodingException unused) {
            return null;
        }
    }

    public static byte h(byte[] bArr) {
        if (bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            return (byte) 1;
        }
        if (bArr.length >= 2 && bArr[0] == -2 && bArr[1] == -1) {
            return (byte) 2;
        }
        return (bArr.length >= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) ? (byte) 3 : (byte) 0;
    }

    public byte[] e() {
        return f[this.b];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AG ag = (AG) obj;
        return this.b == ag.b && Arrays.equals(this.a, ag.a);
    }

    public final void g() {
        int length;
        byte b;
        byte[] bArr = this.a;
        int i = 2;
        if (bArr.length < 2 || (((b = bArr[0]) != -2 || bArr[1] != -1) && (b != -1 || bArr[1] != -2))) {
            i = (bArr.length >= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) ? 3 : 0;
        }
        byte[] bArr2 = f[this.b];
        if (bArr.length - i < bArr2.length) {
            length = 0;
            break;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            byte[] bArr3 = this.a;
            if (bArr3[(bArr3.length - bArr2.length) + i2] != bArr2[i2]) {
                length = 0;
                break;
            }
        }
        length = bArr2.length;
        if (i + length > 0) {
            byte[] bArr4 = this.a;
            int length2 = (bArr4.length - i) - length;
            byte[] bArr5 = new byte[length2];
            if (length2 > 0) {
                System.arraycopy(bArr4, i, bArr5, 0, length2);
            }
            this.a = bArr5;
        }
    }

    public int hashCode() {
        return ((this.b + 31) * 31) + Arrays.hashCode(this.a);
    }

    public String toString() {
        try {
            return b(this.a, d(this.b));
        } catch (CharacterCodingException unused) {
            return null;
        }
    }

    public AG(byte b, String str) {
        this.b = b;
        this.a = f(str, d(b));
        g();
    }
}
