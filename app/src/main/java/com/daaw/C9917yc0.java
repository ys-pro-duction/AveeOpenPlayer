package com.daaw;

import com.daaw.AbstractC4629fi;
import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.yc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9917yc0 extends AbstractC4629fi {
    public final byte[] C;
    public int D = 0;

    /* JADX INFO: renamed from: com.daaw.yc0$b */
    public class b implements AbstractC4629fi.a {
        public int B;
        public final int C;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(c());
        }

        @Override // com.daaw.AbstractC4629fi.a
        public byte c() {
            try {
                byte[] bArr = C9917yc0.this.C;
                int i = this.B;
                this.B = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B < this.C;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b() {
            this.B = 0;
            this.C = C9917yc0.this.size();
        }
    }

    public C9917yc0(byte[] bArr) {
        this.C = bArr;
    }

    public static int R(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // com.daaw.AbstractC4629fi
    public int D() {
        return 0;
    }

    @Override // com.daaw.AbstractC4629fi
    public boolean E() {
        return true;
    }

    @Override // com.daaw.AbstractC4629fi
    public boolean F() {
        int iQ = Q();
        return AbstractC3750cb1.f(this.C, iQ, size() + iQ);
    }

    @Override // com.daaw.AbstractC4629fi
    public int H(int i, int i2, int i3) {
        return R(i, this.C, Q() + i2, i3);
    }

    @Override // com.daaw.AbstractC4629fi
    public int I(int i, int i2, int i3) {
        int iQ = Q() + i2;
        return AbstractC3750cb1.g(i, this.C, iQ, i3 + iQ);
    }

    @Override // com.daaw.AbstractC4629fi
    public int J() {
        return this.D;
    }

    @Override // com.daaw.AbstractC4629fi
    public String L(String str) {
        return new String(this.C, Q(), size(), str);
    }

    @Override // com.daaw.AbstractC4629fi
    public void O(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.C, Q() + i, i2);
    }

    public boolean P(C9917yc0 c9917yc0, int i, int i2) {
        if (i2 > c9917yc0.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > c9917yc0.size()) {
            int size2 = c9917yc0.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.C;
        byte[] bArr2 = c9917yc0.C;
        int iQ = Q() + i2;
        int iQ2 = Q();
        int iQ3 = c9917yc0.Q() + i;
        while (iQ2 < iQ) {
            if (bArr[iQ2] != bArr2[iQ3]) {
                return false;
            }
            iQ2++;
            iQ3++;
        }
        return true;
    }

    public int Q() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public AbstractC4629fi.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4629fi) || size() != ((AbstractC4629fi) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C9917yc0) {
            return P((C9917yc0) obj, 0, size());
        }
        if (obj instanceof ZJ0) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(strValueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int iH = this.D;
        if (iH == 0) {
            int size = size();
            iH = H(size, 0, size);
            if (iH == 0) {
                iH = 1;
            }
            this.D = iH;
        }
        return iH;
    }

    @Override // com.daaw.AbstractC4629fi
    public int size() {
        return this.C.length;
    }

    @Override // com.daaw.AbstractC4629fi
    public void y(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.C, i, bArr, i2, i3);
    }
}
