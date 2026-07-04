package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class EG {
    public final String a;

    public EG(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public static EG b(String str) {
        return new EG(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EG) {
            return this.a.equals(((EG) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}
