package com.daaw;

import java.security.MessageDigest;

/* JADX INFO: renamed from: com.daaw.lr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6359lr0 implements H70 {
    public final String a;
    public final H70 b;

    public C6359lr0(String str, H70 h70) {
        this.a = str;
        this.b = h70;
    }

    @Override // com.daaw.H70
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.a.getBytes("UTF-8"));
        this.b.a(messageDigest);
    }

    @Override // com.daaw.H70
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6359lr0 c6359lr0 = (C6359lr0) obj;
        return this.a.equals(c6359lr0.a) && this.b.equals(c6359lr0.b);
    }

    @Override // com.daaw.H70
    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
