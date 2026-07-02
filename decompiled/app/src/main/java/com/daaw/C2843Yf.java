package com.daaw;

/* JADX INFO: renamed from: com.daaw.Yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2843Yf implements Comparable {
    public final AbstractC4340ei B;

    public C2843Yf(AbstractC4340ei abstractC4340ei) {
        this.B = abstractC4340ei;
    }

    public static C2843Yf c(AbstractC4340ei abstractC4340ei) {
        AbstractC8342sy0.c(abstractC4340ei, "Provided ByteString must not be null.");
        return new C2843Yf(abstractC4340ei);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2843Yf c2843Yf) {
        return AbstractC6838nb1.j(this.B, c2843Yf.B);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2843Yf) && this.B.equals(((C2843Yf) obj).B);
    }

    public AbstractC4340ei g() {
        return this.B;
    }

    public int hashCode() {
        return this.B.hashCode();
    }

    public String toString() {
        return "Blob { bytes=" + AbstractC6838nb1.v(this.B) + " }";
    }
}
