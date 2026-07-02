package com.daaw;

import com.daaw.H51;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8519td extends H51 {
    public final String a;
    public final byte[] b;
    public final EnumC8911uz0 c;

    /* JADX INFO: renamed from: com.daaw.td$b */
    public static final class b extends H51.a {
        public String a;
        public byte[] b;
        public EnumC8911uz0 c;

        @Override // com.daaw.H51.a
        public H51 a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C8519td(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.H51.a
        public H51.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = str;
            return this;
        }

        @Override // com.daaw.H51.a
        public H51.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // com.daaw.H51.a
        public H51.a d(EnumC8911uz0 enumC8911uz0) {
            if (enumC8911uz0 == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = enumC8911uz0;
            return this;
        }
    }

    @Override // com.daaw.H51
    public String b() {
        return this.a;
    }

    @Override // com.daaw.H51
    public byte[] c() {
        return this.b;
    }

    @Override // com.daaw.H51
    public EnumC8911uz0 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H51) {
            H51 h51 = (H51) obj;
            if (this.a.equals(h51.b())) {
                if (Arrays.equals(this.b, h51 instanceof C8519td ? ((C8519td) h51).b : h51.c()) && this.c.equals(h51.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public C8519td(String str, byte[] bArr, EnumC8911uz0 enumC8911uz0) {
        this.a = str;
        this.b = bArr;
        this.c = enumC8911uz0;
    }
}
