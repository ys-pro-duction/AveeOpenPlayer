package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7688qe {
    public static final AbstractC7688qe a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final AbstractC7688qe b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final AbstractC7688qe c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    public static final AbstractC7688qe d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    public static final AbstractC7688qe e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: com.daaw.qe$a */
    public static final class a {
        public final String a;
        public final char[] b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;
        public final boolean[] h;

        public a(String str, char[] cArr) {
            this.a = (String) AbstractC7785qy0.n(str);
            this.b = (char[]) AbstractC7785qy0.n(cArr);
            try {
                int iD = B00.d(cArr.length, RoundingMode.UNNECESSARY);
                this.d = iD;
                int iMin = Math.min(8, Integer.lowestOneBit(iD));
                try {
                    this.e = 8 / iMin;
                    this.f = iD / iMin;
                    this.c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        AbstractC7785qy0.f(c < 128, "Non-ASCII character: %s", c);
                        AbstractC7785qy0.f(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.g = bArr;
                    boolean[] zArr = new boolean[this.e];
                    for (int i2 = 0; i2 < this.f; i2++) {
                        zArr[B00.a(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                    }
                    this.h = zArr;
                } catch (ArithmeticException e) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                }
            } catch (ArithmeticException e2) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        public int b(char c) throws d {
            if (c > 127) {
                String strValueOf = String.valueOf(Integer.toHexString(c));
                throw new d(strValueOf.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                String strValueOf2 = String.valueOf(Integer.toHexString(c));
                throw new d(strValueOf2.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c);
            throw new d(sb.toString());
        }

        public char c(int i) {
            return this.b[i];
        }

        public boolean d(int i) {
            return this.h[i % this.e];
        }

        public boolean e(char c) {
            byte[] bArr = this.g;
            return c < bArr.length && bArr[c] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.b, ((a) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public String toString() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.qe$b */
    public static final class b extends e {
        public final char[] h;

        public b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // com.daaw.AbstractC7688qe.e, com.daaw.AbstractC7688qe
        public int d(byte[] bArr, CharSequence charSequence) throws d {
            AbstractC7785qy0.n(bArr);
            if (charSequence.length() % 2 == 1) {
                int length = charSequence.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new d(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.f.b(charSequence.charAt(i)) << 4) | this.f.b(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // com.daaw.AbstractC7688qe.e, com.daaw.AbstractC7688qe
        public void g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            AbstractC7785qy0.n(appendable);
            AbstractC7785qy0.s(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.h[i4]);
                appendable.append(this.h[i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES]);
            }
        }

        @Override // com.daaw.AbstractC7688qe.e
        public AbstractC7688qe n(a aVar, Character ch) {
            return new b(aVar);
        }

        public b(a aVar) {
            super(aVar, null);
            this.h = new char[AdRequest.MAX_CONTENT_URL_LENGTH];
            AbstractC7785qy0.d(aVar.b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.h[i] = aVar.c(i >>> 4);
                this.h[i | PSKKeyManager.MAX_KEY_LENGTH_BYTES] = aVar.c(i & 15);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.qe$c */
    public static final class c extends e {
        public c(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // com.daaw.AbstractC7688qe.e, com.daaw.AbstractC7688qe
        public int d(byte[] bArr, CharSequence charSequence) throws d {
            AbstractC7785qy0.n(bArr);
            CharSequence charSequenceL = l(charSequence);
            if (!this.f.d(charSequenceL.length())) {
                int length = charSequenceL.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new d(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceL.length()) {
                int i3 = i + 2;
                int iB = (this.f.b(charSequenceL.charAt(i)) << 18) | (this.f.b(charSequenceL.charAt(i + 1)) << 12);
                int i4 = i2 + 1;
                bArr[i2] = (byte) (iB >>> 16);
                if (i3 < charSequenceL.length()) {
                    int i5 = i + 3;
                    int iB2 = iB | (this.f.b(charSequenceL.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    bArr[i4] = (byte) ((iB2 >>> 8) & 255);
                    if (i5 < charSequenceL.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((iB2 | this.f.b(charSequenceL.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }

        @Override // com.daaw.AbstractC7688qe.e, com.daaw.AbstractC7688qe
        public void g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            AbstractC7785qy0.n(appendable);
            int i3 = i + i2;
            AbstractC7785qy0.s(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 2;
                int i5 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
                i += 3;
                int i6 = i5 | (bArr[i4] & 255);
                appendable.append(this.f.c(i6 >>> 18));
                appendable.append(this.f.c((i6 >>> 12) & 63));
                appendable.append(this.f.c((i6 >>> 6) & 63));
                appendable.append(this.f.c(i6 & 63));
                i2 -= 3;
            }
            if (i < i3) {
                m(appendable, bArr, i, i3 - i);
            }
        }

        @Override // com.daaw.AbstractC7688qe.e
        public AbstractC7688qe n(a aVar, Character ch) {
            return new c(aVar, ch);
        }

        public c(a aVar, Character ch) {
            super(aVar, ch);
            AbstractC7785qy0.d(aVar.b.length == 64);
        }
    }

    /* JADX INFO: renamed from: com.daaw.qe$d */
    public static final class d extends IOException {
        public d(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.qe$e */
    public static class e extends AbstractC7688qe {
        public final a f;
        public final Character g;

        public e(String str, String str2, Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        @Override // com.daaw.AbstractC7688qe
        public int d(byte[] bArr, CharSequence charSequence) throws d {
            a aVar;
            AbstractC7785qy0.n(bArr);
            CharSequence charSequenceL = l(charSequence);
            if (!this.f.d(charSequenceL.length())) {
                int length = charSequenceL.length();
                StringBuilder sb = new StringBuilder(32);
                sb.append("Invalid input length ");
                sb.append(length);
                throw new d(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceL.length()) {
                long jB = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    aVar = this.f;
                    if (i3 >= aVar.e) {
                        break;
                    }
                    jB <<= aVar.d;
                    if (i + i3 < charSequenceL.length()) {
                        jB |= (long) this.f.b(charSequenceL.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = aVar.f;
                int i6 = (i5 * 8) - (i4 * aVar.d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((jB >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.f.e;
            }
            return i2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f.equals(eVar.f) && AbstractC8301sp0.a(this.g, eVar.g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.daaw.AbstractC7688qe
        public void g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            AbstractC7785qy0.n(appendable);
            AbstractC7785qy0.s(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                m(appendable, bArr, i + i3, Math.min(this.f.f, i2 - i3));
                i3 += this.f.f;
            }
        }

        public int hashCode() {
            return this.f.hashCode() ^ AbstractC8301sp0.b(this.g);
        }

        @Override // com.daaw.AbstractC7688qe
        public int i(int i) {
            return (int) (((((long) this.f.d) * ((long) i)) + 7) / 8);
        }

        @Override // com.daaw.AbstractC7688qe
        public int j(int i) {
            a aVar = this.f;
            return aVar.e * B00.a(i, aVar.f, RoundingMode.CEILING);
        }

        @Override // com.daaw.AbstractC7688qe
        public AbstractC7688qe k() {
            return this.g == null ? this : n(this.f, null);
        }

        @Override // com.daaw.AbstractC7688qe
        public CharSequence l(CharSequence charSequence) {
            AbstractC7785qy0.n(charSequence);
            Character ch = this.g;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public void m(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            AbstractC7785qy0.n(appendable);
            AbstractC7785qy0.s(i, i + i2, bArr.length);
            int i3 = 0;
            AbstractC7785qy0.d(i2 <= this.f.f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f.d;
            while (i3 < i2 * 8) {
                a aVar = this.f;
                appendable.append(aVar.c(((int) (j >>> (i5 - i3))) & aVar.c));
                i3 += this.f.d;
            }
            if (this.g != null) {
                while (i3 < this.f.f * 8) {
                    appendable.append(this.g.charValue());
                    i3 += this.f.d;
                }
            }
        }

        public AbstractC7688qe n(a aVar, Character ch) {
            return new e(aVar, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f.toString());
            if (8 % this.f.d != 0) {
                if (this.g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public e(a aVar, Character ch) {
            this.f = (a) AbstractC7785qy0.n(aVar);
            AbstractC7785qy0.j(ch == null || !aVar.e(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.g = ch;
        }
    }

    public static AbstractC7688qe a() {
        return a;
    }

    public static byte[] h(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public final byte[] b(CharSequence charSequence) {
        try {
            return c(charSequence);
        } catch (d e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final byte[] c(CharSequence charSequence) {
        CharSequence charSequenceL = l(charSequence);
        byte[] bArr = new byte[i(charSequenceL.length())];
        return h(bArr, d(bArr, charSequenceL));
    }

    public abstract int d(byte[] bArr, CharSequence charSequence);

    public String e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public final String f(byte[] bArr, int i, int i2) {
        AbstractC7785qy0.s(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(j(i2));
        try {
            g(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract void g(Appendable appendable, byte[] bArr, int i, int i2);

    public abstract int i(int i);

    public abstract int j(int i);

    public abstract AbstractC7688qe k();

    public abstract CharSequence l(CharSequence charSequence);
}
