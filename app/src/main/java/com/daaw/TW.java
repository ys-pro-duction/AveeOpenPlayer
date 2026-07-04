package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class TW implements SW {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public int f = -1;
    public String g = null;

    public TW(byte[] bArr) throws C6344lo0 {
        c(bArr);
    }

    public final void b(byte[] bArr) throws C6344lo0 {
        if (bArr.length != 128) {
            throw new C6344lo0("Buffer length wrong");
        }
        if (!"TAG".equals(AbstractC6308lh.c(bArr, 0, 3))) {
            throw new C6344lo0();
        }
    }

    public final void c(byte[] bArr) throws C6344lo0 {
        b(bArr);
        this.c = AbstractC6308lh.k(AbstractC6308lh.c(bArr, 3, 30));
        this.b = AbstractC6308lh.k(AbstractC6308lh.c(bArr, 33, 30));
        this.d = AbstractC6308lh.k(AbstractC6308lh.c(bArr, 63, 30));
        this.e = AbstractC6308lh.k(AbstractC6308lh.c(bArr, 93, 4));
        int i = bArr[127] & 255;
        this.f = i;
        if (i == 255) {
            this.f = -1;
        }
        if (bArr[125] != 0) {
            this.g = AbstractC6308lh.k(AbstractC6308lh.c(bArr, 97, 30));
            this.a = null;
            return;
        }
        this.g = AbstractC6308lh.k(AbstractC6308lh.c(bArr, 97, 28));
        byte b = bArr[126];
        if (b == 0) {
            this.a = "";
        } else {
            this.a = Integer.toString(b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TW tw = (TW) obj;
        String str = this.d;
        if (str == null) {
            if (tw.d != null) {
                return false;
            }
        } else if (!str.equals(tw.d)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (tw.b != null) {
                return false;
            }
        } else if (!str2.equals(tw.b)) {
            return false;
        }
        String str3 = this.g;
        if (str3 == null) {
            if (tw.g != null) {
                return false;
            }
        } else if (!str3.equals(tw.g)) {
            return false;
        }
        if (this.f != tw.f) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null) {
            if (tw.c != null) {
                return false;
            }
        } else if (!str4.equals(tw.c)) {
            return false;
        }
        String str5 = this.a;
        if (str5 == null) {
            if (tw.a != null) {
                return false;
            }
        } else if (!str5.equals(tw.a)) {
            return false;
        }
        String str6 = this.e;
        if (str6 == null) {
            if (tw.e != null) {
                return false;
            }
        } else if (!str6.equals(tw.e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.d;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f) * 31;
        String str4 = this.c;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.a;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.e;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
