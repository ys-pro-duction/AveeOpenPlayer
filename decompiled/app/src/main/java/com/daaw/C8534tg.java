package com.daaw;

import com.daaw.AbstractC4629fi;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8534tg extends C9917yc0 {
    public final int E;
    public final int F;

    /* JADX INFO: renamed from: com.daaw.tg$b */
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
            int i = this.B;
            if (i >= this.C) {
                throw new NoSuchElementException();
            }
            byte[] bArr = C8534tg.this.C;
            this.B = i + 1;
            return bArr[i];
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
            int iQ = C8534tg.this.Q();
            this.B = iQ;
            this.C = iQ + C8534tg.this.size();
        }
    }

    public C8534tg(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (((long) i) + ((long) i2) <= bArr.length) {
            this.E = i;
            this.F = i2;
            return;
        }
        StringBuilder sb3 = new StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i);
        sb3.append("+");
        sb3.append(i2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.daaw.C9917yc0
    public int Q() {
        return this.E;
    }

    @Override // com.daaw.C9917yc0, java.lang.Iterable
    /* JADX INFO: renamed from: S */
    public AbstractC4629fi.a iterator() {
        return new b();
    }

    @Override // com.daaw.C9917yc0, com.daaw.AbstractC4629fi
    public int size() {
        return this.F;
    }

    @Override // com.daaw.C9917yc0, com.daaw.AbstractC4629fi
    public void y(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.C, Q() + i, bArr, i2, i3);
    }
}
