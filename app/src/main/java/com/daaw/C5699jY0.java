package com.daaw;

import java.security.MessageDigest;

/* JADX INFO: renamed from: com.daaw.jY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5699jY0 implements H70 {
    public final String a;

    public C5699jY0(String str) {
        if (str == null) {
            throw new NullPointerException("Signature cannot be null!");
        }
        this.a = str;
    }

    @Override // com.daaw.H70
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.a.getBytes("UTF-8"));
    }

    @Override // com.daaw.H70
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C5699jY0) obj).a);
    }

    @Override // com.daaw.H70
    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "StringSignature{signature='" + this.a + "'}";
    }
}
