package com.daaw;

import com.daaw.AbstractC1316Jt;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9637xc extends AbstractC1316Jt.d.b {
    public final String a;
    public final byte[] b;

    /* JADX INFO: renamed from: com.daaw.xc$b */
    public static final class b extends AbstractC1316Jt.d.b.a {
        public String a;
        public byte[] b;

        @Override // com.daaw.AbstractC1316Jt.d.b.a
        public AbstractC1316Jt.d.b a() {
            String str = "";
            if (this.a == null) {
                str = " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C9637xc(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.d.b.a
        public AbstractC1316Jt.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.b = bArr;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.d.b.a
        public AbstractC1316Jt.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.a = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.d.b
    public byte[] b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.d.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.d.b) {
            AbstractC1316Jt.d.b bVar = (AbstractC1316Jt.d.b) obj;
            if (this.a.equals(bVar.c())) {
                if (Arrays.equals(this.b, bVar instanceof C9637xc ? ((C9637xc) bVar).b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }

    public C9637xc(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}
