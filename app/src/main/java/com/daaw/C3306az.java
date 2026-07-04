package com.daaw;

/* JADX INFO: renamed from: com.daaw.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3306az implements InterfaceC7026oF {
    public final int a;
    public final int b;

    public C3306az(int i, int i2) {
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
        if (!(obj instanceof C3306az)) {
            return false;
        }
        C3306az c3306az = (C3306az) obj;
        return this.a == c3306az.a && this.b == c3306az.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
