package com.daaw;

import com.daaw.AbstractC2731Xd;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6562mc extends AbstractC2731Xd {
    public final Iterable a;
    public final byte[] b;

    /* JADX INFO: renamed from: com.daaw.mc$b */
    public static final class b extends AbstractC2731Xd.a {
        public Iterable a;
        public byte[] b;

        @Override // com.daaw.AbstractC2731Xd.a
        public AbstractC2731Xd a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C6562mc(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2731Xd.a
        public AbstractC2731Xd.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.a = iterable;
            return this;
        }

        @Override // com.daaw.AbstractC2731Xd.a
        public AbstractC2731Xd.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // com.daaw.AbstractC2731Xd
    public Iterable b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC2731Xd
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2731Xd) {
            AbstractC2731Xd abstractC2731Xd = (AbstractC2731Xd) obj;
            if (this.a.equals(abstractC2731Xd.b())) {
                if (Arrays.equals(this.b, abstractC2731Xd instanceof C6562mc ? ((C6562mc) abstractC2731Xd).b : abstractC2731Xd.c())) {
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
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    public C6562mc(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
