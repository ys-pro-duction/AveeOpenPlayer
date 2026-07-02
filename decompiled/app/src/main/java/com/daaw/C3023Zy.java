package com.daaw;

/* JADX INFO: renamed from: com.daaw.Zy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3023Zy implements InterfaceC7026oF {
    public final int a;
    public final int b;

    public C3023Zy(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3023Zy)) {
            return false;
        }
        C3023Zy c3023Zy = (C3023Zy) obj;
        return this.a == c3023Zy.a && this.b == c3023Zy.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
