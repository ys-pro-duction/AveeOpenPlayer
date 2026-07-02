package com.daaw;

/* JADX INFO: renamed from: com.daaw.Hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1084Hn extends C6836nb {
    public String B;
    public String C;

    public C1084Hn(String str, String str2, String str3) {
        super(str);
        this.B = str2;
        this.C = str3;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new C0980Gn(20, this.B, this.C).b(super.getMessage());
    }
}
