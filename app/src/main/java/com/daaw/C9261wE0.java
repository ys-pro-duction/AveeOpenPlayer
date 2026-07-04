package com.daaw;

/* JADX INFO: renamed from: com.daaw.wE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9261wE0 implements InterfaceC1692Nj0 {
    public final InterfaceC1900Pj0 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public C9261wE0(InterfaceC1900Pj0 interfaceC1900Pj0, String str, Object[] objArr) {
        this.a = interfaceC1900Pj0;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.daaw.InterfaceC1692Nj0
    public boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // com.daaw.InterfaceC1692Nj0
    public InterfaceC1900Pj0 b() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC1692Nj0
    public EnumC3087aB0 c() {
        return (this.d & 1) == 1 ? EnumC3087aB0.PROTO2 : EnumC3087aB0.PROTO3;
    }

    public Object[] d() {
        return this.c;
    }

    public String e() {
        return this.b;
    }
}
